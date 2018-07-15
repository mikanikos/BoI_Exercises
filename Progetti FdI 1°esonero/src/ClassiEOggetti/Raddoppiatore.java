package ClassiEOggetti;
import fiji.io.*;
/* classe per il calcolo del doppio di un numero intero */
public class Raddoppiatore {
	/* metodo principale */
	public static void main(String[] args) { 
		int x;			// numero da leggere
		int doppio;		// il suo doppio

		/* leggi il numero */
		System.out.println("Introduci un numero");
		x = Lettore.in.leggiInt();
		
		/* calcola il doppio */
		doppio = 2 * x;
		
		/* stampa il risultato */
		System.out.println("Il doppio vale " + doppio);		
	}
}
