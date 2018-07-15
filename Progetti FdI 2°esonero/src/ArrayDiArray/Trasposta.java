package ArrayDiArray;

import fiji.io.Lettore;

/* classe per la creazione della trasposta di una matrice data */
public class Trasposta {
	
	public static void main(String[] args) {
		
		double[][] matrice;
		
		/* creazione della dimensione della matrice */
		System.out.println("Inserisci il numero di righe della matrice");
		int righe = Lettore.in.leggiInt();
		System.out.println("Inserisci il numero di colonne della matrice");
		int colonne = Lettore.in.leggiInt();
		
		matrice = new double[righe][colonne];
		
		/* creazione degli elementi della matrice */
		for(int i=0; i<righe; i++) {
			System.out.println("Inserisci gli elementi della "+(i+1)+" riga");
			for(int j=0; j<colonne; j++)
				matrice[i][j] = Lettore.in.leggiDouble();
		}
		
		/* stampa della matrice inserita */
		System.out.println("La matrice inserita è la seguente:");
		for(int i=0; i<righe; i++) {
			for(int j=0; j<colonne; j++)
				System.out.print(matrice[i][j]+ " ");
			System.out.println();
		}
		
		/* creazione della trasposta */
		double[][] trasposta;
		trasposta = new double[colonne][righe];
		
		for(int i=0; i<righe; i++) {
			for(int j=0; j<colonne; j++)
				trasposta[j][i] = matrice[i][j];
		}
		
		/* stampa della matrice trasposta */
		System.out.println("La matrice trasposta della precedente è la seguente:");
		for(int i=0; i<colonne; i++) {
			for(int j=0; j<righe; j++)
				System.out.print(trasposta[i][j]+ " ");
			System.out.println();
		}
	}
}
