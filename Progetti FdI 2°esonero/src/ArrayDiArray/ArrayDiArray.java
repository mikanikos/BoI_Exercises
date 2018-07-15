package ArrayDiArray;

public class ArrayDiArray {

	public static void main(String[] a) {
		System.out.println(unoARettangolo(new int[][] {{2,2,2,2},{2,1,1,2},{2,1,1,2}}));
	}
	
	/* metodo che calcola e restituisce la matrice identita' */
	public static int[][] identita(int n) {
		int[][] matrice;		// array bidimensionale
		matrice = new int[n][n];
		int i, j;		// contatori
		/* guarda tutti gli elementi della matrice */
		for(i=0; i<n; i++)
			for(j=0; j<n; j++)
				/* un elemento e' 1 solo se e' sulla diagonale altrimenti e' pari a 0 */
				if(i==j)
					matrice[i][j]=1;
				else
					matrice[i][j]=0;
		return matrice;
	}

	/* metodo che calcola e restituisce la matrice composta dai numeri 1,..., r*c,
	 * ordinati alto-basso e sinistra-destra */
	public static int[][] numeriNaturali(int r, int c) {
		int[][] matrice;		// array bidimensionale
		matrice = new int[r][c];
		int i, j;		// contatori
		/* guarda tutti gli elementi della matrice */
		for(i=0; i<r; i++)
			for(j=0; j<c; j++)
				/* l'elemento con indici i e j ha valore c*i + j + 1 */
				matrice[i][j] = c*i + j + 1;
		return matrice;
	}

	/* metodo che verifica se una matrice e' diagonale */
	public static boolean diagonale(int[][] matrice) {
		boolean diagonale = true;					// variabile di universalita'
		int i, j;										// contatori
		/* verifica se e' una matrice quadrata */
		i = 0;
		while(i<matrice.length && diagonale) {
			if(matrice.length!=matrice[i].length) 	// numero righe diverso dal numero colonne?
				diagonale = false;
			i++;
		}
		/* visita la matrice riga per riga */
		i = 0;
		while(i<matrice.length && diagonale) {
			j = 0;	// visita tutta la riga
			while(j<matrice[i].length && diagonale) {
				if((i!=j && matrice[i][j]!=0))
					diagonale = false;
				j++;
			}
			i++;
		}
		return diagonale;
	}
	
	/* metodo che visualizza un array di array sullo schermo */
	public static void visualizza(int[][] arrayDiArray){
		int i,j;		// contatori
		/* scansione per riga */
		for(i=0; i<arrayDiArray.length; i++) {
			for(j=0; j<arrayDiArray[i].length; j++)
				System.out.print(arrayDiArray[i][j] + " ");
			System.out.println();	// a capo dopo la fine riga
		}
	}
	
	/* metodo che calcola e restituisce la somma degli 
	 * elementi di un array di array */
	public static int somma(int[][] array){
		int i,j;		// contatori
		int somma = 0;		// variabile accumulazione
		
		/* scansione per riga */
		for(i=0; i<array.length; i++)
			for(j=0; j<array[i].length; j++)
				somma += array[i][j];
		return somma;
	}

	/* metodo che calcola la somma degli elementi di un array */
	public static int somma(int[] array){
		int somma = 0;		// variabile accumulazione
		
		/* somma ciascun elemento */
		for(int i=0; i<array.length; i++)
			somma += array[i];
		return somma;
	}

	/* metodo che calcola e restituisce la somma degli elementi di un array di array */
	public static int somma2(int[][] array){
		int somma = 0;		// variabile accumulazione
		
		/* somma ogni riga */
		for(int i=0; i<array.length; i++)
			somma += somma(array[i]);
		return somma;
	}
	
