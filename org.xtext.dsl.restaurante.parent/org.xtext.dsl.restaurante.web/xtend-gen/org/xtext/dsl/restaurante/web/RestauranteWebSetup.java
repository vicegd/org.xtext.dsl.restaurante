/**
 * generated by Xtext 2.12.0
 */
package org.xtext.dsl.restaurante.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.dsl.restaurante.RestauranteRuntimeModule;
import org.xtext.dsl.restaurante.RestauranteStandaloneSetup;
import org.xtext.dsl.restaurante.ide.RestauranteIdeModule;
import org.xtext.dsl.restaurante.web.RestauranteWebModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class RestauranteWebSetup extends RestauranteStandaloneSetup {
  @Override
  public Injector createInjector() {
    RestauranteRuntimeModule _restauranteRuntimeModule = new RestauranteRuntimeModule();
    RestauranteIdeModule _restauranteIdeModule = new RestauranteIdeModule();
    RestauranteWebModule _restauranteWebModule = new RestauranteWebModule();
    return Guice.createInjector(Modules2.mixin(_restauranteRuntimeModule, _restauranteIdeModule, _restauranteWebModule));
  }
}
