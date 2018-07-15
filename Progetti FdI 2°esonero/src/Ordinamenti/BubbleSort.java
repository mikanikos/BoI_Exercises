package Ordinamenti;

public class BubbleSort {
	
	public static void scambia(int[] dati, int i, int j) {
		// pre: dati!=null && 0 <= i,j < dati.length
		int temp; // variabile di supporto per lo scambio
		/* scambia dati[i] con dati[j] */
		temp = dati[i];
		dati[i] = dati[j];
		dati[j] = temp;
	}
	
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
		    if ((!fattoscambio)||(i==n-1))
		        finito = true;
	    }
    }
}
