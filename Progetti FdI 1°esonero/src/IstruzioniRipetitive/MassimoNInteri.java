package IstruzioniRipetitive;
import fiji.io.Lettore;

public class MassimoNInteri {
	public static void main(String[] args) {

		int n;
		int m;
		int massimo=0;
		
		System.out.println("Utente, inserisci un intero n per calcolare il massimo di n interi");
		
		n=Lettore.in.leggiInt();
		
		System.out.println("Utente, ora inserisci " +n+ " intero/i per calcolarne il massimo");

		for (int i=1; i<=n; i++) {
			m=Lettore.in.leggiInt();
			if (m>massimo) {
				massimo=m;;
			}
			
		}
	
		System.out.println("Utente, il massimo è " +massimo);
		
	}
}