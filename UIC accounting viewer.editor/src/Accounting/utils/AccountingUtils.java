package Accounting.utils;


import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

import Accounting.Carrier;
import Accounting.CharacterSet;
import Accounting.Currency;
import Accounting.GenericReductionCards;
import Accounting.AccountingFactory;
import Accounting.AccountingPackage;
import Accounting.AccountingViewerData;
import Accounting.Station;
import Accounting.WorkflowHistory;
import Accounting.WorkflowStep;
import Accounting.console.ConsoleUtil;
import Accounting.preferences.PreferenceConstants;
import Accounting.preferences.PreferencesAccess;
import Accounting.presentation.DirtyCommand;
import Accounting.presentation.AccountingEditor;
import Accounting.presentation.AccountingEditorPlugin;
import Accounting.provider.AccountingItemProviderAdapterFactory;


/**
 * The Class AccountingUtils.
 * 
 * utilities to handle commands, messages message boxes,...
 * 
 */
public class AccountingUtils {
	
	/** The one hundred. */
	private static 	BigDecimal oneHundred = new BigDecimal("100.0");
	
	/** The date format. */
	private static DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd"); //$NON-NLS-1$
	
	
	/**
	 * Gets the active editor.
	 *
	 * @return the active editor
	 */
	public static AccountingEditor getActiveEditor() {

		if (PlatformUI.getWorkbench() != null &&
			PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null &&
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()!= null &&
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor() != null) {
		   	return (AccountingEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor() ;
		}

		
		IWorkbench wb = PlatformUI.getWorkbench();
		if (wb == null) return null;
		for (IWorkbenchWindow win : wb.getWorkbenchWindows()) {
				if (win.getPartService().getActivePart() instanceof AccountingEditor) {
					return (AccountingEditor)  win.getPartService().getActivePart();
				}
		}
		return null;
	}
	
	/**
	 * Gets the Accounting tool data node.
	 *
	 * @param editingDomainProvider the editing domain provider
	 * @return the Accounting tool
	 */
	public static AccountingViewerData getAccounting(IEditingDomainProvider editingDomainProvider) {
	   		   	
	   	IEditorPart editor =  getActiveEditor();
	   	if (editor == null) return null;
		EditingDomain domain = ((AccountingEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return null;

		if (object instanceof AccountingViewerData){
			return (AccountingViewerData) object;
		} else {
			return null;
		}
	}
	
	/**
	 * Gets the Accounting tool data node.
	 *
	 * @return the Accounting tool
	 */
	public static AccountingViewerData getAccounting() {
	   	
	   	IEditorPart editor =  getActiveEditor();
	   	if (editor == null) return null;
	   	EditingDomain domain = ((AccountingEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return null;

		if (object instanceof AccountingViewerData){
			return (AccountingViewerData) object;
		} else {
			return null;
		}
	}
	
	/**
	 * Execute and flush and run the garbage collector.
	 *
	 * @param command the command
	 * @param domain the domain
	 * @param editor the editor
	 */
	public static void executeAndFlush(Command command, EditingDomain domain, AccountingEditor editor) {
		
		if (command == null || domain == null) {
			return;
		}
		
		if (command instanceof CompoundCommand) {
			if (((CompoundCommand)command).isEmpty()) return;
		}
		
		if (command.canExecute()) {
			domain.getCommandStack().execute(command);
			flushCommandStack(domain);
		} else {
			String message = "Could not execute Change: " + command.getDescription();
			AccountingUtils.writeConsoleError(message, editor);
		}
		
		System.gc();
		
	}
	
	
	/**
	 * flush a command mark the model as dirty and ask for the garbage collector.
	 *
	 * @param command the command
	 * @param domain the domain
	 */
	public static void flushCommandStack(EditingDomain domain) {
	
		if (domain == null 
			|| domain.getCommandStack() == null
			|| domain.getCommandStack().getMostRecentCommand() == null 
			|| domain.getCommandStack().getMostRecentCommand() instanceof DirtyCommand) {
			return;
		}
		
		domain.getCommandStack().flush();
		domain.getCommandStack().execute(new DirtyCommand());
		
	}
	
	/**
	 * Execute and flush a command and ask for the garbage collector.
	 *
	 * @param command the command
	 * @param domain the domain
	 */
	public static void executeAndFlush(CompoundCommand command, EditingDomain domain) {
		
		if (command != null && domain != null && !command.isEmpty() && command.canExecute()) {
			domain.getCommandStack().execute(command);
			flushCommandStack(domain);
		} else {
			String message = "could not change data: " + command.getDescription();
			AccountingUtils.writeConsoleError(message,null);
		}
		
		System.gc();
		
	}
	
	/**
	 * Gets the active domain.
	 *
	 * @return the active domain
	 */
	public static EditingDomain getActiveDomain() {
	   	IEditorPart editor =  getActiveEditor();
	   	if (editor == null) return null;
	   	return ((AccountingEditor) editor).getEditingDomain();
	}
	

	

	/**
	 * Checks if is standard text id.
	 *
	 * @param id the id
	 * @return true, if is standard text id
	 */
	public static boolean isStandardTextId(String id) {
		
		if (id == null || id.length() == 0) return true;
		
		for (GenericReductionCards card : GenericReductionCards.values()) {
			
			if (card.getName().equals(id)) {
				return true;
			}
			
		}
		
		return false;
	}


	/**
	 * Find carrier.
	 *
	 * @param tool the tool
	 * @param code the code
	 * @return the carrier
	 */
	static Carrier findCarrier(AccountingViewerData tool, String code) {
		
		if (tool == null || tool.getCodeLists() == null || tool.getCodeLists() == null) {
			return null;
		}
		
		for (Carrier carrier : tool.getCodeLists().getCarriers().getCarriers()){
			if (carrier.getCode().equalsIgnoreCase(code)) {
				return carrier;				
			}
		}
		return null;
	}

	
	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path.
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		
		Bundle bundle = Platform.getBundle(AccountingEditorPlugin.PLUGIN_ID);
		URL fileURL = bundle.getEntry(path); //$NON-NLS-1$
		return ImageDescriptor.createFromURL(fileURL);
	}
	

	/**
	 * To printable asc II.
	 *
	 * @param text the text
	 * @return the string
	 */
	public static String toPrintableAscII(String text) {
        // strips off all non-ASCII characters
        text = text.replaceAll("[^\\x00-\\x7F]", ""); //$NON-NLS-1$ //$NON-NLS-2$
 
        // erases all the ASCII control characters
        text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", ""); //$NON-NLS-1$ //$NON-NLS-2$
         
        // removes non-printable characters from Unicode
        return text.replaceAll("\\p{C}", ""); //$NON-NLS-1$ //$NON-NLS-2$

	}
	
	/**
	 * Limit string length.
	 *
	 * @param s the s
	 * @param maxChar the max char
	 * @return the string
	 */
	public static String limitStringLength(String s, int maxChar) {
		if (s == null) return " "; //$NON-NLS-1$
		return s.substring(0, Math.min(maxChar, s.length()));
	}

	/**
	 * Limit string length with console entry.
	 *
	 * @param s the s
	 * @param maxChar the max char
	 * @param editor the editor
	 * @param text the text
	 * @return the string
	 */
	public static String limitStringLengthWithConsoleEntry(String s, int maxChar, AccountingEditor editor, String text) {
		if (s == null) return " "; //$NON-NLS-1$
		if (s.length() <= maxChar) return s;
		
		
		String truncated = s.substring(0, Math.min(maxChar, s.length()));
		AccountingUtils.writeConsoleError("text" + " truncated:" + s + " -- " + truncated, editor);//$NON-NLS-1$ //$NON-NLS-3$
		return truncated;
	}
	
	/**
	 * Import station.
	 *
	 * @param filter the import filter in the preferences
	 * @param country the country
	 * @return true, if successful
	 */
	public static boolean importStation(String filter, int country) {
		if (country < 1 || country > 99) return false;
		
		if (filter != null && filter.trim().length() > 0) {
			if (!filter.contains(String.valueOf(country))) return false;
		}
		
		String filterP = PreferencesAccess.getStringFromPreferenceStore(PreferenceConstants.P_IMPORT_CONTRY_FILTER);
		
		if (filterP != null && filterP.trim().length() > 0 ) {
			if (!filterP.contains(String.valueOf(country))) return false;
		}		
		
		return true;
		
	}

	/**
	 * Gets the numeric station code.
	 *
	 * @param station the station
	 * @return the numeric station code
	 */
	public static long getNumericStationCode(Station station) {
		long i = 0;
		if (station.getStationCode() > 0) {
			return station.getStationCode();
		}
		
		try {
			i = Long.parseLong(station.getCode()) + station.getCountry().getCode() * 100000;
		} catch (Exception e ) {
			return 0;
		}
		
		return i;
		
	}
		
	/**
	 * Write console error.
	 *
	 * @param message the message
	 * @param editor the editor
	 */
	public static void writeConsoleError(final String message, AccountingEditor editor) {
		
		if (message == null || message.length() == 0) {
			return;
		}
		try {
			if (editor == null) {
				Display display = getDisplay();
				if (display == null) return;
				display.asyncExec(() -> {
					ConsoleUtil.printError("Error","Error: " + message);
				});	
			} else {
				editor.getSite().getShell().getDisplay().asyncExec(() -> {
					ConsoleUtil.printError("Error","Error: " +  message);
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Display async error message.
	 *
	 * @param e the e
	 * @param text the text
	 */
	public static void displayAsyncErrorMessage(Exception e , String text) {
			
		AccountingEditor editor = AccountingUtils.getActiveEditor();
		
		AccountingUtils.writeConsoleError(text + " - " + e.getMessage(), editor);

		Display display = getDisplay();
		
		final Shell shell =  display.getActiveShell();
		
			
		if (shell != null) {
			display.asyncExec(() -> {
				MessageBox dialog =  new MessageBox(shell, SWT.ICON_ERROR | SWT.OK);
				dialog.setText(text);
				if (e != null && e.getMessage() != null) {
					dialog.setMessage(e.getMessage());
				}
				dialog.open(); 
				e.printStackTrace();
				AccountingEditorPlugin.INSTANCE.log(e);
				return;
			});	
		}
	}
	
	/**
	 * Display async info message.
	 *
	 * @param text the text
	 * @param details the details
	 */
	public static void displayAsyncInfoMessage(String text, String details) {
		
		AccountingEditor editor = AccountingUtils.getActiveEditor();

		Display display = getDisplay();
		final Shell shell1 =  editor.getSite().getShell();
			
		if (display != null) {
			display.asyncExec(() -> {
				MessageBox dialog =  new MessageBox(shell1, SWT.ICON_INFORMATION | SWT.OK);
				dialog.setText(text);
				dialog.setMessage(details);
				AccountingUtils.writeConsoleInfo(text + " - " + details, editor);
				dialog.open(); 
				return;
			});	
		}
	}

	
	/**
	 * Gets the display.
	 *
	 * @return the display
	 */
	public static Display getDisplay() {
		AccountingEditor e = AccountingUtils.getActiveEditor();
		Display display = null;
		if (e != null) {
			display = e.getSite().getShell().getDisplay();
		} else {
			display = Display.getDefault();
		}
		return display;
	}
	
	/**
	 * Write console info.
	 *
	 * @param message the message
	 * @param editor the editor
	 */
	public static void writeConsoleInfo(String message, AccountingEditor editor) {
		if (message == null || message.length() == 0) {
			return;
		}
		
		try {
			if (editor == null) {
				Display display = getDisplay();
				if (display == null) return;
				display.asyncExec(() -> {
					ConsoleUtil.printInfo("Info","Info: " + message);
				});	
			} else {
				editor.getSite().getShell().getDisplay().asyncExec(() -> {
					ConsoleUtil.printInfo("Info","Info: " +  message);
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Write console warning.
	 *
	 * @param message the message
	 * @param editor the editor
	 */
	public static void writeConsoleWarning(String message, AccountingEditor editor) {
		if (message == null || message.length() == 0) {
			return;
		}
		
		try {
			if (editor == null) {
				Display display = getDisplay();
				if (display == null) return;
				display.asyncExec(() -> {
					ConsoleUtil.printWarning("Warning","Warning: " +  message);
				});					
			} else {
				editor.getSite().getShell().getDisplay().asyncExec(() -> {
					ConsoleUtil.printWarning("Warning","Warning: " +  message);
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	/**
	 * Checks if is referenced.
	 *
	 * @param object the object
	 * @param tree the tree
	 * @return true, if is referenced
	 */
	public static boolean isReferenced(EObject object, EObject tree) {
		
		if (object == null || tree == null) return false;
		
		TreeIterator<EObject> it = tree.eAllContents();
		
		while (it.hasNext()) {
			EObject next = it.next();
			
			EList<EObject> crossReferences = next.eCrossReferences();
			
			if (crossReferences.contains(object)) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Gets the label text for an eObject.
	 *
	 * @param object the object
	 * @return the label text
	 */
	public static String getLabelText(EObject object) {
		
		if (object == null) return "";
		
		AccountingItemProviderAdapterFactory factory = new AccountingItemProviderAdapterFactory();
		if(factory.isFactoryForType(IItemLabelProvider.class)){
			IItemLabelProvider labelProvider = (IItemLabelProvider)	factory.adapt(object, IItemLabelProvider.class);
			if(labelProvider != null){
				return labelProvider.getText(object);
			}
		}
	
		return null;
	}
	
	/**
	 * Gets the euro cent.
	 *
	 * @param f the f
	 * @return the euro cent
	 */
	public static int getEuroCent(float f) {
		BigDecimal value = new BigDecimal(Float.toString(f));
		BigDecimal amount = value.multiply(oneHundred);
		return amount.intValue();
	}
	
	/**
	 * Gets the euro from cent.
	 *
	 * @param i the i
	 * @return the euro from cent
	 */
	public static float getEuroFromCent(int i) {
		BigDecimal value = new BigDecimal(i);
		value.setScale(2);
		BigDecimal amount = value.divide(oneHundred);
		return amount.floatValue();
	}
	
	 /**
 	 * Gets the stack trace.
 	 *
 	 * @param aThrowable the a throwable
 	 * @return the stack trace
 	 */
 	public static String getStackTrace(Throwable aThrowable) {
		    final Writer result = new StringWriter();
		    final PrintWriter printWriter = new PrintWriter(result);
		    aThrowable.printStackTrace(printWriter);
		    return result.toString();
	 }
	
	/**
	 * Write console stack trace.
	 *
	 * @param e the e
	 * @param editor the editor
	 */
	public static void writeConsoleStackTrace(Exception e, AccountingEditor editor){
		if (e == null) return;
		
		String stackTrace = getStackTrace(e);
		AccountingUtils.writeConsoleError(stackTrace, editor);
		
	}
	
	/**
	 * Round.
	 *
	 * @param amount the amount
	 * @param scale the scale
	 * @param mode the mode
	 * @param radix the radix
	 * @return the big decimal
	 */
	public static BigDecimal round(float amount, int scale, RoundingMode mode, int radix) {
		
		String amountS = Float.toString(amount);
		if (radix == 10) {
			return new BigDecimal(amountS).setScale(scale, mode);
		} else {
			float value = amount * radix;
			String valueS = Float.toString(value);
			BigDecimal bd = new BigDecimal(valueS).setScale(scale - 1, mode);
			float v = bd.floatValue() / radix;
			String vS = Float.toString(v);
			BigDecimal bf = new BigDecimal(vS).setScale(scale, mode);
			return bf;
		}
	}
	
	/**
	 * Gets the supported charset.
	 *
	 * @param set the set
	 * @param editor the editor
	 * @return the supported charset
	 */
	public static Charset getSupportedCharset(CharacterSet set, AccountingEditor editor) {
		
		if (set == null) {
			return StandardCharsets.ISO_8859_1;
		} else if (set.equals(CharacterSet.LATIN10_ISO885916)) {
			return getCharSet("ISO8859_16", editor);
		} else if (set.equals(CharacterSet.LATIN1_ISO88591)) {
			return StandardCharsets.ISO_8859_1;
		} else if (set.equals(CharacterSet.LATIN2_ISO88592)) {
			return getCharSet("ISO8859_2", editor);
		} else if (set.equals(CharacterSet.LATIN3_ISO88593)) {
			return getCharSet("ISO8859_3", editor);
		} else if (set.equals(CharacterSet.LATIN4_ISO88594)) {
			return getCharSet("ISO8859_4", editor);
		} else if (set.equals(CharacterSet.LATIN5_ISO88599)) {
			return getCharSet("ISO8859_9", editor);
		} else if (set.equals(CharacterSet.LATIN7_ISO885913)) {
			return getCharSet("ISO8859_13", editor);
		} else if (set.equals(CharacterSet.LATIN9_ISO885915)) {
			return getCharSet("ISO8859_15", editor);
		} else if (set.equals(CharacterSet.LATINARABIC_ISO88596)) {
			return getCharSet("ISO8859_6", editor);
		} else if (set.equals(CharacterSet.LATINGREEK_ISO88597)) {
			return getCharSet("ISO8859_7", editor);
		} else if (set.equals(CharacterSet.LATINHEBREW_ISO88598)) {
			return getCharSet("ISO8859_8", editor);
		} else if (set.equals(CharacterSet.LATINKYRILLIC_ISO88595)) {
			return getCharSet("ISO8859_5", editor);
		} else if (set.equals(CharacterSet.RUSSIAN_KOI8R)) {
			return getCharSet("KOI8_R", editor);
		} else if (set.equals(CharacterSet.UKRAINIAN_KOI8U)) {
			return getCharSet("KOI8_U", editor);
		} else if (set.equals(CharacterSet.USASCII)) {
			return StandardCharsets.US_ASCII;
		} 
		
		return StandardCharsets.ISO_8859_1;
	}

	/**
	 * Gets the char set.
	 *
	 * @param charset the charset
	 * @param editor the editor
	 * @return the char set
	 */
	private static Charset getCharSet(String charset,AccountingEditor editor) {
		
		Charset set = null;
		try {
			set = Charset.forName(charset);
		} catch (Exception e) {
			return StandardCharsets.ISO_8859_1;
		}
		if (set == null) {
			String message = "local character set " + charset + " not supported using ISO-8859-1 instead - local station names might be corrupted in the export";
			AccountingUtils.writeConsoleInfo(message, editor);
			return StandardCharsets.ISO_8859_1;
		} else {
			return set;
		}
	}
	
	/**
	 * Convert utf 8 to char set.
	 *
	 * @param s the s
	 * @param set the set
	 * @return the string
	 */
	public static String convertUtf8ToCharSet(String s, Charset set) {
		try {
			byte[] original = s.getBytes("UTF-8");
			return  new String(original, set);		
		} catch (UnsupportedEncodingException e) {
			return s;
		}
	}


	

	
	
	/**
	 * Delete orphaned objects.
	 *
	 * @param domain the domain
	 * @param tool the tool
	 */
	public static void deleteOrphanedObjects(EditingDomain domain, AccountingViewerData tool) {
		
		if (tool == null || domain == null) return;
		
		Map<EObject, Collection<Setting>> ll = EcoreUtil.ExternalCrossReferencer.find(tool);

		for (Entry<EObject,Collection<Setting>> e:  ll.entrySet()) {
			for (Setting s : e.getValue()) {
				EcoreUtil.remove(s,e.getKey());
			}
		}
		return;

	}

	/**
	 * Adds the workflow step.
	 *
	 * @param description the description of the workflow step
	 * @param editor the editor
	 */
	public static void addWorkflowStep(String description, AccountingEditor editor) {
		
		WorkflowStep step = AccountingFactory.eINSTANCE.createWorkflowStep();
		step.setTime(java.util.Calendar.getInstance().getTime());
		step.setDescription(description);
		
	   	if (editor == null) return;
	   	
	   	EditingDomain domain = ((AccountingEditor) editor).getEditingDomain();
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return;

		AccountingViewerData tool = null;
		if (object instanceof AccountingViewerData){
			tool = (AccountingViewerData) object;
		} else {
			return;
		}
		
		Command com = null;
		if (tool.getWorkflowHistory() == null) {
			
			WorkflowHistory history = AccountingFactory.eINSTANCE.createWorkflowHistory();
			history.getWorkflowSteps().add(step);
			com = SetCommand.create(editor.getEditingDomain(), tool, "Workflow History", history);
			if (com != null && com.canExecute()) {
				editor.getEditingDomain().getCommandStack().execute(com);
			}
		} else {
			
			com = AddCommand.create(editor.getEditingDomain(), tool.getWorkflowHistory(), AccountingPackage.Literals.WORKFLOW_HISTORY__WORKFLOW_STEPS, step);
			if (com != null && com.canExecute()) {
				editor.getEditingDomain().getCommandStack().execute(com);
			}
		}	
	}
	
	
	/**
	 * Sets the to 2359 UTC.
	 *
	 * @param date the date
	 * @return the date
	 */
	public static Date setTo2359UTC(Date date) {
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(date);
		cal.set(java.util.Calendar.HOUR_OF_DAY, 23);
		cal.set(java.util.Calendar.MINUTE, 59);
		cal.set(java.util.Calendar.SECOND, 59);
		Date date2 = cal.getTime();
		
		return date2;
	}
	
	/**
	 * Sets the to 0000 UTC.
	 *
	 * @param date the date
	 * @return the date
	 */
	public static Date setTo0000UTC(Date date) {
		
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(date);
		cal.set(java.util.Calendar.HOUR_OF_DAY, 0);
		cal.set(java.util.Calendar.MINUTE, 0);
		cal.set(java.util.Calendar.SECOND, 0);

		return cal.getTime();
	}
	
	/**
	 * Check date only equal.
	 *
	 * @param date1 the date 1
	 * @param date2 the date 2
	 * @return true, if successful
	 */
	public static boolean checkDateOnlyEqual(Date date1, Date date2) {
		
		String d1 = dateFormat.format(date1);
		String d2 = dateFormat.format(date2);
		
		return d1.equals(d2);

	}





	/**
	 * Standardize reduction card id.
	 *
	 * @param cardIssuer the card issuer
	 * @param id the reduction card id
	 * @return the standardized reduction card id
	 */
	public static String standardizeId(Carrier cardIssuer, String id) {
		
		//standard UIC ids
		if (id.startsWith("UIC_")) return id;
		
		//issuer must be there
		if (cardIssuer ==  null || cardIssuer.getCode() == null || cardIssuer.getCode().length() < 1) {
			AccountingUtils.writeConsoleError("Card issuer is missing in card with id: " + id, null);
			return null;
		}
		
		String newId = cardIssuer.getCode();
		if (id.startsWith(newId)) {
			newId = id;
		} else {
			newId = newId + "_" + id;
		}
		
		newId = newId.trim();
		newId = newId.replace(" ", "_");
		return newId;
	}

	/**
	 * Checks if a station is convertable.
	 *
	 * @param station the station
	 * @return true, if the station is convertable to 108 data
	 */
	public static boolean isConvertable(Station station) {
		
		if (station.getStationCode() > 0L && station.getStationCode() < 10000000L) {
			return true;
		}
		
		return false;
	}

	/**
	 * Gets the station code.
	 *
	 * @param stationCode the station code
	 * @return the numeric station code
	 */
	public static long getStationCode(String stationCode) {
		
		//pure station code
		if (stationCode == null || stationCode.length() == 0) {
			return 0;
		}
		
		long i = 0;
		
		try {
		
			i = Long.parseLong(stationCode);
		
		} catch (Exception e) {
			
			//maybe its URN format
			String decoded = URI.decode(stationCode);
			String[] parts = decoded.split(":");
			
			try {
				i =  Long.parseLong(parts[parts.length - 1]);
			} catch (Exception e2) {
				return 0;
			}
			
		}
		
		return i;		

	}

	public static Currency getCurrency(String isoCode) {
		
		AccountingViewerData data = AccountingUtils.getAccounting();
		
		if (data.getCodeLists() == null ||
			data.getCodeLists().getCurrencies() == null ||
			data.getCodeLists().getCurrencies().getCurrencies() == null) {
			return null;
		}
		
		for (Currency c : data.getCodeLists().getCurrencies().getCurrencies()){
			if (c.getIsoCode() != null && c.getIsoCode().equals(isoCode)) {
				return c;
			}
		}
		
		return null;
	}
	
	/**
	 * Gets the country code of station from the station code.
	 *
	 * @param stationCode the station code
	 * @return the country of station
	 */
	public static int getCountryOfStation(String stationCode) {
		
		Long codeNum = AccountingUtils.getStationCode(stationCode);
		
		if (codeNum < 1000000) return 0;
		
		//rail code
		if (codeNum < 10000000) {
			return (int) (codeNum / 100000);
		}
		
		// long code
		//type + country
		int typeAndCountry = (int) (codeNum / 100000);
		
		int type = typeAndCountry / 100;
		
		return typeAndCountry - type * 100;

	}

	/**
	 * Gets the local station code from a unique station code.
	 *
	 * @param stationCode the station code
	 * @return the local station code
	 */
	public static long getlocalStationCode(String stationCode) {
		
		Long codeNum = AccountingUtils.getStationCode(stationCode);
		
		if (codeNum < 1000000) return 0;
		
		int typeAndCountry = (int) (codeNum / 100000);
		return codeNum - typeAndCountry * 100000;

	}

	public static Carrier getCarrier(AccountingViewerData tool, String code) {
		if (tool == null ||
			tool.getCodeLists() == null ||
			tool.getCodeLists().getCarriers() == null ||
			tool.getCodeLists().getCarriers().getCarriers() == null ||
			tool.getCodeLists().getCarriers().getCarriers().isEmpty()) {
			return null;
		}
		
		for (Carrier c : tool.getCodeLists().getCarriers().getCarriers()) {
			if (c.getCode().equals(code)) return c;
		}

		return null;
	}



}



