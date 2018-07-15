package EserciziEsame;

import fiji.io.Lettore;

public class CreaBus {
	public static void main(String[] args) {
		
		Bus a;
		String numIde;
		int linea;
		String cap1, cap2;
		char modifica;
		
		System.out.println("Inserire il numero di identificazione del bus");
		numIde = Lettore.in.leggiString();
		
		System.out.println("Inserire la linea del bus");
		linea = Lettore.in.leggiInt();
		
		Lettore.in.leggiLinea();
		
		System.out.println("Inserire il primo capolinea del bus");
		cap1 = Lettore.in.leggiLinea();
		
		System.out.println("Inserire il secondo capolinea del bus");
		cap2 = Lettore.in.leggiLinea();
		
		a = new Bus(numIde, linea, cap1, cap2);
		
		System.out.println(a.toString());
		
		System.out.println("Desideri modificare la linea e i capolinea del bus? (Y/N)");
		modifica = Lettore.in.leggiChar();
		
		if (modifica == 'Y' || modifica == 'y') {
			a.cambiaLinea(linea, cap1, cap2);
			System.out.println(a.toString());
		}
	}

}
