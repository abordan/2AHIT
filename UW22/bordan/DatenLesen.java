package bordan;
import java.io.*;
/**
 * Ein Programm, das aus einem vorher erzeugten RandomAccessFile Daten ausliest.
 * 
 * @author Andreas Bordan
 * @version 2014-02-01
 */
public class DatenLesen {
   private static File f;
   /**
    * Die main-Methode dient zur Ueberpruefung und zum Lesen eines RandomAccessFiles.
    * 
    * @since 2014-02-01
    */
   public static void main(String[]args) {
       String dateiname = Input.readString("Bitte den Pfad ihrer zu lesenden Datei angeben.");
       while(!existingFile(dateiname)){
          dateiname = Input.readString("Es wurde ein falscher Pfad angegeben, bitte erneut versuchen.");
       }
       try{
           fileLesen(new RandomAccessFile(f,"rw"));
       }catch(FileNotFoundException fehler){
           System.out.println("File not Found");
       }
   }
   /**
    * Eine Methode, die ueberprueft, ob es ein File ueberhaupt gibt.
    * 
    * @param dateiname Der Name der zu ueberpruefenden Datei
    * 
    * @return Bestimmt, ob diese Datei existiert, oder nicht.
    * 
    * @since 2014-02-01
    */
   public static boolean existingFile(String dateiname) {
       dateiname.trim();
       f = new File(dateiname);
       while(dateiname.equals("")){
           dateiname = Input.readString("Ohne Angabe gehts leider nicht :("); 
           dateiname.trim();
           f = new File(dateiname);
       }
       if(f.exists()){
          return true;    
       }
       return false;
   }
   /**
    * Eine Methode, die Daten aus einem RandomAccessFile ausliest.
    * 
    * @param file Das RandomAccessFile, aus dem die Auslese erfolgen soll.
    * 
    * @since 2014-02-01
    */
   public static void fileLesen(RandomAccessFile file) {
       try{
          System.out.println(file.readUTF()+" ist "+file.readInt()+" Jahre alt.");
          if(file.readBoolean()) {
              System.out.println("Diese Frau ist unter der Telefonnummer "+file.readUTF()+" erreichbar.");
              System.out.println("Falls Sie ihr etwas schicken wollen, lautet ihre Postleitzahl "+file.readInt()+".");
          }else{
              System.out.println("Dieser Mann ist unter der Telefonnummer "+file.readUTF()+" erreichbar.");
              System.out.println("Falls Sie ihm etwas schicken wollen, lautet seine Postleitzahl "+file.readInt()+".");   
          }
       }catch(IOException fehler) {
           System.out.println("Fail");
       }
   }
}