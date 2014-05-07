package bordan;
/**
 * Ein Programm, das Sparkonten verwaltet.
 * 
 * @author Andreas Bordan
 * @version 2013-12-13
 */
public class Sparkonto extends Konto{
    private float zinssatz;
    /**
     * Die Konstruktor-Methode erzeugt ein Sparkonto mit vorgegebener Kontonummer und Zinssatz.
     * 
     * @param nummer Die Kontonummer
     * @param zinssatz Der Jahreszinssatz
     * 
     * @since 2013-12-13
     */
    public Sparkonto(long nummer, float zinssatz) {
        super(nummer); // Konstruktor aus der "Über"-Klasse wird aufgerufen
        if(zinssatz<0.0f){
            this.zinssatz = 0.0f;
        }else{
            this.zinssatz = zinssatz;
        }
    }
    /**
     * Eine Methode, die einen gegebenen Betrag vom Sparkonto abhebt, es aber nicht tut, falls dies
     * das Sparkonto ueberziehen wuerde.
     * 
     * @param betrag Der abzuhebende Betrag
     * 
     * @since 2013-12-13
     */
    @Override // Sicherstellung, dass diese Methode auch wirklich die alte ueberschreibt.
    public void abheben(double betrag) {
        if(betrag>this.getSaldo()) { // Kontostand darf nicht unter 0 fallen!
            return;
        }else{
            super.abheben(betrag); // Methode aus der "Über"-Klasse wird aufgerufen
        }
    }
    /**
     * Eine Methode, die die Jahreszinsen auf ein Konto einzahlt
     * 
     * @since 2013-12-13
     */
    public void addiereJahreszinsen() {
        this.einzahlen(this.getSaldo()/100*this.zinssatz);
    }
}