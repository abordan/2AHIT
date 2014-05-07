package bordan;

/**
 * Ein Programm, das das pascal'sche Dreieck bis zu einer bestimmten Hochzahl erzeugt.
 * 
 * @author Andreas Bordan
 * @version 2014-03-10
 */
public class Pascal {
	/**
	 * Eine Methode, die die Zahlenwerte in das pascal'sche Dreieck einspeichert.
	 * 
	 * @param pascalisch Das pascal'sche Dreieck
	 * @return Das pascal'sche Dreieck inklusive Zahlen
	 *  
	 * @since 2014-03-07
	 */
	public static int[][] zahlenEinfuegen(int [][]pascalisch) {
		if(pascalisch==null) {
			return null;
		}
		for(int i = 0;i<pascalisch.length;++i) {
			for(int j = 0;j<pascalisch[i].length;++j) {
				if(j==0||j==i)  {
					pascalisch[i][j] = 1; // Erste und letzte Stellen
				}else{
					pascalisch[i][j] = pascalisch[i-1][j-1]+pascalisch[i-1][j]; // Zwischenstellen werden aus der ueberliegenden Zelle und der davor genommen und addiert
				}
			}
		}
		return pascalisch;
		
	}
	/**
	 * Eine Methode, die ein pascal'sches Dreieck erzeugt.
	 * 
	 * @param x Die Anzahl der zu erzeugenden Zeilen
	 * @return Die Grundform des pascal'schen Dreiecks
	 * 
	 * @since 2014-03-07
	 */
	public static int[][] pascal(int x) {
		if(x<0) { // Nicht fuer negative Potenzen geeignet
			return null;
		}
		int[][] dreieck = new int [x+1][]; // So hohe Potenz wie im Parameter angegeben.
		for(int i = 0;i<dreieck.length;++i) {
			dreieck[i] = new int [i+1];
		}
		return dreieck;
	}
	/**
	 * Eine Methode, die das pascal'sche Dreieck in einen "stufenfoermigen" String umwandelt.
	 * 
	 * @param dreieck Das umzuwandelnde pascal'sche Dreieck
	 * @return Die stufenfoermige Form des pascal'schen Dreiecks
	 * 
	 * @since 2014-03-07
	 */
	 public static String arrayToString(int dreieck[][]) {
		if(dreieck==null) {
			return "Es konnte kein pascal'sches Dreieck erzeugt werden.";
		}
		String ausgabe = "";
		for(int i = 0;i<dreieck.length;++i) {
			if(i!=0) {
				ausgabe += "\n";
			}
			for(int j = 0;j<dreieck[i].length;++j) {
				ausgabe += dreieck[i][j]+" ";
			}
		}
	return ausgabe;
	}
	 /**
	  * Eine Methode, die das pascal'sche Dreieck in Form einer verkehrten Pyramide umwandelt.
	  * 
	  * @param pascal Das umzuwandelnde pascal'sche Dreieck
	  * @return Die verkehrte Pyramide
	  * 
	  * @since 2014-03-10
	  */
	 public static String[] arrayToWrongTriangle(int[][]pascal) { // TODO bei manchen Testlaeufen ist es mehr zur Seite gekippt, beheben!
		 if(pascal==null) {
			 return null;
		 }
		 String ausgabe[] = new String [pascal.length], s;
		 int maxZahlenlaenge = laengsteZahl(pascal), reihe, spalte, zusatzAbstand = pascal.length;
		 for(int i = 0;i<pascal.length;++i) {
			 ausgabe[i] = "\n";
			 if(i>0) {
				 ausgabe[i]+= abstand(i);
			 }
			 if(maxZahlenlaenge>1) {
			 ausgabe[i] += abstand(pascal.length-zusatzAbstand); // TODO die Kippung hat wahrscheinlich mit ungenauen werten hier zu tun
			 --zusatzAbstand;
			 }
			 reihe = pascal.length-1-i;
			for(int j = 0;j<pascal[reihe].length;++j) {
				spalte = pascal[reihe].length-1-j;
			    s = ""+pascal[reihe][spalte];
				ausgabe[i] += s+" ";
				for(int l = s.length();maxZahlenlaenge>l;++l){
					ausgabe[i] += " ";
				}
			}
		 }
		 return ausgabe;
	 }
	 /**
	  * Eine Methode, die Abstaende erzeugt.
	  * 
	  * @param i Die Anzahl der zu erzeugenden Abstaende
	  * @return Die Abstaende
	  * 
	  * @since 2014-03-10
	  */
	 public static String abstand(int i) {
		 String s ="";
		 for(int j = 0;j<i;++j) {
			 s+=" ";
	 }
		 return s;
	 }
	 /**
	  * Eine Methode, die die falsche Pyramide richtig stellt.
	  * 
	  * @param wrongTriangle Die verkehrte Pyramide mit kleinen Fehlern
	  * @return Die richtige Pyramide
	  * 
	  * @since 2014-03-10
	  */
	public static String arrayToTriangle(String [] wrongTriangle) {
		if(wrongTriangle==null) {
			return "Es konnte kein pascal'sches Dreieck erzeugt werden.";
		}
		String s = "";
		for(int i = 0;i<wrongTriangle.length;++i) {
			s += wrongTriangle[wrongTriangle.length-i-1];
		}
		return s.substring(1,s.length()); // Erstes \n wegmachen
	}
	/**
	 * Eine Methode, die die laengste Ziffernzahl aus dem Dreieck berechnet.
	 * 
	 * @param pascal Das Dreieck zur Ziffernberechnung
	 * @return Die laengste Stellenanzahl im Dreieck
	 * 
	 * @since 2014-03-10
	 */
	public static int laengsteZahl(int[][] pascal){
		int laenge = 0;
		String s = "";
		for(int i = 0;i<pascal.length;++i) {
			for(int j = 0;j<pascal[i].length;++j) {
				s = ""+pascal[i][j];
				if(s.length()>laenge) {
					laenge = s.length();
				}
			}
		}
		return laenge;
	}
}