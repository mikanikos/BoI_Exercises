package TerzaEsercitazione;
import fiji.io.*; 

/* Applicazione che legge da tastiera un numero intero strettamente
 * maggiore di 0 e verifica se tale numero è un numero primo. */
class Kefa{
	/* metodo principale */ 
	public static void main(String[] args){
		
	    /* dichiarazioni */
		int numero;          // numero immesso
	    int i;               // variabile contatore
	    boolean composto;    // variabile boolean per numeri primi
	    int radiceNumero;    // radice quadrata intera del numero immesso; pre: n>0
	    
	    /* stampa del messaggio per l'utente */
	    System.out.println("Scrivi un numero >0");
	    
	    /*inizializzazioni */
	    /* l'utente immette il numero */
	    numero = Lettore.in.leggiInt(); 
	    /* variabile contatore inizializzata a 2 */
	    i = 2; 
	    /* variabile boolean vale false inizialmente */  
	    composto = false;
	    /* radice quadrata intera del numero immesso */
	    radiceNumero = (int)Math.sqrt(numero);
	    
	    /* esecuzione del corpo dell'istruzione while fintanto che il numero non è
	     * composto e la variabile contatore minore della radice del numero immesso */
	    while (!composto && (i<=radiceNumero)){
	    	/* se il resto della divisione intera fra il numero immesso e la
	    	 * variabile contatore è uguale a 0 allora il numero è composto */
	    	if (numero%i==0)
	    		composto = true;
	    	/* incremento variabile contatore */
	    	i = i+1;
	    }
	    
	    /* stampa del risultato all'utente */
	    if (composto)
	    	System.out.println("NON e' primo");
        else 
        	System.out.println("E' primo");
	    
	}
}