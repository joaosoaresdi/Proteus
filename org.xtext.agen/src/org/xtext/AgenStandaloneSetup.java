/*
 * generated by Xtext 2.24.0
 */
package org.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AgenStandaloneSetup extends AgenStandaloneSetupGenerated {

	public static void doSetup() {
		new AgenStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
