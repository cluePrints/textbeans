package net.sf.textbeans.parser.glr;

public interface ObjectChangeHook {
	public void onObjectChanged(Object obj);
	
	public static final ObjectChangeHook NONE = new ObjectChangeHook() {
		@Override
		public void onObjectChanged(Object obj) {
			
		}
	};
}
