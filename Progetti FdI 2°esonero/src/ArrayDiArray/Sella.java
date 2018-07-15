package ArrayDiArray;

import fiji.io.Lettore;

public class Sella {
	
	public static void main(String[] args) {
		
		System.out.println("Inserisci la dimensione della matrice quadrata");
		int n = Lettore.in.leggiInt();
		
		int[][] matrice;
		matrice = new int[n][n];
		
		for(int i=0; i<matrice.length; i++)
			for(int j=0; j<matrice[i].length; j++)
				matrice[i][j] = Lettore.in.leggiInt();
		
		
		stampaSella(matrice);
	}
	
	public static void stampaSella(int[][] matrice) {
	
		int sella = -1;
		int i=0,j=0,k=0,l=0;
		int minR;
		boolean trovato = false;
		int contatore;
		
		for(i=0; i<matrice.length && !trovato; i++) {
			contatore = 0;
			minR = matrice[i][0];
			for(j=1; j<matrice[i].length; j++) {
				if(matrice[i][j] < minR) {
					minR = matrice[i][j];
					l = j;
				}
			}
			for(k=0; k<matrice.length && !trovato; k++) {
				if(matrice[k][l] < minR)
					contatore++;
				if(contatore == 3)
					trovato = true;
			}
			if(trovato) {
				sella = minR;
				l++;
			}
		}
		
		if(sella != -1)
			System.out.println("Punto sella: " +sella+ " (" +i+ "," +l+ ")");
		else
			System.out.println("Il punto di sella non esiste");
		
	}

}
