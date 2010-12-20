package net.sf.textbeans.util;

public class Pair<K, V> {
	public final K k;
	public final V v;
	public Pair(K k, V v) {
		super();
		this.k = k;
		this.v = v;
	}
	public static <K, V> Pair<K, V> newOne(K k, V v) {
		return new Pair<K, V>(k, v);
	}
	@Override
	public String toString() {
		return "("+k+","+v+")";
	}
	public K getK() {
		return k;
	}
	public V getV() {
		return v;
	}
}
