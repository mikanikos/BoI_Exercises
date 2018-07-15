package EserciziEsame;

/*  
* SPECIFICA
* Input: Una stringa s
* Pre-condizione: s non nulla
* Output: una variabile int sommatore
* Post-condizione: sommatore è uguale alla somma dei caratteri numerici che compaiono nella stringa

* TIPO DI PROBLEMA 
* Conteggio

* ALGORITMO
* 1. input(s)
* 2. sommatore = 0
* 3. i = 0
* 4. fintanto che (i < lunghezza della stringa s)
*   4.1 se (carattere alla posizione i è una cifra(da 1 a 9) e il carattere a i+1 non è l'ultimo)
*     4.1.1 sommatore = sommatore + cifra rappresentata dal carattere numerico
*   4.2 i++;
* 5. output(sommatore) 
*/

/* classe per calcolare la somma dei caratteri numerici di una stringa */
public class SommaCaratteriNumerici {
	
	/* metodo principale */
	public static void main(String[] args) {
		
		/* invocazione metodo di test */
		testSommaCaratteriNumerici();
	}
	
	/* metodo per il calcolo della somma dei caratteri numerici di una stringa */
	public static int sommaCaratteriNumerici(String s) {
		
		/* dichiarazioni */
		int sommatore;  // variabile sommatore
		int i;          // variabile contatore
		
		/* assegnazioni */
		sommatore = 0;  // inizialmente sommatore vale 0
		i = 0;          // variabile contatore inzializzata a 0
		
		/* finanto che i è minore della lunghezza della stringa s esegui il corpo del while
		 * e poi incrementa i di 1 */
		for (i = 0; i < s.length(); i++) {
			/* se il carattere alla posizione i è numerico e il carattere di i+1 non è l'ultimo
			 * aggiungi a sommatore la cifra rappresentata dal carattere numerico */
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && i+1 <= s.length()) 
				sommatore = sommatore + Integer.parseInt(s.substring(i,i+1));			
		}
		
		/* viene restituito il valore al metodo invocatore */
		return sommatore;
	}
	
	/* metodo di test */
	public static void testSommaCaratteriNumerici() {
		
		/* Stringa vuota */
		System.out.println("sommaCaratteriNumerici (\"\") : [0] = " +sommaCaratteriNumerici(""));
		
		/* Stringa con un carattere numerico */
		System.out.println("sommaCaratteriNumerici (\"3\") : [3] = " +sommaCaratteriNumerici("3"));
		
		/* Stringa con un carattere non numerico */
		System.out.println("sommaCaratteriNumerici (\"a\") : [0] = " +sommaCaratteriNumerici("c"));
		
		/* Stringa con più caratteri solo numerici */
		System.out.println("sommaCaratteriNumerici (\"5732\") : [17] = " +sommaCaratteriNumerici("5732"));
		
		/* Stringa con più caratteri non numerici */
		System.out.println("sommaCaratteriNumerici (\"ciao a tutti\") : [0] = " +sommaCaratteriNumerici("ciao a tutti"));
		
		/* Stringa con caratteri sia numerici che non numerici */
		System.out.println("sommaCaratteriNumerici (\"SVEGLIA!1!1!11!@@2\") : [6] = " +sommaCaratteriNumerici("SVEGLIA!1!1!11!@@2"));
		
		/* Stringa con carattere numerico all'inizio */
		System.out.println("sommaCaratteriNumerici (\"8ciao\") : [8] = " +sommaCaratteriNumerici("8ciao"));
		
		/* Stringa con carattere numerico alla fine */
		System.out.println("sommaCaratteriNumerici (\"macchina91\") : [10] = " +sommaCaratteriNumerici("macchina91"));
		
		/* Stringa con carattere numerico all'interno */
		System.out.println("sommaCaratteriNumerici (\"aiuto 53per favore\") : [8] = " +sommaCaratteriNumerici("aiuto 53per favore"));
		
		/* Stringa esempio */
		System.out.println("sommaCaratteriNumerici (\"cinque5sei66\") : [17] = " +sommaCaratteriNumerici("cinque5sei66"));
	}

}
