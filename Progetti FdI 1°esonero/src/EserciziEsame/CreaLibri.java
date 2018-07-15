package EserciziEsame;

import fiji.io.Lettore;

public class CreaLibri {
	
	public static void main(String[] args) {
		
		Libro l1, l2;
		String t1,t2,a1,a2,g1,g2;
		int p1,p2;
		char input;
		
		System.out.println("Inserisci il titolo del primo libro");
		t1 = Lettore.in.leggiLinea();
		
		System.out.println("Inserisci l'autore del primo libro");
		a1 = Lettore.in.leggiLinea();
	
		System.out.println("Inserisci il genere del primo libro");
		g1 = Lettore.in.leggiLinea();
		
		System.out.println("Inserisci il numero di pagine del primo libro");
		p1 = Lettore.in.leggiInt();
		
		Lettore.in.leggiLinea();
		
		l1 = new Libro(t1,a1,g1,p1);
		
		System.out.println("Inserisci il titolo del secondo libro");
		t2 = Lettore.in.leggiLinea();
		
		System.out.println("Inserisci l'autore del secondo libro");
		a2 = Lettore.in.leggiLinea();
		
		System.out.println("Inserisci il genere del secondo libro");
		g2 = Lettore.in.leggiLinea();
		
		System.out.println("Inserisci il numero di pagine del secondo libro");
		p2 = Lettore.in.leggiInt();
		
		Lettore.in.leggiLinea();
		
		l2 = new Libro(t2,a2,g2,p2);
		
		System.out.println("Vuoi sapere se i due libri hanno lo stesso stato? (Y/N)");
		input = Lettore.in.leggiChar();
		
		if (input == 'Y' || input == 'y') {
			
			if(l1.equals(l2))
				System.out.println("I due libri hanno lo stesso stato");
			else
				System.out.println("I due libri non hanno lo stesso stato");
		}
		
		
	}

}
