package Accounting.actions;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import Accounting.AccountingViewerData;
import Accounting.nls.NationalLanguageSupport;
import Accounting.utils.AccountingUtils;
import Accounting.utils.ModelInitializer;

public abstract class BasicAction extends BaseSelectionListenerAction {
	
		
		protected IEditingDomainProvider editingDomainProvider = null;
		
	
		public BasicAction(String text, IEditingDomainProvider editingDomainProvider) {
			super(text);
			this.editingDomainProvider = editingDomainProvider;
		}

		public void run() {
			run( this.getStructuredSelection() );
			return;
		}
		
		protected void run(IStructuredSelection structuredSelection) {

			AccountingViewerData tool = AccountingUtils.getAccounting();
			
			EditingDomain domain = AccountingUtils.getActiveDomain();
			
			if (tool == null) {
				AccountingUtils.writeConsoleWarning(NationalLanguageSupport.BasicGtmAction_0,AccountingUtils.getActiveEditor());
				return;
			}
			
			CompoundCommand preparationCommand = ModelInitializer.getPreparationCommand(tool, domain);
			
			if (preparationCommand != null && !preparationCommand.isEmpty()) {
				domain.getCommandStack().execute(preparationCommand);
			}
			
			runAction(tool);
		
		}		


		protected void runAction(AccountingViewerData tool) {			
		};

		protected void prepareStructure(AccountingViewerData tool, EditingDomain domain) {
			if (tool == null) return;
			if (domain == null) return;
			
			CompoundCommand preparationCommand = ModelInitializer.getPreparationCommand(tool, domain);
			if (preparationCommand != null && !preparationCommand.isEmpty() && preparationCommand.canExecute()) {
				domain.getCommandStack().execute(preparationCommand);
			}
		}
		
		protected void prepareStructure() {
			AccountingViewerData tool = AccountingUtils.getAccounting();
			if (tool == null) return;

			EditingDomain domain = AccountingUtils.getActiveDomain();
			if (domain == null) return;
			
			CompoundCommand preparationCommand = ModelInitializer.getPreparationCommand(tool, domain);
			if (preparationCommand != null && !preparationCommand.isEmpty() && preparationCommand.canExecute()) {
				domain.getCommandStack().execute(preparationCommand);
			}
		}

		protected boolean checkSelection(IStructuredSelection selection)
		{
			if (AccountingUtils.getAccounting() == null) return false;
			
			return true;
		}
		
 	
		
	    public boolean updateSelection (IStructuredSelection selection)
	    {
	  		this.setEnabled(false);

	  		if (checkSelection(selection)) 	{
	  			this.setEnabled(true);
	  			return true;
	  		}
	  		return false;
	    }	
	    
	

}
