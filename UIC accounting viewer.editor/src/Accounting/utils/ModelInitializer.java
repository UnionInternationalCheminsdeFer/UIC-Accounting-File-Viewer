package Accounting.utils;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import Accounting.CodeLists;
import Accounting.FareStructure;
import Accounting.AccountingFactory;
import Accounting.AccountingPackage;
import Accounting.AccountingViewerData;

public class ModelInitializer {

	
	/**
	 * Gets the preparation command to initialize the data structure
	 *
	 * @param tool the tool
	 * @param domain the domain
	 * @return the preparation command
	 */
	public static CompoundCommand getPreparationCommand (AccountingViewerData tool, EditingDomain domain) {
		
		CompoundCommand command = new CompoundCommand();
	
	

		
		if (tool.getCodeLists() == null) {
			command.append(new SetCommand(domain, tool, AccountingPackage.Literals.ACCOUNTING_VIEWER_DATA__CODE_LISTS, createInitialCodeLists()));	
		} else {
			
			if (tool.getCodeLists().getCarriers() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),AccountingPackage.Literals.CODE_LISTS__CARRIERS,AccountingFactory.eINSTANCE.createCarriers()));													
			}
			if (tool.getCodeLists().getCountries() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),AccountingPackage.Literals.CODE_LISTS__COUNTRIES,AccountingFactory.eINSTANCE.createCountries()));					
			}
			if (tool.getCodeLists().getCurrencies() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),AccountingPackage.Literals.CODE_LISTS__CURRENCIES,AccountingFactory.eINSTANCE.createCurrencies()));	
			}
			if (tool.getCodeLists().getLanguages() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),AccountingPackage.Literals.CODE_LISTS__LANGUAGES,AccountingFactory.eINSTANCE.createLanguages()));	
			}
			if (tool.getCodeLists().getServiceBrands() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),AccountingPackage.Literals.CODE_LISTS__SERVICE_BRANDS,AccountingFactory.eINSTANCE.createServiceBrands()));	
			}			
			if (tool.getCodeLists().getStations() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),AccountingPackage.Literals.CODE_LISTS__STATIONS,AccountingFactory.eINSTANCE.createStations()));	
			}				
			if (tool.getCodeLists().getNutsCodes() == null) {
				command.append(new SetCommand(domain,tool.getCodeLists(),AccountingPackage.Literals.CODE_LISTS__NUTS_CODES,AccountingFactory.eINSTANCE.createNUTSCodes()));	
			}				
		}
		

		return command;
	}
	
	



	/**
	 * Creates the initial code lists.
	 *
	 * @return the code lists
	 */
	private static CodeLists createInitialCodeLists() {
		CodeLists codes = AccountingFactory.eINSTANCE.createCodeLists();
		codes.setCarriers(AccountingFactory.eINSTANCE.createCarriers());
		codes.setServiceBrands(AccountingFactory.eINSTANCE.createServiceBrands());
		codes.setCountries(AccountingFactory.eINSTANCE.createCountries());
		codes.setCurrencies(AccountingFactory.eINSTANCE.createCurrencies());
		codes.setLanguages(AccountingFactory.eINSTANCE.createLanguages());
		codes.setNutsCodes(AccountingFactory.eINSTANCE.createNUTSCodes());
		codes.setStations(AccountingFactory.eINSTANCE.createStations());
		return codes;
	}




	/**
	 * Populate initial model.
	 *
	 * @param tool the tool
	 */
	public static void populateInitialModel(AccountingViewerData tool){
		
		tool.setCodeLists(createInitialCodeLists());
			
		CodeListInitializer.populateServiceBrands(tool.getCodeLists().getServiceBrands());
		CodeListInitializer.populateUICcountries(tool.getCodeLists().getCountries());
		CodeListInitializer.populateCurrencies(tool.getCodeLists().getCurrencies());
		CodeListInitializer.populateUICLaguages(tool.getCodeLists().getLanguages());

		
	}
	
	

	
	public static Command getLinkReductionCardClassesCommand(FareStructure fareStructure, EditingDomain domain) {
		
		CompoundCommand command = new CompoundCommand();
		
		if (fareStructure == null ||
			fareStructure.getServiceClassDefinitions() == null ||
			fareStructure.getServiceClassDefinitions().getServiceClassDefinitions() == null ||
			fareStructure.getReductionCards() == null ||
			fareStructure.getReductionCards().getReductionCards() == null) {
			return null;
		}
		
				
		if (!command.isEmpty()) return command;
		return null;
		
	}
	

	

	
}
