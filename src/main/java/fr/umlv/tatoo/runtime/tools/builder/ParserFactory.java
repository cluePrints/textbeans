package fr.umlv.tatoo.runtime.tools.builder;

import fr.umlv.tatoo.runtime.parser.LookaheadMap;
import fr.umlv.tatoo.runtime.parser.Parser;
import fr.umlv.tatoo.runtime.parser.ParserErrorRecoveryPolicy;
import fr.umlv.tatoo.runtime.parser.ParserListener;
import fr.umlv.tatoo.runtime.parser.ParserTable;

public interface ParserFactory {
	<T,N,P,V> Parser<T,N,P,V> createParser(ParserTable<T,N,P,V> table,
		      ParserListener<? super T,? super N,? super P> listener,
		      ParserErrorRecoveryPolicy<T,N,P,V> policy,
		      N start,
		      V version,
		      LookaheadMap<? extends T,? super V> lookaheadMap);
}
