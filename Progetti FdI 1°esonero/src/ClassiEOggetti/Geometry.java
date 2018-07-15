package ClassiEOggetti;

/* classe per la creazione di un oggetto bravo in geometria */
public class Geometry {
	/* metodo che calcola la distanza fra 2 punti */
	public static double distanza(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow((p1.getX()-p2.getX()),2) + 
						 Math.pow((p1.getY()-p2.getY()),2));
	}
	
	/* metodo che dati tre punti calcola il perimetro del triangolo che definiscono */
	public static double perimetro(Punto p1, Punto p2, Punto p3) {
		return distanza(p1,p2)+distanza(p1,p3)+distanza(p2,p3);
	}
	
}
