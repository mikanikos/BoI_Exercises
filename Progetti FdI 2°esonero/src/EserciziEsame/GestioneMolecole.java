package EserciziEsame;

/* classe per la gestione di oggetti Molecola */
public class GestioneMolecole {	
	
	/* metodo che restituisce un array di molecole formate da un certo atomo */
	public static Molecola[] stessoAtomo(Molecola[] m, Atomo a) {
		Molecola[] nuovo;  // array di Oggetti Molecola
		int i;             // contatore
		int lun = 0;       // variabile lunghezza nuovo array, inizializzato a 0
		int j = 0;         // contatore
		/* si ispeziona ogni elemento dell'array dato come parametro e se 
		 * si trovo una molecola costituita dall'atomo cercato si aumenta 
		 * di 1 la lunghezza del nuovo array */
		for(i=0; i<m.length; i++)
			if((m[i].getAtomo1() == a) || (m[i].getAtomo2() == a) || (m[i].getAtomo3() == a))
				lun++;
		// creazione array di oggetti Molecola
		nuovo = new Molecola[lun];
		/* si ripete l'ispezione, stavolta per memorizzare dentro l'array 
		 * l'elemento che soddifa la condizione */
		for(i=0; i<m.length; i++)
			if((m[i].getAtomo1() == a) || (m[i].getAtomo2() == a) || (m[i].getAtomo3() == a)) {
				nuovo[j] = m[i];
				j++;
			}
		/* restituito l'array al metodo invocatore */
		return nuovo;
	}
	
	/* metodo che ordina l'array in base al numero atomico del primo atomo, a parità per il secondo */
	public static void ordinaMolecole(Molecola[] m) {
		selectionSortRic(m,0,m.length);
	}
	
	/* metodo di ordinamento per oggetti Molecola */
	public static void selectionSortRic(Molecola[] m, int i, int n) {
		if (i < n-1)
			selectionSortRic(scambiaMolecola(m,i,minMolecola(m,i,n-1)), i+1, n);
	}
	
	/* metodo per scambiare due oggetti Molecola in un array */
	private static Molecola[] scambiaMolecola(Molecola[] dati, int i, int j) {
		Molecola temp; 
		temp = dati[i];
		dati[i] = dati[j];
		dati[j] = temp;
		return dati;
	}
	
	/* metodo che effettua l'ordinamento */
	private static int minMolecola(Molecola[] m, int inf, int sup){
		int i,indmin;
		indmin = inf;
		for(i=inf+1; i<=sup; i++) {
			if(m[i].getAtomo1().getZ() < m[indmin].getAtomo1().getZ())
				indmin = i;
			else {
				if(m[i].getAtomo1().getZ() == m[indmin].getAtomo1().getZ())
					if(m[i].getAtomo2().getZ() == m[indmin].getAtomo2().getZ())
						indmin = i;
			}
		}
		return indmin;
	}
	
	/* metodo main */
	public static void main(String[] args) {
		testMolecole();
	}
	
	/* classe di test per i metodi */
	public static void testMolecole() {
		// creazione Atomi
		Atomo H = new Atomo('H', 1, 1, 1, 1);
		Atomo C = new Atomo('C', 6, 12, 2, 14);
		Atomo O = new Atomo('O', 8, 16, 2, 16);
		Atomo P = new Atomo('P', 15, 31, 3, 15);
		Atomo K = new Atomo('K', 19, 39, 4, 1);
		// creazione array di Molecole
		Molecola[] prova;
		prova = new Molecola[5];
		prova[0] = new Molecola(P,K,C);
		prova[1] = new Molecola(K,H,P);
		prova[2] = new Molecola(P,O,H);
		prova[3] = new Molecola(H,H,O);
		prova[4] = new Molecola(C,O,O);
		
		System.out.println("L'array di molecole che contiene K è ");
		stampaMolecola(stessoAtomo(prova,K));
		System.out.println("L'array di molecole ordinate in base al numero atomico ");
		ordinaMolecole(prova);
		stampaMolecola(prova);
	}
	
	/* stampa array */
	public static void stampaMolecola(Molecola[] m) {
		for(int i=0; i<m.length; i++)
			System.out.print(m[i].toString() + " ");
		System.out.println();
	}

}
