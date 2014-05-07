package bordan;
/**
 * Ein Programm, das die String-Parameter der main-Methode auf der Konsole ausgibt
 * 
 * @author Andreas Bordan
 * @version 2013-10-18
 */
public class Kommandozeile {
    /**
     * Die main-Methode gibt ihren Parameter aus.
     * 
     * @since 2013-10-18
     */
    public static void main(String[]args) {
        for(int i = 0;i<args.length;i++) {
            System.out.println("args["+i+"] = "+args[i]);
        }
    }
}
