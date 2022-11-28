package Accounting.propertyPage;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import Accounting.AccountingPackage;

public class CustomizedPropertySource extends PropertySource {

	public CustomizedPropertySource(Object object, IItemPropertySource itemPropertySource) {
		super(object, itemPropertySource);
	}
	
    @Override
    protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
     	   
        
          return new PropertyDescriptor(object, itemPropertyDescriptor)   {
         	    
        	  
              @Override
              public CellEditor createPropertyEditor(Composite composite) {
                
            	Object feature = itemPropertyDescriptor.getFeature(this.object);
            	  
                if ( 
                		feature instanceof EStructuralFeature && 
                		((EStructuralFeature)feature).equals(AccountingPackage.Literals.ACCOUNTING_DELIVERY__ID)
                     || 
                        feature instanceof EStructuralFeature && 
                        ((EStructuralFeature)feature).equals(AccountingPackage.Literals.ACCOUNTING_RECORD__ID)
                   ) {
		           return new UuidCellEditor(composite);
				} else {
             	   return super.createPropertyEditor(composite);
                }
             }
         };
      }

}
