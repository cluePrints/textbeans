package net.sf.textbeans.beaver;

import java.io.Reader;

import beaver.comp.ParserGenerator;
import beaver.comp.io.SrcReader;
import beaver.comp.run.Options;
import beaver.comp.util.Log;
import beaver.spec.Grammar;

public class RuntimeParserGenerator {
	public RuntimeParser compile(Reader grammarIn) {
		try {
			SrcReader src = new SrcReader(grammarIn);
			Options opt = new Options();
			opt.no_compression = false;
			Log log = new Log();
			Grammar grammar = ParserGenerator.parseGrammar(src, log);
			ParserGenerator.CompiledParser parser = ParserGenerator.compile(
					grammar, opt, log);
			String tables = parser.encodeParsingTables();
			RuntimeParser myParser = new RuntimeParser(grammar, tables);
			return myParser;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
