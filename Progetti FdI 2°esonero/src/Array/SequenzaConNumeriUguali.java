package Array;
import fiji.io.Lettore;

/* applicazione che legge una sequenza di interi e stampa un messaggio che comunica 
 * all'utente se la sequenza contiene due numeri uguali oppure no */
public class SequenzaConNumeriUguali {
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
		
		/* stampa un messaggio che comunica all'utente se la sequenza contiene due numeri uguali */
		if(contieneUguali(sequenza))
			System.out.println("Li contiene!");
		else 
			System.out.println("Non li contiene!");
	}
	
	/* metodo che verifica se una sequenza contiene due numeri uguali oppure no */
	public static boolean contieneUguali(int[] interi) {
		boolean trovati;		// variabile esistenziale
		trovati = false;		// inizialmente non hai trovato due numeri uguali
		
		/* verifica ciascuna coppia */
		for(int i=0; i<interi.length-1; i++)
			for(int j=i+1; j<interi.length; j++)
				if(interi[i]==interi[j])
					trovati = true;
		return trovati;
	}
}