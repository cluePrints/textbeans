package net.sf.textbeans.binding.io;

import java.io.Writer;

import net.sf.textbeans.binding.Binding;

public interface BindingInfoWriter {
	public void toFile(Binding info, Writer fileRepr);
}
	
