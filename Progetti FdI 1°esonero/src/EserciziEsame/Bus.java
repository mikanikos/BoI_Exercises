package EserciziEsame;

import fiji.io.Lettore;

public class Bus {
	
	private String numIde;
	
	private int linea;
	
	private String capolinea1;
	
	private String capolinea2;
	
	/* metodi get */
	public String getNumIde() {
		return this.numIde;
	}
	
	public int getLinea() {
		return this.linea;
	}
	
	public String getCapolinea1() {
		return this.capolinea1;
	}
	
	public String getCapolinea2() {
		return this.capolinea2;
	}
	
	/* metodi set */
	public void setNumIde(String numIde) {
		this.numIde = numIde;
	}
	
	public void setLinea(int linea) {
		this.linea = linea;
	}
	
	public void setCapolinea(String cap1, String cap2) {
		this.capolinea1 = cap1;
		this.capolinea1 = cap2;
	}
	
	public String toString() {
		String s;
		s = "Il bus con numero identificativo " + this.getNumIde() + " percorre"
				+ " la linea " + this.getLinea() + " da " + this.getCapolinea1() + " a "
				+ this.getCapolinea2();
		return s;
	}
	
	public boolean equals(Bus b) {
		return ((this.numIde.equals(b.numIde)) && (this.linea == b.linea) &&
				(this.capolinea1.equals(b.capolinea1)) && (this.capolinea2.equals(b.capolinea2)));
	}
	
	public void cambiaLinea(int linea, String cap1, String cap2) {
		
		System.out.println("Inserire la nuova linea del bus");
		this.linea = Lettore.in.leggiInt();
		
		Lettore.in.leggiLinea();
		
		System.out.println("Inserire il primo capolinea del bus");
		this.capolinea1 = Lettore.in.leggiLinea();
		
		System.out.println("Inserire il secondo capolinea del bus");
		this.capolinea2 = Lettore.in.leggiLinea();
	}
	
	/* costruttore */
	public Bus(String numIde, int linea, String cap1, String cap2) {
		this.numIde = numIde;
		this.linea = linea;
		this.capolinea1 = cap1;
		this.capolinea2 = cap2;
	}

}
