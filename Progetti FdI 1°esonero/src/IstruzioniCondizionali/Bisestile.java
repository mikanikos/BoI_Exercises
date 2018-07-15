package IstruzioniCondizionali;
import fiji.io.Lettore;

        /* Applicazione che chiede all'utente di inserire un intero a da tastiera, 
		 * legge l'intero inserito dall'utente ed informa l'utente se l'anno a 
		 * inserito e' bisestile o no */


public class Bisestile {
	public static void main(String[] args) {
		
		int a;
		
		System.out.println("Utente, inserisci un intero per sapere se l'anno è bisestile o no");
		
		a=Lettore.in.leggiInt();
		
		if ((a%4==0 && a%100!=0) || (a%400==0))
			System.out.println("Utente, l'anno inserito è bisestile");
		else
			System.out.println("Utente, l'anno inserito non è bisestile");
	}
}
		
		