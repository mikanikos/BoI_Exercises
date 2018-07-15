package ClassiEOggetti;

import fiji.io.*;
/* Applicazione di prova per la classe Triangolo. */
class UsoTriangolo {
    public static void main(String[] args) {
      Triangolo t;         // un triangolo
		Punto2 p1,p2,p3;
		double x,y;

	/* si possono leggere i dati da input */
	System.out.println("ascissa del primo vertice");
	x = Lettore.in.leggiDouble();
	System.out.println("ordinata del primo vertice");
	y = Lettore.in.leggiDouble();
	p1 = new Punto2(x,y);

	System.out.println("ascissa del secondo vertice");
	x = Lettore.in.leggiDouble();
	System.out.println("ordinata del secondo vertice");
	y = Lettore.in.leggiDouble();
	p2 = new Punto2(x,y);

	System.out.println("ascissa del terzo vertice");
	x = Lettore.in.leggiDouble();
	System.out.println("ordinata del terzo vertice");
	y = Lettore.in.leggiDouble();
	p3 = new Punto2(x,y);

	t = new Triangolo(p1,p2,p3);
	System.out.println(t.toString());

	System.out.println("il perimetro del triangolo e' "+ t.perimetro());
	}
}
