package Array;

import fiji.io.Lettore;

/* Applicazione che legge una sequenza di interi, e calcola e stampa la
 * sequenza composta dai soli interi positivi della sequenza letta */
public class ElementiPositivi {

	/* metodo principale */
	public static void main(String[] args){
		int[] sequenza;			// sequenza da leggere
		int[] nuovaSequenza;	// sequenza di soli positivi
		int lunghezza;			// lunghezza della sequenza
		
		/* leggi la lunghezza della sequenza */
		System.out.println("Quanti numeri hai intenzione di scrivere?");
		lunghezza = Lettore.in.leggiInt();
		sequenza = new int[lunghezza];
		
		/* leggi la sequenza */
		for(int i=0; i<lunghezza; i++) {
			System.out.println("Introduci un numero");
			sequenza[i] = Lettore.in.leggiInt(); 
		}

		/* invoca il metodo per il calcolo della sequenza di positivi */
		nuovaSequenza = soloPositivi(sequenza);
		
		/* stampa gli elementi della sequenza di positivi */
		System.out.print("La sequenza ristretta ai numeri positivi e' ");  
		for(int i=0;i<nuovaSequenza.length;i++)
			System.out.print(nuovaSequenza[i] + " ");	
	}

	/* metodo per il calcolo dell'array di positivi */
	public static int[] soloPositivi(int[] x){
		int i, j;				// contatori
		int[] positivi;			// l'array che vogliamo creare
		int lunghezza;			// numero di elementi positivi
		
		/* crea l'array che vogliamo restituire */
		lunghezza = numeroPositivi(x);
		positivi = new int[lunghezza];
		
		/* Scandisci tutti gli elementi di x e memorizza 
		 * ciascun elemento positivo nell'array positivi */
		j=0;
		for(i=0;i<x.length;i++)
			if(x[i]>0) {
				positivi[j]=x[i];
				j++;
			}
		
		return positivi;							
	}

	/* metodo per il calcolo del numero di elementi positivi in un array */
	public static int numeroPositivi(int[] x){
		int numero;		// valore da restituire
		int i;			// contatore
		
		/* aumenta il valore di numero per ciascun elemento di x >0 */
		numero = 0;
		for(i=0;i<x.length;i++)
			if(x[i]>0) 
				numero++;
		
		return numero;
	}		
}