package ArrayDiOggetti;

/* Calcola il rettangolo intersezione tra r1 e r2.
 * Restituisce false se l'intersezione è vuota.

 Specifica:
 Input: due rettangoli r1 e r2rappresentati dal vbs e vad (Punto)
 Pre: r1 e r2 !=null
 Output: intersez:booleano
 Post: intersez e' vera se i due triangoli hanno intersezione non nulla, falso altrimenti

 Algoritmo: considero il rettangolo che contiene entrambi i rettangoli
            se la base di questo rettangolo e' minore della somma della basi i t1 e t2 e se
            l'altezza i questo rettangolo e' minore della somma delle altezze di t1 e t2,
            allora i rettangoli si intersecano.
 */


public class VerificaIntersezioneRettangoli {

    public static void main (String[] args){
		testIntersezione();
	}

	public static void testIntersezione(){
		Rettangolo2 r1,r2;

		// rettangoli con intersezione vuota
		r1 = new Rettangolo2(new Punto2(1,1),new Punto2(2,4));
		r2 = new Rettangolo2(new Punto2(3,3), new Punto2(5,7));
		System.out.println("I rettangoli si intersecano? (false) " + intersezione(r1,r2));

		// rettangoli con intersezione non vuota
		r1 = new Rettangolo2(new Punto2(1,1),new Punto2(6,4));
		r2 = new Rettangolo2(new Punto2(3,3), new Punto2(5,7));
		System.out.println("I rettangoli si intersecano? (true) " + intersezione(r1,r2));

		// rettangoli con intersezione non vuota
		r1 = new Rettangolo2(new Punto2(3,3),new Punto2(5,7));
		r2 = new Rettangolo2(new Punto2(4,1), new Punto2(6,4));
		System.out.println("I rettangoli si intersecano? (true) " + intersezione(r1,r2));
	}

    public static boolean intersezione(Rettangolo2 r1, Rettangolo2 r2) {
        // pre: r1!=null && r2!=null
		// se la differenza degli estremi e' minore della somma delle singole basi oppure
		// se la differenza degli estremi e' minore della somma delle singole altezze,
		// allora i rettangoli si intersecano
		double baseR, altezzaR;
		baseR = max(r1.getVad().getX(),r1.getVbs().getX(), r2.getVad().getX(),r2.getVbs().getX()) -
		   min(r1.getVad().getX(),r1.getVbs().getX(), r2.getVad().getX(),r2.getVbs().getX());
		altezzaR = max(r1.getVad().getY(),r1.getVbs().getY(), r2.getVad().getY(),r2.getVbs().getY()) -
		   min(r1.getVad().getY(),r1.getVbs().getY(), r2.getVad().getY(),r2.getVbs().getY());

		return  (baseR < r1.base()+r2.base()) && (altezzaR < r1.altezza()+r2.altezza());
	}

	    public static double max(double a, double b, double c, double d){
			double massimo;
			massimo = a;
			if (b>massimo) massimo = b;
			if (c>massimo) massimo = c;
			if (d>massimo) massimo = d;
			return massimo;
		}


    public static double min(double a, double b, double c, double d){
		double minimo;
		minimo =a;
		if (b<minimo) minimo = b;
		if (c<minimo) minimo = c;
		if (d<minimo) minimo = d;
		return minimo;
	}
}
