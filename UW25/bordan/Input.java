package bordan;
import java.io.*;
/**
 * Ein Programm, das Eingaben der Konsole umaendert.
 * 
 * @author Andreas Bordan
 * @version 2013-12-06
 */
public class Input {
    /**
     * Eine Methode, die einen Text ausgibt und anschlieszend eine Ziffer vom Benutzer in ihren 
     * Integer-Wert umwandelt.
     * 
     * @param s Der auszugebende Text
     * 
     * @return Die umgewandelte Zahl, oder Integer.MIN_VALUE
     * 
     * @since 2013-11-26
     */
    public static int readInt(String s) {
        int zahlInt = 0;
        System.out.println(s);
        try {
            zahlInt = Integer.parseInt(readString());
        }catch(NumberFormatException fehler) {
            return Integer.MIN_VALUE;
        }
        return zahlInt;
    }
    /**
     * Eine Methode, die einen Text ausgibt und anschlieszend eine Ziffer vom Benutzer in ihren 
     * Double-Wert umwandelt.
     * 
     * @param s Der auszugebende Text
     * 
     * @return Die umgewandelte Zahl oder Double.MIN_VALUE
     * 
     * @since 2013-12-06
     */
    public static double readDouble(String s) {
        System.out.println(s);
        double zahlDouble = 0.0;
        try {
            zahlDouble = Double.parseDouble(readString());
        }catch(NumberFormatException fehler) {
            return Double.MIN_VALUE;
        }
        return zahlDouble;
    }
    /**
     * Eine Methode, die einen Text ausgibt und anschlieszend mehrere Zahlen vom Benutzer in ihre 
     * Integer-Werte umwandelt.
     * 
     * @param s Der auszugebende Text
     * @param count Die Anzahl der umzuwandelnden Zahlen
     * 
     * @return Die umgewandelten Zahlen
     * 
     * @since 2013-12-03
     */
    public static int [] readIntArray(String s,int count) {
        if(count<1) {
            return null;
        }
        System.out.println(s);
        int [] intArr = new int [count];
        for(int i = 0;i<intArr.length;++i) {
            intArr[i] = readInt(""+(i+1)+". Zahl");
            if(intArr[i]==Integer.MIN_VALUE) {
                return null;
            }
        }
        /*
         * Ausgabe 
         * for(int i = 0;i<intArr.length;++i) {
         *   System.out.println(""+(i+1)+". "+intArr[i]);
         * }
         */
        return intArr;
    }
    /**
     * Eine Methode, die einen Text aus der Konsole ausliest und ihn als String zurueckliefert.
     * 
     * @return Der umgewandelte Text
     */
    public static String readString() {
        String ausgabe = "";
        char zeichen = ' ';
        while(zeichen!=10&&zeichen!=13) {
            try{
                zeichen = (char) System.in.read();
            }catch(IOException fehler){
                return null;
            }
            if(zeichen!=10&&zeichen!=13){
                ausgabe += zeichen;
            }
        }
        return ausgabe;
    }
    /**
     * Eine Methode, die einen Text aus der Konsole ausliest und ihn als String zurueckliefert.
     * 
     * @param text Der auszugebende Text
     * 
     * @return Der umgewandelte Text
     * 
     * @since 2013-12-06
     */
    public static String readString(String text) {
        System.out.println(text);
        return readString();
    }
    /*
    /**
     * Eine Methode, die den benoetigten Konsoleninput wieder auf String zurueckaendert.
     * 
     * @param switcher Die zu aendernde Konsoleneingabe in Unicode
     * 
     * @return Die geaenderte Konsoleneingabe
     * 
     * @since 2013-11-26
     */
    /*
    public static String switching(int switcher) {
        String s;
        switch(switcher){
            case 46:
            s = ".";
            break;
            case 48:
            s = "0";
            break;
            case 49:
            s = "1";
            break;
            case 50:
            s = "2";
            break;
            case 51:
            s = "3";
            break;
            case 52:
            s = "4";
            break;
            case 53:
            s = "5";
            break;
            case 54:
            s = "6";
            break;
            case 55:
            s = "7";
            break;
            case 56:
            s = "8";
            break;
            case 57:
            s = "9";
            break;
            default:
            s = "";
        }
        return s;
    }
    */
}