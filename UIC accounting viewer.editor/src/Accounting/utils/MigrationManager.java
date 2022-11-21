package Accounting.utils;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import Accounting.AccountingFactory;
import Accounting.AccountingPackage;
import Accounting.AccountingViewerData;
import Accounting.Countries;
import Accounting.Country;
import Accounting.Currencies;
import Accounting.Currency;
import Accounting.presentation.AccountingEditor;


public class MigrationManager {

	public static void migrate(AdapterFactoryEditingDomain domain, AccountingEditor editor) {
		
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		if (resource == null) return;
		
		TreeIterator<EObject> it = resource.getAllContents();
		if (it == null) return;
		
		EObject object = it.next();
		
		if (object == null) return;
	
		runMigration(domain, editor);
		

	}


	/**
	 * Run migration.
	 *
	 * @param domain the domain
	 * @param editor the editor
	 */
	private static void runMigration(EditingDomain domain, AccountingEditor editor) {
		
		
		Resource resource = domain.getResourceSet().getResources().get(0);
	   	
		TreeIterator<EObject> it = resource.getAllContents();
		EObject object = it.next();
		
		if (object == null) return;

		
		AccountingViewerData data = null;
		
		if (!(object instanceof AccountingViewerData)){
			return;
		} else {
			data = (AccountingViewerData) object;
		}
		
		CompoundCommand com = ModelInitializer.getPreparationCommand(data, domain);
		if (com != null && !com.isEmpty() && com.canExecute()) {
			domain.getCommandStack().execute(com);
		}
		
		updateCountries(data,editor);

		updateCurrencies(data,editor);

		return;

	}
	
	
	private static void updateCountries(AccountingViewerData tool, AccountingEditor editor) {
		
		Countries cs = AccountingFactory.eINSTANCE.createCountries();
		
		CodeListInitializer.populateUICcountries(cs);
		
		CompoundCommand com = new CompoundCommand();
		
		for (Country c : cs.getCountries()) {
			
			boolean found = false;
			
			for (Country oldC : tool.getCodeLists().getCountries().getCountries()) {
				
				if (c.getCode() == oldC.getCode()) {
					found = true;
					if (!oldC.getISOcode().equals(c.getISOcode())) {
						com.append(SetCommand.create(editor.getEditingDomain(),oldC,AccountingPackage.Literals.COUNTRY__IS_OCODE,c.getISOcode() ));
					}
					if (!oldC.getName().equals(c.getName())) {
						com.append(SetCommand.create(editor.getEditingDomain(),oldC,AccountingPackage.Literals.COUNTRY__NAME,c.getName()));
					}
					if (oldC.getDefaultCharacterSet() == null || !c.getDefaultCharacterSet().equals(oldC.getDefaultCharacterSet())) {
						com.append(SetCommand.create(editor.getEditingDomain(),oldC,AccountingPackage.Literals.COUNTRY__DEFAULT_CHARACTER_SET,c.getDefaultCharacterSet()));
					}
				}
			}
			
			if (!found) {
				com.append(AddCommand.create(editor.getEditingDomain(),tool.getCodeLists().getCountries(), AccountingPackage.Literals.COUNTRIES__COUNTRIES,c));
			}

		}
		
		for (Country oldC : tool.getCodeLists().getCountries().getCountries()) {

			boolean found = false;
			
			for (Country c : cs.getCountries()) {
				
				if (c.getCode() == oldC.getCode()) {
					found = true;
				}
				
			}
			
			if (!found) {
				com.append(DeleteCommand.create(editor.getEditingDomain(), oldC));
			}
			
		}
		

		if (!com.isEmpty() && com.canExecute()) {
			editor.getEditingDomain().getCommandStack().execute(com);
			AccountingUtils.writeConsoleInfo("Countries updated", editor);
		}
		
	}

	private static void updateCurrencies(AccountingViewerData tool, AccountingEditor editor) {
		
		Currencies cs = AccountingFactory.eINSTANCE.createCurrencies();
		
		CodeListInitializer.populateCurrencies(cs);
		
		CompoundCommand com = new CompoundCommand();
		
		for (Currency c : cs.getCurrencies()) {
			
			boolean found = false;
			
			for (Currency oldC : tool.getCodeLists().getCurrencies().getCurrencies()) {
				
				if (c.getIsoCode().equals(oldC.getIsoCode())) {
					found = true;
					if (!oldC.getName().equals(c.getName())) {
						com.append(SetCommand.create(editor.getEditingDomain(),oldC,AccountingPackage.Literals.CURRENCY__NAME,c.getName()));
					}
				}
			}
			
			if (!found) {
				com.append(AddCommand.create(editor.getEditingDomain(),tool.getCodeLists().getCurrencies(), AccountingPackage.Literals.CURRENCIES__CURRENCIES,c));
			}

		}
		
		

		if (!com.isEmpty() && com.canExecute()) {
			editor.getEditingDomain().getCommandStack().execute(com);
			AccountingUtils.writeConsoleInfo("Currencies updated", editor);
		}
		
	}
}
