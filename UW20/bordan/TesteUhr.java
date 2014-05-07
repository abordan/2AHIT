package bordan;
/**
 * Ein Programm, das die Klasse Uhr2 sinnvoll testet
 * 
 * @author Andreas Bordan
 * @version 2014-01-17
 */
public class TesteUhr {
    /**
     * Die main-Methode testet Uhrenobjekte und deren Methoden sinnvoll.
     * 
     * @since 2014-01-17
     */
    public static void main(String[]args) {
        Uhr2 a = new Uhr2(1,2,3);
        int f = 2;
        Uhr b = a.zeitInZone(4);
        boolean c = a.selbeZeit(b);
        for(int i = 0;i<60;++i) {
            a.tick();
        }
        System.out.println("Zeit der verschobenen Uhr: "+b.zeigeZeit());
        System.out.println("Zeit der getickten Uhr: "+a.zeigeZeit());
    }
}