package IstruzioniRipetitive;
import fiji.io.Lettore;

public class RettangoloAsterischi {
	public static void main(String[] args) {

		int b, h;
		
		System.out.println("Utente, inserisci rispettivamente base ed altezza per avere un rettangolo di asterischi con tali dimensioni");
		
		b=Lettore.in.leggiInt();		
		h=Lettore.in.leggiInt();
		
		int i,j;
		
		for(i=0;i<h;i++){// per ciascuna riga (ce ne sono h)

			/* stampa una riga e vai a capo */
			for (j=0;j<b;j++) // ciascuna riga contiene b asterischi
				System.out.print("* ");

			System.out.println();// passa alla riga successiva
		}
			
			
	     }
	}