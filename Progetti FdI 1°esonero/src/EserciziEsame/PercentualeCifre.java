package EserciziEsame;

/*  
SPECIFICA
* Input: Una stringa s
* Pre-condizione: Una stringa s non nulla
* Output: Un valore booleano contiene
* Post-condizione: Se nella stringa s almeno la metà dei caratteri sono numerici
* allora contiene vale true, altrimenti vale false
* 
* TIPO DI PROBLEMA 
* Verifica Esistenziale  !!!ERRORE: E' DI CONTEGGIO!!!
*/

/* Applicazione che sa risolvere il seguente problema. Data una stringa non nulla
 * verificare se almeno la metà dei suoi caratteri sono numerici. */
public class PercentualeCifre {
	/* metodo principale */
	public static void main(String[] args) {
		testPercentualeCifre();
	}
	
	/* Metodo di classe percentualeCifre che prende come parametro una stringa non
	 * nulla. Il metodo restituisce true se almeno la metà dei caratteri della 
	 * stringa sono numerici e false altrimenti. */
	public static boolean percentualeCifre(String s) {
		
		/* dichiarazioni */
		boolean contiene;  // variabile booleana di esistenza
		int contCifre;     // variabile contatore di cifre
		int i;             // variabile contatore
		
		/* inizializzazioni */
		contiene = false;   // inizilmente non è verificata la condizione          
		contCifre = 0;      // inizlamente non sono state trovate cifre nella stringa
		
		/* viene passato in rassegna ogni carattere della stringa */
		for (i = 0; i<s.length(); i++) {
			/* se un carattere è una cifra viene incrementata la variabile contatore di cifre */
			if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
				contCifre++;
		}
		
		contiene = contCifre >= s.length()-contCifre;
		
		/* viene restituito il valore booleano al metodo invocatore */
		return contiene;
	}
	
	/* Un metodo di classe testPercentualeCifre() per la verifica di correttezza.
	 * Il metodo di test deve realizzare un test a scatola nera. */
	public static void testPercentualeCifre() {
		
		/* Stringa vuota */
		System.out.println("percentualeCifre (\"\"): [true] = " + percentualeCifre(""));
		
		/* Stringa casuale che verifica la condizione */
		System.out.println("percentualeCifre (\"oggi 22-12-2015\"): [true] = " + percentualeCifre("oggi 22-12-2015"));
		
		/* Stringa casuale che non verifica la condizione */
		System.out.println("percentualeCifre (\"oggi è 22-12-2015\"): [false] = " + percentualeCifre("oggi è 22-12-2015"));
		
		/* Stringa con un solo carattere numerico */
		System.out.println("percentualeCifre (\"5\"): [true] = " + percentualeCifre("5"));
		
		/* Stringa con un solo carattere non numerico */
		System.out.println("percentualeCifre (\"o\"): [false] = " + percentualeCifre("o"));
		
		/* Stringa con la metà dei caratteri numerici */
		System.out.println("percentualeCifre (\"ciao1010\"): [true] = " + percentualeCifre("ciao1010"));
		
		/* Stringa con caratteri numerici intervallati da non numerici */
		System.out.println("percentualeCifre (\"c1i0a1o0s9k8\"): [true] = " + percentualeCifre("c1i0a1o0s9k8"));
		
		/* Stringa con caratteri particolari e specifici che verifica la condizione */
		
		System.out.println("percentualeCifre (\"678//0=645=%%7t74*55*5°<|743\"): [true] = " + percentualeCifre("678//0=645=%%7t74*55*5°<|743"));
		
		/* Stringa con caratteri particolari e specifici che non verifica la condizione */
		
		System.out.println("percentualeCifre (\"+ èàò79||! &%/&7589< \"): [false] = " + percentualeCifre("+ èàò79||! &%/&7589< "));
	}
}


