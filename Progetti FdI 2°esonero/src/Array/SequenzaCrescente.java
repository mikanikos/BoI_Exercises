package Array;
import fiji.io.Lettore;

/* applicazione che legge una sequenza di interi e stampa un messaggio che comunica 
 * all'utente se la sequenza e' crescente oppure no */
public class SequenzaCrescente {
	/* metodo principale */
	public static void main(String[] args) {
		int[] sequenza;		// sequenza da leggere
		int lunghezza;		// lunghezza della sequenza
		
		/* leggi la lunghezza della sequenza */
		System.out.println("Quanti numeri hai intenzione di scrivere?");
		lunghezza = Lettore.in.leggiInt();
		sequenza = new int[lunghezza];
		
		/* leggi la sequenza */
		for(int i=0; i<lunghezza; i++) {
			System.out.println("Introduci un numero");
			sequenza[i] = Lettore.in.leggiInt(); 
		}
		
		/* stampa un messaggio che comunica all'utente se la sequenza e' crescente */
		if(isCrescente(sequenza))
			System.out.println("Crescente!");
		else 
			System.out.println("Non crescente!");
	}
	
	/* metodo che verifica se una sequenza e' crescente oppure no;
	 * una sequenza e' crescente se ciascun elemento non e' maggiore
	 * dell'elemento successivo  */
	public static boolean isCrescente(int[] sequenza) {
		boolean crescente;		// variabile universalita'
		crescente = true;		// inizialmente la sequenza e' crescente
		/* verifica se ciscun elemento e' minore o uguale al successivo */
		for(int i=0; i<sequenza.length-1; i++)
			if(sequenza[i]>sequenza[i+1])
				crescente = false;
		return crescente;
	}
}