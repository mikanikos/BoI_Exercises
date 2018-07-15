package EserciziEsame;

/*
SPECIFICA
* Input: Una stringa s
* Pre-condizione: s non nulla e non vuota
* Output: un valore intero contatore
* Post-condizione: contatore è uguale al numero di parole che compongono la stringa
* 
* TIPO DI PROBLEMA 
* Conteggio
*/

public class ContaParole {
	
	public static void main(String[] args) {
		testContaParole();
	}
	
	public static int contaParole(String s) {
		
		int contatore;
		int i,j;
		boolean fineParola;
		
		j=0;
		contatore = 0;
		
		for (i = 0; i < s.length(); i=j+1) {
			j = i;
			fineParola = false;
			if (s.charAt(i) != ' ') {
				while (j <= s.length()-1 && !fineParola) {
					if (s.charAt(j) == ' ' || j == s.length()-1){
						contatore++;
						fineParola = true;
						j--;
					}
					j++;
				}
			}
		}
		
		return contatore;
	}
	
	public static void testContaParole() {
		
		/* Stringa s con una sola parola */
		System.out.println("contaParole (\"ciao\") : [1] = " + contaParole("ciao"));
		
		/* Stringa s con due parole */
		System.out.println("contaParole (\"ciao amico\") : [2] = " + contaParole("ciao amico"));
		
		/* Stringa s con una sola parola ma che finisce con uno spazio */
		System.out.println("contaParole (\"ciao \") : [1] = " + contaParole("ciao "));
		
		/* Stringa s con una sola parola ma che inizia con uno spazio */
		System.out.println("contaParole (\" ciao\") : [1] = " + contaParole(" ciao"));
		
		/* Stringa s con due parole separate da doppio spazio */
		System.out.println("contaParole (\"ciao  amico\") : [2] = " + contaParole("ciao  amico"));
		
		/* Stringa s composta da una sola lettera */
		System.out.println("contaParole (\"c\") : [1] = " + contaParole("c"));
		
		/* Stringa s con una parola con altri caratteri */
		System.out.println("contaParole (\"aspetta…Eccola!\") : [1] = " + contaParole("aspetta…Eccola!"));
		
		/* Stringa s 4 parole */
		System.out.println("contaParole (\"quant’è lunga questa stringa\") : [4] = " + contaParole("quant’è lunga questa stringa"));
		
		/* Stringa s con diversi spazi e diverse parole */
		System.out.println("contaParole (\"  guarda   quante complicazioni      \") : [3] = " + contaParole("  guarda   quante complicazioni      "));
		
		/* Stringa con solo spazi */
		System.out.println("contaParole (\"    \") : [0] = " + contaParole("    "));
		
	}

}
