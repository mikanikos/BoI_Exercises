package ArrayDiOggetti;

import fiji.io.Lettore;

public class GestioneRettangolo {
public static void main(String[] args) {
		
		Rettangolo3 r1, r2;
		double cord1, cord2, cord3, cord4;
		double cord5, cord6, cord7, cord8;
		
		/* lettura dei dati da tastiera e creazione dei quadrati */
		System.out.println("Inserisci le coordinate del verice in basso a sinistra per il primo rettangolo(dopo invio)");
		cord1 = Lettore.in.leggiDouble();
		cord2 = Lettore.in.leggiDouble();
		
		System.out.println("Inserisci le coordinate del verice in alto a destra per il primo rettangolo(dopo invio)");
		cord3 = Lettore.in.leggiDouble();
		cord4 = Lettore.in.leggiDouble();
		
		r1 = new Rettangolo3(cord1, cord2, cord3, cord4);
		
		System.out.println("Inserisci le coordinate del verice in basso a sinistra per il secondo rettangolo(dopo invio)");
		cord5 = Lettore.in.leggiDouble();
		cord6 = Lettore.in.leggiDouble();
		
		System.out.println("Inserisci le coordinate del verice in alto a destra per il secondo rettangolo(dopo invio)");
		cord7 = Lettore.in.leggiDouble();
		cord8 = Lettore.in.leggiDouble();
		
		r2 = new Rettangolo3(cord5, cord6, cord7, cord8);
		
		System.out.println("Intersezione: " +r1.intersezione(r2));
	}
}
