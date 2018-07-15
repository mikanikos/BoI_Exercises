package EserciziEsame;

import fiji.io.Lettore;

/* classe per creare oggetti di tipo quadrato */ 
public class CreaQuadrati {
	
	/* metodo principale */
	public static void main(String[] args) {
		
		Quadrato q1, q2;
		double cord1, cord2, cord3, cord4;
		double cord5, cord6, cord7, cord8;
		boolean contiene;
		
		/* lettura dei dati da tastiera e creazione dei quadrati */
		System.out.println("Inserisci le coordinate del verice in basso a sinistra per il primo quadrato(dopo invio)");
		cord1 = Lettore.in.leggiDouble();
		cord2 = Lettore.in.leggiDouble();
		
		System.out.println("Inserisci le coordinate del verice in alto a destra per il primo quadrato(dopo invio)");
		cord3 = Lettore.in.leggiDouble();
		cord4 = Lettore.in.leggiDouble();
		
		q1 = new Quadrato(cord1, cord2, cord3, cord4);
		
		System.out.println("Inserisci le coordinate del verice in basso a sinistra per il secondo quadrato(dopo invio)");
		cord5 = Lettore.in.leggiDouble();
		cord6 = Lettore.in.leggiDouble();
		
		System.out.println("Inserisci le coordinate del verice in alto a destra per il secondo quadrato(dopo invio)");
		cord7 = Lettore.in.leggiDouble();
		cord8 = Lettore.in.leggiDouble();
		
		q2 = new Quadrato(cord5, cord6, cord7, cord8);
		
		/* invocazione metodo contiene */
		contiene = q1.contiene(q2);
		
		if (contiene)
			System.out.println("Il primo quadrato contiene il secondo");
		else
			System.out.println("Il primo quadrato non contiene il secondo");
	
	}

}
