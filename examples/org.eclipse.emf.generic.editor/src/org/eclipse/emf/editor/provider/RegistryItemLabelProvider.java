package org.eclipse.emf.editor.provider;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry;

/**
 * @author Dennis Hübner - Initial contribution and API
 *
 */
public class RegistryItemLabelProvider implements IItemLabelProvider {

	private Map<String, AdapterFactory> _cache = new HashMap<String, AdapterFactory>();

	public Object getImage(Object element) {
		IItemLabelProvider itemlabelProvider = findItemLabelProvider(element);
		if (itemlabelProvider != null) {
			return itemlabelProvider.getImage(element);
		}
		return null;
	}

	public String getText(Object element) {
		IItemLabelProvider itemlabelProvider = findItemLabelProvider(element);
		if (itemlabelProvider != null) {
			return itemlabelProvider.getText(element);
		}
		return null;
	}

	private IItemLabelProvider findItemLabelProvider(Object element) {
		String nsURI = ((EObject) element).eClass().getEPackage().getNsURI();
		AdapterFactory adapterFactory = _cache.get(nsURI);
		IItemLabelProvider itemlabelProvider;
		if (adapterFactory == null) {
			Registry composedAdapterFactoryRegistry = ComposedAdapterFactory.Descriptor.Registry.INSTANCE;
			Descriptor descriptor = composedAdapterFactoryRegistry
					.getDescriptor(Arrays
							.asList(new Object[] { nsURI.toString(),
									"org.eclipse.emf.edit.provider.IItemLabelProvider" }));
			if (descriptor != null) {
				adapterFactory = descriptor.createAdapterFactory();
				_cache.put(nsURI, adapterFactory);
			}
		}
		if (adapterFactory != null) {
			itemlabelProvider = (IItemLabelProvider) adapterFactory.adapt(
					element, IItemLabelProvider.class);
			return itemlabelProvider;
		}
		return null;
	}

}
