package bordan;
/**
 * Beschreibt die Funktion aller verschiedene Varianten der Methode lastIndexOf
 * 
 * Die erste Variante: 
 * Sucht von hinten nach der Ersten bzw. von vorne nach der Letzten Stelle 
 * im String, an dem der angegebene Character vorkommt.
 * 
 * Die zweite Variante:
 * Sucht von hinten nach der Ersten bzw. von vorne nach der 
 * Letzten Stelle im String, an dem der angegebene Character vorkommt und startet bei einem
 * angegebenen Index (Strings gehen von 0 bis length-1).
 * 
 * @author Andreas Bordan
 * @version 2013-09-13
 */
public class LastIndexOf {
    /**
     * Testet die Varianten der Methode lastIndexOf.
     * 
     * @since 2013-09-13
     */
    public static void testLastIndexOf() {
        String s1 = "Sind sie gut?", s2 = "Vlt auch schlecht";
        char z1 = 's', z2 = 'c';
        int i1 = 10, bsp1 = s1.lastIndexOf(z1), bsp2 = s1.lastIndexOf(z1,i1);
        System.out.println("Die letzte Stelle, an der "+z1+" in: \""+s1+"\" vorkommt ist: "+bsp1+".");
        System.out.println("Die letzte Stelle, an der "+z2+" in \""+s2+"\" vorkommt ist: "+bsp2+", wobei diesmal die Suche an der "+i1+". Stelle gestartet wurde.");
    }
}