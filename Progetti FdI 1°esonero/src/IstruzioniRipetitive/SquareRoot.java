package IstruzioniRipetitive;

import fiji.io.Lettore;

public class SquareRoot {
	public static void main (String[] args) {
		
		int x;
		int r;
		
		System.out.println("Utente, inserisci un numero per calcolarne la radice quadrata intera");
		
		x=Lettore.in.leggiInt();
		
		r=0;
		do {
			if ((r+1)*(r+1)>x)
			    System.out.println("Utente, la radice quadrata di " +x+ " è " +r);
			r++;
		}
		while (r*r<=x);
			
		
	}

}
