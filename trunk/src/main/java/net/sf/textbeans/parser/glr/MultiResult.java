package net.sf.textbeans.parser.glr;

import java.util.List;

import net.sf.textbeans.util.Pair;

public interface MultiResult {

	List<List<Pair<String, ? extends Object>>> getResultTrees();

}