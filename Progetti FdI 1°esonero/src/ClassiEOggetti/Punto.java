package ClassiEOggetti;

/* classe per gestire i punti */
public class Punto {
	private double x;	// coordinata x
	private double y;	// coordinata y
	
	/* metodi get */
	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	/* metodi set */
	public void setX(double a) {
		this.x = a;
	}

	public void setY(double a) {
		this.y = a;
	}

	/* costruttore */
	public Punto(double a, double b) {
		this.x=a;
		this.y=b;
	}

}