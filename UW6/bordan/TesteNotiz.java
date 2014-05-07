package bordan;
import javax.swing.*;
/**
 * Ein Programm, das die Notizklasse testet.
 * 
 * @author Andreas Bordan
 * @version 2013-10-11
 */
public class TesteNotiz {
    /**
     * Die main-Methode erzeugt Notiz-Objekte aus der Klasse Notiz und verwendet diese fuer Tests.
     * 
     * @since 2013-10-11
     */
    public static void main(String[]args) {
        Notiz n = new Notiz("Betreff","Text");
        Notiz n2 = new Notiz("abc","xyz");
        String eingabeBetreff = JOptionPane.showInputDialog(null,"Geben Sie bitte einen Notizbetreff ein.");
        String eingabeText = JOptionPane.showInputDialog(null,"Geben Sie bitte einen Notiztext ein.");
        n.setBetreff(eingabeBetreff);
        n.setText(eingabeText);
        JOptionPane.showMessageDialog(null,"Ihr Betreff lautet: "+n.getBetreff());
        JOptionPane.showMessageDialog(null,"Ihr Text lautet: "+n.getText());
        JOptionPane.showMessageDialog(null,"Ihre Notiz wurde zu dieser Zeit geschrieben: "+n.getTimestamp());
    }
}
