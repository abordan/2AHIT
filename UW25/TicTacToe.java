/**
 * Ein Programm, das ein TicTacToe Spiel initialisiert.
 * 
 * @author Andreas Bordan 
 * @version 2014-02-21
 */
public class TicTacToe {
    /**
     * Die main-Methode erzeugt ein TicTacToeObject-Objekt und startet das Spiel.
     * 
     * @since 2014-02-21
     */
    public static void main(String[]args) {
        new TicTacToeObject().main(new String[3]);
    }
}