package Stringhe;

/* classe per illustrare concetti sulle conversioni */
public class Conversioni {
	/* metodo che calcola la radice quadrata intera */
	public static int radiceQuadrataIntera(int radicando) {
		return (int) Math.sqrt(radicando);
	}

	/* metodo che verifica se una stringa contiene un carattere alfabetico */ 
	public static boolean contieneCarattereAlfabetico(String s) {
		boolean trovato = false;	// hai trovato un carattere alfabetico?		
		char c;						// generico carattere della stringa
		/* guarda tutti i caratteri della stringa */
		for(int i=0; i<s.length(); i++) {
			c = s.charAt(i);
			/* il carattere e' alfabetico? */
			if((('a'<=c) && (c<='z'))||(('A'<=c) && (c<='Z')))
				trovato = true;
		}
		return trovato;
	}
	
	/* metodo che prende un carattere e lo restituisce, dopo averlo reso
	 * maiuscolo se era un carattere alfabetico minuscolo */ 
	public static char restituisceCarattereMaiuscolo(char c) {
		/* verifica se il carattere e' alfabetico minuscolo */
		if(c>='a' && c<='z')
			/* rendilo maiuscolo */
			c = (char) (c + 'A' - 'a'); 
		return c;
	}
	
	/* metodo che restituisce la cifra corrispondente ad un carattere o -1 */
	public static int restituisceCifra(char c) {
		int res = -1;		// valore da restituire
		/* se il carattere rappresenta una cifra */
		if(c>='0' && c<='9')
			res = c - '0';
		return res;
	}
}