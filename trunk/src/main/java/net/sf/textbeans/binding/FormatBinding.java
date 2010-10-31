package net.sf.textbeans.binding;

import java.util.LinkedList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class FormatBinding {
	@XStreamImplicit
	private List<ClassBinding> bindings = new LinkedList<ClassBinding>();

	public void addClass(ClassBinding b) {
		bindings.add(b);
	}
	public List<ClassBinding> getBindings() {
		return bindings;
	}

	public void setBindings(List<ClassBinding> bindings) {
		this.bindings = bindings;
	}
	
}
