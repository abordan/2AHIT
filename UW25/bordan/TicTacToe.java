package bordan;
import javax.swing.*;
/**
 * Ein Programm, das einen Spieler TicTacToe gegen den Computer spielen lässt.
 * 
 * @author Andreas Bordan
 * @author Ivana Pavlovic
 * @version 2013-04-30
 */
public class TicTacToe {
    static char [] [] feld = new char [3] [3];
    static int zugZähler;
    static final char zeichenLeer = ' ';
    static final char zeichenComputer = 'O';
    static final char zeichenSpieler = 'X';
    static final int maxZüge = 9;
    /**
     * Eine Methode, die alle Felder und den Zähler in ihre Ursprungszustände zurücksetzt.
     * 
     * @since 2013-04-17
     */
    public static void init(){
        feldA1 = zeichenLeer;
        feldA2 = zeichenLeer;
        feldA3 = zeichenLeer;
        feldB1 = zeichenLeer;
        feldB2 = zeichenLeer;
        feldB3 = zeichenLeer;
        feldC1 = zeichenLeer;
        feldC2 = zeichenLeer;
        feldC3 = zeichenLeer;
        zugZähler = 0;
    }
    /**
     * Eine Methode, die das aktuelle TicTacToe-Feld über die Konsole ausgibt.
     * 
     * @since 2013-04-17
     */
    public static void ausgabe() {
        System.out.println("\f     A   B   C");
        System.out.println("   +---+---+---+");
        System.out.println("1  | "+feldA1+" | "+feldB1+" | "+feldC1+" |");
        System.out.println("   +---+---+---+");
        System.out.println("2  | "+feldA2+" | "+feldB2+" | "+feldC2+" |");
        System.out.println("   +---+---+---+");
        System.out.println("3  | "+feldA3+" | "+feldB3+" | "+feldC3+" |");
        System.out.println("   +---+---+---+");
    }
    /**
     * Eine Methode, die ein Spielfeld für Tests erzeugt.
     * 
     * @since 2013-04-17
     */
    public static void testFeld() {
        feldA1 = zeichenLeer;
        feldA2 = zeichenComputer;
        feldA3 = zeichenSpieler;
        feldB1 = zeichenLeer;
        feldB2 = zeichenLeer;
        feldB3 = zeichenSpieler;
        feldC1 = zeichenComputer;
        feldC2 = zeichenComputer;
        feldC3 = zeichenSpieler;
        System.out.println("\f     A   B   C");
        System.out.println("   +---+---+---+");
        System.out.println("1  | "+feldA1+" | "+feldB1+" | "+feldC1+" |");
        System.out.println("   +---+---+---+");
        System.out.println("2  | "+feldA2+" | "+feldB2+" | "+feldC2+" |");
        System.out.println("   +---+---+---+");
        System.out.println("3  | "+feldA3+" | "+feldB3+" | "+feldC3+" |");
        System.out.println("   +---+---+---+");
    }
    /**
     * Eine Methode, die einen Zug des Computers ausführt.
     * 
     * @since 2013-04-24
     */
    public static void computerZug() {
       czFreiesFeld();
       ausgabe();
       /*
        * Ich habe zwar alle cz-Methoden geschrieben ( letzten Methoden im Programm ) , aber
        * die Variablen werden, wie Sie gesagt haben, nicht übernommmen. Also habe ich nur
        * czFreiesFeld(), den Ursprungszustand des Computerzuges, hier aufgerufen.
        */ 
       /*
        * Die Form mit allen cz-Methoden würde folgendermaßen aussehen:
        * if(czSieg()==true) {
        * }else{
        *       if(czKeineNiederlage()==true){
        *       }else{
        *            if(czZweiVonDrei()==true) {
        *            }else{
        *                czFreiesFeld();
        *            }
        *       }
        * }
        * ausgabe();
        */
    }
    /**
     * Eine Methode, die den Spieler nach dem Feld für seinen Zug fragt und diesen dann, sofern er
     * möglich ist, durchführt.
     * 
     * @since 2013-04-19
     */
    public static void spielerZug() {
        String s = JOptionPane.showInputDialog(null,"Bitte die Feldnummer (Großbuchstabe und Zahl) für deinen nächsten Zug eingeben.");
        while(gültigerZug(s)==false) {
            s = JOptionPane.showInputDialog(null,"Dies war eine ungültige Eingabe, bitte nochmal probieren!");
        }
        zugSetzen(s);
        ausgabe();
    }
    /**
     * Eine Methode, die überprüft, ob der Zug des Spielers möglich ist.
     * 
     * @param s Das vom Spieler für seinen Zug definierte Feld.
     * @return Bestimmt, ob der Zug möglich ist.
     * @since 2013-04-30
     */
    public static boolean gültigerZug(String s) {
        boolean a = false;
        switch(s) {
            case "A1" :
            if(feldA1==zeichenLeer) {
                a = true;
            }
            break;
            case "A2" :
            if(feldA2==zeichenLeer) {
                a = true;
            }
            break;
            case "A3" :
            if(feldA3==zeichenLeer) {
                a = true;
            }
            break;
            case "B1" :
            if(feldB1==zeichenLeer) {
                a = true;
            }
            break;
            case "B2" :
            if(feldB2==zeichenLeer) {
                a = true;
            }
            break;
            case "B3" :
            if(feldB3==zeichenLeer) {
                a = true;
            }
            break;
            case "C1" :
            if(feldC1==zeichenLeer) {
                a = true;
            }
            break;
            case "C2" :
            if(feldC2==zeichenLeer) {
                a = true;
            }
            break;
            case "C3" :
            if(feldC3==zeichenLeer) {
                a = true;
            }
            break;
        }
        return a;
    }
    /**
     * Eine Methode, die eine der TicTacToe-Zellen umändert.
     * 
     * @param s Das vom Spieler für seinen Zug definierte Feld.
     * @since 2013-04-30
     */
    public static void zugSetzen(String s) {
        switch(s) {
            case "A1" :
            feldA1 = zeichenSpieler;
            break;
            case "A2" :
            feldA2 = zeichenSpieler;
            break;
            case "A3" :
            feldA3 = zeichenSpieler;
            break;
            case "B1" :
            feldB1 = zeichenSpieler;
            break;
            case "B2" :
            feldB2 = zeichenSpieler;
            break;
            case "B3" :
            feldB3 = zeichenSpieler;
            break;
            case "C1" :
            feldC1 = zeichenSpieler;
            break;
            case "C2" :
            feldC2 = zeichenSpieler;
            break;
            case "C3" :
            feldC3 = zeichenSpieler;
        }
    }
    /**
     * Eine Methode zur Hilfe der Ermittlung des Siegers.
     * 
     * @param x Die erste Zelle für die Siegerermittlung.
     * @param y Die zweite Zelle für die Siegerermittlung.
     * @param z Die dritte Zelle für die Siegerermittlung.
     * @param s Bestimmt, für wen der Sieg ermittelt werden soll.
     * @return Bestimmt, ob Computer oder Spieler gesiegt hat.
     * @since 2013-04-17
     */
    public static boolean siegHelp(char x, char y, char z, String spielerTyp) {
        boolean a;
        String s = ""+x+y+z;
        if(s.equals("XXX")&&spielerTyp.equals("Spieler")) {
            a = true;
        }else{
            if(s.equals("OOO")&&spielerTyp.equals("Computer")) {
                a = true;
            }else{
                a = false;
            }
        }
        return a;
    }
    /**
     * Eine Methode, die den Sieg des Computers oder des Spielers ermittelt.
     * 
     * @param s Bestimmt, ob für Spieler oder Computer der Sieg ermittelt wird.
     * @return Bestimmt, ob Computer oder Spieler gesiegt hat.
     * @since 2013-04-17
     */
    public static boolean sieg(String s) {
        boolean a;
        if(siegHelp(feldA1,feldA2,feldA3,s)==true) {
            a = true;
        }else{
            if(siegHelp(feldB1,feldB2,feldB3,s)==true) {
                a = true;
            }else{   
                if(siegHelp(feldC1,feldC2,feldC3,s)==true) {
                    a = true;
                }else{ 
                    if(siegHelp(feldA1,feldB1,feldC1,s)==true) {
                        a = true;
                    }else{ 
                        if(siegHelp(feldA2,feldB2,feldC2,s)==true) {
                            a = true;
                        }else{
                            if(siegHelp(feldA3,feldB3,feldC3,s)==true) {
                                a = true;
                            }else{
                                if(siegHelp(feldA1,feldB2,feldC3,s)==true) {
                                    a = true;
                                }else{
                                    if(siegHelp(feldA3,feldB2,feldC1,s)==true) {
                                        a = true;
                                    }else{
                                        a = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return a;
    }
    /**
     * Eine Methode, die den Spieler zuerst fragt wer beginnen soll und danach eine Partie TicTacToe startet.
     * 
     * @since 2013-04-19
     */
    public static void spielen() {
        init();
        ausgabe();
        String s = JOptionPane.showInputDialog(null,"Soll Spieler oder Computer den ersten Zug machen?");
        while((s.equals("Spieler")==false)&&(s.equals("Computer")==false)) {
            s = JOptionPane.showInputDialog(null,"Bitte nur \"Spieler\" oder \"Computer\" eingeben!");
        }
        if(s.equals("Spieler")) {
            for(;zugZähler<4;zugZähler++) {
                    spielerZug();
                    if(sieg("Spieler")==false) {
                        computerZug();
                        if(sieg("Computer")==true) {
                            JOptionPane.showMessageDialog(null,"Der Computer hat gewonnen!");
                            zugZähler = maxZüge;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Der Spieler hat gewonnen!");
                        zugZähler = maxZüge;
                    }
            }
            if(zugZähler<maxZüge) {
                spielerZug();
            }
            if(sieg("Spieler")==true&&(zugZähler<maxZüge)) {
                JOptionPane.showMessageDialog(null,"Der Spieler hat gewonnen!");
            }
            zugZähler = maxZüge;
            if((zugZähler==maxZüge)&&(sieg("Spieler")==false)&&(sieg("Computer")==false)) {
                JOptionPane.showMessageDialog(null,"Unentschieden!");
            }
        }else{
            for(;zugZähler<4;zugZähler++) {
                    computerZug();
                    if(sieg("Computer")==false) {
                        spielerZug();
                        if(sieg("Spieler")==true) {
                            JOptionPane.showMessageDialog(null,"Der Spieler hat gewonnen!");
                            zugZähler = maxZüge;
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Der Computer hat gewonnen!");
                        zugZähler = maxZüge;
                    }
            }
            if(zugZähler<maxZüge) {
                computerZug();
            }
            if(sieg("Computer")==true&&(zugZähler<maxZüge)) {
                JOptionPane.showMessageDialog(null,"Der Computer hat gewonnen!");
            }
            zugZähler = maxZüge;
            if((zugZähler==maxZüge)&&(sieg("Spieler")==false)&&(sieg("Computer")==false)) {
                JOptionPane.showMessageDialog(null,"Unentschieden!");
            }
        }
        // Diese Methode hat einiges an Denken erfordert.
    }
    /**
     * Eine Methode, die nach dem Spiel ein neues startet, sofern der Spieler es möchte.
     * 
     * @since 2013-04-17
     */
    public static void main(String[]args) {
        String s;
        do {
            spielen();
            s = JOptionPane.showInputDialog(null,"Möchtest du nochmal spielen?");
        }while(s.equals("Ja")||s.equals("ja"));
    }
    /**
     * Eine Methode, die den Computer mit einem einfach Algorithmus seinen Zug Spalte für Spalte
     * abarbeiten lässt, bis er ein freies Feld für seinen Zug gefunden hat.
     * 
     * @since 2013-04-30
     */
    public static void czFreiesFeld() {
       if(feldA1==zeichenLeer) {
           feldA1 = zeichenComputer;
       }else{
           if(feldA2==zeichenLeer) {
               feldA2 = zeichenComputer;
            }else{
                if(feldA3==zeichenLeer) {
                    feldA3 = zeichenComputer;
                }else{
                    if(feldB1==zeichenLeer) {
                        feldB1 = zeichenComputer;
                    }else{
                        if(feldB2==zeichenLeer) {
                            feldB1 = zeichenComputer;
                        }else{
                            if(feldB3==zeichenLeer) {
                                feldB3 = zeichenComputer;
                            }else{
                                if(feldC1==zeichenLeer) {
                                    feldC1 = zeichenComputer;
                                }else{
                                    if(feldC2==zeichenLeer) {
                                        feldC2 = zeichenComputer;
                                    }else{
                                        feldC3 = zeichenComputer;  
                                    }   
                                }   
                            }   
                        }   
                    }
                }       
            }
       }
    }
    /**
     * Eine Methode, die den möglichen Sieg für den Computer ermittelt und auch, wenn
     * 2 von 3 Feldern bereits mit zeichenComputer belegt sind, den Siegeszug durchführt.
     * 
     * @param x Das erste Feld für die Siegesermittlung.
     * @param y Das zweite Feld für die Siegesermittlung.
     * @param z Das dritte Feld für die Siegesermittlung.
     * @return Bestimmt, ob ein Sieg möglich ist.
     * @since 2013-04-24
     */
    public static boolean czSieg3(char x,char y, char z) {
        boolean a;
        if(x==zeichenComputer&&y==zeichenComputer&&z==zeichenLeer) {
            z = zeichenComputer;
            a = true;
        }else{
           if(x==zeichenComputer&&y==zeichenLeer&&z==zeichenComputer) {
                y = zeichenComputer;
                a = true;
            }else{
                if(x==zeichenLeer&&y==zeichenComputer&&z==zeichenComputer) {
                    x = zeichenComputer;
                    a = true;
                }else{
                    a = false;
                }
            }
        }
        return a;
    }
    /**
     * Eine Methode, die den möglichen Sieg für den Computer mit jeder Möglichkeit der Felder überprüft. 
     * 
     * @return Bestimmt, ob ein Sieg möglich ist.
     * @since 2013-04-24
     */
    public static boolean czSieg() {
        boolean a;
        if(czSieg3(feldA1,feldA2,feldA3)==true) {
            a = true;
        }else{
            if(czSieg3(feldB1,feldB2,feldB3)==true) {
                 a = true;
            }else{
                if(czSieg3(feldC1,feldC2,feldC3)==true) {
                    a = true;
                }else{
                    if(czSieg3(feldA1,feldB1,feldC1)==true) {
                        a = true;
                    }else{
                        if(czSieg3(feldA2,feldB2,feldC2)==true) {
                            a = true;
                        }else{
                            if(czSieg3(feldA3,feldB3,feldC3)==true) {
                                a = true;
                            }else{
                                if(czSieg3(feldA1,feldB2,feldC3)==true) {
                                    a = true;
                                }else{
                                    if(czSieg3(feldC1,feldB2,feldA3)==true) {
                                        a = true;
                                    }else{
                                        a = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return a;
    }
    /**
     * Eine Methode, die die mögliche Niederlage für den Computer ermittelt und auch, wenn
     * 2 von 3 Feldern bereits mit zeichenSpieler belegt sind, die Niederlage verhindert.
     * 
     * @param x Das erste Feld für die Niederlagenermittlung.
     * @param y Das zweite Feld für die Niederlagenermittlung.
     * @param z Das dritte Feld für die Niederlagenermittlung.
     * @return Bestimmt, ob eine Niederlage möglich ist.
     * @since 2013-04-24
     */
    public static boolean czKeineNiederlage3(char x, char y, char z) {
        boolean a;
        if((x==zeichenSpieler)&&(y==zeichenSpieler)&&(z==zeichenLeer)) {
            z = zeichenComputer;
            a = true;
        }else{
           if((x==zeichenSpieler)&&(y==zeichenLeer)&&(z==zeichenSpieler)) {
                y = zeichenComputer;
                a = true;
            }else{
                if((x==zeichenLeer)&&(y==zeichenSpieler)&&(z==zeichenSpieler)) {
                    x = zeichenComputer;
                    a = true;
                }else{
                    a = false;
                }
            }
        }
        return a;
    }
     /**
     * Eine Methode, die die mögliche Niederlage für den Computer mit jeder Möglichkeit der Felder
     * überprüft.
     * 
     * @return Bestimmt, ob eine Niederlage möglich ist.
     * @since 2013-04-24
     */
    public static boolean czKeineNiederlage() {
        boolean a;
        if(czKeineNiederlage3(feldA1,feldA2,feldA3)==true) {
            a = true;
        }else{
            if(czKeineNiederlage3(feldB1,feldB2,feldB3)==true) {
                 a = true;
            }else{
                if(czKeineNiederlage3(feldC1,feldC2,feldC3)==true) {
                    a = true;
                }else{
                    if(czKeineNiederlage3(feldA1,feldB1,feldC1)==true) {
                        a = true;
                    }else{
                        if(czKeineNiederlage3(feldA2,feldB2,feldC2)==true) {
                            a = true;
                        }else{
                            if(czKeineNiederlage3(feldA3,feldB3,feldC3)==true) {
                                a = true;
                            }else{
                                if(czKeineNiederlage3(feldA1,feldB2,feldC3)==true) {
                                    a = true;
                                }else{
                                    if(czKeineNiederlage3(feldC1,feldB2,feldA3)==true) {
                                        a = true;
                                    }else{
                                        a = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return a;
    }
    /**
     * Eine Methode, die den Computer sein Zeichen in eine Zeile/Spalte/Diagonale setzen lässt, wenn
     * dort bereits ein computerZeichen vorhanden ist.
     * 
     * @param x Das erste Feld für die Setzung des 2. Zeichens.
     * @param y Das zweite Feld für die Setzung des 2. Zeichens.
     * @param z Das dritte Feld für die Setzung des 2. Zeichens.
     * @return Bestimmt, ob das Setzen eines 2. Zeichen in diesen Fällen möglich ist.
     * @since 2013-04-24
     */
    public static boolean czZweiVonDrei3(char x, char y, char z) {
        boolean a;
        if(x==zeichenLeer&&y==zeichenLeer&&z==zeichenComputer) {
            x = zeichenComputer;
            a = true;
        }else{
           if(x==zeichenLeer&&y==zeichenComputer&&z==zeichenLeer) {
                y = zeichenComputer;
                a = true;
            }else{
                if(x==zeichenComputer&&y==zeichenLeer&&z==zeichenLeer) {
                    z = zeichenComputer;
                    a = true;
                }else{
                    a = false;
                }
            }
        }
        return a;
    }
    /**
     * Eine Methode, die den Computer sein 2. Zeichen mit allen Möglichkeiten der Spielfelder zu setzen
     * probieren lässt.
     * 
     * @return Bestimmt, ob das Setzen eines 2. Zeichen in diesen Fällen möglich ist.
     * @since 2013-04-24
     */
    public static boolean czZweiVonDrei() {
        boolean a;
        if(czZweiVonDrei3(feldA1,feldA2,feldA3)==true) {
            a = true;
        }else{
            if(czZweiVonDrei3(feldB1,feldB2,feldB3)==true) {
                 a = true;
            }else{
                if(czZweiVonDrei3(feldC1,feldC2,feldC3)==true) {
                    a = true;
                }else{
                    if(czZweiVonDrei3(feldA1,feldB1,feldC1)==true) {
                        a = true;
                    }else{
                        if(czZweiVonDrei3(feldA2,feldB2,feldC2)==true) {
                            a = true;
                        }else{
                            if(czZweiVonDrei3(feldA3,feldB3,feldC3)==true) {
                                a = true;
                            }else{
                                if(czZweiVonDrei3(feldA1,feldB2,feldC3)==true) {
                                    a = true;
                                }else{
                                    if(czZweiVonDrei3(feldC1,feldB2,feldA3)==true) {
                                        a = true;
                                    }else{
                                        a = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return a;
    }
}