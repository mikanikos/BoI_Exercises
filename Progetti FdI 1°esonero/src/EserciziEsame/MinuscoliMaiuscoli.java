package EserciziEsame;

/*  
SPECIFICA
* Input: Una stringa s
* Pre-condizione: Una stringa s non nulla
* Output: un valore booleano contiene
* Post-condizione: se se il numero di caratteri alfabetici minuscoli 
* è uguale al numero di caratteri alfabetici maiuscoli allora contiene
* vale true, altrimenti vale false
* 
* TIPO DI PROBLEMA 
* Verifica esistenziale   !!!ERRORE: E' DI CONTEGGIO!!!

* ALGORITMO
* 1. input(s)
* 2. contiene = false
* 3. i = 0
* 4. fintanto che (contiene = false e i minore della lunghezza di s)
*   4.1 se (carattere è minuscolo)
*     4.1.1 contatoreMinuscole++
*   4.2 se (carattere è maiuscolo)
*     4.2.1 contatoreMaiuscole++
*   4.3 i++
* 5. output(contiene)
*/

/* Applicazione che risolve il seguente problema: data una stringa
 * non nulla, verifica se il numero di caratteri alfabetici minuscoli 
 * è uguale al numero di caratteri alfabetici maiuscoli */
public class MinuscoliMaiuscoli{
/* metodo principale */
	public static void main(String[] args) {
		/* invocazione del metodo di test */
		testMinuscoliMaiuscoli();
	}
/* Metodo di classe minuscoliMaiuscoli che prende come parametro
 * una stringa non nulla. Il metodo restituisce true se il numero
 * di caratteri minuscoli ed il numero di caratteri maiuscoli nella
 * stringa coincidono e restituisce false altrimenti */
	public static boolean minuscoliMaiuscoli(String s) {
		
		/* dichiarazioni */
		boolean contiene;  // variabile booleana di esistenza
		int contMin;       // contatore di caratteri minuscoli
		int contMai;       // contatore di caratteri maiuscoli
		int i;             // variabile contatore
		
		/* inizializzazioni */
		contiene = false;  // inizialmente contiene vale false perché non è stata
		                   // trovata nessuna stringa che verifica la condizione
		contMin = 0;       // contatore minuscole non ha trovato ancora alcun carattere minuscolo
		contMai = 0;       // contatore maiuscole non ha trovato ancora alcun carattere maiuscolo
		i=0;               // variabile contatore inizializzata a 0
		
		/* fintanto che i non assume tutte le posizioni dei caratteri che
		 * compongono la stringa s viene eseguito il corpo del while */
		while (i<s.length()) {
			/* se viene trovato un carattere minuscolo viene incrementata
			 * di uno la variabile contatore di caratteri minuscoli */
			if ((s.charAt(i)>= 'a') && (s.charAt(i)<= 'z'))
				contMin++;
			/* se viene trovato un carattere maiuscolo viene incrementata
			 * di uno la variabile contatore di caratteri maiuscoli */
			if ((s.charAt(i)>= 'A' && s.charAt(i)<= 'Z'))
				contMai++;
			/* variabile contatore incrementata alla fine del ciclo */
			i++;
		}
		/* se il numero di caratteri minuscoli della stringa coincide con il numero 
		 * dei cratteri maiuscoli (escluso il caso 0) allora contiene vale true */
		if (contMin == contMai)
			contiene = true;
		
		/* variabile di esistenza restituita al metodo invocatore */
		return contiene;	
	}
/* Metodo di classe testMinuscoliMaiuscoli() per la verifica di
 * correttezza. Il metodo di test deve realizzare un test a scatola nera. */
	public static void testMinuscoliMaiuscoli() {
		
		/* Stringa vuota */
		System.out.println("minuscoliMaiuscoli(\"\"): [true] = " + minuscoliMaiuscoli(""));
		
		/* Stessi carattero maiuscoli e minuscoli in una sola parola */
		System.out.println("minuscoliMaiuscoli(\"CIao\"): [true] = " + minuscoliMaiuscoli("CIao"));
		
		/* Un solo carattere minuscolo */
		System.out.println("minuscoliMaiuscoli(\"a\"): [false] = " + minuscoliMaiuscoli("a"));
		
		/* Un solo carattere maiuscolo */
		System.out.println("minuscoliMaiuscoli(\"A\"): [false] = " + minuscoliMaiuscoli("A"));
		
		/* Un solo carattere né minuscolo né maiuscolo */
		System.out.println("minuscoliMaiuscoli(\"&\"): [false] = " + minuscoliMaiuscoli("false"));
		
		/* Uno spazio */
		System.out.println("minuscoliMaiuscoli(\" \"): [true] = " + minuscoliMaiuscoli(" "));
		
		/* Stringa con diversi caratteri e che verifica la condizione */
		System.out.println("minuscoliMaiuscoli(\"Non lo so fare! AIUTOOOOO\"): [true] = " + minuscoliMaiuscoli("Non lo so fare! AIUTOOOOO"));
		
		/* Stringa con diversi caratteri e che non verifica la condizione */
		System.out.println("minuscoliMaiuscoli(\"Non lo so fare! HELP!\"): [false] = " + minuscoliMaiuscoli("Non lo so fare! HELP!"));
	}
}
