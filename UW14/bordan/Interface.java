package bordan;
/**
 * Interfaces
 * 
 * @author Andreas Bordan
 * @version 2013-12-06
 */
public class Interface implements Auto{
    public void lenken(boolean richtung) {
        if(richtung) {
            System.out.println("Links");
        }else{
            System.out.println("Rechts");
        }
    }
    public String angeben() {
        return "Ich kann Interfaces benutzen";
    }
}
