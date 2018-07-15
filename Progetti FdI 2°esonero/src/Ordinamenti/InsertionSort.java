package Ordinamenti;

public class InsertionSort {
	
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
		}
	}
	
	/* Ordina l'array dati in modo non crescente.
	*  Ordinamento per inserzione. */
	public static void insertionSortInverso(int[] dati) {
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
		        if (corrente>dati[i-1]) { // sposta verso dx
		            dati[i] = dati[i-1];
		            i--;
		        } else
		            ins = true;
		    /* inserisce corrente tra i "rel. ordinati" */
		    dati[i] = corrente;
		    /* ora gli elementi "rel. ordinati" sono quelli
		    * di indice compreso tra 0 e ordinati */
		}
	}
}
