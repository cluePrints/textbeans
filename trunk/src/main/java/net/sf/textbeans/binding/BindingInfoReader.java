package net.sf.textbeans.binding;

import java.io.Reader;

public interface BindingInfoReader {
	public Binding fromFile(Reader fileSource);
}
	
