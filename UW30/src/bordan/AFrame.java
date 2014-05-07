package bordan;

import javax.swing.JFrame;

/**
 * Ein Programm, das mein Fenster mit Einstellungen und dem Inhalt erzeugt.
 * 
 * @author Andreas Bordan
 * @version 2014-03-28
 *
 */
@SuppressWarnings("serial")
public class AFrame extends JFrame {
	public AFrame() {
		super("Viele Layouts");
		this.add(new APanel());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setVisible(true);
	}
	/**
	 * Die main-Methode erzeugt mein Fenster.
	 * 
	 * @since 2014-03-28
	 */
	public static void main(String[] args) {
		new AFrame();

	}
}