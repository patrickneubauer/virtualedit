/*
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.simpleaspect.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SimpleAspectAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("at/ac/tuwien/big/simpleaspect/parser/antlr/internal/InternalSimpleAspect.tokens");
	}
}
