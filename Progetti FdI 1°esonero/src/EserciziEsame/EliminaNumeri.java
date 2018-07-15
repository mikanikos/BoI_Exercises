package EserciziEsame;

/*  
SPECIFICA
* Input: Una stringa s
* Pre-condizione: s non nulla
* Output: una stringa noNum
* Post-condizione: noNum è uguale a s senza nessun carattere numerico
* 
* TIPO DI PROBLEMA: Ricerca
*  
* ALGORITMO
* 1. input(s)
* 2. noNum = s
* 3. i = 0 
* 4. fintanto che (i < lunghezza di s)
*   4.1 se (carattere ad i è un numero) 
*     4.1.1 noNum = s - s.chatAt(i)
*     4.1.2 finanto che (j non è un carattere numerico)
*       4.1.1.1 noNum = nuNum + sottostringa da i fino a j 
*       4.1.1.2 j++;
*     4.1.3 i = j+1
* 5. output(contiene) */

/* classe per la creazione di una stringa senza numeri */
public class EliminaNumeri {
	/* metodo main */
	public static void main(String[] args) {
		/* invocazione metodo di test */
		testEliminaNumeri();
	}
	
	/* metodo per il calcolo di una stringa senza numeri */
	public static String eliminaNumeri(String s) {
		
		String noNum;
		int i, j;
		boolean noCifre;
		
		noNum = "";
		j = 0;
		i = 0;
		
		while (i < s.length()) {
			noCifre = false;
			j = i;
			while (j < s.length() && (s.charAt(j) != '0' && s.charAt(j) != '1' && s.charAt(j) != '2' && s.charAt(j) != '3' && 
					s.charAt(j) != '4' && s.charAt(j) != '5' && s.charAt(j) != '6' && 
					s.charAt(j) != '7' && s.charAt(j) != '8' &&  s.charAt(j) != '9')) {
				j++;
				noCifre = true;
			}
			if (noCifre) {
				noNum += s.substring(i,j);
				i = j-1;
			}
			i++;
		}
		
		/*int i,j;
		String noNum ="", t = "";
		
		for(i = 0; i < s.length(); i++) {
			j = 1;
			if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '3' && 
					s.charAt(i) != '4' && s.charAt(i) != '5' && s.charAt(i) != '6' && 
					s.charAt(i) != '7' && s.charAt(i) != '8' &&  s.charAt(i) != '9') {
				t = s.charAt(i) + "";
				while ((i+j) < s.length() && s.charAt(i+j) != '0' && s.charAt(i+j) != '1' && s.charAt(i+j) != '2' && s.charAt(i+j) != '3' && 
						s.charAt(i+j) != '4' && s.charAt(i+j) != '5' && s.charAt(i+j) != '6' && 
						s.charAt(i+j) != '7' && s.charAt(i+j) != '8' &&  s.charAt(i+j) != '9' ) {
					t += s.charAt(i+j);
					j++;
				}
			    i += j;
			}
			noNum += t;
		}*/
				
		return noNum;
	}
	
	/* metodo di test */
	public static void testEliminaNumeri() {
		
		/* Stringa vuota */
		System.out.println("eliminaNumeri (\"\") : [] : " +eliminaNumeri("") );
		
		/* Stringa con un solo carattere numerico */
		System.out.println("eliminaNumeri (\"5\") : [] : " +eliminaNumeri("5") );
		
		/* Stringa con un solo carattere non numerico */
		System.out.println("eliminaNumeri (\"!\") : [!] : " +eliminaNumeri("!") );
		
		/* Stringa con caratteri solo numerici */
		System.out.println("eliminaNumeri (\"4893734\") : [] : " +eliminaNumeri("4893734") );
		
		/* Stringa con caratteri solo non numerici */
		System.out.println("eliminaNumeri (\"ciao a tutti\") : [ciao a tutti] : " +eliminaNumeri("ciao a tutti") );
		
		/* Stringa con caratteri sia numerici che non numerici */
		System.out.println("eliminaNumeri (\"2il tre3 marzo ci5 5sono 800due capre4!9\") : [il tre marzo ci sono due capre!] : " +eliminaNumeri("2il tre3 marzo ci5 5sono 800due capre4!9") );
		
		/* Stringa con carattere numerico alla fine */
		System.out.println("eliminaNumeri (\"ciao9\") : [ciao] : " +eliminaNumeri("ciao9") );
		
		/* Stringa con carattere numerico all'inizio */
		System.out.println("eliminaNumeri (\"44miao\") : [miao] : " +eliminaNumeri("44miao") );
		
		/* Stringa con carattere numerico in mezzo */
		System.out.println("eliminaNumeri (\"ecco3ci\") : [eccoci] : " +eliminaNumeri("ecco3ci") );
		
		
	}
}
