package net.sf.textbeans.util;

import net.sf.textbeans.binding.io.XStreamProvider;

import com.thoughtworks.xstream.XStream;

public class XStreamCloner implements Cloner {
	XStreamProvider prov = new XStreamProvider();
	XStream xStream = prov.getxStream();

	@SuppressWarnings("unchecked")
	public <T> T clone(T obj) {
		String xml = xStream.toXML(obj);		
		return (T) xStream.fromXML(xml);
	};
}
