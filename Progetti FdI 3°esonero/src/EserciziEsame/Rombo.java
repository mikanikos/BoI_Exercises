package EserciziEsame;

public class Rombo {
	
	private double diagMin;
	private double diagMax;
	
	public Rombo(double d1, double d2) {
		this.diagMin = d1;
		this.diagMax = d2;
	}
	
	public double getDiagMin() {
		return this.diagMin;
	}
	
	public double getDiagMax() {
		return this.diagMax;
	}
	
	public boolean equals(Rombo r) {
		return (this.diagMin == r.diagMin && this.diagMax == r.diagMax);
	}
	
	public String stampa() {
		return "DiagMin = " + this.diagMin + " " +
				"DiagMax = " + this.diagMax;
	}
}
