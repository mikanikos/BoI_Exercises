package IstruzioniCondizionali;
import fiji.io.Lettore;

		/* Scrivere un'applicazione ETriangolo che chiede all'utente di inserire tre interi da
		 * tastiera, li legge e stampa un messaggio che dice all'utente se esiste un triangolo
		 * con lati a, b e c (tre numeri sono i lati di un triangolo se sono tutti posiivi e ciascuno
		 * è minore della somma degli altri 2). */

public class ETriangolo {
	public static void main(String[] args) {
		
		int a, b, c;
		
        System.out.println("Utente, inserisci tre interi per vedere se, per essi, esiste un triangolo");
		
		a=Lettore.in.leggiInt();
		b=Lettore.in.leggiInt();
		c=Lettore.in.leggiInt();
		
		if (a>0 && b>0 && c>0 && a<b+c && b<a+c && c<a+b)
			System.out.println("Utente, un triangolo con tali lati esiste");
		else
			System.out.println("Utente, un triangolo con tali lati non esiste");
	}
}
