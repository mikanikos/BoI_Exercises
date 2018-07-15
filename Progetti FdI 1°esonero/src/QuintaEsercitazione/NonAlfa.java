package QuintaEsercitazione;

/*  
SPECIFICA
* Input: Una stringa s
* Pre-condizione: Una stringa non nulla
* Output: Un valore Booleano nonAlfa
* Post-condizione: se la stringa non contiene un carattere alfabetico nonAlfa Ë true, altrimenti Ë false

* TIPO DI PROBLEMA 
* Problema di verifica esistenziale

* ALGORITMO
* 1. Input(s)
* 2. i=0
* 3. fintanto che i Ë minore della lunghezza della stringa
*   3.1 j = charAt(i)
*   3.2 se la posizione del carattere j non Ë compresa tra le lettere maiuscole o minuscole
*     3.2.1 nonAlfa = true
*   3.3 altrimenti
*     3.3.1 i++
* 4. Output (nonAlfa)
*/ 

/* classe che, data una stringa, verifica se in essa Ë
 * presente almeno un carattere non alfabetico */
public class NonAlfa {
	
	/* metodo prinicipale che invoca il metodo di test */
	public static void main(String[] args) {
		/* invoca il metodo di test */
		testContieneNonAlfa();
	}
	
	/* Metodo che prende come parametro una stringa non nulla. 
	 * Il metodo restituisce true se nella stringa esiste un
	 * carattere non alfabetico (ovvero un carattere che non
	 * appartiene allíalfabeto inglese maiuscolo o minuscolo)
	 * e restituisce false altrimenti */
	public static boolean contieneNonAlfa(String s) {
		
		/* dichiarazioni */
		boolean nonAlfa;
		int i;
		
		/* inizializzazioni */
		i=0;
		nonAlfa=false;
		
		/* fintanto che i Ë minore della lunghezza della stringa
		 * vedi tutti i caratteri di s */
		while (i<s.length() && !nonAlfa) {
			/* se la posizione del carattere j non Ë compresa tra le lettere
			 * maiuscole o minuscole allora nonAlfa Ë true, altrimenti
			 * incrementa i di uno */
			if(s.charAt(i) < 'A' || (s.charAt(i) > 'Z' &&  s.charAt(i) < 'a') ||  s.charAt(i) > 'z' )
				nonAlfa = true;
			else
				i++;
		}
		/* restituisce il valore nonAlfa al metodo che lo ha invocato */
		return nonAlfa; 
	}
	
	/* metodo di test per la verifica di correttezza */
	public static void testContieneNonAlfa() {
		
		/* Stringa vuota */
		System.out.println("contieneNonAlfa () : [false] : " +contieneNonAlfa(""));
		/* Stringa con tutti i caratteri alfabetici minuscoli */
		System.out.println("contieneNonAlfa (buonasera) : [false] : " +contieneNonAlfa("buonasera"));
		/* Stringa con tutti i caratteri alfabetici maiuscoli */
		System.out.println("contieneNonAlfa (BUONASERA) : [false] : " +contieneNonAlfa("BUONASERA"));
		/* Stringa con caratteri alfabetici maiuscoli e minuscoli */
		System.out.println("contieneNonAlfa (bUoNasERa) : [false] : " +contieneNonAlfa("bUoNasERa"));
		/* Stringa con tutti i caratteri non alfabetici */
		System.out.println("contieneNonAlfa (6754%%^^.-) : [true] : " +contieneNonAlfa("6754%%^^.-"));
		/* Stringa con carattere non alfabetico alla fine */
		System.out.println("contieneNonAlfa(ciao5) : [true] : " +contieneNonAlfa("ciao5"));
		/* Stringa con carattere non alfabetico all'inizio */
		System.out.println("contieneNonAlfa (/ciao) : [true] : " +contieneNonAlfa("/ciao"));
		/* Stringa con carattere non alfabetico in mezzo alla stringa */
		System.out.println("contieneNonAlfa (buon6giorno) : [true] : " +contieneNonAlfa("buon∞giorno"));
		/* Stringa con un solo carattere alfabetico */
		System.out.println("contieneNonAlfa (f) : [false] : " +contieneNonAlfa("f"));
		/* Stringa con un solo carattere non alfabetico */
		System.out.println("contieneNonAlfa (&) : [true] : " +contieneNonAlfa("&"));
		/* Stringa con un spazio */
		System.out.println("contieneNonAlfa (cane e gatto) : [true] : " +contieneNonAlfa("cane e gatto"));
		/* Stringa con un solo spazi */
		System.out.println("contieneNonAlfa (     ) : [true] : " +contieneNonAlfa("     "));
		/* Stringa con vari caratteri non alfabetici (parentesi quadre, caratteri accentati ecc...) */
		System.out.println("contieneNonAlfa ([Ë‡++^£<-,ß Ú 1 ) : [true] : " +contieneNonAlfa("[Ë‡++^£<-,ß Ú 1 "));
	}

}