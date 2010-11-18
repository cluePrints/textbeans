package net.sf.textbeans.util;

public interface Memento<T extends Cloneable> {
	void loadState(T state);
	T getState();
}
