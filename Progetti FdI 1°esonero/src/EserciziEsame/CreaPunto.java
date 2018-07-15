package EserciziEsame;

import fiji.io.Lettore;

/* classe per la creazione di un oggetto Punto */
public class CreaPunto {
	
	/* metodo principale */
	public static void main(String[] args) {
		
		Punto a;     // variabile punto
		double x,y;  // variabili coordinate  
		
		/* vengono lette le coordnate da tastiera */
		System.out.println("Inserisci la coordinata x del punto");
		x = Lettore.in.leggiDouble();
		
		System.out.println("Inserisci la coordinata y del punto");
		y = Lettore.in.leggiDouble();
		
		/* creazione del punto con l'invocazione al costruttore */
		a = new Punto(x,y);
		
		/* traslazione di un vettore (3,3) attraverso il metodo trasla */
		a.trasla(3, 3);
		
		/* stampa dello stato attraverso il metodo toString */
		System.out.println(a.toString());
	}

}
