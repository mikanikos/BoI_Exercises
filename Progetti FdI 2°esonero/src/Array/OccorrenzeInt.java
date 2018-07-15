package Array;

import fiji.io.Lettore;

public class OccorrenzeInt {
	
	public static int occorrenze(int[] a, int v) {
		
		int occ = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == v)
				occ++;
		}
		
		return occ;
	}
	
	public static void main(String[] args) {
		
		int lun;
		int[] arr;
		int v;
		int occ;
		
		System.out.println("Quanto è lunga la sequenza di interi?");
		lun = Lettore.in.leggiInt();
		
		arr = new int[lun];
		
		for(int i=0; i<lun; i++) {
			System.out.println("Introduci un numero");
			arr[i] = Lettore.in.leggiInt();
		}
		
		System.out.println("Inserisci il numero di cui vuoi calcolare l'occorrenza");
		v = Lettore.in.leggiInt();
		
		occ = occorrenze(arr, v);
		
		System.out.println("Il numero di occorrenze di " +v+ " nella sequenza è " +occ);
		
	}

}
