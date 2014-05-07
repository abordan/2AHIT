package bordan;
import java.awt.*;
/**
 * Ein Programm, das Menschen Objekte verwaltet.
 * 
 * @author Andreas Bordan
 * @version 2013-10-12
 */
public class Mensch {
    private String name;
    private char geschlecht;
    private double gewicht;
    private int zahnAnzahl;
    private long haarAnzahl;
    /**
     * Konstruktormethode fuer einen Menschen
     * 
     * @since 2013-10-12
     */
    public Mensch() {
        name = "Meier ";
        geschlecht = 'm';
        gewicht = 66.6;
        zahnAnzahl = 32;
        haarAnzahl = 100_000L;
    }
    /**
     * Eine Methode, die den privaten Menschennamen zurueckliefert.
     * 
     * @return Der Name des Menschen
     * 
     * @since 2013-10-12
     */
    public String getName() {
        return name;
    }
    /**
     * Eine Methode, die das private Menschengeschlecht zurueckliefert.
     * 
     * @return Das Geschlecht des Menschen
     * 
     * @since 2013-10-12
     */
    public char getGeschlecht() {
        return geschlecht;
    }
    /**
     * Eine Methode, die das private Menschengewicht zurueckliefert.
     * 
     * @return Das Gewicht des Menschen
     * 
     * @since 2013-10-12
     */
    public double getGewicht() {
        return gewicht;
    }
    /**
     * Eine Methode, die die private Menschenzahnanzahl zurueckliefert.
     * 
     * @return Die Zahnanzahl des Menschen
     * 
     * @since 2013-10-12
     */
    public int getZahnAnzahl() {
        return zahnAnzahl;
    }
    /**
     * Eine Methode, die die private Menschenhaaranzahl zurueckliefert.
     * 
     * @return Die Haaranzahl des Menschen
     * 
     * @since 2013-10-12
     */
    public long getHaarAnzahl() {
        return haarAnzahl;
    }
    /**
     * Eine Methode, die den Namen des Menschenobjekts aendert.
     * 
     * @param name Der neue Name des Menschen
     * 
     * @since 2013-10-12
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Eine Methode, die das Geschlecht des Menschenobjekts aendert.
     * 
     * @param name Das neue Geschlecht des Menschen
     * 
     * @since 2013-10-12
     */
    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }
    /**
     * Eine Methode, die das Gewicht des Menschenobjekts aendert.
     * 
     * @param name Das neue Gewicht des Menschen
     * 
     * @since 2013-10-12
     */
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    /**
     * Eine Methode, die die Zahnanzahl des Menschenobjekts aendert.
     * 
     * @param name Ddie neue Zahnanzahl des Menschen
     * 
     * @since 2013-10-12
     */
    public void setZahnAnzahl(int zahnAnzahl) {
        if(zahnAnzahl>32) {
            zahnAnzahl = 32;
        }
        this.zahnAnzahl = zahnAnzahl;
    }
    /**
     * Eine Methode, die die Haaranzahl des Menschenobjekts aendert.
     * 
     * @param name Die neue Haaranzahl des Menschen
     * 
     * @since 2013-10-12
     */
    public void setHaarAnzahl(long haarAnzahl) {
        this.haarAnzahl = haarAnzahl;
    }
}
