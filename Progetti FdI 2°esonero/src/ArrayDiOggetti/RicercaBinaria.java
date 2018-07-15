package ArrayDiOggetti;

public class RicercaBinaria {
	
	/* Ricerca chiave nell'array a ordinato in modo
	* non descrescente, restituendo l'indice di un
	* elemento di a uguale a chiave (oppure -1). */
	public static int ricercaBinaria(int[] a, int chiave) {
		
		// pre: a!=null && a è ordinato in modo non decrescente
		int posizione; // posizione di un elemento di a
		// uguale a chiave, se esiste
		int sinistra; // indice del primo elemento dello
		// spazio di ricerca
		int destra; // indice del primo elemento oltre
		// lo spazio di ricerca
		int centro; // indice dell'elemento centrale
		// dello spazio di ricerca
		boolean trovato; // vero se l’elemento viene trovato
		/* inizialmente lo spazio di ricerca comprende
		* tutti gli elementi di a */
		sinistra = 0;
		destra = a.length;
		trovato = false;
		/* cerca l'indice di un elemento di a uguale
		* a chiave, se esiste, mediante la ricerca binaria */
		posizione = -1;
		while (sinistra<destra && !trovato) {
		    centro = (sinistra+destra)/2;
		    if (a[centro]==chiave) { // trovato
		        trovato = true;
		        posizione = centro; 
		    }
		    else {
			    if (a[centro]>chiave) // continua a sinistra
		            destra = centro;
		        else // continua a destra
		            sinistra = centro+1;
		    }
		}
		
		return posizione;
	}
	
	/* metodo che calcola gli elelementi comuni tra due array ordinati
	 * in modo crescente con la ricerca binaria */
	public static int comuni(int[] a, int[] b) {
		
		int i, comuni = 0;
		/* ricerca degli elementi del primo array nel secondo con la ricerca binaria */
		for(i=0; i<a.length; i++) {
				if(ricercaBinaria(b, a[i]) != -1)
					comuni++;
		}
		return comuni;
	}
	
	/* esercizio */
	public static void main(String[] args) {
		
		int[] a;
		a = new int[] {0,1,3,4,7,9,12,16,22,34};
		
		/* vari input */
		System.out.println(ricercaBinaria(a,0));
		System.out.println(ricercaBinaria(a,-5));
		System.out.println(ricercaBinaria(a,22));
		System.out.println(ricercaBinaria(a,44));
		
		/* verifica metodo inserisci */
		int[] b = new int[] {3,5,6,8};
		for(int i=0; i<inserisci(b,4).length; i++)
			System.out.print(inserisci(b,4)[i]+ " ");
	}
	
	/* metodo che restituisce un nuovo array formato dall'array dato come 
	 * parametro e l'elemento dato inserito nell'ordine crescente */
	public static int[] inserisci(int[] a, int v) {
		
		int i=0, posizione=-1;
		boolean trovato = false;
		
		/* cerca la posizione in cui deve essere inserito il valore */
		while(i<a.length && !trovato) {
			if(a[i] >= v) {
				trovato = true;
				posizione = i;
			}
			i++;
		}
		if(posizione == -1)
			posizione = a.length;
		
		int[] b;
		/* se non esiste un elemento di a uguale a v allora copio gli elementi di a più v in b */
		if(ricercaBinaria(a,v) == -1) {
			b = new int[a.length+1];
			for(i=0; i<posizione; i++)
				b[i] = a[i];
			b[posizione] = v;
			for(i=posizione; i<a.length; i++)
				b[i+1] = a[i];
		}
		/* se v è già presente in a allora b è uguale ad a */
		else
			b = a;
		
		return b;
	}
}