/*
 * generated by Xtext 2.10.0
 */
package at.ac.tuwien.big.parser.antlr;

import at.ac.tuwien.big.parser.antlr.internal.InternalSimplejavaParser;
import at.ac.tuwien.big.services.SimplejavaGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class SimplejavaParser extends AbstractAntlrParser {

	@Inject
	private SimplejavaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSimplejavaParser createParser(XtextTokenStream stream) {
		return new InternalSimplejavaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SimpleJava";
	}

	public SimplejavaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SimplejavaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}