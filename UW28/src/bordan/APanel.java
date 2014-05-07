/**
 * 
 */
package bordan;

import javax.swing.*;

/**
 * Ein Programm, das die Komponenten fuer mein Fenster verwaltet.
 * 
 * @author Andreas Bordan
 * @version 2014-03-14
 */
@SuppressWarnings("serial")
public class APanel extends JPanel {
	private JLabel lAusgabe;
	private JButton bOK;
	/**
	 * Konstruktor fuer meine Fensterkomponenten
	 *
	 * @since 2014-03-14
	 */
	public APanel() {
		lAusgabe = new JLabel("Ich bin toll",SwingConstants.CENTER);
		bOK = new JButton("OK");
		this.add(lAusgabe);
		this.add(bOK);
	}
	public class buttonControl {
	}
}
