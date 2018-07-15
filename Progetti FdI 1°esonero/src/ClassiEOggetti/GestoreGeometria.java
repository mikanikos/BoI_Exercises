package ClassiEOggetti;
import fiji.io.*;

/* applicazione per gestire operazioni sui punti */
public class GestoreGeometria {
	/* metodo principale */
	public static void main(String[] args){
		int scelta; 		// numero rappresentante scelta utente
		double x, y;		// coordinate
		
		Punto p, q, r;			// punti
		
		double valore;		// distanza o perimetro
		
		do {
			/* chiedi all'utente che cosa vuole fare */
			System.out.println("Utente, cosa vuoi fare?");
			System.out.println("Introduci 1 per calcolare la distanza "
					+ "fra due punti");
			System.out.println("Introduci 2 per calcolare il perimetro"
					+ " di un triangolo");
			scelta = Lettore.in.leggiInt();
			/* distanza fra 2 punti */
			if(scelta==1){

				/* leggi i punti */
				System.out.println("Introduci la coordinata x del primo punto");
				x = Lettore.in.leggiDouble();
				System.out.println("Introduci la coordinata y del primo punto");
				y = Lettore.in.leggiDouble();
				p = new Punto(x,y);
				
				System.out.println("Introduci la coordinata x del secondo punto");
				x = Lettore.in.leggiDouble();
				System.out.println("Introduci la coordinata y del secondo punto");
				y = Lettore.in.leggiDouble();
				q = new Punto(x,y);
				/* calcola la distanza */
				valore = Geometry.distanza(p,q);
				/* stampa un messaggio per l'utente */
				System.out.println("La distanza fra i due punti e' " + valore);
			}
			/* perimetro triangolo */
			if(scelta==2){
				/* leggi i punti */
				System.out.println("Introduci la coordinata x del primo punto");
				x = Lettore.in.leggiDouble();
				System.out.println("Introduci la coordinata y del primo punto");
				y = Lettore.in.leggiDouble();
				p = new Punto(x,y);
				
				System.out.println("Introduci la coordinata x del secondo punto");
				x = Lettore.in.leggiDouble();
				System.out.println("Introduci la coordinata y del secondo punto");
				y = Lettore.in.leggiDouble();
				q = new Punto(x,y);
				
				System.out.println("Introduci la coordinata x del terzo punto");
				x = Lettore.in.leggiDouble();
				System.out.println("Introduci la coordinata y del terzo punto");
				y = Lettore.in.leggiDouble();
				r = new Punto(x,y);
				
				/* calcola il perimetro */
				valore = Geometry.perimetro(p,q,r);
				
				/* stampa un messaggio per l'utente */
				System.out.println("Il perimetro del triangolo definito dai 3 punti"
						+ " e' " + valore);
			}
		}
		while(scelta==1 || scelta==2);
	}
}
