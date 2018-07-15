package Ordinamenti;

public class OrdinamentiConStampa {
	
	public static void main(String[] args) {
		int[] a = new int[]{33,7,544,0,67,4};
		selectionSort(a);
		bubbleSort(a);
		insertionSort(a);
	}
	
	public static void stampa(int[] a) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+ " ");
		System.out.println();
	}
	
	///// SELECTION SORT
	/* Scambia gli elementi di indice i e j di dati. */
	private static void scambia(int[] dati, int i, int j) {
		// pre: dati!=null && 0 <= i,j < dati.length
		int temp; // variabile di supporto per lo scambio
		/* scambia dati[i] con dati[j] */
		temp = dati[i];
		dati[i] = dati[j];
		dati[j] = temp;
	}
	
	/* calcola la posizione in cui si trova il minimo in
	* una porzione dell'array a compresa tra inf e sup */
	public static int min(int[] a, int inf, int sup){
		int i,indmin;
		indmin = inf;
		for (i = inf+1; i <= sup; i++) {
		    if (a[i] < a[indmin])
		        indmin = i;
		}
		return indmin;
	}
	
	/* selection sort */
	public static void selectionSort(int[] v) {
		int n;
		n = v.length;
		for (int i = 0; i < n-1; i++) {
		    scambia(v,i,min(v,i,n-1));
		    stampa(v);
		}
	}
	
	///// BUBBLE SORT
	public static void bubbleSort(int[] v) {
		int n = v.length;
		int i, j;
		boolean fattoscambio, finito = false;
		i=0; /* fatte 0 passate */
		while (!finito) {
		    i=i+1;
		    fattoscambio = false;
		    for (j=0; j<n-i; j++ )
		        if (v[j]>v[j+1]) {
		            scambia(v,j,j+1);
		            fattoscambio = true;
		        }
		    stampa(v);
		    if ((!fattoscambio)||(i==n-1))
		        finito = true;
	    }
    }
	
	///// INSERTION SORT
	/* Ordina l'array dati in modo non decrescente.
	*  Ordinamento per inserzione. */
	public static void insertionSort(int[] dati) {
		// pre: dati!=null
		int n; // lunghezza di dati
		int i; // indice per la scansione di dati
		int ordinati; // numero di elementi
		// "relativamente ordinati"
		int corrente; // elemento da "ordinare"
		boolean ins; // è possibile inserire corrente
		// tra gli "relativamente ordinati"
		n = dati.length;
		/* esegue n-1 passate */
		for (ordinati=1; ordinati<n; ordinati++) {
		    /* gli elementi "relativamente ordinati" sono
		    * quelli di indice tra 0 e ordinati */
		    /* viene "ordinato" il primo elemento
		    * tra i "non relativamente ordinati" */
		    corrente = dati[ordinati];
		    ins = false;
		    i = ordinati;
		    while (!ins && i>0)
		        if (corrente<dati[i-1]) { // sposta verso dx
		            dati[i] = dati[i-1];
		            i--;
		        } else
		            ins = true;
		    /* inserisce corrente tra i "rel. ordinati" */
		    dati[i] = corrente;
		    /* ora gli elementi "rel. ordinati" sono quelli
		    * di indice compreso tra 0 e ordinati */
		    stampa(dati);
		}
	}

}
