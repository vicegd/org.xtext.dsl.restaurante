/*
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.dsl.restaurante.ui.internal.RestauranteActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RestauranteExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RestauranteActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RestauranteActivator.getInstance().getInjector(RestauranteActivator.ORG_XTEXT_DSL_RESTAURANTE_RESTAURANTE);
	}
	
}
