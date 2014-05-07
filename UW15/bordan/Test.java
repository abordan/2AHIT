package bordan;
/**
 * Ein Programm, das Konto und Sparkonto erzeugt und auf diese einzahlen sowie abheben laesst.
 * 
 * @author Andreas Bordan
 * @version 2013-12-13
 */
public class Test {
    /**
     * Die main-Methode erzeugt sowohl Konto als auch Sparkonto und laesst den Benutzer dann ueber
     * die Konsole Einzahlungen und Abhebungen taetigen.
     * 
     * @since 2013-12-13
     */
    public static void main(String[]args) {
        long kontonummer = (long) Input.readInt("Bitte die Kontonummer Ihres Kontos eingeben.");
        System.out.println();
        long sparkontonummer = (long) Input.readInt("Bitte die Kontonummer Ihres Sparkontos eingeben.");
        float sparkontozinsen = (float) Input.readDouble("Bitte den Zinssatz Ihres Sparkontos eingeben.");
        Konto konto = new Konto(kontonummer);
        Sparkonto sparkonto = new Sparkonto(sparkontonummer,sparkontozinsen);
        System.out.println();
        System.out.println("Ihr Kontostand betraegt: "+konto.getSaldo()+" ,da es ein neues Konto ist.");
        System.out.println("Ihr Sparkontostand betraegt: "+sparkonto.getSaldo()+" ,da es ein neues Sparkonto ist.");
        System.out.println();
        int hinzu = Input.readInt("Wie oft moechten Sie auf Ihre Konten einzahlen?");
        if(hinzu<1) {
            hinzu = 1;
        }
        for(int i = 1;i<=hinzu;++i) {
            konto.einzahlen(Input.readDouble("Wieviel moechten Sie auf Ihr Konto einzahlen?"));
            sparkonto.einzahlen(Input.readDouble("Wieviel moechten Sie auf Ihr Sparkonto einzahlen?"));
        }
        System.out.println();
        System.out.println("Nach den Einzahlungen betraegt Ihr Kontostand: "+konto.getSaldo()+".");
        System.out.println("Nach den Einzahlungen betraegt Ihr Sparkontostand: "+sparkonto.getSaldo()+".");
        System.out.println();
        int hinweg = Input.readInt("Wie oft moechten Sie von Ihren Konten abheben?");
        if(hinweg<1) {
            hinweg = 1;
        }
        for(int i = 1;i<=hinweg;++i) {
            konto.abheben(Input.readDouble("Wieviel moechten Sie von Ihrem Konto abheben?"));
            sparkonto.abheben(Input.readDouble("Wieviel moechten Sie von Ihrem Sparkonto abheben?"));
        }
        System.out.println();
        System.out.println("Nach den Abhebungen betraegt Ihr Kontostand: "+Math.round(konto.getSaldo()*100)/100+"."); // Runden auf Cents
        System.out.println("Nach den Abhebungen betraegt Ihr Sparkontostand: "+Math.round(sparkonto.getSaldo()*100)/100+"."); // Runden auf Cents
    }
}
