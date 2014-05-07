package bordan;

import javax.swing.JFrame;

/**
 * Ein Programm, das ein Fenster mit Inhalt sowie Grundeinstellungen erzeugt.
 * 
 * @author Andreas Bordan
 * @version 2014-04-25
 *
 */
@SuppressWarnings("serial")
public class AFrame extends JFrame {
	/**
	 * Der Konstruktor fuer mein Fenster.
	 * 
	 * @since 2014-04-25
	 * 
	 */
	public AFrame() {
		super("Grafikaufgabe");
		this.add(new APanel());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	/**
	 * Die main-Methode erzeugt das Fenster.
	 * 
	 * @since 2014-04-25
	 * 
	 */
	public static void main(String[] args) {
		new AFrame();
	}
}