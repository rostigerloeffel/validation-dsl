/*
* generated by Xtext
*/
package com.isax.validation.dsl;

import org.eclipse.emf.ecore.EPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DslStandaloneSetup extends DslStandaloneSetupGenerated{

	public static void doSetup() {
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
    public void register(Injector injector) {
        if (!EPackage.Registry.INSTANCE.containsKey("http://www.isax.com/validation/dsl/Dsl")) {
            EPackage.Registry.INSTANCE.put("http://www.isax.com/validation/dsl/Dsl", com.isax.validation.dsl.dsl.DslPackage.eINSTANCE);
        }
        super.register(injector);
    }
}
