package ClassiEOggetti;
import fiji.io.*;
/* classe per il calcolo della radice quadrata */
public class RadiceQuadrata {

	/* metodo principale */
	public static void main(String[] args) { 
	
		double x;		// numero da leggere
		double radice;	// radice quadrata
		
		/* leggi il numero */
		System.out.println("Introduci un numero");
		x = Lettore.in.leggiDouble();
		
		/* calcola la radice quadrata */
		radice = Math.sqrt(x);
		
		/* stampa il risultato */
		System.out.println("La radice quadrata vale " + radice);		
	}
}
