package net.sf.textbeans.binding.io;

import java.io.Reader;

import net.sf.textbeans.binding.Binding;

public interface BindingInfoReader {
	public Binding fromFile(Reader fileSource);
}
	
