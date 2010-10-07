package net.sf.textbeans.internal.grammar;

import java.util.HashMap;
import java.util.Map;

public class TokenType {
	private final String name;
	private static Map<String, TokenType> types = new HashMap<String, TokenType>();
	private TokenType(String name) {
		super();
		this.name = name;
	}
	
	public static synchronized TokenType getInstance(String name)
	{
		TokenType result = types.get(name);
		if (result == null) {
			result = new TokenType(name);
		}
		return result;
	}

	public String getName() {
		return name;
	}
}
