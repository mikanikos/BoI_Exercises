package EserciziEsame;

/*  
SPECIFICA
* Input: Una stringa s
* Pre-condizione: Stringa s non nulla
* Output: Un valore booleano uguali
* Post-condizione: se tutti i caratteri della stringa s sono uguali allora uguali è true,
*                  altrimenti è false
 
* TIPO DI PROBLEMA 
* Verifica universale

* ALGORITMO
* 1. input(s)
* 2. uguali = true
* 3. i = 1
* 4. fintanto che (i < della lunghezza della stringa s e uguali è true)
*   4.1 se (carattere di i non è uguale al prededente)
*     4.1.1 uguali = false
*   i++
* 5. output(uguali)
*/

/* Applicazione che risolve il seguente problema. Data una stringa non nulla,
 * viene verificato se tutti i suoi caratteri sono uguali. */
public class CaratteriUguali {
	
	/* metodo principale */
	public static void main(String[] args) {
		/* invocazione del metodo di test */
		testCaratteriUguali();
	}
	
	/* Metodo di classe caratteriUguali che prende come parametro una stringa
	 * non nulla. Il metodo restituisce true se tutti i caratteri della stringa
	 * sono uguali e restituisce false altrimenti. */
	public static boolean caratteriUguali(String s) {
		
		/* dichiarazioni */
		boolean uguali;  // variabile booleana di universalità
		int i;           // vriabile contatore
		
		/* inizializzaioni */
		uguali = true;  // inizialmente ogni carattere della stringa è uguale
		i = 0;          // variabile contatore inizializzata a 0
		
		/* se la lunghezza della stringa è zero la condizione non è verificata */
		if (s.length() == 0)
			uguali = false;
		
		/* viene analizzato ogni carattere della stringa */
		while (i < s.length() && uguali) {
			/* se il carattere successivo a quello considerato fa ancora parte della stringa */
			if ((i+1) <= (s.length()-1)) {
				/* se il carattere successivo non è uguale a quello predente la condizione non è verificata */
				if (s.charAt(i) != s.charAt(i+1))
					uguali = false;
			}
			/* variabile contatore incrementata di 1 */
			i++;
		}
		
		/* viene restituito il valore al metodo invocatore */
		return uguali;
	}
	
	/* Metodo di classe testCaratteriUguali() per la verifica di correttezza.
	 * Il metodo di test deve realizzare un test a scatola nera. */
	public static void testCaratteriUguali() {
		
		/* Stringa vuota */
		System.out.println("caratteriUguali (\"\"): [false] = " + caratteriUguali(""));
		
		/* Stringa con lo stesso carattere alfabetico */
		System.out.println("caratteriUguali (\"aaaaaa\"): [true] = " + caratteriUguali("aaaaaa"));
		
		/* Stringa con lo stesso carattere non alfabetico */
		System.out.println("caratteriUguali (\"!!!!!!!!!\"): [true] = " + caratteriUguali("!!!!!!!!!"));
		
		/* Stringa con lo stesso carattere numerico */
		System.out.println("caratteriUguali (\"1111\"): [true] = " + caratteriUguali("1111"));
		
		/* Stringa con due caratteri diversi */
		System.out.println("caratteriUguali (\"A.A.A\"): [false] = " + caratteriUguali("A.A.A"));
		
		/* Stringa con un solo carattere */
		System.out.println("caratteriUguali (\"a\"): [true] = " + caratteriUguali("a"));
		
		/* Stringa con un carattere diverso all'inizio */
		System.out.println("caratteriUguali (\"Maaaaaaaaaaaaaa\"): [false] = " + caratteriUguali("Maaaaaaaaaaaaaa"));
		
		/* Stringa con un carattere diverso alla fine */
		System.out.println("caratteriUguali (\"++++++++9\"): [false] = " + caratteriUguali("++++++++9"));
		
		/* Stringa con un carattere diverso in mezzo alla stringa */
		System.out.println("caratteriUguali (\"      '     \"): [false] = " + caratteriUguali("      '     "));
		
		/* Stringa con uno spazio */
		System.out.println("caratteriUguali (\" \"): [true] = " + caratteriUguali(" "));
	}

}
