package bordan;
/**
 * Ein Programm, das das Maximum von mverschiedenen Zahlen ausgibt.
 * 
 * @author Andreas Bordan
 * @version 2013-09-13
 */
public class Maxima {
    /**
     * Eine Methode, die das Maximum von 2 Zahlen berechnet.
     * 
     * @param z1 Die erste Zahl zum Berechnen des Maximums
     * @param z2 Die zweite Zahl zum Berechnen des Maximums
     * @return Das Maximum aller Zahlen
     * 
     * @since 2013-09-13
     */
    public static int max(int z1, int z2) {
        int max2;
        if(z1<z2) {
            max2 = z2;
        }else{
            max2 = z1;
        }
        return max2;
    }
    /**
     * Eine Methode, die das Maximum von 3 Zahlen berechnet.
     * 
     * @param z1 Die erste Zahl zum Berechnen des Maximums
     * @param z2 Die zweite Zahl zum Berechnen des Maximums
     * @param z3 Die dritte Zahl zum Berechnen des Maximums
     * @return Das Maximum aller Zahlen
     * 
     * @since 2013-09-13
     */
    public static int max(int z1, int z2, int z3) {
        int z4 = max(z1,z2);
        int max3 = max(z3,z4);
        return max3;
    }
    /**
     * Eine Methode, die das Maximum von 5 Zahlen berechnet.
     * 
     * @param z1 Die erste Zahl zum Berechnen des Maximums
     * @param z2 Die zweite Zahl zum Berechnen des Maximums
     * @param z3 Die vierte Zahl zum Berechnen des Maximums
     * @param z4 Die fuenfte Zahl zum Berechnen des Maximums
     * @param z5 Die sechste Zahl zum Berechnen des Maximums
     * @return Das Maximum aller Zahlen
     * 
     * @since 2013-09-13
     */
    public static int max(int z1, int z2, int z3, int z4, int z5) {
        int z6 = max(z1,z2,z3);
        int max5 = max(z4,z5,z6);
        return max5;
    }
    /**
     * Eine Methode, die das Maximum von 10 Zahlen berechnet.
     * 
     * @param z1 Die erste Zahl zum Berechnen des Maximums
     * @param z2 Die zweite Zahl zum Berechnen des Maximums
     * @param z3 Die dritte Zahl zum Berechnen des Maximums
     * @param z4 Die vierte Zahl zum Berechnen des Maximums
     * @param z5 Die fuenfte Zahl zum Berechnen des Maximums
     * @param z6 Die sechste Zahl zum Berechnen des Maximums
     * @param z7 Die siebte Zahl zum Berechnen des Maximums
     * @param z8 Die achte Zahl zum Berechnen des Maximums
     * @param z9 Die neunte Zahl zum Berechnen des Maximums
     * @param z10 Die zehnte Zahl zum Berechnen des Maximums
     * @return Das Maximum aller Zahlen
     * 
     * @since 2013-09-13
     */
    public static int max(int z1, int z2, int z3, int z4, int z5, int z6, int z7, int z8, int z9, int z10) {
        int z11 = max(z1, z2, z3, z4, z5);
        int z12 = max(z6, z7, z8, z9, z10);
        int max10 = max(z11, z12);
        return max10;
    }
    /**
     * Die main-Methode testet alle Maxima Methoden
     * 
     * @since 2013-09-13
     */
    public static void main(String[]args) {
        int i1 = 42;
        int i2 = 24;
        int i3 = 6;
        int i4 = -4;
        int i5 = -23;
        int i6 = -142134;
        int i7 = 14144;
        int i8 = 141419;
        int i9 = 114124;
        int i10 = -0;
        System.out.println("Das Maximum von "+i1+" und "+i2+" ist: "+max(i1,i2)+".");
        System.out.println("Von "+i3+", "+i4+", "+i5+" ist: "+max(i3,i4,i5)+".");
        System.out.println("Zuletzt noch das Maximum von"+i1+", "+i2+", "+i3+", "+i4+", "+i5+", "+i6+", "+i7+", "+i8+", "+i9+", "+i10+" ist: "+max(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10)+".");
    }
}