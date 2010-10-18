package net.sf.textbeans.internal.grammar;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.collect.Lists;

public class Compiler {
	private static final Pattern regex = Pattern.compile("\\s*(\\w+)\\s*=\\s*(\\S+)\\s*");
	public List<Tokenizer> generateTokenizers(Reader grammarSource) {
		try {
			List<Tokenizer> tokenizers = Lists.newLinkedList();
			BufferedReader r = new BufferedReader(grammarSource);
			String s;
			do {
				s = r.readLine();
				if (s == null) 
					break;
				
				Matcher m = regex.matcher(s);
				if (m.matches()) {
					String name = m.group(1);
					String regexStr = m.group(2);
					Tokenizer t = new RegexTokenizer(TokenType.getInstance(name), regexStr);
					tokenizers.add(t);
				} else {
					if (!s.matches("\\s+")) 
						throw new RuntimeException("Syntax error: "+s);
				}
			} while (s != null); 
			return tokenizers;
		} catch (Exception ex) {
			throw new RuntimeException(ex);

		}
	}
}