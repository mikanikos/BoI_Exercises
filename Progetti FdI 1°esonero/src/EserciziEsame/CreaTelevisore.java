package EserciziEsame;
import fiji.io.*;

/* classe per la creazione di televisori */
public class CreaTelevisore {

	/* metodo principale */
	public static void main(String[] args) {
		Televisore t;			// un televisore
		String m;				// marca
		char a;					// acceso
		int v;					// volume
		int c;					// canale

		/* leggi lo stato del televisore */
		System.out.println("Qual e' la marca del televisore?");
		m = Lettore.in.leggiLinea();
		System.out.println("Il televisore e' acceso? (Y/N)");
		a = Lettore.in.leggiChar();
		if(a=='Y' || a=='y') {// acceso
			System.out.println("Qual e' il canale del televisore?");
			c = Lettore.in.leggiInt();
			System.out.println("Qual e' il volume del televisore?");
			v = Lettore.in.leggiInt();
			/* crea il televisore */
			t = new Televisore(m, true, c, v);
		}
		else { // spento
			/* crea il televisore */
			t = new Televisore(m, false, -1, -1);
		}

		/* stampa una descrizione testuale del televisore, se acceso */
		if(t.getAcceso())
			System.out.println(t.toString());
	}
}