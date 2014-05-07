package bordan;
/**
 * Ein Programm, das
 * 
 * @author Andreas Bordan
 * @version 2014-02-21
 */
public class Objekte {
    public static int[][] main(String[]args) {
        Object o = new Object();
        Object p = Input.readString();
        Objekte.meth(o);
        Object [] ao = new Object [3];
        ao[0] = new Object();
        int [] [] di = new int [3] [2]; // 3 Arrays mit je 2 Stellen wird fuer tabellarische Daten verwendet
        di [1] [1] = 5;
        di [2] [0] = 7;
        try{
            di [6] [4] = 1;
        }catch(ArrayIndexOutOfBoundsException a) {
            System.out.println("fehler");
        }
        return di;
    }
    public static void meth(Object a) {
        
    }
}