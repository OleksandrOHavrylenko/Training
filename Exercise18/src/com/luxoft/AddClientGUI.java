package com.luxoft;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AddClientGUI extends JFrame {

	public AddClientGUI(final String name) {
		super(name);
		setResizable(false);
	}

	/**
	 * Create the GUI and show it. For thread safety, this method is invoked
	 * from the event dispatch thread.
	 */
	private static void createAndShowGUI() {

		AddClientGUI frame = new AddClientGUI("Bank Application Client");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// frame.addComponentsToPane(frame.getContentPane());

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(final String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			// UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
