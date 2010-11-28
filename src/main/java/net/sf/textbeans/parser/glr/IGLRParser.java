package net.sf.textbeans.parser.glr;



public interface IGLRParser extends MultiResult {

	void setBranchFollowingListener(
			GLRBranchFollowedListener branchFollowingListener);

	void setBranchSpawnedListener(
			GLRBranchSpawnedListener branchSpawnedListener);
}