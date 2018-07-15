package Ordinamenti;

public class SelectionSort {
	
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
		for (int i = 0; i < n-1; i++)
		    scambia(v,i,min(v,i,n-1));
	}
	
	/* metodo basato sull’algoritmo di ordinamento per selezione che
	 * ordina un array di stringhe (rispetto all’ordinamento lessicografico) */
	public static int primaLettera(String[] a, int inf, int sup) {
		int i, indmin;
		indmin = inf;
		for(i=inf+1; i<=sup; i++) {
			if(a[i].charAt(0) < a[indmin].charAt(0))
				indmin = i;
		}
		return indmin;
	}
	
	public static void ordinaStringhe(String[] v) {
		int n;
		n = v.length;
		for (int i = 0; i < n-1; i++)
		    scambia(v,i,primaLettera(v,i,n-1));
	}
	
	private static void scambia(String[] dati, int i, int j) {
		// pre: dati!=null && 0 <= i,j < dati.length
		String temp; // variabile di supporto per lo scambio
		/* scambia dati[i] con dati[j] */
		temp = dati[i];
		dati[i] = dati[j];
		dati[j] = temp;
	}
	
	/* selection sort ricorsivo */
	public static int[] selectionSortRic(int [] v, int inf) {
		
		if (inf < v.length-1) {
			scambia(v,inf,min(v,inf,v.length-1));
			selectionSortRic(v,inf+1);
		}
		
		return v;
	}
}
