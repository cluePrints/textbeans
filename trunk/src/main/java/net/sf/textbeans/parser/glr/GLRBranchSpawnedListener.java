package net.sf.textbeans.parser.glr;

public interface GLRBranchSpawnedListener {
	/**
	 * Implementor should clone its current state which follows parser state changes 
	 */
	public Object onBranchSpawned();
	
	GLRBranchSpawnedListener NONE = new GLRBranchSpawnedListener(){
		@Override
		public Object onBranchSpawned() {
			return null;
		}
	};
}
