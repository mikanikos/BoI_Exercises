package EserciziEsame;

public class NumeroComplesso {
	
	private double reale;
	private double immaginaria;
	
	public double getReale() {
		return this.reale;
	}
	
	public double getImmaginaria() {
		return this.immaginaria;
	}
	
	public NumeroComplesso(double r, double i) {
		this.reale = r;
		this.immaginaria = i;
	}
	
	public String toString() {
		return this.reale + " + i" + this.immaginaria;
	}
}
