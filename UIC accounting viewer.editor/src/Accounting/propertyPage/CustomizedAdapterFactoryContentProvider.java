package Accounting.propertyPage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.ui.views.properties.IPropertySource;

import Accounting.resourceTree.PartitionedContentProvider;


public class CustomizedAdapterFactoryContentProvider extends PartitionedContentProvider {
	
	
	public CustomizedAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
    protected IPropertySource createPropertySource(Object object, IItemPropertySource itemPropertySource)  {
	    return new CustomizedPropertySource(object, itemPropertySource);
    }

}
