package bordan;
/**
 * Ein Programm, das Uhren-Objekte verwaltet.
 * 
 * @author Andreas Bordan
 * @version 2014-01-17
 */
public class Uhr {
    int stunde, minute, sekunde;
    /**
     * Konstruktor fuer Uhren.
     * 
     * @param stunde Die Stunde
     * @param minute Die Minute
     * @param sekunde Die Sekunde
     * 
     * @since 2014-01-17
     */
    public Uhr(int stunde,int minute,int sekunde) {
        this.stunde = stunde;
        this.minute = minute;
        this.sekunde = sekunde;
    }
    /**
     * Eine Methode, die die Uhrzeit um eine Sekunde pro Aufruf erhoeht.
     * 
     * @since 2014-01-17
     */
    public void tick() {
        ++this.sekunde;
        if(this.sekunde>60) {
            this.sekunde -= 60;
            ++this.minute;
        }
        if(this.minute>60) {
            this.minute -= 60;
            ++this.stunde;
        }
        if(this.stunde>24) {
            this.stunde -= 24;
        }
    }
    /**
     * Eine Methode, die die Uhrzeit in ein Stringformat umwandelt.
     * 
     * @return Die formatierte Uhrzeit
     * 
     * @since 2014-01-17
     */
    public String zeigeZeit() {
        return ""+this.stunde+":"+this.minute+":"+this.sekunde;
    }
}