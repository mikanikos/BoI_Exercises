package EserciziEsame;

/*  
* SPECIFICA
* Input: Una stringa s
* Pre-condizione: Stringa s non nulla
* Output: Un valore booleano contiene
* Post-condizione: contiene è true se la stringa contiene due caratteri diversi e false altrimenti
* TIPO DI PROBLEMA: Verifica esistenziale */

/* Applicazione che risolve il seguente problema. Data una stringa non nulla,
 * verificare se contiene due caratteri diversi. */
public class CaratteriDiversi {
	
	/* Metodo principale. */
	public static void main(String[] args) {
		
		/* Viene invocato il metodo di test testCaratteriDiversi(). */
		testCaratteriDiversi();
	}
	
	/* Metodo di classe caratteriDiversi che prende come parametro una stringa
	 * non nulla. Il metodo restituisce true se la stringa contiene due caratteri
	 * diversi e restituisce false altrimenti. */
	public static boolean caratteriDiversi(String s) {
		
		/* Dichiarazioni */
		boolean contiene, contiene2;  // variabile booleana di esistenza
		int i;             // variabile contatore
		int j;
		char primoChar;      // variabile carattere precedente
		char secChar;
		
		/* Inizializzazioni */
		contiene = false;  // inizialmente non è stata verificata nessuna stringa
		contiene2 = true;
		i = 1;             // variabile contatore inizializzata a 1
		j = 0;
		
		/* Qualora la stringa non sia vuota viene eseguito il corpo
		 * dell'istruzione if. */
		if (s.length() != 0) {
			/* Primo carattere memorizzato dentro la variabile. */
			primoChar = s.charAt(0);
			/* Fintanto che i è minore della lunghezza della stringa
			 * e la variabile booleana di esistenza vale false viene
			 * eseguito il corpo dell'istruzione while. */
			while (i < s.length() && !contiene && contiene2) {
				/* Se un carattere, successivo al primo, è diverso dal
				 * primo allora la variabile booleana di esistenza vale
				 * true. */
				if (primoChar != s.charAt(i)) {
					secChar = s.charAt(i);
					if (secChar == s.length()-1)
						contiene = true;
					j = i + 1;
					while (j < s.length() && contiene2 && !contiene) {
						if (secChar == s.charAt(j) || s.charAt(j) == primoChar) 
							contiene2 = true;
						else
							contiene2 = false;
						j++;
					}
					if (contiene2)
						contiene = true;
					    
				/* Altrimenti viene incrementata la variabile contatore i
				 * e si prosegue nella valutazione degli altri caratteri
				 * della stringa, qualora ancora ce ne siano. */
				}
				else 
					i++;
			}
		}
		
		/* Viene restituito il valore booleano al metodo invocatore */
		return contiene;
	}
	
	/* Un metodo di classe testCaratteriDiversi() per la verifica di correttezza.
	 * Il metodo di test deve realizzare un test a scatola nera. */
	public static void testCaratteriDiversi() {
		
		/* Stringa vuota. */
		System.out.println("caratteriDiversi (\"\") : [false] = " + caratteriDiversi(""));
		
		/* Stringa che contiene caratteri uguali. */
		System.out.println("caratteriDiversi (\"aaaaaa\") : [false] = " + caratteriDiversi("aaaaaa"));
		
		/* Stringa che contiene caratteri diversi. */
		System.out.println("caratteriDiversi (\"AaAaAa\") : [true] = " + caratteriDiversi("AaAaAa"));
		
		/* Stringa che contiene un carattere diverso all'inizio. */
		System.out.println("caratteriDiversi (\" 77777777\") : [true] = " + caratteriDiversi("e77777777"));
		
		/* Stringa che contiene un carattere diverso alla fine. */
		System.out.println("caratteriDiversi (\"àààààààààà.\") : [true] = " + caratteriDiversi("àààààààààà."));
		
		/* Stringa che contiene un carattere diverso in mezzo alla stringa. */
		System.out.println("caratteriDiversi (\"<<<<<<8<<<\") : [true] = " + caratteriDiversi("<<<<<<8<<<"));
		
		/* Stringa che contiene un solo carattere. */
		System.out.println("caratteriDiversi (\"£\") : [false] = " + caratteriDiversi("£"));
		
		/* Stringa che contiene tre caratteri diversi. */
		System.out.println("caratteriDiversi (\"piopio\") : [false] = " + caratteriDiversi("piopio"));
		
		/* Stringa che contiene quattro caratteri diversi */
		System.out.println("caratteriDiversi (\"miao\") : [false] = " + caratteriDiversi("miao"));
	}
}
