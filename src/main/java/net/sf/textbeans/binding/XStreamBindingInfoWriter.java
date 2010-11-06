package net.sf.textbeans.binding;

import java.io.IOException;
import java.io.Writer;

import com.thoughtworks.xstream.XStream;

public class XStreamBindingInfoWriter implements BindingInfoWriter{
	private XStream xStream = new XStreamProvider().getxStream();
	@Override
	public void toFile(Binding info, Writer writer) {
		try {
			xStream.toXML(info, writer);
			writer.close();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
