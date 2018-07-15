package Array;

import fiji.io.Lettore;

public class BinariaDecimale {
	
	public static void main(String[] args) {
		
		int n = 0, a = 0, i = 0, somma = 0;
		
		System.out.println("Inserisci il numero di cifre del numero espresso in rappresentazione binaria");
		a = Lettore.in.leggiInt();
		
		System.out.println("Inserisci il numero espresso in rappresentazione binaria, premendo invio dopo ogni cifra");
		while(i<a) {
			n = Lettore.in.leggiInt();
			if(n==1)
				somma = somma + (int)Math.pow(2, a-i-1);
			i++;
		}
		
		System.out.println("Il numero introdotto, espresso in rappresentazione decimale è: " +somma);
	}
}