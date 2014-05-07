package bordan;
/**
 * Ein Programm, das eine Ahnentafel meiner Familie erzeugt.
 * 
 * @author Andreas Bordan
 * @version 2013-10-25
 */
public class Ahnentafel {
    /**
     * Die main-Methode erzeugt meine Familie und gibt sie in der Form einer Ahnentafel aus.
     * 
     * @since 2013-10-25
     */
    public static void main(String[]args) {
        Person [] familie = new Person [7];
        familie[0] = new Person("Andreas", "Bordan");
        familie[1] = new Person("Gabriele", "Bordan");
        familie[2] = new Person("Otto", "Bordan");
        familie[3] = new Person("Elisabeth", "Gruber");
        familie[4] = new Person("Erich", "Gruber");
        familie[5] = new Person("Helene", "Bordan");
        familie[6] = new Person("Klaus", "Bordan");
        familie[0].setEltern(familie[1],familie[2]);
        familie[1].setEltern(familie[3],familie[4]);
        familie[2].setEltern(familie[5],familie[6]);
        for(int i=0;i<familie.length;i++) {
            familie[i].eltern();
            System.out.println();
        }
    }
}