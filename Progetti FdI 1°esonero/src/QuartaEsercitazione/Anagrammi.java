package QuartaEsercitazione;

import fiji.io.*;

public class Anagrammi {
	
	/* metodo che restituisce true se e solo se
	 * s e t sono l’anagramma l’una dell’altra */
	public static boolean anagramma(String s, String t) {
		
		int stessiChar;
		boolean isAnagramma;
		char c;
		int i; 
		
		stessiChar = 0;
		isAnagramma = false;
		
		if (s.length() != t.length()) {
			isAnagramma = false;
		}
		else {
			for (i=0; i<s.length(); i++) {
				c = s.charAt(i);
				if (t.indexOf(c)!= -1) {
					if (numeroOccorrenze(s,c) == numeroOccorrenze(t,c))
						stessiChar++;
					else
						stessiChar--;
				}
				else
					isAnagramma = false;
			}
		}
		
		if (stessiChar == t.length())
			isAnagramma = true;
		else
			isAnagramma = false;
		
		return isAnagramma;
	}
	
	/*  metodo ausiliario che data una stringa ed un carattere
	 *  restituisce il numero di volte che il carattere compare nella stringa */
	public static int numeroOccorrenze(String s, char c) {
		
		int i;
		int j;
		int contatoreC;
		
		contatoreC = 0;
		
		for (i=0; i<s.length(); i++) {
			j = s.charAt(i);
			if (c==j) {
				contatoreC++;
			}
		}
			
		return contatoreC;
	}
	
	public static void main(String [] args) {
		
		String s;
		String t;
		boolean isAnagramma;
		
		System.out.println("Utente, inserisci due stringhe per sapere"
				         + " se una è l'anagramma dell'altra");
		
		s = Lettore.in.leggiLinea();
		t = Lettore.in.leggiLinea();
		
		isAnagramma = anagramma(s,t);
		
		if (isAnagramma)
			System.out.println("Utente, le due stringhe sono una l’anagramma dell’altra");
		else
			System.out.println("Utente, le due stringhe non sono una l’anagramma dell’altra");		
	}
	
}