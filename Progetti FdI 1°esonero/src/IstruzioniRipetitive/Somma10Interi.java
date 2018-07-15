package IstruzioniRipetitive;
import fiji.io.Lettore;

public class Somma10Interi {
	public static void main(String[] args) {
		
		int n; 
		int somma=0;
		
		System.out.println("Utente, inserisci 10 interi per calcolarne la somma");
		
		for (int i=1; i<=10; i++) {
			
			n=Lettore.in.leggiInt();	
			
			somma += n;
		}
	
		System.out.println("Utente, la somma è " +somma);
		
	}
}
		