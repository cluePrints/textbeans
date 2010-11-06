package net.sf.textbeans.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import fr.umlv.tatoo.cc.parser.grammar.NonTerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.runtime.parser.ParserListener;

public class GrammarParser {
	ReaderGrammarParser parser = new ReaderGrammarParser();

	public GrammarParser compile(String grammarFile) {
		parser.compile(fileToReader(grammarFile));
		return this;
	}

	public void parse(String dataName) {
		parser.parse(fileToReader(dataName));
	}

	public void setParsingListener(
			ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> l) {
		parser.setParsingListener(l);
	}

	static Reader fileToReader(String name) {
		try {
			return new FileReader(name);
		} catch (FileNotFoundException ex) {
			throw new RuntimeException(ex);
		}
	}
}