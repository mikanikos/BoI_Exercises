package EserciziEsame;

/*  
* SPECIFICA
* Input: Due stringhe, rispettivamente s e t
* Pre-condizione: Le stringhe s e t non nulle
* Output: Un valore booleano prefisso
* Post-condizione: Prefisso vale true se la stringa s
* è un prefisso della stringa t, altrimenti vale false
* 
* TIPO DI PROBLEMA: Verifica universale
* 
* ALGORITMO:
* 1. input(s)
* 2. prefisso = true
* 3. i = 0
* 4. se (la stringa s o la stringa t sono vuote)
*   4.1 prefisso = false;
* 5. altrimenti
*   5.1 fintanto che (i è minore della stringa s e prefisso vale true)
*     5.1.1 if (il carattere alla posizione i della stringa s non
*           è uguale al carattere nella stessa posizione della stringa t)
*       5.1.1.1 prefisso vale false
*     5.1.2 altrimenti
*       5.1.2.1 i++
* 6. output(prefisso)
*/

/* Applicazione che risolvere il seguente problema. Date due stringhe non nulle s e t, 
 * verifica se s è un prefisso di t ovvero se la parte iniziale di t coincide con s */
public class Prefisso {
	
	/* metodo principale */
	public static void main(String[] args) {
		
		/* invocazione del metodo di test */
		testPrefisso();
	}
	
	/* Metodo di classe prefisso che prende come parametro due stringhe non nulle. 
	 * Il metodo restituisce true se la prima stringa è un prefisso della seconda */
	public static boolean prefisso(String s, String t) {
		
		/* dichirazioni */
		boolean prefisso;
		int i;
		
		/* inizializzazioni */
		prefisso = true;
		i = 0;
		
		/* se s e' piu' lunga di t, non ne puo' essere un prefisso */
		if(s.length()>t.length())
			prefisso = false;
		
		/* fintanto che i è minore della lunghezza della stringa e prefisso è uguale a true */
		while (i < s.length() && prefisso) {
			/* se il carattere alla posizione i non è uguale al corrispondente nella stringa t 
			* allora prefisso vake false, altrimenti incrementa i di uno */
			if (s.charAt(i) != t.charAt(i))
				prefisso = false;
			else
				i++;
		}		
		
		/* viene restituito il valore prefisso al metodo invocatore */
		return prefisso;
	}
	
	/* Metodo di classe testPrefisso() per la verifica di correttezza. 
	 * Il metodo di test deve realizzare un test a scatola nera */
	public static void testPrefisso() {
		
		/* Le stringhe s e t sono vuote */
		System.out.println("prefisso s = (\"\"), t = (\"\"): [true] = " + prefisso((""),("")));
		
		/* La stringa s è vuota e la stringa t no */
		System.out.println("prefisso s = (\"\"), t = (\"ciao\"): [true] = " + prefisso((""),("ciao")));
		
		/* La stringa t è vuota e la stringa s no */
		System.out.println("prefisso s = (\"ciao\"), t = (\"\"): [false] = " + prefisso(("ciao"),("")));
		
		/* Condizione verificata */
		System.out.println("prefisso s = (\"auto\"), t = (\"automobile\"): [true] = " + prefisso(("auto"),("automobile")));
		
		/* Condizione non verificata */
		System.out.println("prefisso s = (\"auto\"), t = (\"lauto pasto\"): [false] = " + prefisso(("auto"),("lauto pasto")));
		
		/* Stringhe uguali */
		System.out.println("prefisso s = (\"moto\"), t = (\"moto\"): [true] = " + prefisso(("moto"),("moto")));
		
		/* Prefisso di una lettera */
		System.out.println("prefisso s = (\"c\"), t = (\"ciao\"): [true] = " + prefisso(("c"),("ciao")));
		
		/* Suffisso */
		System.out.println("prefisso s = (\"bello\"), t = (\"bellissimo\"): [false] = " + prefisso(("bello"),("bellissimo")));
		
		/* Errore di uno (dall'inizio) */
		System.out.println("prefisso s = (\"pre\"), t = (\"recesso\"): [false] = " + prefisso(("pre"),("recesso")));
		
		/* Errore di uno (dalla fine) */
		System.out.println("prefisso s = (\"anti\"), t = (\"antagonista\"): [false] = " + prefisso(("anti"),("antagonista")));
		
	}

}
