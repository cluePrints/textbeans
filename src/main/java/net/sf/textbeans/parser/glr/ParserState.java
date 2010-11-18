package net.sf.textbeans.parser.glr;

import fr.umlv.tatoo.runtime.util.IntArrayList;

public class ParserState implements Cloneable {
	IntArrayList stack = new IntArrayList();

	public ParserState(IntArrayList stack) {
		super();
		this.stack = stack;
	}

	public IntArrayList getStack() {
		return stack;
	}

	@Override
	public ParserState clone() {
		try {
			ParserState clone = (ParserState) super.clone();
			clone.stack = stack.duplicate();
			return clone;
		} catch (CloneNotSupportedException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public String toString() {
		return "ParserState [stack=" + stack + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stack == null) ? 0 : stack.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParserState other = (ParserState) obj;
		if (stack == null) {
			if (other.stack != null)
				return false;
		} else if (!stack.equals(other.stack))
			return false;
		return true;
	}

}