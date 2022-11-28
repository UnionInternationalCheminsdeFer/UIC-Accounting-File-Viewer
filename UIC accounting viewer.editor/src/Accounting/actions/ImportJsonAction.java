package Accounting.actions;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;

import Accounting.AccountingFile;
import Accounting.AccountingPackage;
import Accounting.AccountingViewerData;
import Accounting.nls.NationalLanguageSupport;
import Accounting.presentation.AccountingEditor;
import Accounting.presentation.AccountingEditorPlugin;
import Accounting.utils.AccountingUtils;
import accountingModelV1.AccountingDataDelivery;
import export.ImportAccountingDelivery;




public class ImportJsonAction extends BasicAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
		public ImportJsonAction(IEditingDomainProvider editingDomainProvider) {
			super("Import Accounting File", editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(AccountingUtils.getImageDescriptor("/icons/import24.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}
		
		public ImportJsonAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text, editingDomainProvider);
			this.setToolTipText(this.getText());
			setImageDescriptor(AccountingUtils.getImageDescriptor("/icons/importGtm.png")); //$NON-NLS-1$
			this.editingDomainProvider = editingDomainProvider;
		}

   
		protected File getFile(){
			
	        FileDialog fd = new FileDialog( Display.getDefault().getActiveShell(), SWT.READ_ONLY);
	        fd.setText(NationalLanguageSupport.ImportGTMJsonAction_1);
	        String[] filterExt = { "*.json" }; //$NON-NLS-1$
	        fd.setFilterExtensions(filterExt);
	        String path = fd.open();
	        
	        if (path == null || path.length() < 1 ) return null;
	        
	        return new File(path);
			
		}
		
		
		protected void run (IStructuredSelection structuredSelection) {
			
			final AccountingViewerData accounting = AccountingUtils.getAccounting();
			
			final AccountingEditor editor = AccountingUtils.getActiveEditor();
			
			final EditingDomain domain = AccountingUtils.getActiveDomain();
			
			if (accounting == null) {
				MessageBox dialog =  new MessageBox(Display.getDefault().getActiveShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText(NationalLanguageSupport.ImportGTMJsonAction_3);
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

			
			
			final File file = getFile();
			if (file == null) return;
			
			final AccountingJsonImporter importer = new AccountingJsonImporter(accounting, domain, editor);
			
			IRunnableWithProgress operation =	new IRunnableWithProgress() {
				// This is the method that gets invoked when the operation runs.

				public void run(IProgressMonitor monitor) {
					
					try {
					
						monitor.beginTask("Import of Accountig File", 5); 
						
						AccountingUtils.addWorkflowStep("Import started for file: " + file.getName(), editor);
						
						
						monitor.subTask("Prepare Data Structure");
						AccountingUtils.deleteOrphanedObjects(domain, accounting);
						prepareStructure(accounting,domain);
						monitor.worked(1);
					
						monitor.subTask("Read File");
						AccountingDataDelivery accountingDataDelivery;
						try {
							accountingDataDelivery = ImportAccountingDelivery.importAccountingFile(file);
						} catch (IOException e) {
							AccountingUtils.displayAsyncErrorMessage(e,"file error");
							monitor.done();
							return;
						} catch (Exception e) {
							AccountingUtils.writeConsoleError(e.getMessage(), editor);
							monitor.done();
							return;
						}
						monitor.worked(1);
					
						int deliveredAccountingRecords = 0;
						if (accountingDataDelivery != null &&
							accountingDataDelivery.getAccountingRecords() != null) {
							deliveredAccountingRecords = accountingDataDelivery.getAccountingRecords().size();						
						}
						
						int importedAccountingRecords = 0;
										
						
						if (accountingDataDelivery != null &&
							accountingDataDelivery.getDeliveryDetails() != null) {
							monitor.subTask("Import Records");
							AccountingFile accountingFile = importer.convertFromJson(accountingDataDelivery);
							if (accountingFile != null &&
								accountingFile.getAccountingRecords() != null &&
								accountingFile.getAccountingRecords().getAccountingRecords() != null && 
								accountingFile.getAccountingRecords().getAccountingRecords().size() != 0) {
								importedAccountingRecords = accountingFile.getAccountingRecords().getAccountingRecords().size();
							}
							monitor.worked(1);

							monitor.subTask("Add Accounting Records to Viewer Model");
							SetCommand command = new SetCommand(domain, accounting, AccountingPackage.Literals.ACCOUNTING_VIEWER_DATA__ACCOUNTING_FILE, accountingFile);
							if (command.canExecute()) {
								domain.getCommandStack().execute(command);
							}	
							monitor.worked(1);
						} 
						

						AccountingUtils.deleteOrphanedObjects(domain, accounting);
							
					
						monitor.worked(1);
						
						StringBuilder sb = new StringBuilder();
						sb.append("Accounting File Import Completed: ");
						sb.append("Delivered accounting records: ");
						sb.append(deliveredAccountingRecords);
						sb.append(" / imported: ");
						sb.append(importedAccountingRecords);
						
						AccountingUtils.writeConsoleInfo(sb.toString(), editor);
						
						AccountingUtils.addWorkflowStep("Import completed for Accounting File: " + file.getName(), editor);
					} finally {
						monitor.done();
					}
				}
			};	
			
			try {
				// This runs the operation, and shows progress.
				editor.disconnectViews();
		
				new ProgressMonitorDialog(editor.getSite().getShell()).run(true, false, operation);

			} catch (Exception e) {
				AccountingUtils.displayAsyncErrorMessage(e,"unknown error");
				MessageBox dialog =  new MessageBox(editor.getSite().getShell(), SWT.ICON_ERROR | SWT.OK);
				dialog.setText("Import from JSON failed");
				if (e.getMessage()!= null) {
					dialog.setMessage(e.getMessage());
					AccountingUtils.writeConsoleStackTrace(e, editor);
				} else {
					dialog.setMessage("no details available");
					AccountingUtils.writeConsoleStackTrace(e, editor);
				}
				AccountingUtils.addWorkflowStep("Import abandoned for file: " + file.getName(), editor);

				dialog.open(); 				
				
				
				e.printStackTrace();
				// Something went wrong that shouldn't.
				AccountingEditorPlugin.INSTANCE.log(e);
			} finally {
				editor.reconnectViews();
			}			

			return;

		}



	

}
