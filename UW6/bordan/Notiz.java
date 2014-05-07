package bordan;
import java.sql.*;
/**
 * Ein Programm, das Notizobjekte verwaltet.
 * 
 * @author Andreas Bordan
 * @version 2013-10-11
 */
public class Notiz {
    private String betreff;
    private String text;
    private Timestamp erstellt;
    /**
     * Konstruktormethode fuer eine Notiz
     * 
     * @param betreff Der Initialbetreff der Notiz
     * @param text Der Initialtext der Notiz
     * 
     * @since 2013-10-11
     */
    public Notiz(String betreff, String text) {
        this.betreff = betreff;
        this.text = text;
        this.erstellt = new Timestamp(System.currentTimeMillis());
    }
    /**
     * Eine Methode, die den Betreff des Notizobjektes aendert.
     * 
     * @param betreff Der neue Wert des Betreffs
     * 
     * @since 2013-10-11
     */
    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }
    /**
     * Eine Methode, die den privaten Notizbetreff zurueckliefert.
     * 
     * @return Der Betreff der Notiz
     * 
     * @since 2013-10-11
     */
    public String getBetreff() {
        return betreff;
    }
    /**
     * Eine Methode, die den Text des Notizobjektest aendert.
     * 
     * @param text Der neue Wert des Textes
     * 
     * @since 2013-10-11
     */
    public void setText(String text) {
        this.text = text;
    }
    /**
     * Eine Methode, die den privaten Notiztext zurueckliefert.
     * 
     * @return Der Text der Notiz
     * 
     * @since 2013-10-11
     */
    public String getText() {
        return text;
    }
    /**
     * Eine Methode, die das private Erzeugerdatum zurueckliefert.
     * 
     * @return Die Zeit der Objekterzeugung
     * 
     * @since 2013-10-11
     */
    public String getTimestamp() {
        return erstellt.toString();
    }
}