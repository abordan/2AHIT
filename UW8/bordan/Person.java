package bordan;
/**
 * Ein Programm, das Personen erzeugen und verwalten kann.
 * 
 * @author Andreas Bordan 
 * @version 2013-11-08
 */
public class Person {
    private String vorName, familienName;
    private Person mutter, vater;
    /**
     * Konstruktor fuer eine Person der Ahnentafel.
     * 
     * @param vorName Der Vorname der zu erzeugenden Person
     * @param nach Name Der Nachname der zu erzeugenden Person
     * 
     * @since 2013-10-25
     */
    public Person(String vorName,String familienName) {
        this.vorName = vorName;
        this.familienName = familienName;
        this.mutter = null;
        this.vater = null;
    }
    /**
     * Eine Methode, die die Eltern einer Person bearbeiten kann.
     * 
     * @param mutter Die neue Mutter der Person
     * @param vater Der neue Vater der Person
     * 
     * @since 2013-10-25
     */
    public void setEltern(Person mutter, Person vater) {
        this.mutter = mutter;
        this.vater = vater;
    }
    /**
     * Eine Methode, die die private Mutter einer Person zurueckgibt.
     * 
     * @return Die Mutter der Person
     * 
     * @since 2013-10-25
     */
    public Person getMutter() {
        return mutter;
    }
    /**
     * Eine Methode, die den privaten Vater einer Person zurueckgibt.
     * 
     * @return Der Vater der Person
     * 
     * @since 2013-10-25
     */
    public Person getVater() {
        return vater;
    }
    /**
     * Eine Methode, die den Vornamen und den Nachnamen einer Person in einer schoenen Stringform zurueckgibt.
     * 
     * @return Vorname und Nachname einer Person in schoener Form
     * 
     * @since 2013-10-25
     */
    public String toString() {
        return this.vorName+" "+this.familienName;
    }
    /**
     * Eine Methode, die sowohl eine Person als auch deren Eltern ausgibt.
     * Falls keine Eltern vorhanden sind, wird Nicht definiert ausgegeben.
     * 
     * @since 2013-10-25
     */
    public void eltern() {
        Person unzureichend = new Person("Nicht","definiert");
        if(this.vater==null) {
            this.vater = unzureichend;
        }
        if(this.mutter==null) {
            this.mutter = unzureichend;
        }
        System.out.println("Name : "+this.toString());
        System.out.println("Vater : "+this.vater.toString()+", Mutter: "+this.mutter.toString());
    }
    /**
     * Eine Methode, die  das Kind einer Mutter erzeugt.
     * 
     * @param vorName Der Vorname des Kindes
     * @param nachName Der Nachname des Kindes
     * @param vater Der Vater des Kindes
     * 
     * @return Das Kind
     * 
     * @since 2013-11-08
     */
    public Person gebaeren(String vorName, String familienName,Person vater) {
        Person kind = new Person(vorName,familienName);
        kind.setEltern(this,vater);
        return kind;
    }
    /**
     * Eine Methode, die alle Kinder eines Elternteils in ein Array speichert.
     * 
     * @param []familie Die Familie fuer die Kindesueberpruefung
     * 
     * @return Die Kinder dieser Person
     * 
     * @since 2013-11-08
     * 
     */
    public Person[] kinder(Person [] familie) {
        Person [] kinder = new Person[familie.length];
        int i = 0;
        for(int ii = 0;ii<familie.length;ii++) {
            if(this==familie[ii].mutter||this==familie[ii].vater){
                kinder[i] = familie[ii];
            }
            if(kinder[i]!=null) {
                i++;
            }
        }
        return kinder;
    }
}
