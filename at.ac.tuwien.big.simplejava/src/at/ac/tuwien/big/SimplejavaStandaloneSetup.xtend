/*
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SimplejavaStandaloneSetup extends SimplejavaStandaloneSetupGenerated {

	def static void doSetup() {
		new SimplejavaStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}