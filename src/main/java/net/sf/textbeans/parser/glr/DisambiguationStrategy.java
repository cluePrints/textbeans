package net.sf.textbeans.parser.glr;

import java.util.Collections;
import java.util.List;

import net.sf.textbeans.util.Pair;

import com.google.common.collect.LinkedListMultimap;


public interface DisambiguationStrategy {
	List<Pair<String, ? extends Object>> choose(List<List<Pair<String, ? extends Object>>> trees);
	public static final DisambiguationStrategy SIMPLE = new Simple(); 
	public static class Simple implements DisambiguationStrategy{
		@Override
		public List<Pair<String, ? extends Object>> choose(
				List<List<Pair<String, ? extends Object>>> trees) {
			return trees.get(0);
		}
	}
	
	// parsed result with a single root is a winner
	public static final DisambiguationStrategy MIN_UNPARSED = new MinUnParsed();
	
	public static class MinUnParsed implements DisambiguationStrategy {			
		@Override
		public List<Pair<String, ? extends Object>> choose(
				List<List<Pair<String, ? extends Object>>> trees) {
			LinkedListMultimap<Double, List<Pair<String, ? extends Object>>> rates = LinkedListMultimap.create();
			for (List<Pair<String, ? extends Object>> tree : trees) {
				Double rate = Double.MAX_VALUE;
				if (tree.size() > 0 ) {
					rate = tree.size() - 1.0;
				}
				rates.put(rate, tree);
			}
			Double bestVal = Collections.min(rates.keys());
			List<List<Pair<String, ? extends Object>>> leftCandidates = rates.get(bestVal);
			if (leftCandidates.size()>1) {
				throw new IllegalStateException("Multiple candidates left after disambiguation");
			}
			return leftCandidates.get(0); 
		}
	};
	
	public static class MaxUnParsed implements DisambiguationStrategy {			
		@Override
		public List<Pair<String, ? extends Object>> choose(
				List<List<Pair<String, ? extends Object>>> trees) {
			LinkedListMultimap<Double, List<Pair<String, ? extends Object>>> rates = LinkedListMultimap.create();
			for (List<Pair<String, ? extends Object>> tree : trees) {
				Double rate = Double.MAX_VALUE;
				if (tree.size() > 0 ) {
					rate = tree.size() - 1.0;
				}
				rates.put(rate, tree);
			}
			Double bestVal = Collections.max(rates.keys());
			List<List<Pair<String, ? extends Object>>> leftCandidates = rates.get(bestVal);
			if (leftCandidates.size()>1) {
				throw new IllegalStateException("Multiple candidates left after disambiguation");
			}
			return leftCandidates.get(0); 
		}
	}
}
