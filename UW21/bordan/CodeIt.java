package bordan;
/**
 * Ein Programm, um Methodenaufrufe zu testen.
 * 
 * @author Andreas Bordan
 * @version 2014-01-24
 */
public class CodeIt {
    /**
     * Konstruktor fuer CodeIt-Objekte mit String-Parameter
     * 
     * @param s Der String-Parameter
     * 
     * @since 2014-01-24
     */
    public CodeIt(String s) {
        
    }
    /**
     * Konstruktor fuer CodeIt-Objekte mit CodeIt-Parametern
     * 
     * @param d Der CodeIt-Parameter
     * 
     * @since 2014-01-24
     */
    public CodeIt(CodeIt d){
        
    }
    /**
     * Eine Methode, die nichts macht.
     * 
     * @since 2014-01-24
     */
    public static void x1(){
        
    }
    /**
     * Eine Methode, die "Hallo" zurueckgibt.
     * 
     * @param i Ein nutzloses Integer
     * @param d Ein nutzloses Double
     * 
     * @return Der String "Hallo"
     * 
     * @since 2014-01-24
     */
    public String x2(int i, double d) {
        return "Hallo";
    }
    /**
     * Eine Methode, die eine neue Note erzeugt.
     * 
     * @param s Ein Schueler, dem die Note gegeben wird
     * 
     * @return Eine Neue Note
     * 
     * @since 2014-01-24
     */
    public Note pruefung(Schueler s) {
        return new Note();
    }
    /**
     * Eine Methode, die nichts macht.
     * 
     * @param a Ein nutzloses int-array
     * 
     * @since 2014-01-24
     */
    public void mehr(int[] a) {
        
    }
    /**
     * Eine Methode, die ein neues Note-Array erzeugt.
     * 
     * @return Ein Note-Array
     * 
     * @since 2014-01-24
     */
    public static Note[] zeugnis() {
        return new Note[3];
    }
    /**
     * Eine Methode, die ihren Parameter zurueckliefert.
     * 
     * @param note Eine Note
     * 
     * @return Der Parameter
     * 
     * @since 2014-01-24
     */
    public static Note note(Note note){
        return note;
    }
}