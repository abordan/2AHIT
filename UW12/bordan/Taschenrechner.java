package bordan;
import java.io.*;
/**
 * Ein Programm, das eine beliebige Anzahl von Zahlen vom Benutzer ueber die Konsole einliest, dann
 * nach einem entsprechenden Rechenoperator fragt und alle Zahlen mittels dieses Operators
 * zusammenrechnet.
 * 
 * @author Andreas Bordan
 * @version 2013-12-03
 */
public class Taschenrechner{
    /**
     * Eine Methode, die eine beliebige Anzahl von Zahlen vom Benutzer ueber die Konsole einliest,
     * dann nach einem entsprechenden Rechenoperator fragt und alle Zahlen mittels dieses Operators
     * zusammenrechnet.
     * 
     * @return Das Ergebnis der zusammengerechneten Zahlen
     * 
     * @since 2013-12-03
     */
    public static int taschenrechner() {
        int ergebnis = 0, init = -1;
        int [] arr = new int [2];
        System.out.println("Eingabe der Zahlen:");
        do{
            ++init;
            arr[init] = Input.readInt(""+(init+1)+". Zahl");
            if(init == arr.length-1) {
                arr = arrBigger(arr);
            }
        }while(arr[init]!=Integer.MIN_VALUE);
        if(init<2){
            return 0;
        }
        try {
            char operator = Input.readString("Eingabe des Operators:").charAt(0);
            switch(operator) {
                case '+' :
                for(int i = 0;i<arr.length-2;++i) {
                    if(i==0) {
                        ergebnis = arr[i];
                    }else{
                        ergebnis = ergebnis + arr[i];
                    }
                }
                break;
                case '-' :
                for(int i = 0;i<arr.length-2;++i) {
                    if(i==0) {
                        ergebnis = arr[i];
                    }else{
                        ergebnis = ergebnis - arr[i];
                    }
                }
                break;
                case '/' :
                for(int i = 0;i<arr.length-2;++i) {
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
                for(int i = 0;i<arr.length-2;++i) {
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
    /**
     * Eine Methode, die alle Werte eines int-Arrays in ein um 1 groeszeres int-Array kopiert.
     * 
     * @param []arr Das zu vergroeszernde Array
     * 
     * @return Das um 1 groeszere Array, in dem alle bisherigen Werte des Alten vorhanden sind
     * 
     * @since 2013-12-03
     */
    public static int[] arrBigger (int [] arr) {
        int [] arrBig = new int [arr.length+1];
        for(int i = 0;i<arr.length;++i) {
            arrBig[i] = arr[i];
        }
        return arrBig;
    }
}