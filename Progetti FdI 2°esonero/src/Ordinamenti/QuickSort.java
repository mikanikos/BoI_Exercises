package Ordinamenti;

public class QuickSort {
	
	public static void scambia(int[] dati, int i, int j) {
		// pre: dati!=null && 0 <= i,j < dati.length
		int temp; // variabile di supporto per lo scambio
		/* scambia dati[i] con dati[j] */
		temp = dati[i];
		dati[i] = dati[j];
		dati[j] = temp;
	}
	
	/* metodo che implementa l'ordinamento veloce */ 
	public static int[] quickSort(int[] v, int inf, int sup) {
		int i;
		if(inf < sup) {
			i = partiziona(v,inf,sup);
			quickSort(v,inf,i-1);
			quickSort(v,i+1,sup);
		}
		return v;
	}
	
	/* metodo per partizionare l'array */
	public static int partiziona(int[] v, int inf, int sup) {
		int i = inf;
		int j = sup;
		while(i<=j) {
			while(v[j] > v[inf])
				j--;
			while(v[i] <= v[sup] && i<=j)
				i++;
			if(i<j) {
				scambia(v,i,j);
				i++;
				j--;
			}
		}
		scambia(v,inf,j);
		return j;
	}
	
	public static void main(String[] args) {
		int[] a = new int[]{58,65,67,45,31,16,96,50};
		int[] v = quickSort(a,0,a.length-1);
		for(int i=0; i<v.length; i++)
			System.out.print(v[i]+ " ");
	}

}
