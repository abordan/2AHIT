import javax.swing.*;
/**
 * Ein Programm, das einen Spieler TicTacToe gegen einen anderen Spieler antreten laesst.
 * 
 * @author Andreas Bordan
 * @version 2013-04-30
 */
public class TicTacToeObject {
    private char [] [] feld;
    private int zugZaehler;
    private final int maxZuege;
    private final char zeichenLeer,zeichenX,zeichenO;
    /**
     * Konstruktor fuer ein TicTacToe-Spielfeld.
     * 
     * @since 2014-02-21
     */
    public TicTacToeObject() {
        feld = new char [3] [3];
        zugZaehler = 0;
        maxZuege = 9;
        zeichenLeer = ' ';
        zeichenX = 'X';
        zeichenO = 'O';
    }
    /**
     * Eine Methode, die alle Felder zuruecksetzt.
     * 
     * @since 2014-02-21
     */
    public void init(){
        zugZaehler = 0;
        for(int spalte = 0;spalte<feld.length;++spalte) {
            for(int reihe = 0;reihe<feld[spalte].length;++reihe) {
                feld[spalte][reihe] = zeichenLeer;
            }
        }
    }
    /**
     * Eine Methode, die das aktuelle TicTacToe-Feld ueber die Konsole ausgibt.
     * 
     * @since 2014-02-21
     */
    public void ausgabe() {
        System.out.println("\f     1   2   3");
        System.out.println("   +---+---+---+");
         for(int spalte = 0;spalte<feld.length;++spalte) {
            char zeichen = (char) (65+spalte); // fuer A B C
            System.out.println(""+zeichen+"  | "+feld[spalte][0]+" | "+feld[spalte][1]+" | "+feld[spalte][2]+" |");
            System.out.println("   +---+---+---+");
        }
    }
    /**
     * Eine Methode, die den Spieler nach dem Feld fuer seinen Zug fragt und diesen dann, sofern er
     * moeglich ist, durchfuehrt.
     * 
     * @param zeichen Das auf das Feld zu setzende Zeichen.
     * 
     * @since 2014-02-21
     */
    public  void spielerZug(char zeichen) {
        String s = JOptionPane.showInputDialog(null,"Bitte die Feldnummer (Buchstabe und Zahl) fuer deinen naechsten Zug eingeben.");
        while(!gueltigerZug(s)) {
            s = JOptionPane.showInputDialog(null,"Dies war eine ungueltige Eingabe, bitte nochmal probieren!");
        }
        zugSetzen(s,zeichen);
        ausgabe();
    }
    /**
     * Eine Methode, die ueberprueft, ob der Zug des Spielers moeglich ist.
     * 
     * @param s Das vom Spieler fuer seinen Zug definierte Feld.
     * 
     * @return Bestimmt, ob der Zug moeglich ist.
     * 
     * @since 2014-02-21
     */
    public  boolean gueltigerZug(String s) {
        if(s.length()!=2) { // Feld besteht aus BuchstabeZeichen
            return false;
        }
        int spalteZahl = s.toUpperCase().charAt(0)-'A'; // Unicode-Werte werden subtrahiert -> Werte fuer Array-Felder 0,1,2 ermittelt.
        int reiheZahl = s.toUpperCase().charAt(1)-'1'; // Unicode-Werte werden subtrahiert -> Werte fuer Array-Felder 0,1,2 ermittelt.
        if(!((-1<spalteZahl)&&(spalteZahl<3))) { // nur A,B,C moeglich
            return false;
        }
        if(!((-1<reiheZahl)&&(reiheZahl<3))) { // nur 1,2,3 moeglich
            return false;
        }
        if(!(feld[spalteZahl][reiheZahl]==' ')) { // Feld muss leer sein
            return false;
        }
        return true;
    }
    /**
     * Eine Methode, die eine der TicTacToe-Zellen umaendert.
     * 
     * @param s Das vom Spieler fuer seinen Zug definierte Feld.
     * @param zeichen Das auf das Feld zu setzende Zeichen.
     * 
     * @since 2014-02-21
     */
    public void zugSetzen(String s,char zeichen) {
        int spalteZahl = s.toUpperCase().charAt(0)-'A'; // Unicode-Werte werden subtrahiert -> Werte fuer Array-Felder 0,1,2 ermittelt.
        int reiheZahl = s.toUpperCase().charAt(1)-'1'; // Unicode-Werte werden subtrahiert -> Werte fuer Array-Felder 0,1,2 ermittelt.
        feld[spalteZahl][reiheZahl] = zeichen;
    }
    /**
     * Eine Methode, die zur Hilfe der Siegesermittlung dient.
     * 
     * @param x Die erste Zelle fuer die Siegerermittlung.
     * @param y Die zweite Zelle fuer die Siegerermittlung.
     * @param z Die dritte Zelle fuer die Siegerermittlung.
     * 
     * @return Bestimmt, ob ein Sieg erzielt wurde.
     * 
     * @since 2013-04-17
     */
    public boolean siegHelp(char x, char y, char z) {
        String s = ""+x+y+z;
        if(s.equals("XXX")||s.equals("OOO")) {
            return true;
        }
        return false;
    }
    /**
     * Eine Methode, die ueberprueft, ob ein Spieler gesiegt hat.
     * 
     * @return Bestimmt, ob ein Sieg ermittelt wurde.
     * 
     * @since 2014-02-21
     */
    public boolean sieg() {
        // Siegesermittlung der Spalten und Reihen
        for(int spalte = 0;spalte<feld.length;++spalte) {
            for(int reihe = 0;reihe<feld[spalte].length;++reihe) {
                if(siegHelp(feld[spalte][0],feld[spalte][1],feld[spalte][2])||siegHelp(feld[0][reihe],feld[1][reihe],feld[2][reihe])){
                    return true;
                }
            }
        }
        // Siegesermittlung der Diagonalen
        if(siegHelp(feld[0][0],feld[1][1],feld[2][2])||siegHelp(feld[0][2],feld[1][1],feld[2][0])) {
            return true;
        }
        return false;
    }
    /**
     * Eine Methode, die eine Partie TicTacToe startet.
     * 
     * @param beginner Bestimmt, wer beginnt.
     * 
     * @since 2014-02-21
     * // mehrfache spiele noch nicht moeglich
     */
    public void spielen(int beginner) {
        init();
        ausgabe();
        for(;zugZaehler<maxZuege;zugZaehler++) {
            if(maxZuege%beginner==0) { // Abwechselnde Zuege
                spielerZug('X');
                if(sieg()) {
                    JOptionPane.showMessageDialog(null,"Spieler1 hat gewonnen!");
                    zugZaehler = maxZuege;
                }
                beginner = 2;
            }else{
                spielerZug('O');
                if(sieg()) {
                    JOptionPane.showMessageDialog(null,"Spieler2 hat gewonnen!");
                    zugZaehler = maxZuege;
                }
                beginner = 1;
            }
        }
        if(!sieg()) { // Wenn nach Ablauf aller Zuege niemand siegt, gilt es als unentschieden.
            JOptionPane.showMessageDialog(null,"Unentschieden!");
        }
    }
    /**
     * Die main-Methode startet nach einem Spiel ein weiteres, sofern der Spieler es auch moechte.
     * 
     * @since 2014-02-21
     */
    public void main(String[]args) {
        String s, s1;
        int beginner = 1;
        do {
            for(s = JOptionPane.showInputDialog(null,"Soll X oder O beginnen?").toUpperCase();(!s.equals("X"))&&(!s.equals("O"));s = JOptionPane.showInputDialog("Wer soll denn nun wirklich beginnen?").toUpperCase()) {
                // Solange bis der Benutzer eine gueltige Eingabe macht.
            }
            if(s.charAt(0)=='O'){
                beginner = 2;
            }
            spielen(beginner);
            s1 = JOptionPane.showInputDialog(null,"Noch eine Partie?").toUpperCase();
        }while((s1.charAt(0)=='Y')||(s1.charAt(0)=='J')); // Deutsch und Englisch moeglich
    }
}