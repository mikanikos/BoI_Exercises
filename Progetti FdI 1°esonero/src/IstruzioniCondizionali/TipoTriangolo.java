package IstruzioniCondizionali;
import fiji.io.Lettore;

/* Scrivere un'applicazione TipoTriangolo che chiede all'utente di inserire tre interi
* a, b e c da tastiera, li legge e stampa un messaggio che dice all'utente se il triangolo
* a, b e c è equilatero, isoscele o scaleno. */

public class TipoTriangolo {
	public static void main(String[] args) {
		
		int a, b, c;
		
		System.out.println("Utente, inserisci tre interi per sapere se un triangolo con tali lati è equilatero, isoscele o scaleno");
		
		a=Lettore.in.leggiInt();
		b=Lettore.in.leggiInt();
		c=Lettore.in.leggiInt();
		
		if (!(a>0 && b>0 && c>0 && a<b+c && b<a+c && c<a+b)) {
			System.out.println("Utente, un triangolo con tali lati non esiste");
		    }
		
		else {
			if (a==b && b==c && a==c) {
			    System.out.println("Utente, il trinagolo è equilatero" );
		    }
		
		    else {
			    if (a==b || b==c || a==c) {
				    System.out.println("Utente, il trinagolo è isoscele" );
			    }
			    else {
				    System.out.println("Utente, il trinagolo è scaleno" );
			    }
		    }
	    }
		
		
	}

}
