package bordan;
import javax.swing.*;
/**
 * Ein Programm, das Zufallszahlen erstellt und sie ausgibt.
 * 
 * @author Andreas Bordan
 * @version 2013-09-22
 */
public class ArrayZufall {
    static int [] zufallszahlen; // = new int [zahl]; geht auch
    /**
     * Eine Methode, die den Benutzer die Anzahl der zu erzeugenden Zufallszahlen eingeben laesst.
     * 
     * @return Die Anzahl der Zufallszahlen
     * 
     * @since 2013-09-20
     */
    public static int eingabe() {
        int anzahl;
        String eingabe = JOptionPane.showInputDialog(null,"Geben Sie bitte die Anzahl der zu erzeugenden Zufallszahlen ein.");
        anzahl = Integer.parseInt(eingabe);
        return anzahl;
    }
    /**
     * Eine Methode, die Zufallszahlen in einem Array erzeugt.
     * 
     * @param anzahl Dei Anzahl der zu erzeugenden Zufallszahlen
     * 
     * @since 2013-09-22
     */
    public static void erzeugeZufallszahlen(int anzahl) {
        zufallszahlen = new int [anzahl];
        for(int i = 0;i<anzahl;i++) {
            double zufallsZahl = Math.random()*100;
            zufallszahlen [i] = (int) zufallsZahl;
        }
    }
    /**
     * Eine Methode, die die erzeugenden Zufallszahlen auf der Konsole ausgibt.
     * 
     * @since 2013-09-22
     */
    public static void ausgabe() {
        System.out.print("Von vorne:");
        for(int i = 0;i<zufallszahlen.length;i++) {
            int vorwaerts = zufallszahlen[i];
            System.out.print(" "+vorwaerts);
        }
        System.out.println();
        System.out.print("Von hinten:");
        for(int i = zufallszahlen.length;i>0;i--) {
            int rueckwaerts = zufallszahlen[i-1];
            System.out.print(" "+rueckwaerts);
        }
    }
    /**
     * Die main-Methode ruft die oberen Methoden der Reihe nach auf.
     * 
     * @since 2013-09-20
     */
    public static void main(String[]args) {
        erzeugeZufallszahlen(eingabe());
        ausgabe();
    }
}