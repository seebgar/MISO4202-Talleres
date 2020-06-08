/*
 * generated by Xtext 2.20.0
 */
package org.example.entities.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.example.entities.EntitiesRuntimeModule;
import org.example.entities.EntitiesStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class EntitiesIdeSetup extends EntitiesStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new EntitiesRuntimeModule(), new EntitiesIdeModule()));
	}
	
}
