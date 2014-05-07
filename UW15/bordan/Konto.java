package bordan;
/**
 * Ein Programm, das Konten verwaltet.
 * 
 * @author Andreas Bordan
 * @version 2013-12-13
 */
public class Konto{
    private long nummer;
    private double saldo;
    /**
     * Die Konstruktor-Methode erzeugt ein Konto mit vorgegebener Kontonummer.
     * 
     * @param nummer Die Kontonummer
     * 
     * @since 2013-12-13
     */
    public Konto(long nummer) {
        this.nummer = nummer;
    }
    /**
     * Eine Methode, die einen gegebenen Betrag auf das Konto einzahlt-
     * 
     * @param betrag Der einzuzahlende Betrag
     * 
     * @since 2013-12-13
     */
    public void einzahlen(double betrag) {
        if(betrag<0.0) { // Keine negativen Betraege einzahlen!
            return;
        }
        saldo += betrag;
    }
    /**
     * Eine Methode, die den private Saldo zurueckgibt.
     * 
     * @return Der Saldo
     * 
     * @since 2013-12-13
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Eine Methode, die einen gegebenen Betrag vom Konto abhebt.
     * 
     * @param betrag Der abzuhebende Betrag
     * 
     * @since 2013-12-13
     */
    public void abheben(double betrag) {
        if(betrag<0.0) { // Keine negativen Betraege abheben!
            return;
        }
        saldo -= betrag;
    }
}