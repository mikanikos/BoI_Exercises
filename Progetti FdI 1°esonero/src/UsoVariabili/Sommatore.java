package UsoVariabili;
import fiji.io.*;

/* programma che legge due numeri e ne stampa la somma */
public class Sommatore {
	public static void main(String[] args) {
		int numero1, numero2; 		// numeri da leggere	
		int somma;					// somma
	
		/* leggi i numeri */
		System.out.println("Ciao utente, sono un programma che somma due numeri.");
		System.out.println("Per favore introduci due interi, premendo invio dopo ciascuno.");
		numero1 = Lettore.in.leggiInt();
		numero2 = Lettore.in.leggiInt();
		
		/* calcola la somma */
		somma = numero1 + numero2;
		
		/* stampa un messaggio per l'utente */
		System.out.println("La somma dei due numeri introdotti e' " + somma);
		
	}
}