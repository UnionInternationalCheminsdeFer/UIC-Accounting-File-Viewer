package Accounting.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import Accounting.presentation.AccountingEditorPlugin;


public class PreferenceInitializer extends AbstractPreferenceInitializer
{

	public void initializeDefaultPreferences()
	{
		
		IPreferenceStore store = AccountingEditorPlugin.getPreferenceStore();

		store.setDefault(PreferenceConstants.P_LIST_FOLDER_SIZE, 1000);

	}


}

