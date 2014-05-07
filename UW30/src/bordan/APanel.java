package bordan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Ein Programm, das die Buttons und Panels meines Fensters verwaltet und erzeugt.
 * 
 * @author Andreas Bordan
 * @version 2014-03-28
 *
 */
@SuppressWarnings("serial")
public class APanel extends JPanel {
	/**
	 * Der Konstruktor fuer die verschiedenen Fenster Elemente.
	 * 
	 * @since 2014-03-28
	 */
	public APanel() {
		// Allgemine Einstellungen
		GridLayout hauptLayout = new GridLayout(2,3,10,10);
		this.setLayout(hauptLayout);
		this.setBackground(Color.LIGHT_GRAY);
		// Oben Links
		JPanel obenLinks = new JPanel();
		obenLinks.setLayout(new BorderLayout(5,5));
		obenLinks.setBackground(Color.RED);
		obenLinks.add(new JButton("PAGE_START"), BorderLayout.NORTH);
		obenLinks.add(new JButton("LINE_START"), BorderLayout.WEST);
		obenLinks.add(new JButton("BorderLayout.CENTER"), BorderLayout.CENTER);
		obenLinks.add(new JButton("PAGE_END"), BorderLayout.SOUTH);
		this.add(obenLinks);
		// Oben Mitte
		JPanel obenMitte = new JPanel();
		obenMitte.setLayout(new FlowLayout(FlowLayout.RIGHT,5,5));
		obenMitte.setBackground(Color.ORANGE);
		obenMitte.add(new JButton("Das"));
		obenMitte.add(new JButton("ist"));
		obenMitte.add(new JButton("ein"));
		obenMitte.add(new JButton("rechtsbündiges"));
		obenMitte.add(new JButton("FlowLayout"));
		obenMitte.add(new JButton("."));
		this.add(obenMitte);
		// Oben Rechts
		JPanel obenRechts = new JPanel();
		obenRechts.setLayout(new BoxLayout(obenRechts, BoxLayout.LINE_AXIS));
		obenRechts.setBackground(Color.YELLOW);
		obenRechts.add(new JButton("Ein"));
		obenRechts.add(new JButton("horizontales"));
		obenRechts.add(new JButton("BoxLayout"));
		obenRechts.add(new JButton("."));
		this.add(obenRechts);
		//Unten Links
		JPanel untenLinks = new JPanel();
		untenLinks.setLayout(new GridLayout(4,3,5,5));
		untenLinks.setBackground(Color.GREEN);
		for(int i = 0; i<12; ++i) {
			untenLinks.add(new JButton(""+(i+1)));
		}
		this.add(untenLinks);
		// Unten Mitte
		JPanel untenMitte = new JPanel();
		JPanel untenMitteInnen = new JPanel();
		untenMitte.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		Color lightblue = new Color(13, 214, 238);
		//Color darkblue = new Color()
		untenMitte.setBackground(lightblue);
		untenMitteInnen.setBackground(Color.BLUE);
		untenMitte.add(untenMitteInnen);
		untenMitteInnen.setLayout(new BoxLayout(untenMitteInnen, BoxLayout.PAGE_AXIS));
		untenMitteInnen.add(new JButton("Ein"));
		untenMitteInnen.add(new JButton("BoxLayout"));
		untenMitteInnen.add(new JButton("innerhalb"));
		untenMitteInnen.add(new JButton("eines"));
		untenMitteInnen.add(new JButton("FlowLayouts"));
		untenMitteInnen.add(new JButton("."));
		this.add(untenMitte);
		// Unten Rechts
		Color purple = new Color(140,9,240);
		JButton buttonPurple = new JButton("Der letzte Button in der letzten GridLayout-Zelle.");
		buttonPurple.setBackground(purple);
		this.add(buttonPurple);	
	}
}