	/* metodo che restituisce i massimi delle righe dell'array dato */
	public static int[] massimi(int[][] matrice) {
		int[] massimi;						// array da calcolare
		massimi = new int[matrice.length];	// un elemento per ciascuna riga
		int max;							// variabile per il massimo
		
		/* guarda tutte le righe della matrice */
		for(int i=0; i<matrice.length; i++) {
			max = matrice[i][0];	// inizializza il max al primo elemento della riga
			/* guarda tutti gli elementi della riga */
			for(int j=1; j<matrice[i].length; j++) 
				if(matrice[i][j]>max)
					max = matrice[i][j];
			massimi[i]=max;
		}
		
		return massimi;
	}

	/* metodo che verifica se due array sono uguali */
	public static boolean uguali(int[][] a, int[][] b) {
		boolean uguali = true;		// variabile universale
		int i, j;		// contatori
		
		/* verifica se uno dei due e' nullo e l'altro no */
		if((a==null && b!=null) || (a!=null && b==null))
			uguali = false;
		else { // entrambi non nulli o entrambi nulli
			if(a!=null && b!=null) { // se sono entrambi nulli sono uguali
				/* stessa lunghezza? */
				if(a.length!=b.length)
					uguali = false;
				else {
					i = 0;
					while(uguali && i<a.length) {
						/* esamina la riga con indice i */
						if((a[i]==null && b[i]!=null)|| (a[i]!=null && b[i]==null))
							uguali = false;
						else {// entrambi non nulli o entrambi nulli
							/* stessa lunghezza? */
							if(a[i].length!=b[i].length)
								uguali = false;
							else {
								j = 0;
								if(a[i]!=null && b[i]!=null) // se sono entrambi nulli sono uguali 
									while(uguali && j<a[i].length) {
										if(a[i][j]!=b[i][j])
											uguali = false;
										j++;
									}
							}
						}
						i++;
					}
				}
			}
		}
		return uguali;
	}
	
	/* metodo che esegue il prodotto righe per colonne di due matrici */
	public static int[][] prodottoRigheColonne(int[][] a, int[][] b) {
		//pre: a e b sono due matrici bidimensionali non nulle, ed 
		// il numero di colonne di a e' pari al numero di righe di b
		
		int[][] risultato;		// matrice risultato
		risultato = new int[a.length][b[0].length]; // stesse righe di a, stesse colonne di b
		
		/* elemento i,j del risultato e' pari al prodotto della riga i di a per la colonna j di b */
		for(int i = 0; i<a.length; i++)
			for(int j = 0; j<b[0].length; j++)
				risultato[i][j] = prodottoScalare(a,b,i,j);
		return risultato;
	}
	
	/* metodo che esegue il prodotto scalare fra una riga ed una colonna di due matrici */
	public static int prodottoScalare(int[][] a, int[][] b, int i, int j) {
		int res = 0;		// accumulatore
		/* la riga i di a e' lunga quanto la colonna j di b */
		for(int k = 0;	k<a[i].length; k++)
			res += a[i][k] * b[k][j];

		return res;
	}
	
	/* metodo che calcola le prime n righe del triangolo di tartaglia */
	public static int[][] tartaglia(int n) {
		int i, j; 				// contatori
		int[][] tart;			// la matrice da calcolare
		tart = new int[n][n];	// e' una matrice n per n
		
		/* la prima riga ha un solo valore significativo */
		tart[0][0]=1;
		
		/* vedi una riga alla volta, dalla seconda */
		for(i=1;i<n;i++) {
			/* la riga con indice i ha i+1 numeri, il primo e l'ultimo =1 */
			tart[i][0]=1;
			tart[i][i]=1;
			/* ogni altro numero e' pari alla somma dei due ``sopra'' */
			for(j=1;j<i;j++) 
				tart[i][j]=tart[i-1][j-1]+tart[i-1][j];
		}
		return tart;
	}

