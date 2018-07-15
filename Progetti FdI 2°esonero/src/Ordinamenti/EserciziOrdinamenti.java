package Ordinamenti;

import ArrayDiOggetti.Rettangolo;

public class EserciziOrdinamenti {
	
	private static void scambia(Rettangolo[] r, int i, int j) {
		// pre: dati!=null && 0 <= i,j < dati.length
		Rettangolo temp; // variabile di supporto per lo scambio
		/* scambia dati[i] con dati[j] */
		temp = r[i];
		r[i] = r[j];
		r[j] = temp;
	}
	
	/* metodo che ordina in modo crescente un array di oggetti Rettangolo in base all'area */
	public static void bubbleSortAree(Rettangolo[] r) {
		int n = r.length;
		int i, j;
		boolean fattoscambio, finito = false;
		i=0; /* fatte 0 passate */
		while (!finito) {
		    i=i+1;
		    fattoscambio = false;
		    for (j=0; j<n-i; j++ )
		        if (r[j].area()>r[j+1].area()) {
		            scambia(r,j,j+1);
		            fattoscambio = true;
		        }
		    if ((!fattoscambio)||(i==n-1))
		        finito = true;
	    }
    }
	
	/* metodo che ordina in modo crescente un array di oggetti Rettangolo in base ai lati */
	public static void bubbleSortLati(Rettangolo[] r) {
		int n = r.length;
		int i, j;
		boolean fattoscambio, finito = false;
		i=0; /* fatte 0 passate */
		while (!finito) {
		    i=i+1;
		    fattoscambio = false;
		    for (j=0; j<n-i; j++) {
		        if (r[j].getLato1()>r[j+1].getLato1()) {
		            scambia(r,j,j+1);
		            fattoscambio = true;
		        }
		        if(r[j].getLato1()==r[j+1].getLato1()) {
		        	if(r[j].getLato2()>r[j+1].getLato2()) {
		        		scambia(r,j,j+1);
			            fattoscambio = true;
		        	}
		        }
		    }
		    if ((!fattoscambio)||(i==n-1))
		        finito = true;
	    }
    }
	
	public static void scambia(int[] dati, int i, int j) {
		// pre: dati!=null && 0 <= i,j < dati.length
		int temp; // variabile di supporto per lo scambio
		/* scambia dati[i] con dati[j] */
		temp = dati[i];
		dati[i] = dati[j];
		dati[j] = temp;
	}
	
	/* metodo per mischiare gli elementi di un array di interi */
	public static int[] mischia(int[] a) {
		int n = a.length;
		int x,y;
		for(int i=0; i<1000; i++) {
			do {
				x = (int)(n*Math.random());
			    y = (int)(n*Math.random());	
			}
			while(x==y);
		    scambia(a,x,y);
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{3,45,9,25,865,47,12};
		int[] v = mischia(a);
		for(int i=0; i<v.length; i++)
			System.out.print(v[i]+ " ");
	}
}
