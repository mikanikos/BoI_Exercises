package EserciziEsame;

/*  
* SPECIFICA
* Input: Due stringhe, rispettivamente s e t
* Pre-condizione: Stringhe s e t non nulle e s <= t
* Output: Un valore int indiceMax
* Post-condizione: indiceMax contiene l'indice iniziale dell’ultima occorrenza di s 
* all’interno di t, oppure -1 se tale indice non esiste
* 
* TIPO DI PROBLEMA: Ricerca
* 
* ALGORITMO:
* 1. input(s,t)
* 2. indiceMax = primo indice della prima occorrenza di s in t
* 3. se (indiceMax != -1 && lunghezza di s != 0)
*   3.1 se (indiceMax + lunghezza di s < lunghezza di t -1)
*     3.1.1 diminutio = sottostringa a partire dall'indice dato dalla somma tra indiceMax e
*           e la lunghezza di s e la lunghezza di t)
*     3.1.2 fintanto che (lunghezza di diminutio > 0 && indice della prima occorrenza di s
*           in diminutio != -1)
*       3.1.2.1 indiceMax = lunghezza di t - lunghezza di diminutio + indice della prima 
*               occorrenza di s in diminutio
*       3.1.2.2 diminutio = sottostringa a partire da indiceMax fino alla lunghezza di diminutio
*  4. output(indiceMax)
*/

public class UltimaOccorrenza {
	
	public static void main(String[] args) {
		testUltimaOccorrenza();
	}
	
	public static int ultimaOccorrenza(String s, String t) {
		
		/* int indiceMax;
	    String diminutio;;
		
		indiceMax = t.indexOf(s);
		
		if (indiceMax != -1 && s.length() != 0) {
			if (indiceMax + s.length() < t.length()-1) {
			    diminutio = t.substring(indiceMax + s.length(), t.length());
			    while (diminutio.length() > 0 && diminutio.indexOf(s) != -1 ) {	
				    indiceMax = (t.length()-diminutio.length()) + diminutio.indexOf(s);
				    diminutio = diminutio.substring(indiceMax, diminutio.length());
			    }
		    }
		}
		
		return indiceMax; */
		
		int i, pos = -5;
		
		for (i = 0; i <= (t.length() - s.length()); i++) {
			if(t.substring(i,i + s.length()).equals(s))
				pos = i;
		}
		
		return pos;
	}
	
	public static void testUltimaOccorrenza() {
		
		/* Stringhe vuote */
		System.out.println("ultimaOccorrenza ((\"\"),(\"\")) : [0] = " + ultimaOccorrenza((""),("")));
		
		/* Condizione verificata (indice maggiore di 0) */
		System.out.println("ultimaOccorrenza ((\"ma\"),(\"mamma mia che macchina\")) : [14] = " + ultimaOccorrenza(("ma"),("mamma mia che macchina")));
		
		/* Condizione non verificata (indice uguale a -1) */
		System.out.println("ultimaOccorrenza ((\"ma\"),(\"mi sa che mi sono sbagliato\")) : [-1] = " + ultimaOccorrenza(("ma"),("mi sa che mi sono sbagliato")));
		
		/* s vuota e t no */
		System.out.println("ultimaOccorrenza ((\"\"),(\"ciao\")) : [0] = " + ultimaOccorrenza((""),("ciao")));
		
		/* Una occorrenza all'inizio */
		System.out.println("ultimaOccorrenza ((\"mi\"),(\"mi dispiace\")) : [0] = " + ultimaOccorrenza(("mi"),("mi dispiace")));
		
		/* Una occorrenza alla fine */
		System.out.println("ultimaOccorrenza ((\"a\"),(\"ricca\")) : [4] = " + ultimaOccorrenza(("a"),("ricca")));
		
		/* s e t uguali */
		System.out.println("ultimaOccorrenza ((\"dieci\"),(\"dieci\")) : [0] = " + ultimaOccorrenza(("dieci"),("dieci")));
		
		/* Due occorrenze di seguito */
		System.out.println("ultimaOccorrenza ((\"dum\"),(\"dumdumeeeee\")) : [3] = " + ultimaOccorrenza(("dum"),("dumdumeeeee")));
		
	}

}
