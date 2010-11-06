package net.sf.textbeans.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTree;

import net.sf.textbeans.parser.ReaderTextBindingParser;

import com.google.common.collect.Lists;

public class DemoGui {
	public static void main(String[] args) {
		JFrame wndMain = new JFrame();
		wndMain.setSize(300, 200);
		wndMain.setLayout(new BorderLayout());
		wndMain.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 2));
		wndMain.add(mainPanel);
		
		
		final JTree trResult = new JTree();
		trResult.setSize(300, 200);
		wndMain.setVisible(true);
		/*          |
		 *  text    |  grammar
		 * -------------------
		 *  tree    |  binding
		 *          |
		 **/
		
		
		final JTextArea taText = new JTextArea("text");
		final JTextArea taGrammar = new JTextArea("grammar");
		final JTextArea taBinding = new JTextArea("binding");
		mainPanel.add(taText);
		mainPanel.add(taGrammar);
		mainPanel.add(trResult);
		mainPanel.add(taBinding);
		
		JButton btnCompile = new JButton("Go!");
		btnCompile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReaderTextBindingParser parser = new ReaderTextBindingParser();
				parser.compile(asReader(taGrammar));
				parser.loadAstRules(asReader(taBinding));
				parser.parse(asReader(taText));
				trResult.setModel(new ObjectTreeModel(parser.getResult().getClass().getSimpleName(), parser.getResult()));
			}
		});
		wndMain.add(btnCompile, BorderLayout.SOUTH);
	}
	
	private static Reader asReader(JTextArea area)
	{
		return new StringReader(area.getText());
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
