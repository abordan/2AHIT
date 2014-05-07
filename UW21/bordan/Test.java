package bordan;
/**
 * Ein Programm, das meine CodeIt-Methoden testet.
 * 
 * @author Andreas Bordan
 * @version 2014-01-24
 */
public class Test {
    /**
     * Die main-Methode testet alle CodeIt-Methoden.
     * 
     * @since 2014-01-24
     */
    public static void main(String[]args) {
        CodeIt.x1();
        CodeIt a = new CodeIt("Hallo");
        CodeIt b = new CodeIt(a);
        String s = b.x2(3,1.5);
        Note n1 = a.pruefung(new Schueler());
        a.mehr(new int [4]);
        Note [] arr = CodeIt.zeugnis();
        Note n2 = CodeIt.note(n1);
    }
}
