package net.sf.textbeans.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.filechooser.FileNameExtensionFilter;

import net.sf.textbeans.parser.BindingParser;
import net.sf.textbeans.parser.TatooTest;
import net.sf.textbeans.util.Const;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class DemoGui {
	public static void main(String[] args) {
		final JFrame wndMain = new JFrame();
		wndMain.setSize(800, 600);
		wndMain.setLayout(new BorderLayout());
		wndMain.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 2, 1, 1));
		wndMain.add(mainPanel);

		final JTree trResult = new JTree();
		wndMain.setVisible(true);
		/*
		 * | text | grammar ------------------- tree | binding |
		 */

		final JTextArea taText = new JTextArea();
		final JTextArea taGrammar = new JTextArea("grammar");
		final JTextArea taBinding = new JTextArea("binding");
		
		add(mainPanel, taText, "Text to process: ");
		add(mainPanel, trResult, "Resulting object tree: ");
		add(mainPanel, taGrammar, "Parsing rules: ");
		add(mainPanel, taBinding, "Binding rules: ");
		
		

		JPanel pnlActions = new JPanel();
		JButton btnCompile = new JButton("Compile rules and parse");
		btnCompile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				test(trResult, taText, taGrammar, taBinding);
			}
		});

		JButton btnLoad = new JButton("Load test case");
		btnLoad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fChooser = new JFileChooser(TatooTest.TEST_DIR);
				FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"EBNF grammar descriptions", Const.EBNF_EXT.substring(1));
				fChooser.setFileFilter(filter);
				int returnVal = fChooser.showOpenDialog(wndMain);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fChooser.getSelectedFile();
					String nameNExt = selectedFile.getName();
					String name = nameNExt.substring(0, nameNExt.length()-Const.EBNF_EXT.length());
					String dir = selectedFile.getParentFile().getPath() +"/";
					tryLoad(taGrammar, dir + name + Const.EBNF_EXT);
					tryLoad(taText, dir + name +".txt");
					tryLoad(taBinding, dir + name +".xml");
				}
			}
		});
		pnlActions.add(btnLoad);
		pnlActions.add(btnCompile);
		wndMain.add(pnlActions, BorderLayout.NORTH);
	}

	private static void add(JComponent mainPanel, final JComponent taBinding,
			String title) {
		taBinding.setBorder(BorderFactory.createTitledBorder(title));
		mainPanel.add(new JScrollPane(taBinding));
	}

	private static Reader asReader(JTextArea area) {
		return new StringReader(area.getText());
	}

	private static void tryLoad(JTextArea dest, String fileName) {
		File file = new File(fileName);
		if (file.exists()) {
			try {
				dest.setText(Files.toString(file, Charsets.UTF_8));
			} catch (Exception ex) {
				StringWriter stringWriter = new StringWriter();
				ex.printStackTrace(new PrintWriter(stringWriter));
				dest.setText(stringWriter.toString());
			}
		} else {
			dest.setText("");
		}
	}

	private static void test(final JTree trResult, final JTextArea taText,
			final JTextArea taGrammar, final JTextArea taBinding) {
		BindingParser parser = new BindingParser();
		parser.compile(asReader(taGrammar));
		parser.loadAstRules(asReader(taBinding));
		parser.parse(asReader(taText));
		trResult.setModel(new ObjectTreeModel(parser.getResult().getClass()
				.getSimpleName(), parser.getResult()));
	}
}