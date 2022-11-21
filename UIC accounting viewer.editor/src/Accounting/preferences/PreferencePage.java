package Accounting.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

import Accounting.nls.NationalLanguageSupport;
import Accounting.presentation.AccountingEditorPlugin;
import Accounting.PropertyAdapter;



public class PreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage
{


	public PreferencePage()
	{
		super(GRID);
		setPreferenceStore(AccountingEditorPlugin.getPreferenceStore());
		this.setTitle(NationalLanguageSupport.PreferencePage_0);
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors()
	{

    	
        
    	addField(
					new IntegerFieldEditor(
							PreferenceConstants.P_LIST_FOLDER_SIZE,
							NationalLanguageSupport.PreferencePage_folder_size,
							getFieldEditorParent()));
        
    	
	};


	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench)	{

		// second parameter is typically the plug-in id
	    setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, "GTM_data_converter.editor")); //$NON-NLS-1$
	    setDescription(NationalLanguageSupport.PreferencePage_4);
	    //provide access to the edit module
	    PropertyAdapter.getInstance().setStore(AccountingEditorPlugin.getPreferenceStore());

	}
}

