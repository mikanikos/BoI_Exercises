package ArrayDiOggetti;

/* Un oggetto Rettangolo rappresenta un rettangolo in uno spazio
 * bidimensionale, i cui lati sono entrambi paralleli
 * agli assi cartesiani del piano. */

public class Rettangolo2 {
    /* Vertice in basso a sinistra. */
    private Punto2 vbs;
    /* Vertice in alto a destra. */
    private Punto2 vad;

    /* Crea un nuovo Rettangolo tra i punti p1 e p2. */
    public Rettangolo2(Punto2 p1, Punto2 p2) {
        // pre: p1!=null && p2!=null
        this.vbs = p1;
        this.vad = p2;
    }

	public Punto2 getVbs(){
		return this.vbs;
	}

	public Punto2 getVad(){
		return this.vad;
	}

    /* calcola la base del rettangolo */
    public double base(){
		return (this.vad.getX()-this.vbs.getX());
	}

    /* calcola l'altezza del rettangolo */
    public double altezza(){
		return this.vad.getY()-this.vbs.getY();
	}

    /* calcola l'area del rettangolo */
    public double area(){
		return this.base()*this.altezza();
	}

    /* Restituisce una descrizione di questo rettangolo. */
    public String toString() {
        return "Rettangolo[vbs=" + vbs.toString() +
               ",vad=" + vad.toString() + "]";
    }

}