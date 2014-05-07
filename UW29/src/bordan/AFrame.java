package bordan;

import javax.swing.*;

/**
 * Ein Programm, das ein neues Fenster mit den Standardeinstellungen und einem Panel erzeugt.
 * 
 * @author Andreas Bordan
 * @version 2014-03-21
 *
 */
@SuppressWarnings("serial")
public class AFrame extends JFrame {
	/**
	 * Konstruktor fuer das Frame.
	 * 
	 * @since 2014-03-21
	 */
	public AFrame() {
		super("Einfache GUI");
		this.add(new APanel());
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	/**
	 * Die main-Methode erzeugt ein neues Fensterobjekt.
	 * 
	 * @since 2014-03-21
	 */
	public static void main(String[] args) {
		new AFrame();

	}
}
