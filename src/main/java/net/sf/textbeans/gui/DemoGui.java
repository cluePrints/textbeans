package net.sf.textbeans.gui;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTree;

import com.google.common.collect.Lists;

public class DemoGui {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		frame.setLayout(new BorderLayout());
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		JTree tree = new JTree(new ObjectTreeModel("root", new AA()));
		tree.setSize(300, 200);
		frame.add(tree, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}

class A {
	String name = "name";
	List<String> someStuff = Lists.newArrayList("first", "second", "third");
	public List<String> getSomeStuff() {
		return someStuff;
	}

	public void setSomeStuff(List<String> someStuff) {
		this.someStuff = someStuff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}

class AA {
	A a = new A();

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
