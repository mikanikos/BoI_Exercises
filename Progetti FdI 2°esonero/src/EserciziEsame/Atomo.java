package EserciziEsame;

/* classe per la creazione di oggetti Atomo */
public class Atomo {
	
	/* variabili d'istanza */
	// simbolo
	private char simbolo;
	// numero atomico
	private int Z;
	// massa atomica
	private double A;
	// periodo
	private int periodo;
	// gruppo
	private int gruppo;
	
	/* metodi get */
	// simbolo
	public char getSimbolo() {
		return this.simbolo;
	}
	// numero atomico
	public int getZ() {
		return this.Z;
	}
	// massa atomica
	public double getA() {
		return this.A;
	}
	// periodo
	public int getPeriodo() {
		return this.periodo;
	}
	// gruppo
	public int getGruppo() {
		return this.gruppo;
	}
	
	/* metodi set */
	// simbolo
	public void setSimbolo(char s) {
		this.simbolo = s;
	}
	// numero atomico
	public void setZ(int z) {
		this.Z = z;
	}
	// massa atomica
	public void setA(double a) {
		this.A = a;
	}
	// periodo
	public void setPeriodo(int p) {
		this.periodo = p;
	}
	// gruppo
	public void setGruppo(int g) {
		this.gruppo = g;
	}
	
	/* metodo toString */
	public String toString() {
		return ("SIMBOLO = " + this.getSimbolo() + "\n" +
				"Z = " + this.getZ() + "\n" +
				"A = " + this.getA() + "\n" +
				"PERIODO = " + this.getPeriodo() + "\n" +
				"GRUPPO = " + this.getGruppo());
	}
	
	/* metodo equals */
	public boolean equals(Atomo a) {
		return ((this.getSimbolo() == a.getSimbolo()) && (this.getZ() == a.getZ()) && 
				(this.getA() == a.getA()) && (this.getPeriodo() == a.getPeriodo()) && 
				(this.getGruppo() == a.getGruppo()));
	}
	
	/* costruttore */
	public Atomo(char s, int z, double a, int p, int g) {
		this.simbolo = s;
		this.Z = z;
		this.A = a;
		this.periodo = p;
		this.gruppo = g;
	}
}