	/* metodo che calcola le prime n righe del triangolo di tartaglia */
	public static int[][] tartaglia2(int n) {
		int i, j; 				// contatori
		int[][] tart;			// la matrice da calcolare
		tart = new int[n][];	// e' una matrice con n righe
		int[] riga;				// una riga
		
		/* la prima riga ha un solo significativo */
		tart[0] = new int[] {1};
		
		/* vedi una riga alla volta, dalla seconda */
		for(i=1;i<n;i++) {
			/* la riga con indice i ha i+1 numeri, il primo e l'ultimo =1 */
			riga = new int[i+1];
			riga[0]=1;
			riga[i]=1;
			/* ogni altro numero e' pari alla somma dei due ``sopra'' */
			for(j=1;j<i;j++) 
				riga[j]=tart[i-1][j-1]+tart[i-1][j];
			tart[i] = riga;
		}
		return tart;
	}

	/* metodo che calcola e restituisce la matrice composta dai numeri 1,..., n^2, 
	 * ordinati a spirale */
	public static int[][] spirale(int n) {
		int[][] matrice;			// l'array bidimensionale da costruire
		matrice = new int[n][n];	// matrice quadrata
		int numero = 1;				// prossimo numero da inserire nella matrice
		/* scrivi numeri su una cornice alla volta. Ci sono (n+1)/2 cornici */
		for(int offset=0; offset<(n+1)/2; offset++) {
			/* scrivi i numeri sulla parte alta della cornice attuale */
			for(int i=offset; i<=n-offset-1;i++) {
				matrice[offset][i]=numero;
				numero++;
			}
			/* scrivi i numeri sulla parte destra della cornice attuale */
			for(int i=offset+1; i<=n-offset-1;i++) {
				matrice[i][n-offset-1]=numero;
				numero++;
			}
			/* scrivi i numeri sulla parte bassa della cornice attuale */
			for(int i=n-offset-2; i>=offset;i--) {
				matrice[n-offset-1][i]=numero;
				numero++;
			}
			/* scrivi i numeri sulla parte sinstra della cornice attuale */
			for(int i=n-offset-2; i>=offset+1;i--) {
				matrice[i][offset]=numero;
				numero++;
			}
		}
		return matrice;
	}

	/* metodo che verifica se tutti gli uno di una matrice formano un rettangolo */
	public static boolean unoARettangolo(int[][] matrice) {
		int minR = -1;		// indice di riga minimo in cui compare un uno
		int minC = -1;		// indice di colonna minimo in cui compare un uno		
		int maxR = -1;		// indice di riga massimo in cui compare un uno
		int maxC = -1;		// indice di colonna massimo in cui compare un uno

		/* in questa fase determiniamo l'estensione del rettangolo */
		for(int i=0; i<matrice.length;i++) {
			for(int j=0; j<matrice[i].length;j++) {
				/* il primo uno determina l'angolo in alto a sinistra del rettangolo */
				if(minR==-1 && matrice[i][j]==1) {
					minR = i;
					minC = j;
				}
				/* ogni volta che incontri un uno, aggiorna maxR e maxC */
				if(matrice[i][j]==1) {
					maxR=i;
					maxC=j;
				}			
			}
		}
		
		/* adesso verifichiamo se gli uno formano un rettangolo */
		boolean rettangolo;					// variabile di universalita'
		rettangolo = true;
		int i, j;							// contatori
		
		/* se non hai trovato nessun uno, allora OK, altrimenti... */
		if(minR!=-1) {
			i = 0;		// parti dalla prima riga
			while(i<matrice.length && rettangolo) {
				j = 0;		// parti dalla prima colonna
				while(j<matrice.length && rettangolo) {
					/* perdi se trovi un 1 fuori o un non 1 dentro al rettangolo */
					if((matrice[i][j]==1 && (i<minR || i>maxR || j<minC || j>maxC))||
						(matrice[i][j]!=1 && i>=minR && i<=maxR && j>=minC && j<=maxC))
						rettangolo = false;
					j++;
				}
				i++;
			}		
		}
		return rettangolo;
	}

}