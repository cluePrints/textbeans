package net.sf.textbeans.binding;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class XMLSerializationTest {
	BindingInfoWriter wr = new XStreamBindingInfoWriter();
	BindingInfoReader rr = new XStreamBindingInfoReader();
	
	@Test
	public void whatDoesItLooksLikeTest() throws Exception {
		Binding b = new Binding();
		ClassBinding binding = ClassBinding.forClass(OrderObj.class).as("advertisement");
		binding.addField("adType", "type");
		binding.addField("size", "size");
		binding.add(new Rhs2MethodBinding("rhs", "method"));
		b.addClass(binding);
				
		String fileName = "src/test/resources/net/sf/textbeans/binding/ad.xml";
		wr.toFile(b, new FileWriter(fileName));
		Binding b1 = rr.fromFile(new FileReader(fileName));
		Assert.assertEquals(1, b1.getBindings().size());
		
		Assert.assertEquals(2, b1.getBindings().get(0).getFields().size(), 2);
	}
}

class BatchObj {
	private List<OrderObj> advertisements = new LinkedList<OrderObj>();

	public List<OrderObj> getAdvertisements() {
		return advertisements;
	}

	public void setAdvertisements(List<OrderObj> advertisements) {
		this.advertisements = advertisements;
	}
	
}
class OrderObj {
	private String type;
	private String size;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}	
}
