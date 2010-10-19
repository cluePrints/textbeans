package net.sf.textbeans.util;

public class Pair<K, V> {
	public K k;
	public V v;
	public Pair(K k, V v) {
		super();
		this.k = k;
		this.v = v;
	}
	public static <K, V> Pair<K, V> newOne(K k, V v) {
		return new Pair<K, V>(k, v);
	}
}
