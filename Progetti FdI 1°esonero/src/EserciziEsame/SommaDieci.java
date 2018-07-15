package EserciziEsame;

/*  
SPECIFICA
* 
* Input: Una stringa s
* Pre-condizione: s non nulla e contiene solo caratteri numerici
* Output: un valore Booleano contiene
* Post-condizione: contiene e' true se s contiene due caratteri numerici a somma dieci
* 
* TIPO DI PROBLEMA: Verifica esistenziale
*  
* ALGORITMO
* 1. input(s)
* 2. contiene = false
* 3. i = 0 
* 4. fintanto che (contiene = false e i <= indice penultimo carattere di s) 
* 	4.1. j=i+1
* 	4.2. fintanto che (contiene = false e j <= indice ultimo carattere di s)
* 		4.2.1. se (il carattere in posizione i ed il carattere in posizione j hanno somma 10)
* 			4.2.1.1. contiene = true
* 		4.2.2. altrimenti 
* 			4.2.2.1. j++
* 	4.3. i++
* 5. output(contiene) */

/* classe per la gestione di stringhe con caratteri a somma 10 */
 public class SommaDieci{
 
	/* metodo principale */
	 public static void main(String[] args) {
		 /* invoca il metodo di test e termina */
		 testSommaDieci();
	 }
		 
	/* metodo che restituisce true se s contiene due caratteri numerici la cui somma 
	 * e' dieci e restituisce false altrimenti */
	public static boolean sommaDieci(String s) {
		// pre: s non nulla e contiene solo caratteri numerici
		boolean contiene;		// variabile di esistenza
		contiene = false;		// non sono stati trovati due caratteri a somma dieci
		int primoN, secondoN;	// numeri nella stringa  
		int i = 0;				// contatore
		int j;					// contatore
		
		/* per ciascuna coppia di caratteri, verifica se hanno somma dieci e nel caso
		 * interrompi la ricerca */
		while(i<s.length()-1 && !contiene) {
			primoN = s.charAt(i) - '0';
			j = i+1;			// guarda tutti gli indici successivi ad i
			while(j<s.length() && !contiene) {
				secondoN = s.charAt(j) - '0';
				if(primoN+secondoN==10) // trovati!!
					contiene = true;
				else	// confronta il prossimo carattere con i
					j++;
			}
			i++;		// prossimo carattere per i
		}
		return contiene;
	}
	
	/* metodo di test per sommaDieci */
	public static void testSommaDieci() {
		
		/* Stringa vuota */
		System.out.println("sommaDieci(\"\"): [false] = " + sommaDieci(""));

		/* Stringa con un solo carattere */
		System.out.println("sommaDieci(\"3\"): [false] = " + sommaDieci("3"));

		/* Gli unici due caratteri a somma 10 sono il primo ed un altro */
		System.out.println("sommaDieci(\"36769\"): [true] = " + sommaDieci("36769"));

		/* Gli unici due caratteri a somma 10 sono l'ultimo ed un altro */
		System.out.println("sommaDieci(\"36169\"): [true] = " + sommaDieci("36169"));

		/* Gli unici due caratteri a somma 10 sono il primo e l'ultimo */
		System.out.println("sommaDieci(\"1769\"): [true] = " + sommaDieci("1769"));

		/* C'e' un 5 ma non ci sono due caratteri a somma 10 */
		System.out.println("sommaDieci(\"17568\"): [false] = " + sommaDieci("17568"));

		/* Esistono due caratteri in posizioni diverse dalla prima e l'ultima che
		 * hanno somma dieci */
		System.out.println("sommaDieci(\"1375658\"): [true] = " + sommaDieci("1375658"));

		/* Non esistono due caratteri che hanno somma dieci e la stringa ha almeno due
		 * caratteri */
		System.out.println("sommaDieci(\"1335618\"): [false] = " + sommaDieci("1335618"));

	}
}