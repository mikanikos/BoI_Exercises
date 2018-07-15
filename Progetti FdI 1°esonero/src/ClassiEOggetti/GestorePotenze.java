package ClassiEOggetti;
import fiji.io.*;

/* applicazione che legge un numero dall'utente e stampa la piu'
 * grande potenza di due minore o uguale al numero letto */
public class GestorePotenze {

	/* metodo principale */
	public static void main(String[] args) {
		int numero;				// il numero da leggere
		int risultato;			// la potenza di due
		
		/* leggi il numero */
		System.out.println("Introduci un intero positivo");
		numero = Lettore.in.leggiInt();
		
		/* calcola il risultato utilizzando il metodo 
		 * trovaPotenza della classe */
		risultato = trovaPotenza(numero); 
		/* oppure GestorePotenze.trovaPotenza(numero); */
		
		/* comunica all'utente il risultato */
		System.out.println("Il valore richiesto e' " + risultato);
	}
	
	/* metodo che prende come parametro un valore positivo di 
	 * tipo int e restituisce un valore di tipo boolean che indica se il 
	 * numero e' una potenza di due oppure no. */
	public static boolean verificaPotenza(int numero) {
		/* rappresenta se hai trovato o no una potenza di 2 
		 * uguale a numero: inizialmente no... */
		boolean isPotenza = false;	
		/* rappresenta la potenza di due piu' grande che hai trovato 
		 * minore o uguale a numero */
		int potenza = 1;		
		/* controlla le potenze di due finche' non superi il valore di numero */
		while(potenza <= numero) {
			if(potenza==numero) // hai trovato?
				isPotenza = true;
			potenza *= 2;
		}
		return isPotenza;
	}
	
	/* metodo che prende come parametro un valore di tipo int e 
	 * restituisce la piu' grande potenza di due minore o uguale 
	 * al parametro. */
	public static int trovaPotenza(int intero) {
		int potenza;		// il valore da restituire

		/* guarda tutti i numeri da 1 a intero e memorizza quello 
		 * piu' grande che e' una potenza di due */
		potenza = 1;
		for(int i=2;i<=intero;i++) 
			if(verificaPotenza(i))
				potenza = i;
		
		return potenza;
	}
	
}