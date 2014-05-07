package bordan;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Ein Programm, das eine Schere-Stein-Papier Spieloberflaeche erzeugt.
 * 
 * @author Andreas Bordan
 * @version 2014-03-21
 *
 */
@SuppressWarnings("serial")
public class BFrame extends JFrame{
	/**
	 * Konstruktor fuer das Spielfenster
	 * 
	 * @since 2014-03-21
	 * 
	 */
	public BFrame () {
		super("Schere-Stein-Papier");
		this.add(new BPanel());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setResizable(false);
		// Fenster mittig platzieren
		Dimension bildschirm = Toolkit.getDefaultToolkit().getScreenSize();
		int breite = (int) bildschirm.getWidth()/2;
		int hoehe = (int) bildschirm.getHeight()/2;
		this.setLocation(breite-400, hoehe-300);
		this.setVisible(true);
	}
	/**
	 * Die main-Methode erzeugt das Spielfeld.
	 * 
	 * @since 2014-03-21
	 * 
	 */
	public static void main(String[] args) {
		new BFrame();
	}
}