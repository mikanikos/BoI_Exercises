package Array;

import fiji.io.Lettore;

public class DecimaleBinaria {
	public static void main(String[] args) {
		
		int x,y;
		int i = 0, n = 0;
		int[] array;
		
		System.out.println("Utente, inserisci un numero in notazione decimale per avere il suo corrispondente in rappresentazione binaria");
		x=Lettore.in.leggiInt();
		System.out.print("Utente, il numero introdotto in rappresentazione binaria è: ");
		
		int a = x;
		
		/* calcolo numero di cifre dell'array */
		while (x!=0) {
			y=x%2;
			x=x/2;
		    n++;
		}
		
		/* inserimento cifre nell'array */
		array = new int[n];
		while (a!=0) {
			y=a%2;
			a=a/2;
			array[i] = y;
			i++;
		}
		
		/* creazione array inverso */
		int[] inverso;
		inverso = new int[n];
		
		for(int j=0; j<n; j++)
			inverso[j] = array[n-j-1];
		
		/* stampa dell'array inverso */
		for(int j=0; j<n; j++)
			System.out.print(inverso[j]);
	}
}
