package bordan;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * Ein Programm, das einen Kreis erzeugt und verwaltet.
 * 
 * @author Andreas Bordan
 * @version 2014-04-30
 *
 */
@SuppressWarnings("serial")
public class KreisGrafik extends JPanel {
	private int hoehe, breite, radius;
	/**
	 * Konstruktor fuer den Kreis.
	 * 
	 * @since 2014-04-30
	 * 
	 */
	public KreisGrafik(int radius) {
		this.setRadius(radius);
	}
	/**
	 * Eine Methode, die den Radius des Kreises veraendert.
	 * 
	 * @param radius Der Radius fuer den Kreis.
	 * 
	 * @since 2014-04-30
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	/**
	 * Eine Methode, die die Kreisgrafik zeichnet.
	 * 
	 * @param g Die zu zeichnende Grafik
	 * 
	 * @since 2014-04-30
	 * 
	 */
	@Override
	public void paintComponent(Graphics g) {
		hoehe = this.getHeight();
		breite = this.getWidth();
		if(radius<breite/4) {
			g.setColor(Color.RED);
		}else{
			if(radius<breite/2) {
				g.setColor(Color.YELLOW);
			}else{
				if(radius<breite*3/4) {
					g.setColor(Color.GREEN);
				}else{
					g.setColor(Color.BLUE);
				}
			}
		}
		g.fillOval(breite/2-radius/2, hoehe/2-radius/2, radius, radius); // In der Mitte platziert.
	}
}