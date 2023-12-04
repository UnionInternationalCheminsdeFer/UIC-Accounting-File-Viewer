package Accounting.actions;

import java.io.File;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;


import Accounting.AccountingRecord;
import Accounting.AccountingViewerData;
import Accounting.nls.NationalLanguageSupport;
import Accounting.presentation.AccountingEditor;
import Accounting.presentation.AccountingEditorPlugin;
import Accounting.reporting.SummaryCalculator;
import Accounting.utils.AccountingUtils;




public class ShowSummaryAction extends BasicAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ShowSummaryAction(IEditingDomainProvider editingDomainProvider) {
			super("Show Accounting Summary", editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(AccountingUtils.getImageDescriptor("/icons/summary24.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ShowSummaryAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(AccountingUtils.getImageDescriptor("/icons/summary.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

   
		protected File getFile(){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(NationalLanguageSupport.ShowSummary);
	        String[] filterExt = { "*.json" }; //$NON-NLS-1$
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return new File(path);
			
		}
		
		
		protected void run (IStructuredSelection structuredSelection) {
			
			final AccountingViewerData accounting = AccountingUtils.getAccounting();
			
			final AccountingEditor editor = AccountingUtils.getActiveEditor();

			
			String summary = null;
			
			if (accounting == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("No Accounting Data Available");
				dialog.open(); 
				return;
			}
			
			if (accounting.getCodeLists() == null ||
				accounting.getCodeLists().getCarriers() == null ||
				accounting.getCodeLists().getCarriers().getCarriers() == null ||
				accounting.getCodeLists().getCarriers().getCarriers().isEmpty()
				) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Carrier Code List is Missing");
				dialog.open(); 
				return;
			}

			
			final SummaryCalculator calculator = new SummaryCalculator(accounting.getAccountingFile().getAccountingDelivery());

			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
					
						monitor.beginTask("Calculating Summary", accounting.getAccountingFile().getAccountingRecords().getAccountingRecords().size()); 
						
						
						for (AccountingRecord rec : accounting.getAccountingFile().getAccountingRecords().getAccountingRecords()) {
							
							calculator.addAccountingRecord(rec);
							monitor.worked(1);
							
						}					
												
						AccountingUtils.addWorkflowStep("Summary completed", editor);
						
					} finally {
						monitor.done();
					}
				}
			};	
			
			try {
		
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);
				
				summary = calculator.getSummary();

			} catch (Exception e) {
				AccountingUtils.displayAsyncErrorMessage(e,"unknown error");

				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Summary failed");
				if (e.getMessage()!= null) {
					dialog.setMessage(e.getMessage());
					AccountingUtils.writeConsoleStackTrace(e, editor);
				} else {
					dialog.setMessage("no details available");
					AccountingUtils.writeConsoleStackTrace(e, editor);
				}

				dialog.open(); 				
								
				e.printStackTrace();
				// Something went wrong that shouldn't.
				AccountingEditorPlugin.INSTANCE.log(e);
			} finally {
				
				AccountingUtils.writeConsoleInfo('\n' + summary, editor);
				
				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Accounting Summary: " + '\n');
				
				if (summary != null) {
					dialog.setMessage(summary);
				} else {
					dialog.setMessage("no summary available");
				}

				dialog.open();
			}			

			return;

		}



	

}
