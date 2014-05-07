package bordan;
import java.io.*;
/**
 * Ein Programm, das eine angegebene Anzahl von Zahlen vom Benutzer ueber die Konsole einliest, dann
 * nach einem entsprechenden Rechenoperator fragt und alle Zahlen mittels dieses Operators
 * zusammenrechnet.
 * 
 * @author Andreas Bordan
 * @version 2013-12-03
 */
public class TaschenrechnerMitDefinition{
    /**
     * Eine Methode, die eine angegebene Anzahl von Zahlen vom Benutzer ueber die Konsole einliest,
     * dann nach einem entsprechenden Rechenoperator fragt und alle Zahlen mittels dieses Operators
     * zusammenrechnet.
     * 
     * @param zahlen Die Anzahl der einzugebenden Zahlen
     * 
     * @return Das Ergebnis der zusammengerechneten Zahlen
     * 
     * @since 2013-12-03
     */
    public static int taschenrechner(int zahlen) {
        int ergebnis = 0;
        if(zahlen<2) {
            return 0;
        }
        int [] arr = Input.readIntArray("Eingabe der Zahlen:",zahlen);
        // Ueberpruefung des Arrays, falls der Benutzer mit der Anzahl der Zahlen gelogen hat
        if(arr==null) {
            return 0;
        }
        try {
            char operator = Input.readString("Eingabe des Operators:").charAt(0);
            switch(operator) {
                case '+' :
                for(int i = 0;i<arr.length;++i) {
                    if(i==0) {
                        ergebnis = arr[i];
                    }else{
                        ergebnis = ergebnis + arr[i];
                    }
                }
                break;
                case '-' :
                for(int i = 0;i<arr.length;++i) {
                    if(i==0) {
                        ergebnis = arr[i];
                    }else{
                        ergebnis = ergebnis - arr[i];
                    }
                }
                break;
                case '/' :
                for(int i = 0;i<arr.length;++i) {
                    if(i==0) {
                        ergebnis = arr[i];
                    }else{
                        if(arr[i]==0) { // Division durch 0
                            return 0;
                        }else{
                            ergebnis = ergebnis / arr[i];
                        }
                    }
                }
                break;
                case '*' :
                for(int i = 0;i<arr.length;++i) {
                    if(i==0) {
                        ergebnis = arr[i];
                    }else{
                        ergebnis = ergebnis * arr[i];
                    }
                }
                break;
                default:
                return 0;
            }
        }catch(NumberFormatException blubblub) {
            return 0;
        }
        System.out.println("Ergebnis: "+ergebnis);
        return ergebnis;
    }
}