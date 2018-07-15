package Array;
import fiji.io.*;

/* programma per leggere e calcolare il minimo fra venti interi */
public class Minimo20InteriArray {
	/* metodo principale */
	public static void main(String[] args) {
		int[] x;				// dichiarazione array di interi 
		x = new int[20];		// creazione array di interi
		
		/* INPUT */
		System.out.println("Inserisci venti interi");
		for(int i=0; i<20; i++) 
			x[i] = Lettore.in.leggiInt();
		
		/* calcola e stampa il minimo */
		int min = x[0];		
		for(int i=1; i<20; i++) 
			if(x[i]<min)
				min = x[i];
		System.out.println("Il minimo e' " + min);
	}
}