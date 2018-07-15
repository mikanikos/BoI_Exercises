package UsoVariabili;
import fiji.io.Lettore;

/* programma che legge due numeri e ne stampa il prodotto */
public class Moltiplicatore {
	public static void main(String[] args) {
		int numero1, numero2; 		// numeri da leggere	
		int prodotto;					// prodotto
	
		/* leggi i numeri */
		System.out.println("Ciao utente, sono un programma che moltiplica due numeri.");
		System.out.println("Per favore introduci due interi, premendo invio dopo ciascuno.");
		numero1 = Lettore.in.leggiInt();
		numero2 = Lettore.in.leggiInt();
		
		/* calcola il prodotto */
		prodotto = numero1 * numero2;
		
		/* stampa un messaggio per l'utente */
		System.out.println("Il prodotto dei due numeri introdotti e' " + prodotto);
		
	}
}