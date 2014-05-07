package bordan;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

/**
 * Ein Programm, das ein Auto in einem Fenster zeichnet.
 * 
 * @author Andreas Bordan
 * @version 2014-04-25
 * 
 */
@SuppressWarnings("serial")
public class AGrafik extends JPanel {
	/**
	 * Der Konstruktor fuer meine Grafik.
	 * 
	 * @since 2014-04-25
	 * 
	 */
	public AGrafik() {
		this.setBackground(Color.WHITE);
	}
	@Override
	/**
	 * Eine Methode, die geometrische Formen im Fenster zeichnet.
	 * 
	 * @param g Das Fenster, in dem gezeichnet werden soll.
	 * 
	 * @since 2014-04-25
	 * 
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Hinterreifen
		g.fillOval(365, 350, 40, 40);
		g.fillOval(665, 350, 40, 40);
		// Rot
		g.setColor(new Color(189,59,1));
		// Autogeruest 1
		g.fillRoundRect(250, 265, 475, 100, 30, 100);
		// Orange
		g.setColor(new Color(219, 144, 25));
		// Autogeruest 2
		Polygon p1 = new Polygon();
		p1.addPoint(300, 265);
		p1.addPoint(350, 100);
		p1.addPoint(640, 100);
		p1.addPoint(700, 265);
		g.fillPolygon(p1);
		// Gelb
		g.setColor(new Color(200, 196, 0));
		// Scheinwerfer
		g.fillArc(260, 275, 75, 50, 70, 110);
		// Grau
		g.setColor(new Color(150,150,150));
		// Tuerhebel
		g.fillRect(460, 300, 55, 10);
		// Blau
		g.setColor(new Color(9, 184, 222));
		// Fenster
		Polygon p2 = new Polygon();
		p2.addPoint(330, 245);
		p2.addPoint(370, 120);
		p2.addPoint(620, 120);
		p2.addPoint(670, 245);
		g.fillPolygon(p2);
		// Schwarz
		g.setColor(new Color(0, 0, 0));
		// Vorderreifen
		g.fillOval(325, 350, 50, 50);
		g.fillOval(625, 350, 50, 50);
		// Tuertrennlinien
		g.drawLine(400 ,364, 400, 265);
		g.drawLine(525, 364, 525, 265);
		// Fenstertrennlinie
		g.drawLine(575, 244, 575, 120);
	}
}