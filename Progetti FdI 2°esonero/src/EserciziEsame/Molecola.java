package EserciziEsame;

/* classe per la creazione di oggetti Molecola */
public class Molecola {
	
	/* metodi di istanza */
	// primo atomo
	private Atomo atomo1;
	// secondo atomo
	private Atomo atomo2;
	// terzo atomo
	private Atomo atomo3;
	
	/* metodi get */
	// primo atomo
	public Atomo getAtomo1() {
		return this.atomo1;
	}
	// secondo atomo
	public Atomo getAtomo2() {
		return this.atomo2;
	}
	// terzo atomo
	public Atomo getAtomo3() {
		return this.atomo3;
	}
	
	/* costruttore */
	public Molecola(Atomo a, Atomo b, Atomo c) {
		this.atomo1 = a;
		this.atomo2 = b;
		this.atomo3 = c;
	}
	
	/* metodo toString */
	public String toString() {
		return ("" + this.getAtomo1().getSimbolo() + this.getAtomo2().getSimbolo() + 
				this.getAtomo3().getSimbolo() + "");
	}
}
