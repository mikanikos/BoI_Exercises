package IstruzioniRipetitive;

import fiji.io.Lettore;

public class Fattoriale {
	public static void main(String[] args) {
		
		int x;
		
		System.out.println("Utente, inserisci un intero per calcolare il suo fattoriale");
		x=Lettore.in.leggiInt();
		
		int fattoriale=1;
		int i;
		
		for (i=1; i<=x; i++) {
			fattoriale *= i;
		}
		
		System.out.println("Utente, il fattoriale di " +x + " è " +fattoriale);
		
	}

}
