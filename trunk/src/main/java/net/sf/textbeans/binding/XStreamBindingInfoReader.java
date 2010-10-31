package net.sf.textbeans.binding;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.thoughtworks.xstream.XStream;

public class XStreamBindingInfoReader implements BindingInfoReader{
	private XStream xStream = new XStreamProvider().getxStream();
	
	@Override
	public FormatBinding fromFile(String fileName) {
		try {
			FileReader r = new FileReader(fileName);
			return (FormatBinding) xStream.fromXML(r);
		} catch (FileNotFoundException ex) {
			throw new RuntimeException(ex);
		}
	}
}
