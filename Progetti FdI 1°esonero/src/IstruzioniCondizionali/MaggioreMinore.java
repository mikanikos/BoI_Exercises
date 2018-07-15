package IstruzioniCondizionali;

import fiji.io.Lettore;

public class MaggioreMinore {
	public static void main(String[] args) {
		
		int x, y;
		
		System.out.println("Utente, inserisci due interi per calcolarne il maggiore e il minore");
		
		x=Lettore.in.leggiInt();
		y=Lettore.in.leggiInt();
		
		int maggiore, minore;
		
		if (x>y) {
			maggiore = x;
			minore = y;
		}
		
		else {
			maggiore = y;
			minore = x;
		}
		
		System.out.println("Utente, il maggiore è " + maggiore + " e il minore è " + minore);
		
	}

}
