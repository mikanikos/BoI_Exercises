package IstruzioniRipetitive;
import fiji.io.Lettore;

public class SommaNInteri {
	public static void main(String[] args) {
		
		int n;
		int m;
		int somma=0;
		
		System.out.println("Utente, inserisci un intero n per calcolare la somma di n interi");
		
		n=Lettore.in.leggiInt();
		
		System.out.println("Utente, ora inserisci " +n+ " intero/i per calcolarne la somma");

		for (int i=1; i<=n; i++) {
			
			m=Lettore.in.leggiInt();	
			
			somma += m;
		}
	
		System.out.println("Utente, la somma è " +somma);
		
	}
}
		