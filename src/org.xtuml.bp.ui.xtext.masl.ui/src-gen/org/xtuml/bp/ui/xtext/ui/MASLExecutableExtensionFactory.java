/*
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.ui.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtuml.bp.ui.xtext.masl.ui.internal.MaslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MASLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MaslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MaslActivator.getInstance().getInjector(MaslActivator.ORG_XTUML_BP_UI_XTEXT_MASL);
	}
	
}
