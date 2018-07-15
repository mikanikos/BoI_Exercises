package EserciziEsame;

import fiji.io.Lettore;

/* classe per istanziare oggetti moneta */
public class Moneta {
	
	/* variabili di istanza */
	
	/* valore */
	private double valore;
	
	/* nazionalità */
	private String nazione;
	
	/* anno */
	private int anno;
	
	/* metodi get */
	public double getValore() {
		return this.valore;
	}
	
	public String getNazione() {
		return this.nazione;
	}
	
	public int getAnno() {
		return this.anno;
	}
	
	/* metodi set */
	public void setValore(double v) {
		this.valore = v;
	}
	
	public void setNazione(String n) {
		this.nazione = n;
	}
	
	public void setAnno(int a) {
		this.anno = a;
	}
	
	/* metodo toString */
	public String toString() {
		String res;
		
		if(this.valore < 1) {
			res = "La moneta ha un valore di " +this.valore+ " centesimi di euro ed è stata "
					+ "fabbricata in " +this.nazione+ " nell'anno " +this.anno;
		}
		else {
			res = "La moneta ha un valore di " +(int)this.valore+ " euro ed è stata fabbricata "
					+ "in " +this.nazione+ " nell'anno " +this.anno;
		}
		return res;
	}
	
	/* metodo equals */
	public boolean equals(Moneta m) {
		return ((this.valore == m.valore) && (this.nazione.equals(m.nazione)) && 
				(this.anno == m.anno));
	}
	
	/* metodo modificaValore */
	public void modificaValore() {
		System.out.println("Inserisci il nuovo valore della moneta");
		this.valore = Lettore.in.leggiDouble();
	}
	
	
	/* costruttore */
	public Moneta(double v, String n, int a) {
		this.valore = v;
		this.nazione = n;
		this.anno = a;
	}
}
