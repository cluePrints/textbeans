package net.sf.textbeans.binding;

import java.io.Writer;

public interface BindingInfoWriter {
	public void toFile(Binding info, Writer fileRepr);
}
	
