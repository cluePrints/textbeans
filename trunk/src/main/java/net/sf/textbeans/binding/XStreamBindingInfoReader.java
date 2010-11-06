package net.sf.textbeans.binding;

import java.io.Reader;

import com.thoughtworks.xstream.XStream;

public class XStreamBindingInfoReader implements BindingInfoReader{
	private XStream xStream = new XStreamProvider().getxStream();
	
	@Override
	public Binding fromFile(Reader r) {
		return (Binding) xStream.fromXML(r);
	}
}
