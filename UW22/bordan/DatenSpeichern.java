package bordan;
import java.io.*;
/**
 * Ein Programm, das dem Benutzer eine Datei mit seinen Informationen anlegt.
 * 
 * @author Andreas Bordan
 * @version 2014-02-14
 */
public class DatenSpeichern {
    /**
     * Die main-Methode erzeugt ein beschreibbares File und laesst es beschreiben.
     * 
     * @since 2014-02-14
     */
    public static void main(String[]args) {
        File f = erzeugeFile(Input.readString("Bitte Dateipfad angeben."));
        try{
            RandomAccessFile r = new RandomAccessFile(f,"rw");
            System.out.println("Sie beginnen nun damit, vollwertige Benutzerinformationen einzulesen.");
            do{
                schreiben(r);
            }while(!Input.readString("Hier ist ein Abbruch der Eingaben mittels Enter moeglich.").equals(""));
        }catch(FileNotFoundException fehler){
            System.out.println("File not Found");
        }
    }
    /**
     * Eine Methode, die ein File anlegt und davor verschiedene Ueberpruefungen durchgeht.
     * 
     * @param dateiname Der Pfad, auf dem das File erzeugt werden soll.
     * 
     * @return Das entstandene File
     * 
     * @since 2014-01-31
     */
    public static File erzeugeFile(String dateiname) {
        dateiname.trim();
        File f = new File(dateiname);
        while(dateiname.equals("")||f.exists()){
            dateiname = Input.readString("Entweder existiert bereits eine gleichnamige Datei in diesem Verzeichnis, oder es wurde kein Pfad angegeben. \n Bitte erneut versuchen.");
            f = new File(dateiname);
        }
        return f;
    }
    /**
     * Eine Methode, die ein RandomAccessFile mit Benutzerinformationen beschreibt.
     * 
     * @param a Das zu beschreibende RandomAccessFile
     * 
     * @since 2014-01-31
     */
    public static void schreiben(RandomAccessFile a) {
        try{
            a.writeUTF(Input.readString("Bitte ihren Namen angeben."));
            a.writeInt(Input.readInt("Bitte ihr Alter angeben."));
            boolean b;
            if(Input.readString("Bitte \"w\" fuer Frauen angeben, sonst sind sie ein Mann!").charAt(0)== 'w') {
                b = true;
            }else{
                b = false;
            }
            a.writeBoolean(b);
            a.writeUTF(Input.readString("Bitte ihre Telefonnummer angeben."));
            a.writeInt(Input.readInt("Bitte ihre Postleitzahl angeben."));
        }catch(IOException fehler2) {
            System.out.println("Fail");
        }
    }
}
// Inhalt:  Bert    1234567  Û
// Nur Strings werden erkannt.