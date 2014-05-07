package bordan;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Ein Programm, das sowohl einen Text, als auch die Autografik in einem Fenster anzeigt.
 * 
 * @author Andreas Bordan
 * @version 2014-04-25
 *
 */
@SuppressWarnings("serial")
public class APanel extends JPanel {
	/**
	 * Der Konstruktor fuer meinen Fensterinhalt.
	 * 
	 * @since 2014-04-25
	 * 
	 */
	public APanel() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new BorderLayout());
		this.add(new JLabel("Meine Auto Grafik",SwingConstants.CENTER), BorderLayout.PAGE_START);
		this.add(new AGrafik(), BorderLayout.CENTER);
	}
}