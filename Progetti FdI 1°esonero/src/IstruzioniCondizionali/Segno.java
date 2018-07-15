package IstruzioniCondizionali;
import fiji.io.Lettore;

/* Scrivere un'applicazione Segno che chiede all'utente di inserire un intero da tastiera
* lo legge e stampa un messaggio che informa del fatto che il numero introdotto sia
* positivo, negativo o nullo. */

public class Segno {
	public static void main(String[] args) {
		
		int x;
		
        System.out.println("Utente, inserisci un numero per sapere se è positivo, negativo o nullo");
		
		x=Lettore.in.leggiInt();
		
		if (x>0) {
			System.out.println("Utente, il numero è positivo" );
		}
		
		else {
			if (x==0) {
				System.out.println("Utente, il numero è nullo");
			}
			
			else  {
				System.out.println("Utente, il numero è negativo");
			}
		}
		
		
	}
}