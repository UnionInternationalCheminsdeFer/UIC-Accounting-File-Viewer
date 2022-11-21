package Accounting.presentation;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.dialogs.PatternFilter;

import Accounting.ViaStation;

public class AccountingPatternFilter extends PatternFilter {
	
	boolean isVisible(Viewer viewer,Object element) {
		
		if (element instanceof ViaStation) {	
			if (((ViaStation) element).getStation() != null) {
				return super.wordMatches(((ViaStation) element).getStation().getCode());
			}
		}
		return false;
		
	}

}
