package net.sf.textbeans.internal.grammar;

import java.util.HashMap;
import java.util.Map;

public class TokenType {
	private final String name;
	private static Map<String, TokenType> types = new HashMap<String, TokenType>();
	private static Map<TokenType, Integer> typeIds = new HashMap<TokenType, Integer>();
	private static int idCount=0;
	
	private static final String EOF_STR = "end-of-file";
	public static final TokenType EOF = TokenType.getInstance(EOF_STR);

	
	private TokenType(String name) {
		super();
		this.name = name;
	}
	
	public static synchronized TokenType getInstance(String name)
	{
		TokenType result = types.get(name);
		if (result == null) {
			result = new TokenType(name);
			typeIds.put(result, idCount);
			types.put(name, result);
			idCount++;
		}
		return result;
	}
	
	public static synchronized Integer getId(TokenType type)
	{
		return typeIds.get(type);
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void dump()
	{
		for (TokenType type : types.values()) {
			System.out.println(String.format("%s %s", typeIds.get(type), type.getName()));
		}
	}
}
