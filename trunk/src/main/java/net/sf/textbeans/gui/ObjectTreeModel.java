package net.sf.textbeans.gui;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;

public class ObjectTreeModel implements TreeModel{
	private Prop root;
	
	public ObjectTreeModel(String rootName, Object root) {
		super();
		this.root = new Prop(rootName, root, -1);
	}
	
	private Set<Class<? extends Serializable>> leafClasses = Sets.newHashSet(String.class, Number.class, Class.class);
	
	@Override
	public boolean isLeaf(Object pNode) {
		if (pNode == null)
			return true;
		return isLeaf0(pNode);
	}

	private boolean isLeaf0(Object pNode) {
		Prop prop = (Prop) pNode;
		if (prop.value == null)
			return true;
		if (Collection.class.isAssignableFrom(prop.value.getClass())) 
			return false;
		if (prop.value.getClass().isArray()) 
			return false;
		
		for (Class<? extends Serializable> leafClass : leafClasses) {
			if (leafClass.isAssignableFrom(prop.value.getClass())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int getIndexOfChild(Object parent, Object child) {
		if (child == null)
			return 0;
		Prop prop = (Prop) child;
		return prop.idx;
	}
	
	@Override
	public Prop getChild(Object p, int index) {
		Prop prop = (Prop) p;
		try {
			if (prop.value instanceof Collection) {
				return new Prop("["+index+"]",
						Iterators.get(((Collection) prop.value).iterator(), index),
						index);
			}
			if (prop.value instanceof Object[]) {
				return new Prop("["+index+"]",
						((Object[]) prop.value)[index],
						index);
			}
			PropertyDescriptor[] descs = filterProps(prop);
			PropertyDescriptor desc = descs[index];
			return new Prop(desc.getName(), desc.getReadMethod().invoke(prop.value), index);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private PropertyDescriptor[] filterProps(Prop parent)
			throws IntrospectionException {
		BeanInfo inf = Introspector.getBeanInfo(parent.value.getClass());
		PropertyDescriptor[] descs = inf.getPropertyDescriptors();
		return descs;
	}
	
	@Override
	public int getChildCount(Object p) {		
		if (isLeaf(p))
			return 0;
		
		Prop prop = (Prop) p;
		if (prop.value instanceof Collection) {
			return ((Collection) prop.value).size();
		}
		if (prop.value instanceof Object[]) {
			return ((Object[]) prop.value).length;
		}
		try {
			BeanInfo inf = Introspector.getBeanInfo(prop.value.getClass());
			return inf.getPropertyDescriptors().length;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	@Override
	public Prop getRoot() {
		return root;
	}
	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		throw new RuntimeException("not supported");	
	}
	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		throw new RuntimeException("not supported");
	}
	@Override
	public void addTreeModelListener(TreeModelListener l) {
		//throw new RuntimeException("not supported");
	}
	
	class Prop {
		public final String name;
		public final Object value;
		public final int idx;
		
		public Prop(String name, Object value, int idx) {
			super();
			this.name = name;
			this.value = value;
			this.idx = idx;
		}

		@Override
		public String toString() {
			String result = String.valueOf(name);
			if (ObjectTreeModel.this.isLeaf0(this)) {
				result+= "="+String.valueOf(value);
			}
			return result;
		}
	}
}