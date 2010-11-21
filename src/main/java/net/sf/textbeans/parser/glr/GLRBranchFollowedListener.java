package net.sf.textbeans.parser.glr;

public interface GLRBranchFollowedListener {
	/**
	 * Called by parser before following chosen branch 
	 */
	public void onBranchFollowing(Object stateToLoad);
	
	GLRBranchFollowedListener NONE = new GLRBranchFollowedListener(){
		public void onBranchFollowing(Object stateToLoad) {};
	};
}
