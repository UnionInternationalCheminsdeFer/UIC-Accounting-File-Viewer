package Accounting.propertyPage;

import java.util.UUID;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class UuidCellEditor extends DialogCellEditor {
	
	UuidCellEditor(Composite composite){
		super(composite);
	}

    protected Button createButton(Composite parent) {
        Button result = new Button(parent, SWT.DOWN);
        result.setText("new id"); //$NON-NLS-1$
        return result;
    }
    
	@Override
	protected Object openDialogBox(Control arg0) {
		UUID id = UUID.randomUUID();
		//this.doSetValue(id.toString());
		return id.toString();
	}

}