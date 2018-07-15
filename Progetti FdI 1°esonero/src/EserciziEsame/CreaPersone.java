package EserciziEsame;
import fiji.io.*;

/* test per persona */
public class CreaPersone {
	
	/* metodo principale */
	public static void main(String[] args) {
		String n1, c1, n2, c2;			// nome e cognome
		int a1, e1, p1, a2, e2, p2;		// altezza, eta, peso
		
		/* leggi i dati della prima persona */
		System.out.println("Inserisci il nome della prima persona e poi invio");
		n1 = Lettore.in.leggiLinea();
		System.out.println("Inserisci il cognome della prima persona e poi invio");
		c1 = Lettore.in.leggiLinea();
		System.out.println("Inserisci l'eta\' della prima persona e poi invio");
		e1 = Lettore.in.leggiInt();
		System.out.println("Inserisci l\'altezza della prima persona e poi invio");
		a1 = Lettore.in.leggiInt();
		System.out.println("Inserisci il peso della prima persona e poi invio");
		p1 = Lettore.in.leggiInt();
		/* crea la persona */
		Persona persona1 = new Persona(n1,c1,e1,a1,p1);
		
		/* leggi la fine linea precedente */
		Lettore.in.leggiLinea();
		
		/* leggi i dati della seconda persona */
		System.out.println("Inserisci il nome della seconda persona e poi invio");
		n2 = Lettore.in.leggiLinea();
		System.out.println("Inserisci il cognome della seconda persona e poi invio");
		c2 = Lettore.in.leggiLinea();
		System.out.println("Inserisci l'eta\' della seconda persona e poi invio");
		e2 = Lettore.in.leggiInt();
		System.out.println("Inserisci l\'altezza della seconda persona e poi invio");
		a2 = Lettore.in.leggiInt();
		System.out.println("Inserisci il peso della seconda persona e poi invio");
		p2 = Lettore.in.leggiInt();
		/* crea la persona */
		Persona persona2 = new Persona(n2,c2,e2,a2,p2);
		
		if(persona1.equals(persona2))
			System.out.println("Stessa persona");
		else
			System.out.println("Persone diverse");
	}
}