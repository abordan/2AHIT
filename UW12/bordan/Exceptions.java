package bordan;
import javax.swing.*;
import java.io.*;
/**
 * Ein Programm, das
 * 
 * @author Andreas Bordan
 * @version 2013-11-22
 */
public class Exceptions {
    /**
     * Die main-Methode
     * 
     * @since 2013-11-22
     */
    public static void main(String[]args) {
        String s = "";
        int i = 0;
        char zeichen = 0;
        try {
            do{
                zeichen = (char) System.in.read();
                //DEBUG System.out.print(zeichen+" ");
                if(zeichen!=10) {
                    s = s+zeichen+" ";
                }
            }while(zeichen != 10);
            i = Integer.parseInt(s);
        }catch(NumberFormatException fehler) {
            System.out.println("Nur Zahlen eingeben!");
        }catch(IOException fehler2) {
            System.out.println("Beim Einlesen gab es einen Fehler!");
        }
        System.out.println(i);
    }
}