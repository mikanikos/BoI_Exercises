package EserciziEsame;

/* classe per istanziare oggetti che rappresentano punti */
public class Punto {
	
	/* coordinata x */
	private double coordinataX;
	
	/* coordinata y */
	private double coordinataY;
	
	/* metodi get */
	public double getCoordnataX() {
		return this.coordinataX;
	}
	
	public double getCoordinataY() {
		return this.coordinataY;
	}
	
	/* metodi set */
	public void setCoordinataX(double x) {
		this.coordinataX = x;
	}
	
	public void setCoordnataY(double y) {
		this.coordinataY = y;
	}
	
	/* metodo toString */
	public String toString() {
		/* viene restituita una descrizione testuale del punto */
		return "Il punto ha coordinate " +this.coordinataX+ " e " +this.coordinataY;
	}
	
	/* metodo equals */
	public boolean equals(Punto p) {
		/* viene restituito un valore booleano dopo aver valutato se i due punti sono uguali */
		return (this.coordinataX == p.coordinataX) && (this.coordinataY == p.coordinataY);
	}
	
	/* metodo distanza Euclidea */
	public double distanza(Punto p) {
		
		double distanzaAlQuadrato;  // variabile della distanza fra due punti al quarato 
		
		/* viene calcolata la distanza al quadrato tramite la formula */
		distanzaAlQuadrato = (Math.pow(p.coordinataX - this.coordinataX, 2)) + (Math.pow(p.coordinataY - this.coordinataY, 2));
		
		/* viene restituito il valore della distanza dopo averne svolto la radice quadrata */
		return Math.sqrt(distanzaAlQuadrato);
	}
	
	/* metodo trasla */
	public void trasla(int x, int y) {
		/* viene traslato il punto aggiungengo i valori parametrici alle coordinate */
		this.coordinataX = this.coordinataX + x;
		this.coordinataY = this.coordinataY + y;
	}
	
	/* costruttore */
	public Punto(double x, double y) {
		this.coordinataX = x;
		this.coordinataY = y;
	}
}
