package EserciziEsame;

public class NumeroRazionale {
	
	/* variabili di istanza */
	private int numeratore;
	
	private int denominatore;
	
	/* metodi get */
	public int getNumeratore() {
		return this.numeratore;
	}
	
	public int getDenominatore() {
		return this.denominatore;
	}
	
	/* metodi set */
	public void setNumeratore(int num) {
		this.numeratore = num;
	}
	
	public void setDenominatore(int den) {
		this.denominatore = den;
	}
	
	public String toString() {
		
		String s;
		
		s = "Il numero è " +this.numeratore+ "/" +this.denominatore;
		
		if (this.denominatore == 1)
			s = "Il numero è " +this.numeratore;
			
		return s;
	}
	
	public boolean equals(NumeroRazionale n) {
		return ((this.numeratore == n.numeratore) && (this.denominatore == n.denominatore));
	}
	
	public void riduciMinimiTermini() {
		
		int risultato;
		
		if (this.numeratore<=this.denominatore) {
			risultato = this.numeratore;
		}
		else {
			risultato = this.denominatore;
		}
		while (this.numeratore%risultato!=0 || this.denominatore%risultato!=0) {
			risultato=risultato-1;
		}
		
		this.numeratore = this.numeratore / risultato;
		this.denominatore = this.denominatore / risultato;
	}
	
	/* costruttore */
	public NumeroRazionale(int num, int den) {
		this.numeratore = num;
		this.denominatore = den;
	}

}
