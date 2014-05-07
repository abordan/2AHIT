package bordan;
/**
 * Ein Programm, das aus Zufallszahlen die groeszte Zahl ermittelt und ausgibt.
 * 
 * @author Andreas Bordan
 * @version 2013-09-27
 */
public class Maxima {
    /**
     * Eine Methode, die aus allen Zahlen des Arrays die groeszte ermittelt.
     * 
     * @param zahlenmenge Die double-Array der Zufallszahlen
     * @return Das Maximum der Zufallszahlen
     * 
     * @since 2013-09-27
     */
    public static int max(double [] zahlenmenge) {
        int maximum = Integer.MIN_VALUE;
        for(int i = 0;i<zahlenmenge.length;i++) {
            zahlenmenge [i] = Math.random()*100;
            if(maximum<zahlenmenge[i]) {
                maximum = (int) zahlenmenge[i];
            }
        }
        return maximum;
    }
    /**
     * Eine Methode, die das ermittelte Maximum aus max( ) ueber die Konsole ausgibt.
     * 
     * @param versuch Die Anzahl der zu erzeugenden Zahlen im Array
     * 
     * @since 2013-09-27
     */
    public static void ausgabe(int versuch) {
        double [] zahlenmenge = new double [versuch];
        System.out.println("Das Maximum betraegt "+max(zahlenmenge));
    }
    /**
     * Die main-Methode ruft ausgabe( ) mit den zum Testen festgelegten Zahlen auf.
     * 
     * @since 2013-09-27
     */
    public static void main(String[]args) {
        ausgabe(1);
        ausgabe(2);
        ausgabe(5);
        ausgabe(10);
        ausgabe(100);
    }
}