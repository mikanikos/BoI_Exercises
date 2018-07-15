package IstruzioniRipetitive;
import fiji.io.Lettore;

public class MontagnaAsterischi {
	public static void main(String[] args) {
		
		int h;
		int i,j;
		
		System.out.println("Utente, introduci un intero h per avere una montagna di asterischi di altezza h");
		
		h=Lettore.in.leggiInt();
		
		/* stampa un messaggio per l'utente */
		System.out.println("Ecco la tua montagna:");
		
		/* guarda a tutti gli i */
		for(i=1;i<=h;i++) {
			/* guarda a tutte le j */
			for(j=1;j<=2*h;j++) {
				/* devi stampare un asterisco solo nelle posizioni
				 * comprese fra base-i+1 e base+i */
				if(j<h-i+1 || j>h+i)
					System.out.print("  ");
				else 
					System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
