package fr.umlv.tatoo.runtime.parser;

public interface ActionReturn {
	/**
	 * wait for the next terminal
	 */
	public static final ActionReturn NEXT = new ActionReturn() {
	};

	/**
	 * continue with the same terminal
	 */
	public static final ActionReturn KEEP = new ActionReturn() {
	};

	/**
	 * current terminal must be discarded because there is an error.
	 */
	public static final ActionReturn NEXT_ERROR = new ActionReturn() {
	};

	/**
	 * Asks the lexer to reconsider the active rule to parse the input since the
	 * expected lookahead set may changed
	 */
	public static final ActionReturn RELEX = new ActionReturn() {
	};
}