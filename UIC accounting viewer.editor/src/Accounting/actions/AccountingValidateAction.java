package Accounting.actions;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.edit.ui.action.ValidateAction;

import Accounting.problems.AccountingProblemView;
import Accounting.utils.AccountingUtils;




public class AccountingValidateAction extends ValidateAction {
	
	
	  public AccountingValidateAction() {
		  super();
		  this.setToolTipText(super.getText());
		  setImageDescriptor(AccountingUtils.getImageDescriptor("/icons/validate.png")); //$NON-NLS-1$
	  }
	
	  protected void handleDiagnostic(Diagnostic diagnostic) {
		  super.handleDiagnostic(diagnostic); 
		  AccountingProblemView.getInstance().setRootDiagnostic(diagnostic);
	  }
	  
	  
	  public void run() {
		  AccountingProblemView.getInstance().clearContent();
		  AccountingProblemView.getInstance().setRootDiagnostic(null);
		  super.run();
	  }

}
