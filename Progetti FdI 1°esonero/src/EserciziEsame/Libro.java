package EserciziEsame;

public class Libro {
	
	private String titolo;
	
	private String autore;
	
	private String genere;
	
	private int pagine;
	
	/* metodi get */
	public String getTitolo() {
		return this.titolo;
	}
	
	public String getAutore() {
		return this.autore;
	}
	
	public String getGenere() {
		return this.genere;
	}
	
	public int getPagine() {
		return this.pagine;
	}
	
	/* metodi set */
	public void setTitolo(String t) {
		this.titolo = t;
	}
	
	public void setAutore(String a) {
		this.autore = a;
	}
	
	public void setGenere(String g) {
		this.genere = g;
	}
	
	public void setPagine(int p) {
		this.pagine = p;
	}
	
	public String toString() {
		String s;
		s = "Il libro " + this.getTitolo() + " di " + this.getAutore() + " "
				+ "ha " + this.getPagine() + " pagine ed è del genere " + this.getGenere();
		return s;
	}
	
	public boolean equals(Libro l) {
		return ((this.titolo.equals(l.titolo)) && (this.autore.equals(l.autore)) &&
				(this.genere.equals(l.genere)) && (this.pagine == l.pagine));
	}
	
	public void strappaPagina() {
		this.pagine = this.pagine - 1;
	}
	
	/* costruttore */
	public Libro(String t, String a, String g, int p) {
		this.titolo = t;
		this.autore = a;
		this.genere = g;
		this.pagine = p;
	}

}
