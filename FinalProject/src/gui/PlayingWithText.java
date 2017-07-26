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
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class PlayingWithText extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnClear;
	private final Action actionClear = new ActionClear();
	private JButton btnUpper;
	private JMenuItem MenuItem_Upper;
	private JMenuItem MenuItem_Lower;
	private JButton btnLower;
	private final Action actionLower = new ActionLower();
	private final Action actionUpper = new ActionUpper();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayingWithText frame = new PlayingWithText();
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
	public PlayingWithText() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Operations");
		menuBar.add(mnNewMenu);
		
		JMenuItem MenuItem_Clear = new JMenuItem("Clear");
		MenuItem_Clear.setAction(actionClear);
		mnNewMenu.add(MenuItem_Clear);
		
		MenuItem_Upper = new JMenuItem("Upper");
		MenuItem_Upper.setAction(actionUpper);
		mnNewMenu.add(MenuItem_Upper);
		
		MenuItem_Lower = new JMenuItem("Lower");
		MenuItem_Lower.setAction(actionLower);
		mnNewMenu.add(MenuItem_Lower);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnClear.setAction(actionClear);
		toolBar.add(btnClear);
		
		btnUpper = new JButton("Upper");
		btnUpper.setAction(actionUpper);
		toolBar.add(btnUpper);
		
		btnLower = new JButton("Lower");
		btnLower.setAction(actionLower);
		toolBar.add(btnLower);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
	}

	public JButton getBtnNewButton() {
		return btnClear;
	}
	public JTextField getTextField() {
		return textField;
	}
	private class ActionClear extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public ActionClear() {
			putValue(NAME, "Clear");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			getTextField().setText(null);
		}
	}
	public JButton getBtnUpper() {
		return btnUpper;
	}
	public JButton getBtnLower() {
		return btnLower;
	}
	private class ActionLower extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public ActionLower() {
			putValue(NAME, "Lower");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			getTextField().setText(getTextField().getText().toLowerCase());
		}
	}
	private class ActionUpper extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public ActionUpper() {
			putValue(NAME, "Upper");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			getTextField().setText(getTextField().getText().toUpperCase());
		}
	}
}
