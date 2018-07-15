package Array;
import fiji.io.Lettore;

/* applicazione che legge una sequenza di interi sequenza, poi legge un intero indice
 * e stampa l'array ottenuto da sequenza cancellando l'elemento che ha indice indice */
public class CancellaElemento {
	/* metodo principale */
	public static void main(String[] args) {
		int[] sequenza;			// sequenza da leggere
		int[] nuovaSequenza;	// sequenza con l'elemento rimosso
		int lunghezza;			// lunghezza della sequenza
		int indice;				// indice da cancellare
		
		/* leggi la lunghezza della sequenza */
		System.out.println("Quanti numeri hai intenzione di scrivere?");
		lunghezza = Lettore.in.leggiInt();
		sequenza = new int[lunghezza];
		
		/* leggi la sequenza */
		for(int i=0; i<lunghezza; i++) {
			System.out.println("Introduci un numero");
			sequenza[i] = Lettore.in.leggiInt(); 
		}
		
		/* leggi l'indice da cancellare */
		System.out.println("Quale indice vuoi cancellare?");
		indice = Lettore.in.leggiInt(); 
		
		/* cancella l'elemento */
		nuovaSequenza = cancella(sequenza, indice);
		
		/* stampa la nuova sequenza */
		for(int i=0; i<nuovaSequenza.length; i++) {
			System.out.print(nuovaSequenza[i] + " ");
		}
		
			
	}
	
	/* metodo che cancella un elemento da una sequenza */
	public static int[] cancella(int[] sequenza, int indice) {
			int[] nuovaSequenza;		// la nuova sequenza
			nuovaSequenza = new int[sequenza.length-1];
			
			/* copia tutti gli elementi fino a quello con indice indice (escluso) */
			for(int i=0; i<indice; i++)
				nuovaSequenza[i] = sequenza[i];
			
			/* copia tutti gli elementi a partire da quello con indice indice +1 (incluso) */
			for(int i=indice+1; i<sequenza.length; i++)
				nuovaSequenza[i-1] = sequenza[i];			
			
			return nuovaSequenza;
	}
}