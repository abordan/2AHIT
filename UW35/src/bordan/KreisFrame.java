package bordan;

import javax.swing.JFrame;

/**
 * Ein Programm, das die Roheinstellungen fuer das Fenster an sich festlegt.
 * 
 * @author Andreas Bordan
 * @version 2014-04-30
 *
 */
@SuppressWarnings("serial")
public class KreisFrame extends JFrame{
	/**
	 * Konstruktor fuer das Fenster.
	 * 
	 * @since 2014-04-30
	 * 
	 */
	public KreisFrame() {
		super("Kreisgrafik");
		this.add(new KreisPanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(800, 700);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	/**
	 * Die main-Methode erzeugt das Fenster.
	 * 
	 * @since 2014-04-30
	 * 
	 */
	public static void main(String[] args) {
		new KreisFrame();
	}
}