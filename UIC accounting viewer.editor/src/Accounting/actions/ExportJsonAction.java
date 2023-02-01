package Accounting.actions;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.prefs.BackingStoreException;

import Accounting.AccountingViewerData;
import Accounting.presentation.AccountingEditor;
import Accounting.presentation.AccountingEditorPlugin;
import Accounting.resourceTree.DirtyCommand;
import Accounting.utils.AccountingUtils;
import accountingModelV1.AccountingDataDelivery;
import export.ExportAccountingFile;




public class ExportJsonAction extends BasicAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ExportJsonAction(IEditingDomainProvider editingDomainProvider) {
			super("Export accounting data in json format", editingDomainProvider);
			this.editingDomainProvider = editingDomainProvider;
			this.setToolTipText(this.getText());
			setImageDescriptor(AccountingUtils.getImageDescriptor("/icons/export24.png")); //$NON-NLS-1$
		}
		
		public ExportJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(AccountingUtils.getImageDescriptor("/icons/exportGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

		
		protected void run (IStructuredSelection structuredSelection) {
			
			final AccountingViewerData accounting = AccountingUtils.getAccounting();
			
			final EditingDomain domain = AccountingUtils.getActiveDomain();
			
			final AccountingEditor editor = AccountingUtils.getActiveEditor();
			
			if (accounting == null ||
				accounting.getAccountingFile() == null ||
				accounting.getAccountingFile().getAccountingRecords() == null ||
				accounting.getAccountingFile().getAccountingRecords().getAccountingRecords() == null ||
				accounting.getAccountingFile().getAccountingRecords().getAccountingRecords().isEmpty() ) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("No data available for export");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}
			
			if (accounting.getAccountingFile() == null || 
				accounting.getAccountingFile().getAccountingDelivery() == null ) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Delivery Data are missing");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}
			
			if (accounting.getAccountingFile() == null || 
				accounting.getAccountingFile().getAccountingDelivery().getCreationDate() == null ) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Creation Date in Delivery Data is missing");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}

			if (accounting.getAccountingFile() == null || 
					accounting.getAccountingFile().getAccountingDelivery().getInvoiceRecipient() == null ) {
					MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText("Invoice Recipient in Delivery Data is missing");
					dialog.setMessage(dialog.getText());
					dialog.open(); 
					return;
			}
			
			if (accounting.getAccountingFile() == null || 
					accounting.getAccountingFile().getAccountingDelivery().getInvoicingParty() == null ) {
					MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
					dialog.setText("Invoicing Party in Delivery Data is missing");
					dialog.setMessage(dialog.getText());
					dialog.open(); 
					return;
			}
			
			if (accounting.getAccountingFile() == null || 
				accounting.getAccountingFile().getAccountingRecords() == null || 
				accounting.getAccountingFile().getAccountingRecords().getAccountingRecords() == null ||
				accounting.getAccountingFile().getAccountingRecords().getAccountingRecords().isEmpty()) {
				
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Accounting Records missing");
				dialog.setMessage(dialog.getText());
				dialog.open(); 
				return;
			}
			

			
			String name = accounting.getAccountingFile().getAccountingDelivery().getInvoicingParty().getShortName()
					+ "_"
					+ accounting.getAccountingFile().getAccountingDelivery().getInvoiceRecipient().getShortName()
					+ "_"
					+ accounting.getAccountingFile().getAccountingDelivery().getCreationDate().toString();
		
            final File file = getFile(name);
			if (file == null) {
				return;
			}

			final AccountingJsonExporter jsonModelExporterV1 = new AccountingJsonExporter();
	
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
						
						monitor.beginTask("Export Accounting Data", 31); 

						AccountingUtils.addWorkflowStep("Export started to accounting file: " + file.getName(), editor);
						
						/*
						monitor.subTask("Delete unused elements");
						AccountingUtils.deleteOrphanedObjects(domain, accounting);
						prepareStructure(accounting,domain);
						monitor.worked(1);
						*/
					
	
						AccountingDataDelivery accountingV1 = null;

						monitor.subTask("Converting to json format");		
						accountingV1 = jsonModelExporterV1.convertToJson(accounting.getAccountingFile(), monitor);
						AccountingUtils.writeConsoleInfo("Export to Accounting File started", editor);
													
						monitor.worked(1);	 	
						monitor.subTask("Writing to json file");
						try {
							ExportAccountingFile.exportFareDelivery(accountingV1, file);
						} catch (IOException ioe){
							AccountingUtils.displayAsyncErrorMessage(ioe,"format error");
						} catch (Exception e) {
							AccountingUtils.displayAsyncErrorMessage(e," file error");
						}
						monitor.worked(1);
						
						AccountingUtils.addWorkflowStep("Export completed to file: " + file.getName(), editor);
						AccountingUtils.writeConsoleInfo("Export completed to file: " + file.getName(), editor);
					} catch (Exception e) {
						AccountingUtils.addWorkflowStep("Export abandoned to file: " + file.getName(), editor);
						AccountingUtils.writeConsoleError("Export failed", editor);
						AccountingUtils.writeConsoleStackTrace(e, editor);
						
					}  finally {
											
						monitor.done();
					}
				}
			};

			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
				
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);
			
				//workaround for wrong dirty indication
				domain.getCommandStack().execute(new DirtyCommand());
				
			} catch (Exception e) {
				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Export of Accounting Data failed");
				if (e.getMessage()!= null) {
					dialog.setMessage(e.getMessage());
				} else {
					dialog.setMessage("Export of Accounting Data failed");
					AccountingUtils.writeConsoleStackTrace(e, editor);
				}
				dialog.open(); 
				AccountingEditorPlugin.INSTANCE.log(e);
			} finally {
				editor.reconnectViews();
			}
		}		
		

		private File getFile(String name) {
		    Shell shell = Display.getDefault().getActiveShell();
		    shell.open();
		    FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		    dialog.setFilterExtensions(new String[] { "*.json"});  //$NON-NLS-1$
		    
		    String lastPath = getLastPath();
			dialog.setFilterPath(lastPath); 
			
			dialog.setFileName(name);
			
		    String path = dialog.open();

		    storeLastPath(path);
		    File file = new File(path);
		    
		    return file;
	    
		}

		private void storeLastPath(String path) {

			// saves plugin preferences at the workspace level
			 IEclipsePreferences prefs =  InstanceScope.INSTANCE.getNode(AccountingEditorPlugin.PLUGIN_ID); // does all the above behind the scenes

			 if (path == null || path.isEmpty()) return;
			 
			  prefs.put("LAST_PATH", path); //$NON-NLS-1$
			  try {
			    // prefs are automatically flushed during a plugin's "super.stop()".
			    prefs.flush();
			  } catch(BackingStoreException e) {
			    // not important
			  }

		}

		private String getLastPath() {

		  IEclipsePreferences prefs = InstanceScope.INSTANCE.getNode(AccountingEditorPlugin.PLUGIN_ID);
		  // you might want to call prefs.sync() if you're worried about others changing your settings
		  return prefs.get("LAST_PATH","c:\\"); //$NON-NLS-1$ //$NON-NLS-2$
		}

		
		

}
