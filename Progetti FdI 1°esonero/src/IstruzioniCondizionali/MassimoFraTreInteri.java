package IstruzioniCondizionali;

import fiji.io.Lettore;

public class MassimoFraTreInteri {
	public static void main(String[] args) {
		
		int x, y , z;
		
		System.out.println("Utente, inserisci tre interi per calcolarne il massimo");
		
		x=Lettore.in.leggiInt();
		y=Lettore.in.leggiInt();
		z=Lettore.in.leggiInt();
		
		int massimo = x;
		
		if (y>massimo) {
			massimo = y;
		}
		
		if (z>massimo) {
			massimo = z;
		}
		
		System.out.println("Utente, il massimo fra i tre interi è " + massimo);
		
	}	
}
