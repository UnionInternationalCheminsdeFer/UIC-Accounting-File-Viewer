package Accounting.actions;

import java.util.Collection;
import java.util.Iterator;


import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;

import Accounting.AccountingViewerData;
import Accounting.nls.NationalLanguageSupport;
import Accounting.resourceTree.VirtualFolderItemProvider;
import Accounting.utils.AccountingUtils;





public class DeleteFolderAction extends DeleteAction implements ISelectionChangedListener {
	
	private Collection<?> folderSelection = null;
	
	public DeleteFolderAction() {
		  super();
    }
	
	public DeleteFolderAction(boolean removeAllReferencesOnDelete) {
		super(removeAllReferencesOnDelete);
	}

	public void run() {
		
		if (checkFolderSelection(folderSelection)) {
			runFolderDelete(folderSelection);
		} else {
			super.run();
		}
		return;
	}
	
	@Override
	public Command createCommand(Collection<?> selection) {
		 
	  		if (checkFolderSelection(selection)) 	{
	  			return createFolderDeleteCommand(selection);
	  		} else {
	  			return super.createCommand(selection);
	  		}
		 
	 }
	
    public boolean updateSelection (IStructuredSelection selection)   {
    	
  		setEnabled(false);

  		if (checkFolderSelection(selection.toList())) 	{
  			setEnabled(true);
  			folderSelection = selection.toList();	
  			return true;
  		} else {
  			folderSelection = null;
  		   	setEnabled(super.updateSelection(selection));
  			return super.isEnabled();
  		}
    }	
	
	protected boolean checkFolderSelection(Collection<?> selection)	{
				
			if (AccountingUtils.getAccounting() == null) return false;
			
			if (selection == null || selection.isEmpty()) return false;
						
			Iterator<?> it = selection.iterator();
			
			while (it.hasNext()) {
				
				if (!(it.next() instanceof VirtualFolderItemProvider)) {
					return false;
				}
			}
 			
			return true;
		}
		  
	
	protected CompoundCommand createFolderDeleteCommand(Collection<?> selection) {

		AccountingViewerData tool = AccountingUtils.getAccounting();
				
		EditingDomain domain = AccountingUtils.getActiveDomain();
				
		if (tool == null) {
			AccountingUtils.writeConsoleWarning(NationalLanguageSupport.BasicGtmAction_0,AccountingUtils.getActiveEditor());
			return null;
		}
				
		Iterator<?> it = selection.iterator();
		CompoundCommand compoundCommand = new CompoundCommand();
		
		while (it.hasNext()) {
			Object nextObject = it.next();
			if (nextObject instanceof VirtualFolderItemProvider) {
				Command com = DeleteCommand.create(domain, ((VirtualFolderItemProvider)nextObject).getFolderContent());
				compoundCommand.append(com);
			}
		}
		
		return compoundCommand;
		


	  }

	  
	protected void runFolderDelete(Collection<?> structuredSelection) {
		
		CompoundCommand compoundCommand =  createFolderDeleteCommand(structuredSelection);
		
		if (compoundCommand != null && !compoundCommand.isEmpty() && compoundCommand.canExecute()) {
			domain.getCommandStack().execute(compoundCommand);
		}

	  }

}
