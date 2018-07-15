package ArrayDiOggetti;

import fiji.io.*;
public class SelectionSort{

	public static void main(String[] args){
		double[] a;

		a = new double[] { 1, 5, 0, 8, 5 };
		System.out.println("array letto: ");
		stampa(a);
		selectionSort(a);
		System.out.println("array ordinato: ");
		stampa(a);
		System.out.println("******************");
		a = new double[] { 1, 55, 0, 8, 5, 34, -2,27, 18, 0 };
		System.out.println("array letto: ");
		stampa(a);
		selectionSort(a);
		System.out.println("array ordinato: ");
		stampa(a);
		System.out.println("******************");
		a = new double[] { 1};
		System.out.println("array letto: ");
		stampa(a);
		selectionSort(a);
		System.out.println("array ordinato: ");
		stampa(a);

	}


	public static void selectionSort(double[] v) {
		  int n;
		  n = v.length;
		  for (int i = 0; i < n-1; i++)
			  scambia(v,i,min(v,i,n-1));
	}

/*calcola la posizione in cui si trova il minimo in una porzione dell'array a
  compresa tra inf e sup */
  		public static int min(double[] a, int inf, int sup){
  		     int i,indmin;
  		     indmin = inf;
  		     for (i = inf+1; i <= sup; i++)
  		       if (a[i] < a[indmin])
  		         indmin = i;

  		     return indmin;
  		 }


/* Scambia gli elementi di indice i e j di dati. */
  private static void scambia(double[] dati, int i, int j) {
  // pre: dati!=null && 0<= i,j <dati.length

		double temp;    // variabile di supporto per lo scambio

  		/* scambia dati[i] con dati[j] */
      temp = dati[i];
      dati[i] = dati[j];
      dati[j] = temp;
  }



	public static void leggi(double[] v){
		int i;
		System.out.println("scrivi " + v.length + " interi");
		for (i=0; i<v.length; i++)
			v[i] = Lettore.in.leggiDouble();
		System.out.println();
	}

	public static void stampa(double[] v){
		int i;
		for (i=0; i<v.length; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}

}