package bordan;

/**
 * Ein Programm, das das pascal'sche Dreieck ausgibt und testet.
 * 
 * @author Andreas Bordan
 * @version 2014-03-10
 */
public class PascalTest {
	/**
	 * Die main-Methode gibt das pascal'sche Dreieck aus.
	 * 
	 * @since 2014-03-10
	 */
	public static void main(String[]args) {
		System.out.println(Pascal.arrayToTriangle(Pascal.arrayToWrongTriangle(Pascal.zahlenEinfuegen(Pascal.pascal(10)))));
		// System.out.println(Pascal.arrayToString(Pascal.zahlenEinfuegen(Pascal.pascal(5))));
	}
}