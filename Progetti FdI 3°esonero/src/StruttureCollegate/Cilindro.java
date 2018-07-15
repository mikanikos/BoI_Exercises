package StruttureCollegate;

public class Cilindro {
	
	/* variabili di istanza */
	private double raggio;    // raggio di base
	private double altezza;   // altezza del cilindro

	/* costruttore */
	public Cilindro (double r, double h) {
	    this.raggio = r;
	    this.altezza = h;
	}

	/* metodi get */

	// raggio 
	public double getRaggio() {
	    return this.raggio;
	}

	// altezza
	public double getAltezza() {
	    return this.altezza;
	}
	
	/* metodo boolean */
	public boolean equals(Cilindro c) {
		return (this.raggio == c.raggio && this.altezza == c.altezza);
	}

	/* metodo toString */
	public String toString() {
	    return "Raggio = " + this.raggio + "\n" +
	           "Altezza = " + this.altezza;
	}
}
