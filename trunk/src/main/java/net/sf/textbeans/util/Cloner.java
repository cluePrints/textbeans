package net.sf.textbeans.util;

/**
 * Strategy for cloning object hierarchies
 */
public interface Cloner {
	<T> T clone(T obj);
}