package EsercitazioneLab;

/* Un oggetto Rettangolo rappresenta un rettangolo in uno spazio
 * bidimensionale, i cui lati sono entrambi paralleli
 * agli assi cartesiani del piano. */

public class Rettangolo {
    /* Vertice in basso a sinistra. */
    private Punto vbs;
    /* Vertice in alto a destra. */
    private Punto vad;

    /* Crea un nuovo Rettangolo tra i punti p1 e p2. */
    public Rettangolo(Punto p1, Punto p2) {
        // pre: p1!=null && p2!=null
        this.vbs = p1;
        this.vad = p2;
    }

	public Punto getVbs(){
		return this.vbs;
	}

	public Punto getVad(){
		return this.vad;
	}

    /* calcola la base del rettangolo */
    public double base(){
		return Math.abs(this.vad.getX()-this.vbs.getX());
	}

    /* calcola l'altezza del rettangolo */
    public double altezza(){
		return Math.abs(this.vad.getY()-this.vbs.getY());
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