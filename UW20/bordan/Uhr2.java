package bordan;
/**
 * Ein Programm, das verbesserte Uhren verwaltet.
 * 
 * @author Andreas Bordan 
 * @version 2014-01-17
 */
public class Uhr2 extends Uhr{
    /**
     * Konstruktor fuer verbesserte Uhren.
     * 
     * @param stunde Die Stunde
     * @param minute Die Minute
     * @param sekunde Die Sekunde
     * 
     * @since 2014-01-17
     */
    public Uhr2(int stunde, int minute, int sekunde) {
        super(stunde,minute,sekunde);
    }
    /**
     * Eine Methode, die die Stunde einer Uhr veraendert.
     * 
     * @param zeitunterschied Die Anzahl der zu aendernden Stunden
     * 
     * @return Die angepasste Uhr
     * 
     * @since 2014-01-17
     */
    public Uhr zeitInZone(int zeitunterschied) {
        String [] zeiten = this.zeigeZeit().split(":");
        int stunde = Integer.parseInt(zeiten[0]);
        if(stunde+zeitunterschied>24) {
            stunde -= (24-zeitunterschied);
        }else{
            stunde += zeitunterschied;
        }
        Uhr2 a = new Uhr2(stunde,Integer.parseInt(zeiten[1]),Integer.parseInt(zeiten[2]));
        return a;
    }
    /**
     * Eine Methode, die die Uhrzeiten zweier Uhren miteinander vergleicht.
     * 
     * @param andereUhr Die mit der aktuelle Uhr zu vergleichene Uhr
     * 
     * @return Bestimmt, ob die Uhrzeiten gleich sind
     * 
     * @since 2014-01-17
     */
    public boolean selbeZeit(Uhr andereUhr) {
        if(this.zeigeZeit().equals(andereUhr.zeigeZeit())) {
            return true;
        }
        return false;
    }
    int tocker = 0;
    /**
     * Eine Methode, die die vorherige tick-Methode ueberschreibt und jedes 12. mal ein tock ausgibt.
     * 
     * @since 2014-01-17
     */
    @Override
    public void tick() {
        super.tick();
        System.out.println("tick");
        ++tocker;
        if(tocker==12) {
            System.out.println("tock");
            tocker = 0;
        }
    }
}