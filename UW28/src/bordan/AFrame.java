/**
 * 
 */
package bordan;

import javax.swing.*;

/**
 * Ein Programm, das ein Fenster mit Basiseinstellungen erzeugt.
 * 
 * @author Andreas Bordan
 * @version 2014-03-14
 */
@SuppressWarnings("serial")
public class AFrame extends JFrame {

	/**
	 * Konstruktor fuer mein Fenster
	 * 
	 * @since 2014-03-14
	 */
	public AFrame() {
		super("Erste GUI");
		this.setSize(300,200);
		this.setResizable(false);
		this.add(new APanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	/**
	 * Die main-Methode erzeugt mein Fenster.
	 *
	 * @since 2014-03-14
	 */
	public static void main(String[] args) {
		new AFrame();
	}
}
