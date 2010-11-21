package net.sf.textbeans.parser.glr;

public interface IGLRParser {

	void setBranchFollowingListener(
			GLRBranchFollowedListener branchFollowingListener);

	void setBranchSpawnedListener(
			GLRBranchSpawnedListener branchSpawnedListener);

}