package Array;
import fiji.io.Lettore;

/* applicazione che legge una sequenza di interi sequenza, 
 * poi legge un intero val (CHE NON ASSUMIAMO ESISTA IN
 * SEQUENZA) e stampa l'array ottenuto da sequenza 
 * cancellando il primo elemento che ha valore val OPPURE 
 * LA SEQUENZA INIZIALE SE UN ELEMENTO CON VALORE VAL
 * NON ESISTE */
public class CancellaValore {
	/* metodo principale */
	public static void main(String[] args) {
		int[] sequenza;			// sequenza da leggere
		int[] nuovaSequenza;	// sequenza con l'elemento rimosso
		int lunghezza;			// lunghezza della sequenza
		int valore;					// valore da cancellare
		
		/* leggi la lunghezza della sequenza */
		System.out.println("Quanti numeri hai intenzione di scrivere?");
		lunghezza = Lettore.in.leggiInt();
		sequenza = new int[lunghezza];
		
		/* leggi la sequenza */
		for(int i=0; i<lunghezza; i++) {
			System.out.println("Introduci un numero");
			sequenza[i] = Lettore.in.leggiInt(); 
		}
		
		/* leggi il valore da cancellare */
		System.out.println("Quale valore vuoi cancellare?");
		valore = Lettore.in.leggiInt(); 
		
		/* cancella l'elemento */
		nuovaSequenza = cancella2(sequenza, valore);
		
		/* stampa la nuova sequenza */
		for(int i=0; i<nuovaSequenza.length; i++) {
			System.out.print(nuovaSequenza[i] + " ");
		}
		
			
	}
	
	/* metodo che cancella un elemento da una sequenza */
	public static int[] cancella2(int[] sequenza, int val) {
			int[] nuovaSequenza;		// la nuova sequenza
			int i;								// contatore
			boolean esiste;				// esiste un elemento con quel valore?

			/* CONTROLLA SE ESISTE UN ELEMENTO CON VALORE val */
			esiste = false;
			i=0;
			while(i<sequenza.length && !esiste) {
				if(sequenza[i]==val)
					esiste = true;
				else
					i++;
			}
			
			/* SE L'ELEMENTO NON ESISTE DEVI RESTITUIRE sequenza */
			if(!esiste)
				nuovaSequenza = sequenza;
			
			else { // SE ESISTE COME ALTRO ESERCIZIO
				nuovaSequenza = new int[sequenza.length-1];
				
				i = 0;
				/* copia tutti gli elementi fino al primo con valore val */
				while(sequenza[i]!=val) {
					nuovaSequenza[i] = sequenza[i];
					i++;
				}
				
				/* una volta trovato l'elemento con valore val, sei uscito
				 * dal ciclo precedente, quindi puoi copiare tutti gli elementi
				 * successivi */
				i++;
				while(i<sequenza.length) {
					nuovaSequenza[i-1] = sequenza[i];
					i++;
				}
			}
			
			return nuovaSequenza;
	}
}
