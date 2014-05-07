package bordan;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

/**
 * Ein Programm, das ein Panel mit 2 Buttons und einem Label erzeugt.
 * 
 * @author Andreas Bordan
 * @version 2014-03-21
 *
 */
@SuppressWarnings("serial")
public class APanel extends JPanel {
	private JLabel lAusgabe;
	private JButton up, down;
	private int zaehler;
    /**
     * Konstruktor fuer das Panel.
     * 
     * @since 2014-03-21
     */
	public APanel() {
		zaehler = 0;
		this.lAusgabe = new JLabel(""+zaehler);
		this.setLayout(new BorderLayout());
		this.add(lAusgabe, BorderLayout.CENTER);
		this.lAusgabe.setHorizontalAlignment(SwingConstants.CENTER);
		this.up = new JButton("Hoch");
		this.add(up, BorderLayout.NORTH);
		this.down = new JButton("Runter");
		this.add(down, BorderLayout.SOUTH);
		JButtons listener = new JButtons();
		up.addActionListener((ActionListener) listener);
		down.addActionListener((ActionListener) listener);
		up.setActionCommand("+1");
		down.setActionCommand("-1");
	}
    /**
     * Ein Innenprogramm, das meine Buttons verwaltet.
     * 
     * @author Andreas Bordan
     * @since 2014-03-21
     *
     */
	public class JButtons implements ActionListener {
		@Override
		/**
		 * Eine Methode, die die Aktionen fuer die Buttons festlegt.
		 * 
		 * @param e Der Button, der geklickt wird
		 * 
		 * @since 2014-03-21
		 */
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("+1")) {
				++zaehler;
			}
			if(e.getActionCommand().equals("-1")) {
				--zaehler;
			}
			lAusgabe.setText(""+zaehler);
		}
	}
}
