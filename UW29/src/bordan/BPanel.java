package bordan;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Ein Programm, das die Elemente fuer mein Fenster zur Verfuegung stellt.
 * 
 * @author Andreas Bordan
 * @version 2014-03-21
 *
 */
@SuppressWarnings("serial")
public class BPanel extends JPanel {
	private JPanel buttons, ausgaben, score, spielstand;
	private JLabel ausgabeSpieler,ausgabeComputer, rundenErgebnis, spielstandsAnzeige, spielstandsTeilnehmer, spielstandsWerte;
	private JButton schere, stein, papier;
	private int siegeSpieler, siegeComputer;
	/**
	 * Konstruktor fuer den Inhalt des Spielfensters.
	 * 
	 * @since 2014-03-21
	 * 
	 */
	public BPanel() {
		siegeSpieler = 0;
		siegeComputer = 0;
		// Initialisierung der Elemente
		ausgabeSpieler = new JLabel("Deine Wahl");
		ausgabeComputer = new JLabel("Wahl des Computers");
		rundenErgebnis = new JLabel("Ergebnis der letzten Runde");
		spielstandsAnzeige = new JLabel("Spielstand");
		spielstandsTeilnehmer = new JLabel("Spieler         Computer");
		spielstandsWerte = new JLabel(""+siegeSpieler+"                           "+siegeComputer);
		schere = new JButton("Schere");
		stein = new JButton("Stein");
		papier = new JButton("Papier");
		buttons = new JPanel();
		ausgaben = new JPanel();
		spielstand = new JPanel();
		score = new JPanel();
		// Grundlegende Layouts und hinzufuegen der 2 groeszten Panels
		this.setLayout(new GridLayout(1,2)); // 1. Spalte Ausgaben, 2. Spalte Spielstand
		this.add(ausgaben);
		ausgaben.setLayout(new GridLayout(3,1));
		this.add(score);
		score.setLayout(new GridLayout(3,1));
		//Computerausgabe
		ausgabeComputer.setHorizontalAlignment(SwingConstants.CENTER);
		ausgaben.add(ausgabeComputer);
		// Spielerausgabe
		ausgabeSpieler.setHorizontalAlignment(SwingConstants.CENTER);
		ausgaben.add(ausgabeSpieler);
		// Buttons
		buttons.setLayout(new GridLayout(1,3)); // Je Button eine Spalte
		buttons.add(schere);
		buttons.add(stein);
		buttons.add(papier);
		schere.setActionCommand("Schere");
		stein.setActionCommand("Stein");
		papier.setActionCommand("Papier");
		ButtonControl listener = new ButtonControl();
		schere.addActionListener(listener);
		stein.addActionListener(listener);
		papier.addActionListener(listener);
		ausgaben.add(buttons);
		// Spielstandsausgabe
		spielstand.setLayout(new GridLayout(3,1));
		spielstandsAnzeige.setHorizontalAlignment(SwingConstants.CENTER);
		spielstandsAnzeige.setVerticalAlignment(SwingConstants.CENTER);
		spielstandsTeilnehmer.setHorizontalAlignment(SwingConstants.CENTER);
		spielstandsTeilnehmer.setVerticalAlignment(SwingConstants.CENTER);
		spielstandsWerte.setHorizontalAlignment(SwingConstants.CENTER);
		spielstandsWerte.setVerticalAlignment(SwingConstants.NORTH);
		rundenErgebnis.setHorizontalAlignment(SwingConstants.CENTER);
		rundenErgebnis.setVerticalAlignment(SwingConstants.BOTTOM);
		spielstand.add(spielstandsAnzeige);
		spielstand.add(spielstandsTeilnehmer);
		spielstand.add(spielstandsWerte);
		score.add(spielstand);
		score.add(rundenErgebnis);
	}
	/**
	 * Eine Methode, die den Sieger dieser Runde ermittelt und den Spielstand entsprechend aktualisiert.
	 * 
	 * @since 2014-03-21
	 * 
	 */
	public void sieg() {
		String spieler, computer;
		spieler = ausgabeSpieler.getText();
		computer = ausgabeComputer.getText();
		if(!spieler.equals(computer)) {
			if(spieler.equals("Schere")&&computer.equals("Papier")) {
				rundenErgebnis.setText("Du hast diese Runde gewonnen!");
				++siegeSpieler;
			}else{
				if(spieler.equals("Schere")&&computer.equals("Stein")) {
					rundenErgebnis.setText("Du hast diese Runde verloren!");
					++siegeComputer;
				}
			}
			if(spieler.equals("Stein")&&computer.equals("Schere")) {
				rundenErgebnis.setText("Du hast diese Runde gewonnen!");
				++siegeSpieler;
			}else{
				if(spieler.equals("Stein")&&computer.equals("Papier")) {
					rundenErgebnis.setText("Du hast diese Runde verloren!");
					++siegeComputer;
				}
			}
			if(spieler.equals("Papier")&&computer.equals("Stein")) {
				rundenErgebnis.setText("Du hast diese Runde gewonnen!");
				++siegeSpieler;
			}else{
				if(spieler.equals("Papier")&&computer.equals("Schere")) {
					rundenErgebnis.setText("Du hast diese Runde verloren!");
					++siegeComputer;
				}
			}
		}else{
			rundenErgebnis.setText("Unentschieden");
		}
		 spielstandsWerte.setText(""+siegeSpieler+"                           "+siegeComputer);
	}
	/**
	 * Eine Methode, die den Computer eine zufaellige Aktion auswaehlen laesst.
	 * 
	 * @since 2014-03-21
	 * 
	 */
	public void computerZug() {
		int zug = (int) (Math.random()*3+1);
		switch(zug) {
			case 1:
				ausgabeComputer.setText("Schere");
				break;
			case 2:
				ausgabeComputer.setText("Stein");
				break;
			case 3:
				ausgabeComputer.setText("Papier");
				break;
			default:
				ausgabeComputer.setText("Schere");
		}
		sieg();
	}
	/**
	 * Eine Innenklasse, die meine Buttons verwaltet.
	 * 
	 * @author Andreas Bordan
	 * @version 2014-03-21
	 *
	 */
	public class ButtonControl implements ActionListener{
		/**
		 * Eine Methode, die bei einem Klick auf die Buttons eine entsprechende Aktion ausfuehrt.
		 * 
		 * @since 2014-03-21
		 * 
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("Schere")) {
				ausgabeSpieler.setText("Schere");
			}
			if(e.getActionCommand().equals("Stein")) {
				ausgabeSpieler.setText("Stein");
			}
			if(e.getActionCommand().equals("Papier")) {
				ausgabeSpieler.setText("Papier");
			}
			computerZug();
		}
	}
}