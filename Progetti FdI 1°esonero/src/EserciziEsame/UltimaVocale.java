package EserciziEsame;

/*  
SPECIFICA
* Input: Una stringa s
* Pre-condizione: Una stringa s non nulla e non vuota
* Output: un valore int indexVocale
* Post-condizione: ultimaVocale è uguale all'indice dell'ultima vocale contenuta all'interno della stringa s
* 
* TIPO DI PROBLEMA 
* Ricerca

* ALGORITMO
* 1. input(s)
* 2. indexVocale = -1
* 3. i = 0
* 4. fintanto che (i < lunghezza della stringa)
*   4.1 if (il carattere alla posizione i è una vocale)
*     4.1.1 indexVocale = indice del carattere alla posizione i
* 5. output(indexVocale)
*/

/* classe per la ricerca dell'ultimo indice di una vocale in una stringa */
public class UltimaVocale {
	
	/* metodo main */
	public static void main(String[] args) {
		/* invocazione del metodo di test */
		testUltimaVocale();
	}
	
	/* metodo peril calcolo dell'indice dell'ultima vocale di una stringa */
	public static int ultimaVocale(String s) {
		
		int indexVocale;
		int i;
		
		indexVocale = -1;
		
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || 
					s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
					s.charAt(i) == 'O' || s.charAt(i) == 'U') {
						indexVocale = i;
					}
		}
		
		return indexVocale;
	}
	
	/* metodo di test */
	public static void testUltimaVocale() {
		
		/* Stringa con un solo carattere (non vocale) */
		System.out.println("ultimaVocale (\"G\"): [-1] : " +ultimaVocale("G"));
		
		/* Stringa con un solo carattere ( vocale) */
		System.out.println("ultimaVocale (\"a\"): [0] : " +ultimaVocale("a"));
		
		/* Stringa con ultima vocale all'inizio */
		System.out.println("ultimaVocale (\"Allll\"): [0] : " +ultimaVocale("Allll"));
		
		/* Stringa con ultima vocale alla fine */
		System.out.println("ultimaVocale (\"Laaaaaa\"): [6] : " +ultimaVocale("Laaaaaa"));
		
		/* Stringa con ultima vocale in mezzo */
		System.out.println("ultimaVocale (\"caaao784\"): [4] : " +ultimaVocale("caaao784"));
		
		/* Stringa con nessuna vocale */
		System.out.println("ultimaVocale (\"Ghj843**|28\"): [-1] : " +ultimaVocale("Ghj843**|28"));
		
		/* Stringa con solo vocali */
		System.out.println("ultimaVocale (\"EioAAau\"): [6] : " +ultimaVocale("EioAAau"));
		
		/* Stringa con diversi caratteri */
		System.out.println("ultimaVocale (\"Ciao, sono Andrea 10!!\"): [16] : " +ultimaVocale("Ciao, sono Andrea 10!!"));
	}

}
