package Array;

import fiji.io.Lettore;

public class UgualiString {
	
	public static boolean uguali(String[] a, String[] b) {
		
		boolean equals;
		equals = true;
		
		int i=0;
		
		while(i < a.length && equals) {
			if(!(a[i].equals(b[i])))
				equals = false;
			else
				i++;
		}
		
		return equals;
	}
	
	public static void main(String[] args) {
		
		String[] a, b;
		int lunA, lunB;
		
		System.out.println("Inserisci la lunghezza della prima sequenza di parole");
		lunA = Lettore.in.leggiInt();
		a = new String[lunA];
		
		for(int i=0; i<lunA; i++) {
			System.out.println("Introduci una parola");
			a[i] = Lettore.in.leggiString();
		}
		
		System.out.println("Inserisci la lunghezza della seconda sequenza di parole");
		lunB = Lettore.in.leggiInt();
		b = new String[lunB];
		
		for(int i=0; i<lunB; i++) {
			System.out.println("Introduci una parola");
			b[i] = Lettore.in.leggiString();
		}
		
		if(lunA != lunB)
			System.out.println("Le due sequenze di parole non sono uguali");
		else {
			if(uguali(a,b))
				System.out.println("Le due sequenze di parole sono uguali");
			else
				System.out.println("Le due sequenze di parole non sono uguali");
		}

	}

}
