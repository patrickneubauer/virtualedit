/*
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simpleaspect.ui;

import at.ac.tuwien.big.simpleaspect.ui.internal.SimpleaspectActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SimpleAspectExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SimpleaspectActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SimpleaspectActivator.getInstance().getInjector(SimpleaspectActivator.AT_AC_TUWIEN_BIG_SIMPLEASPECT_SIMPLEASPECT);
	}
	
}