package IstruzioniCondizionali;

import fiji.io.Lettore;

public class MassimoFraTreInteri2 {
	public static void main(String[] args) {
		
		int x, y , z;
		
		System.out.println("Utente, inserisci tre interi per calcolarne il massimo");
		
		x=Lettore.in.leggiInt();
		y=Lettore.in.leggiInt();
		z=Lettore.in.leggiInt();
				
		int massimo;
		
		if (x>y) {
			if (x>z) {
				massimo = x;
			}
			else {
				massimo = z;
			}	
		}
		else
			if (y>z) {
				massimo = y;
			}
			else
				massimo =z;
			
		
		System.out.println("Utente, il massimo fra i tre interi è " + massimo);
		
	}	
}
