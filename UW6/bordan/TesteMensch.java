package bordan;
import javax.swing.*;
/**
 * Ein Programm, das die Menschenklasse testet.
 * 
 * @author Andreas Bordan
 * @version 2013-10-12
 */
public class TesteMensch {
    /**
     * Die main-Methode erzeugt Menschen-Objekte aus der Klasse Mensch und verwendet diese fuer Tests.
     * 
     * @since 2013-10-11
     */
    public static void main(String[]args) {
        Mensch mensch = new Mensch();
        String name = JOptionPane.showInputDialog(null,"Wie soll Ihr Mensch heiszen?");
        String geschlecht = JOptionPane.showInputDialog(null,"Soll Ihr Mensch maennlich oder weiblich sein?");
        String gewicht = JOptionPane.showInputDialog(null,"Wie viel soll Ihr Mensch wiegen?(kg)");
        String zahnAnzahl = JOptionPane.showInputDialog(null,"Wie viele Zaehne soll Ihr Mensch haben?");
        String haarAnzahl = JOptionPane.showInputDialog(null,"Wie viele Haare soll Ihr Mensch haben?");
        mensch.setName(name);
        mensch.setGeschlecht(geschlecht.charAt(0));
        mensch.setGewicht(Double.parseDouble(gewicht));
        mensch.setZahnAnzahl(Integer.parseInt(zahnAnzahl));
        mensch.setHaarAnzahl(Long.parseLong(haarAnzahl));
        if(mensch.getGeschlecht()=='m'||mensch.getGeschlecht()=='M') {
            JOptionPane.showMessageDialog(null,mensch.getName()+" ist ein Mann, er hat "+mensch.getHaarAnzahl()+" Haare, noch "+mensch.getZahnAnzahl()+" Zaehne und wiegt "+mensch.getGewicht()+"kg .");
        }else{
            JOptionPane.showMessageDialog(null,mensch.getName()+" ist eine Frau, sie hat "+mensch.getHaarAnzahl()+" Haare, noch "+mensch.getZahnAnzahl()+" Zaehne und wiegt "+mensch.getGewicht()+"kg .");
        }
    }
}