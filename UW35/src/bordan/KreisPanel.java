package bordan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Ein Programm, das alle Aktionen innerhalb des Fensters verwaltet.
 * 
 * @author Andreas Bordan
 * @version 2014-04-30
 *
 */
@SuppressWarnings("serial")
public class KreisPanel extends JPanel{
	private KreisGrafik grafik;
	private JButton bLower, bHigher;
	private int radius = 100;
	/**
	 * Konstruktor fuer das Panel mit den Buttons und dem Kreis.
	 * 
	 * @since 2014-04-30
	 * 
	 */
	public KreisPanel() {
		this.setBackground(Color.WHITE);
		grafik = new KreisGrafik(radius);
		this.setLayout(new BorderLayout());
		this.add(grafik);
		bLower = new JButton("Minus");
		this.add(bLower, BorderLayout.LINE_START);
		bHigher = new JButton("Plus");
		this.add(bHigher, BorderLayout.LINE_END);
		Buttons bSteuerung = new Buttons();
		bLower.addActionListener(bSteuerung);
		bHigher.addActionListener(bSteuerung);
		bLower.setActionCommand("-");
		bHigher.setActionCommand("+");
		
	}
	/**
	 * Ein Programm, das die Buttonaktionen verwaltet.
	 * 
	 * @author Andreas Bordan
	 * @version 2014-04-30
	 *
	 */
	public class Buttons implements ActionListener {
		/**
		 * Eine Methode, die Aktionen ausfuehrt, wenn Buttons gedrueckt werden.
		 * 
		 * @param e Der ausloesende Button
		 * 
		 * @since 2014-04-30
		 * 
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("-")) {
				radius -= 10;
				if(radius<10) {
					radius = 10;
				}
			}else{
				radius += 10;
				if(radius>grafik.getWidth()-10) {
					radius = grafik.getWidth()-10;
				}
			}
			grafik.setRadius(radius);
			repaint(); // Zeichnet sowohl das Fenster als auch den Kreis neu
		}
	}
}