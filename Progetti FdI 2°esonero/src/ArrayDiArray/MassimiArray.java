package ArrayDiArray;

import fiji.io.Lettore;

public class MassimiArray {
	
	public static int[] massimo(int[][] a) {
		int[] max;
		max = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			int massimo = a[i][0];
			for(int j=0; j<a[i].length; j++) {
				if(massimo < a[i][j])
					massimo = a[i][j];
			}
			max[i] = massimo;
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inserisci il numero di righe e di colonne della tabella");
		int r = Lettore.in.leggiInt();
		int c = Lettore.in.leggiInt();
		int[][] a = new int[r][c];
		
		System.out.println("Inserisci gli elementi della tabella");
		for(int i=0; i<r; i++) {
			System.out.println((i+1)+ "° riga");
			for(int j=0; j<c; j++)
				a[i][j] = Lettore.in.leggiInt();
		}
		
		int[] max = new int[r];
		max = massimo(a);
		System.out.println("Ecco gli elementi massimi per ogni riga");
		for(int i=0; i<max.length; i++) {
			System.out.print(max[i]);
			System.out.print(" ");
		}
	}
}
