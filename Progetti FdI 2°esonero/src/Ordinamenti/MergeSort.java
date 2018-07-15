package Ordinamenti;

public class MergeSort {
	
	/* merge sort */
	public static void mergesort(int v[]) {
		msort(v,0,v.length-1); 
	}
	
	/* metodo che applica l'ordinamento per fusione */
	private static void msort(int[] v,
		int inf, int sup) {
		if (inf < sup) {
		    int med = (inf+sup)/2;
		    msort(v,inf,med);
		    msort(v,med+1,sup);
		    merge(v,inf,med,sup);
		}
	}
	
	/* metodo per la fusione */
	private static void merge(int[] v, int inf, int med, int sup) {
		int[] a = new int[sup-inf+1];
		int i1 = inf;
		int i2 = med+1;
		int i = 0;
		while ((i1 <= med) && (i2 <= sup)) {
		// entrambi i vettori contengono elementi
		    if (v[i1] <= v[i2]) {
		        a[i] = v[i1];
		        i1++;
		    }
		    else {
		        a[i] = v[i2];
		        i2++;
		    }
		    i++;
		}
		if (i2 > sup) // e' finito prima il secondo pezzo del vettore
			for (int k = i1; k <= med; k++) {
			    a[i] = v[k];
			    i++;
			}
		else // e' finito prima il primo pezzo del vettore
			for (int k = i2; k <= sup; k++) {
			    a[i] = v[k];
			    i++;
			}
		// copiamo il vettore ausiliario nel vettore originario
		for(int k = 0; k < a.length; k++)
			v[inf+k] = a[k];
	}
}
