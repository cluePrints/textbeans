package net.sf.textbeans.binding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import net.sf.textbeans.binding.decl.ClassBinding;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias(value="binding")
public class Binding {
	@XStreamImplicit
	private List<ClassBinding> bindings = new LinkedList<ClassBinding>();
	@XStreamAsAttribute
	private String disambiguatorClass;
	@XStreamAsAttribute 
	private String prunnerClass;
	
	
	public ClassBinding searchByProductionId(final String prodName)
	{
		return Iterators.getOnlyElement(Iterators.filter(bindings.iterator(), new ProdNameEq(prodName)), null);
	}
	
	public void addClass(ClassBinding b) {
		bindings.add(b);
	}
	public List<ClassBinding> getBindings() {
		return new ArrayList<ClassBinding>(bindings);
	}
	public void setBindings(List<ClassBinding> bindings) {
		this.bindings = new ArrayList<ClassBinding>(bindings);
	}

	public String getDisambiguatorClass() {
		return disambiguatorClass;
	}

	public void setDisambiguatorClass(String disambiguatorClass) {
		this.disambiguatorClass = disambiguatorClass;
	}

	public String getPrunnerClass() {
		return prunnerClass;
	}

	public void setPrunnerClass(String prunnerClass) {
		this.prunnerClass = prunnerClass;
	}
	
}


class ProdNameEq implements Predicate<ClassBinding>
{
	private final String name;
	
	public ProdNameEq(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean apply(ClassBinding input) {
		return name.equalsIgnoreCase(input.getProductionName());
	}
}