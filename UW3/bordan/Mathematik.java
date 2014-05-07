package bordan; 
import javax.swing.*;
/**
 * Ein Programm, das beliebig viele Zahlen vom Benutzer einliest und aufhoert, sobald er 0 eingibt.
 * Anschlieszend wird die Summe aller Eingaben ausgegeben.
 * 
 * Schritt 2:
 * Berechnet den Mittelwert aller Eingabe und gibt diesen aus.
 * 
 * Schritt 3:
 * Ermittlung der kleinsten und der groeszten Eingabe.
 * 
 * @author Andreas Bordan
 * @version 2013-09-20
 */
public class Mathematik {
    /**
     * Die main-Methode fuehrt das Programm aus.
     * 
     * @since 2013-09-20
     */
    public static void main(String[]args) {
        int summe = 0;
        int i = 0;
        int zaehler = 0;
        String s ="";
        double mitte = 0;
        int kleinster = Integer.MAX_VALUE;
        int groeszter = Integer.MIN_VALUE;
        do{
            s = JOptionPane.showInputDialog(null,"Geben Sie bitte eine Zahl ein.");
            i = Integer.parseInt(s);
            summe += i; // += Bedeutet zaehlt zu links das rechte dazu.
            if(i<kleinster&&(i!=0)) {
                kleinster = i;
            }
            if(i>groeszter&&(i!=0)) {
                groeszter = i;
            }
            zaehler++;
        }while(i!=0);
        zaehler -= 1; // -= Bedeutet zaehlt rechts von links ab.
        mitte = (double) summe/zaehler;
        JOptionPane.showMessageDialog(null,"Die Summe all ihrer Eingaben = "+summe+" .");
        JOptionPane.showMessageDialog(null,"Der Mittelwert all ihrer Eingabe = "+mitte+" .");
        JOptionPane.showMessageDialog(null,"Die kleinste Eingabe lautet: "+kleinster+" .");
        JOptionPane.showMessageDialog(null,"Die groeszte Eingabe lautet: "+groeszter+" .");
    }
}