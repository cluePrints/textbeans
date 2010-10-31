package net.sf.textbeans.binding;

import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;

public class XStreamBindingInfoWriter implements BindingInfoWriter{
	private XStream xStream = new XStreamProvider().getxStream();
	@Override
	public void toFile(FormatBinding info, String fileName) {
		try {
			FileWriter writer = new FileWriter(fileName);			
			xStream.toXML(info, writer);
			writer.close();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
