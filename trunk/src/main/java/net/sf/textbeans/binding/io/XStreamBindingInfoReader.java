package net.sf.textbeans.binding.io;

import java.io.Reader;

import net.sf.textbeans.binding.Binding;

import com.thoughtworks.xstream.XStream;

public class XStreamBindingInfoReader implements BindingInfoReader{
	private XStream xStream = new XStreamProvider().getxStream();
	
	@Override
	public Binding fromFile(Reader r) {
		return (Binding) xStream.fromXML(r);
	}
}
