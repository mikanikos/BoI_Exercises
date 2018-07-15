package EserciziEsame;

/* classe per istanziare oggetti che rappresentano quadrati nel piano */
public class Quadrato {
	
	/* variabili di istanza */
	
	/* vertice in basso a sinistra */ 
	private double coordinataXBS;
	private double coordinataYBS;
	
	/* vertice in basso a destra */
	private double coordinataXAD;
	private double coordinataYAD;
	
	/* metodi get */
	public double getCoordinataXBS() { 
		return this.coordinataXBS;
	}
	
	public double getCoordinataYBS() {
		return this.coordinataYBS;
	}
	
	public double getCoordinataXAD() { 
		return this.coordinataXAD;
	}
	
	public double getCoordinataYAD() {
		return this.coordinataYAD;
	}
	
	
	/* metodi set */
	public void setCoordinataXBS(double cord1) {
		this.coordinataXBS = cord1;
	}
	
	public void setCoordinataYBS(double cord2) {
		this.coordinataYBS = cord2;
	}
	
	public void setCoordinataXAD(double cord3) {
		this.coordinataXAD = cord3;
	}
	
	public void setCoordinataYAD(double cord4) {
		this.coordinataYAD = cord4;
	}
	
	/* metodo toString */
	public String toString() {
		return "Il vertice in basso a sinistra del quadrato ha coordinate " +this.coordinataXBS+ ""
				+ " e " +this.coordinataYBS+ " ed"
				+ " il vertice in alto a destra del quadrato ha coordinate" +this.coordinataXAD+
				" e " +this.getCoordinataYAD();
	}
	
	/* metodo equals */
	public boolean equals(Quadrato q) {
		return ((this.coordinataXBS == q.coordinataXBS) && (this.coordinataYBS == q.coordinataXBS)
				&& (this.coordinataXAD == q.coordinataXAD) && (this.coordinataYAD == q.coordinataYAD));
	}
	
	/* metodo per il calcolo dell'area del quadrato */
	public double area() {
		
		double diagonale;
		double lato;
		double area;
		
		diagonale = Math.sqrt((Math.pow(this.coordinataXAD - this.coordinataXBS, 2)+ 
				Math.pow(this.coordinataYAD - this.coordinataYBS, 2)));
		
		lato = diagonale / (Math.sqrt(2.0));
		
		area = lato*lato;
		
		return area;
	}
	
	/* metodo per il calcolo del perimetro del quadrato */
	public double perimetro() {
		
		double diagonale;
		double lato;
		double perimetro;
		
		diagonale = Math.sqrt((Math.pow(this.coordinataXAD - this.coordinataXBS, 2)+ 
				Math.pow(this.coordinataYAD - this.coordinataYBS, 2)));
		
		lato = diagonale / (Math.sqrt(2.0));
		
		perimetro = lato*4;
		
		return perimetro;
	}
	
	/* metodo per stabilire se il quadrato q è contenuto nel quadrato che esegue l'operazione */
	public boolean contiene(Quadrato q) {
		
		boolean contiene, verticeDx, verticeSn;
		
		verticeDx = false;
		verticeSn = false;
		contiene = false;
		
		if(q.coordinataXBS >= this.coordinataXBS && q.coordinataYBS >= this.coordinataYBS)
			verticeSn = true;
		if (q.coordinataXAD <= this.coordinataXAD && q.coordinataYAD <= this.coordinataYAD)
			verticeDx = true;
		
		contiene = verticeSn && verticeDx;
		
		return contiene;
	}
	
	/* costruttore */
	public Quadrato(double cord1, double cord2, double cord3, double cord4) {
		this.coordinataXBS = cord1;
		this.coordinataYBS = cord2;
		this.coordinataXAD = cord3;
		this.coordinataYAD = cord4;
	}

}
