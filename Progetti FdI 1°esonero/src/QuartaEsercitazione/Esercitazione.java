package QuartaEsercitazione;
import fiji.io.*;

public class Esercitazione {

	/* metodo per la generazione e visualizzazione di numeri random */
	public static void generatore(int numPrimi) {
		
		/* dichiarazioni variabili */
		int num;          // variabile numero random generato
		int i;            // variabile contatore dei random generati
		int j;	          // variabile contatore dei numPrimi generati
		
		/* inizialmente le variabili contatore sono inizializzate a 0 */
		i = 0;
		j = 0;
		
		/* fintanto che non sono generati tanti numeri primi quanti quelli
		 * voluti dall'utente si ripete la procedura di generazione random */
		while (j<numPrimi) {
			/* generazione numero random da 1 a 100 */
			num = (int)(Math.random()*100);
			/* variabile contatore dei random generati è innalzata */
			i++;
			/* il numero generato è stampato; attraverso l'invocazione del metodo isPrimo
			 * viene stabilita la primalita': se è primo viene segnalato e
			 * viene incrementata la variabile contatore di numeri primi */
			if (isPrimo(num)) {
				System.out.println("Numero random generato = " +num+ " (primo)");
				j++;
			}
			/* sennò viene semplicemente stampato il numero generato */
			else {
				System.out.println("Numero random generato = " +num);
		    }
		}
		/* stampa del numero totale di random generati */
		System.out.println("Numero totale di random generati: " +i);
	}

	/* metodo per la verifica di primalita’ di un numero */
	public static boolean isPrimo(int num) {
		
	    int i;               // variabile contatore
	    boolean primo;       // variabile boolean per numeri primi
	    int radiceNumero;    // radice quadrata intera del numero immesso;
	    
	    /* variabile contatore inizializzata a 2 */
	    i = 2; 
	    /* variabile boolean vale true inizialmente */  
	    primo = true;
	    /* radice quadrata intera del numero immesso */
	    radiceNumero = (int)Math.sqrt(num);
	    
	    /* esecuzione del corpo dell'istruzione while fintanto che il numero è
	     * primo e la variabile contatore minore della radice del numero immesso */
	    while (primo && (i <= radiceNumero)){
	    	/* se il resto della divisione intera fra il numero immesso e la
	    	 * variabile contatore è uguale a 0 allora il numero non è primo */
	    	if (num%i == 0)
	    		primo = false;
	    	/* incremento variabile contatore */
	    	i = i+1;
	    }
	    /* viene restituito il valore boolean al metodo 
	     * generatore che aveva invocato il metodo isPrimo */
		return primo;
	}

	/* metodo principale */
	public static void main(String[] args) {
		int n; // numero di primi

		/* leggi n */
		System.out.println("Quanti numeri primi vuoi generare?");
		n = Lettore.in.leggiInt();

		/* invoca il metodo per generare i numeri random */
		generatore(n);
	}
}