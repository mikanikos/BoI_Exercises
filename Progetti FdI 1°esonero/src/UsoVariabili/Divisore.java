package UsoVariabili;
import fiji.io.Lettore;

/* programma che legge due numeri e ne stampa la divisione */
public class Divisore {
	public static void main(String[] args) {
		double numero1, numero2; 		// numeri da leggere	
		double divisione;					// divisione
	
		/* leggi i numeri */
		System.out.println("Ciao utente, sono un programma che divide due numeri.");
		System.out.println("Per favore introduci due numeri reali, premendo invio dopo ciascuno.");
		numero1 = Lettore.in.leggiInt();
		numero2 = Lettore.in.leggiInt();
		
		/* calcola la divisione */
		divisione = numero1 / numero2;
		
		/* stampa un messaggio per l'utente */
		System.out.println("La divisione dei due numeri introdotti e' " + divisione);
		
	}
}