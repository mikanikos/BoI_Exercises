package ArrayDiArray;

import fiji.io.Lettore;

/* classe per il calcolo dei numeri primi fino a n con l'utilizzo del Crivello di Eratostene */
public class CrivelloEratostene {
	
	public static void main(String[] args) {
		
		int n,a;
		int numero = 0;
		int[][] griglia;
		
		System.out.println("Fino a che numero vuoi che si fermino i numeri primi?");
		n = Lettore.in.leggiInt();
		
		if(n%10 == 0)
			a=(n/10);
		else
			a=(n/10)+1;
		
		griglia = new int[a][10];
		
		/* riempimento della griglia con i numeri da 1 a n */
		for(int i=0; i<a; i++) {
			if(i>=1)
				numero+=10;
			for(int j=0; j<10; j++)
				griglia[i][j] = (1+j)+numero;
		}
		
		/* stampa della griglia */
		for(int i=0; i<a; i++) {
			for(int j=0; j<10; j++)
				System.out.print(griglia[i][j]+ " ");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Applicando il Crivello di Eratostene vengono cancellati tutti i numeri "
				+ "che non sono primi(evidenziati con 0)");
		System.out.println("Premi invio per avere i numeri primi da 2 a n");
		Lettore.in.leggiLinea();
		Lettore.in.leggiLinea();
		
		/* eliminazione dei numeri non primi cancellando i multipli */
		
		griglia[0][0] = 0;
		
		for(int k=0; k<a; k++) {
			for(int l=0; l<10; l++) {
				if(griglia[k][l] != 0) {
					numero = griglia[k][l];
				}
				for(int i=0; i<a; i++) {
					for(int j=0; j<10; j++) {
						if(griglia[i][j] % numero == 0 && griglia[i][j] != numero)
							griglia[i][j] = 0;
						if(griglia[i][j] > n)
							griglia[i][j] = 0;
					}	
				}
			}
		}
		
		/* stampa della griglia */
		for(int i=0; i<a; i++) {
			for(int j=0; j<10; j++)
				System.out.print(griglia[i][j]+ " ");
			System.out.println();
		}
	}
}