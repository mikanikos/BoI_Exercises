package EserciziEsame;

/*
* SPECIFICA
* Input: Una stringa s
* Pre-condizione: Stringa s non nulla e non vuota
* Output: Valore di tipo char massimoChar
* Post-condizione: massimoChar è uguale al carattere la cui codifica è massima 

* TIPO DI PROBLEMA 
* Massimo

* ALGORITMO
* 1. input(s)
* 2. c = primo carattere di s
* 3. i = 0
* 4. fintanto che (i è minore della lunghezza della stringa s)
*   4.1 se (carattere alla posizione i di s è maggiore di c)
*     4.1.1 c = carattere alla posizione i di s
*   4.2 i++
* 5. output(c)
*/

/* classe per il calcolo del carattere massimo di una stringa */
public class CarattereMassimo {
	
	/* metodo main */
	public static void main(String[] args) {
		/* invocazione metodo di test */
		testCarattereMassimo();
	}
	
	/* metodo per il calcolo del carattere massimo di una stringa */
	public static char carattereMassimo(String s) {
		
		char c;
		int i;
		
		c = s.charAt(0);
		
		for (i = 1; i < s.length(); i++) {
			if (s.charAt(i) > c)
				c = s.charAt(i);
		}
		
		return c;
	}
	
	/* metodo di test */
	public static void testCarattereMassimo() {
		
		/* Stringa esempio */
		System.out.println("carattereMassimo (\"a%6~*&\") : [~] : " +carattereMassimo("a%6~*&"));
		
		/* Stringa esempio */
		System.out.println("carattereMassimo (\"abcde\") : [e] : " +carattereMassimo("abcde"));
		
		/* Stringa con 1 carattere */
		System.out.println("carattereMassimo (\"!\") : [!] : " +carattereMassimo("!"));
		
		/* Stringa con lo stesso carattere */
		System.out.println("carattereMassimo (\"gggggg\") : [g] : " +carattereMassimo("gggggg"));
		
		/* Stringa con carattere massimo all'inizio */
		System.out.println("carattereMassimo (\"aVDSJKVD\") : [a] : " +carattereMassimo("aVDSJKVD"));
		
		/* Stringa con carattere massimo alla fine */
		System.out.println("carattereMassimo (\"VDSJKVDu\") : [u] : " +carattereMassimo("VDSJKVDu"));
		
		/* Stringa con carattere massimo in mezzo */
		System.out.println("carattereMassimo (\"VDSJhKVD\") : [h] : " +carattereMassimo("VDSJhKVD"));
		
	}

}
