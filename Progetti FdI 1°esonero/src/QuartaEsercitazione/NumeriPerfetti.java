package QuartaEsercitazione;
import fiji.io.*;

public class NumeriPerfetti {
	
	/* metodo per la generazione e visualizzazione di numeri perfetti */
	public static void generatorePerfetti(int numPerfetti) {
		
		/* dichiarazioni variabili */
		int num; // variabile numero
		int i;   // variabile contatore di numeri perfetti
		
		/* inizialmente le variabili sono inizializzate a 0 */
		num = 0;
		i = 0;
		
		/* fintanto che non sono trovati tanti numeri perfetti quanti quelli
		 * voluti dall'utente si ripete la ricerca per ogni numero pari */
		while (i<numPerfetti) {
			/* si guarda ad ogni numero pari perché ogni numero perfetto è pari:
			 * in questo modo si accelera la ricerca dei numeri perfetti */
			num = num + 2;
			/* grazie al metodo isPerfetto si verifica se ogni numero è perfetto oppure no:
			 * in caso, si stampa tale numero e si incrementa la variabile contatore di numeri perfetti */
			if(isPerfetto(num)) {
			    System.out.println(num + " e' perfetto");
			    i++;
			}
		}
	}

	/* metodo per la verifica di un numero perfetto */
	public static boolean isPerfetto (int num) {
		
		/* dichiarazioni variabili */
		int j;              // variabile divisore
		int sommaDivisori;  // variabile somma di divisori
		boolean perfetto;   // variabile boolean che verifica se il numero è perfetto
		
		/* inizialmente la variabile di somma di divisori è inizializzata a 0
		 * e non si è ancora capito se il numero è perfetto o meno */
		sommaDivisori = 0;
		perfetto = false;
		
		/* per ogni numero si calcolano i suoi divisori */
		for (j=1; j<=num/2; j++) {
			/* se un numero è divisore del numero viene sommato agli altri divisori trovati */
			if (num%j == 0) {
			    sommaDivisori = sommaDivisori + j;
		    }
		}
		
		/* se la somma dei divisori del numero è uguale
		 * al numero stesso allora il numero è perfetto */
		if (sommaDivisori==num){
			perfetto = true;
		} 
		/* viene restituito il valore boolean trovato al metodo ha invocato isPerfetto */
		return perfetto;
	}
	
	/* metodo principale */
	public static void main(String[] args) {
		
		/* dichiarazione variabile */
		int n;
		
		/* viene chiesto all'utente di inserire quanti n numeri perfetti 
		 * vuole avere: il numero deve essere compreso tra 1 e 5 */
		do {
			/* stampa del messaggio */
			System.out.println("Quanti numeri perfetti vuoi avere? Inserire un numero da 1 a 5");
			/* letture del numero n */
		    n = Lettore.in.leggiInt();
		    /* Se il numero non è compreso tra 1 e 5 
		     * viene chiesto di reinserire il numero n */
		    if (n>5 || n<1) {
			    System.out.println("Inserimento non corretto");
		    }
		}
		while (n>5 || n<1);
	
		/* invocazione del metodo generatorePerfetti */
		generatorePerfetti(n);			
	}
	
}