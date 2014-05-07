package bordan;
import javax.swing.*;
/**
 * Ein Programm, das Die Anzahl an einem bestimmten Buchstaben in verschiedenen Texten zaehlt und ausgibt.
 * 
 * @author Andreas Bordan
 * @version 2013-09-27
 */
public class TextArray {
    /***
     * Eine Methode, die die Anzahl an Buchstaben in Texten zaehlt.
     * 
     * @param []texte Die Array, aus der die Texte zur Ueberpruefung stammen
     * @param buchstabe Der fuer die Ueberpruefung bestimmte Buchstabe
     * @return Die Anzahl an vorhandenen Buchstaben in den Texten
     * 
     * @since 2013-09-27
     */
    public static int zaehle(String [] texte, char buchstabe) {
        int anzahlAnBuchstaben = 0;
        for(int i = 0;i<texte.length;i++) {
            for(int i2 = 0;i2<texte[i].length();i2++) {
                if(texte[i].charAt(i2)==buchstabe) {
                    anzahlAnBuchstaben++;
                }
            }
        }
        return anzahlAnBuchstaben;
    }
    /**
     * Die main-Methode laesst den Benutzer die Texte eingeben und fragt ihn auch nach dem zu
     * zaehlenden Buchstaben. Anschlieszend wird die Anzahl des Buchstabens auf der Konsole ausgegeben.
     * 
     * @since 2013-09-27
     */
    public static void main(String[]args) {
        String [] texte = new String [5];
        for(int i = 0;i<texte.length;i++) {
            texte[i]= JOptionPane.showInputDialog(null,"Bitte geben sie den "+(i+1)+". Text ein.");
        }
        String eingabe2 = JOptionPane.showInputDialog("Fuer welchen Buchstaben soll die Anzahl gesucht werden?");
        char buchstabe = eingabe2.charAt(0); // laut Angabe sollten wir hier 'a' verwenden, ich wollte es aber lieber dem Benutzer ueblerlassen.
        System.out.println("Die Anzahl an \""+buchstabe+"\" in den Texten ist: "+zaehle(texte,buchstabe));
    }
}