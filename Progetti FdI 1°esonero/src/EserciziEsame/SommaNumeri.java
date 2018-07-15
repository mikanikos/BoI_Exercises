package EserciziEsame;

/*  
* SPECIFICA
* Input: Una stringa s
* Pre-condizione: stringa s non nulla
* Output: un valore int sommatore
* Post-condizione: sommatore è uguale alla somma dei numeri che compaiono nella stringa s

* TIPO DI PROBLEMA 
* Accumulazione

* ALGORITMO
* 1. input(s)
* 2. sommatore = 0
* 3. i = 0
* 4. j = 0
* 5. num = 0
* 6. fintanto che (i < s.length())
*   6.1 se (s.charAt(i) >= '0' && s.charAt(i) <= '9') 
*	  6.1.1 piuCifre = false
*	  6.1.2 se (i != s.length()-1)
*	    6.1.2.1 j = i+1
*	    6.1.2.2 fintanto che (j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') 
*	      6.1.2.2.1 se (j+1 != s.length()-1)
*	        6.1.2.2.1.1 num = Integer.parseInt((s.substring(i,j+1)))
*	      6.1.2.2.2 altrimenti 
*	        6.1.2.2.2.1 num = Integer.parseInt((s.substring(j)))	
*	      6.1.2.2.3 piuCifre = true
*	      6.1.2.2.4 j++
*	  6.1.3 se (piuCifre) 
*	  6.1.3.1 sommatore = sommatore + num;
*	  6.1.3.2 i = j-1;
*	  6.1.4 altrimenti
*	  6.1.4.1 sommatore = sommatore + Integer.parseInt((String.valueOf(s.charAt(i))));
*	6.2 i++;
* 7. output(sommatore)
*/

public class SommaNumeri {
	
	public static void main(String[] args) {
		testSommaNumeri();
	}
	
	public static int sommaNumeri(String s) {
		
		/*int sommatore;
		int i,j;
		int num;
		boolean piuCifre;
		
		i = 0;
		j = 0;
		sommatore = 0;
		num = 0;
		
		 while (i < s.length()) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				piuCifre = false;
				if (i != s.length()-1) {
					j = i+1;
					while (j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') {
						if (j+1 != s.length()-1) {
							num = Integer.parseInt((s.substring(i,j+1)));
						}
						else
							num = Integer.parseInt((s.substring(j)));
							
					    piuCifre = true;
					    j++;
				    }
				}
				if (piuCifre) {
				    sommatore = sommatore + num;
				    i = j-1;
				}
			    else {
				    sommatore = sommatore + Integer.parseInt((String.valueOf(s.charAt(i))));
			    }
			}
			i++;
		}
		
		return sommatore; */
		
		int i,j;
		int somma = 0;
		String t = "0";
		
		for(i = 0; i < s.length(); i++) {
			j= 1;
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				t = s.charAt(i) + "";
				while ((i+j) < s.length() && s.charAt(i+j) >= '0' && s.charAt(i+j) <= '9' ) {
					t += s.charAt(i+j);
					j++;
				}
			    i += j;
			}
			somma += Integer.parseInt(t);
			t = "0";
		}
		
		return somma;
	}
	
	public static void testSommaNumeri() {
		
		/* Stringa s vuota */
		System.out.println("sommaNumeri (\"\") : [0] = " +sommaNumeri(""));
		
		/* Stringa s senza caratteri numerici */
		System.out.println("sommaNumeri (\"ciao a tutti\") : [0] = " +sommaNumeri("ciao a tutti"));
		
		/* Stringa s con un carattere numerico all'inizio della stringa */
		System.out.println("sommaNumeri (\"5ciao\") : [5] = " +sommaNumeri("5ciao"));
		
		/* Stringa s con un carattere numerico alla fine della stringa */
		System.out.println("sommaNumeri (\"macchina99\") : [99] = " +sommaNumeri("macchina99"));
		
		/* Stringa s con un carattere numerico in mezzo alla stringa  */
		System.out.println("sommaNumeri (\"mi chiamo 6 andrea\") : [6] = " +sommaNumeri("mi chiamo 6 andrea"));
		
		/* Stringa s con più caratteri numerici all'interno della stringa */
		System.out.println("sommaNumeri (\"SVEGLIA!1!1!11!@@2\") : [15] = " +sommaNumeri("SVEGLIA!1!1!11!@@2"));
		
		/* Stringa s con solo caratteri numerici */
		System.out.println("sommaNumeri (\"34923\") : [34923] = " +sommaNumeri("34923"));
		
		/* Stringa s composta da un solo carattere non numerico */
		System.out.println("sommaNumeri (\"f\") : [0] = " +sommaNumeri("f"));
		
		/* Stringa s composta da un solo carattere numerico */
		System.out.println("sommaNumeri (\"3\") : [3] = " +sommaNumeri("3"));
		
		/* Stringa esempio */
		System.out.println("sommaNumeri (\"cinque5sei66\") : [71] = " +sommaNumeri("cinque5sei66"));
		
	}

}
