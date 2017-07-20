package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class AppendText extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;
	private JCheckBox chckbxAtTop;
	private JTextArea textArea;
	private final Action actionAppend = new ActionAppend();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppendText frame = new AppendText();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppendText() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setAction(actionAppend);
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setAction(actionAppend);
		toolBar.add(btnNewButton);
		
		chckbxAtTop = new JCheckBox("At Top");
		toolBar.add(chckbxAtTop);
		
		textField = new JTextField();
		toolBar.add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	public JCheckBox getCheckBox() {
		return chckbxAtTop;
	}
	public JTextField getTextField() {
		return textField;
	}
	public JTextArea getTextArea() {
		return textArea;
	}
	private class ActionAppend extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public ActionAppend() {
			putValue(NAME, "ActionAppend");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			String line = getTextField().getText();
			String longText = getTextArea().getText();
			if(getCheckBox().isSelected()){
				getTextArea().setText(line+"\n"+longText);
			}
			else{
				getTextArea().setText(longText+"\n"+line);
			}
		}
	}
}
