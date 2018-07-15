package PrimaEsercitazione;
import fiji.io.*;
class MaxTraTreNumeri{
    public static void main(String[] args){
        int n;            // il primo numero intero
        int m;            // il secondo numero intero
        int p;     	  // terzo numero intero

        /* legge i tre numeri interi a  b e p */
        System.out.println("Scrivi tre numeri interi");


        /* legge tre numeri interi a  b e p */
        n = Lettore.in.leggiInt();
        m = Lettore.in.leggiInt();
        p = Lettore.in.leggiInt();

        /* calcola il max dei tre */
        int max = n; // inizializzazione massimo
        
        if (max<m) {
        	max=m;
        }
	    if (max<p) {
	    	max=p;
	    }
		
        System.out.print("Il max è ");
        System.out.println(max);
    }
}