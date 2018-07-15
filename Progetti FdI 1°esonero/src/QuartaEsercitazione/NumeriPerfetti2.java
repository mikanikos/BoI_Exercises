package QuartaEsercitazione;
import fiji.io.Lettore;

public class NumeriPerfetti2 {
	
	/* metodo per la generazione e visualizzazione di numeri perfetti */
	public static void generatorePerfetti(int numPerfetti) {
		
		double m;   // variabile numero di Marsenne
		double num; // variabile numero perfetto
		int n;      // variabile numero primo a partire da 2
		int i;      // variabile contatore di numeri perfetti
		
		/* inizialmente le variabili sono inizializzate a 0, solo
		 * la variabile numero primo è inizializzata a 2 dato che
		 * devono essere esclusi come valori di output 0 e 1 */
		i = 0;
		num = 0;
		n = 2;
		
		/* fintanto che non sono trovati tanti numeri perfetti quanti quelli voluti
		 * dall'utente si ripete la ricerca finché il numero di Marsenne non è primo */
		while (i<numPerfetti) {
			m = (Math.pow(2, n))-1;
			/* se il numero di Marsenne è primo viene applicata la formula
			 * di Euclide per il calcolo del numero perfetto e viene innalzata
			 * la variabile contatore di numeri perfetti */
			if (isPrimo(m) == true){
			     num = (Math.pow(2, (n-1)))*((Math.pow(2, n))-1);
			     System.out.println((int)num);
			     i++;
			}
			/* si procede con il numero primo successivo */
			n++;
		}
	}

	/* metodo per la verifica di un numero perfetto */
    public static boolean isPrimo(double numero) {
    	int i;               // variabile contatore
	    boolean primo;       // variabile boolean per numeri primi
	    int radiceNumero;    // radice quadrata intera del numero immesso;
	    
	    /* variabile contatore inizializzata a 2 */
	    i = 2; 
	    /* variabile boolean vale true inizialmente */  
	    primo = true;
	    /* radice quadrata intera del numero immesso */
	    radiceNumero = (int)Math.sqrt(numero);
	    
	    /* esecuzione del corpo dell'istruzione while fintanto che il numero è
	     * primo e la variabile contatore minore della radice del numero immesso */
	    while (primo && (i <= radiceNumero)){
	    	/* se il resto della divisione intera fra il numero immesso e la
	    	 * variabile contatore è uguale a 0 allora il numero non è primo */
	    	if (numero%i == 0)
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