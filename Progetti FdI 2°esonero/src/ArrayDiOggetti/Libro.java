package ArrayDiOggetti;

public class Libro {
	
	private String autore;
	
	private String titolo;
	
	private int pagine;
	
	private int anno;
	
	/* metodi get */
	public String getAutore() {
		return this.autore;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public int getPagine() {
		return this.pagine;
	}
	
	public int getAnno() {
		return this.anno;
	}
	
	/* metodi set */
	public void setAutore(String a) {
		this.autore = a;
	}
	
	public void setTitolo(String t) {
		this.titolo = t;
	}
	
	public void setPagine(int p) {
		this.pagine = p;
	}
	
	public void setAnno(int y) {
		this.anno = y;
	}
	
	public String toString(){
		return ("AUTORE: " + this.autore + "\n" +
		        "TITOLO: " + this.titolo + "\n"+
		        "N. PAGINE: " + this.pagine + "\n"+
		        "ANNO: " + this.anno + "\n");
		}
	
	public boolean equals(Libro l) {
		return ((this.titolo.equals(l.titolo)) && (this.autore.equals(l.autore))
				&& (this.pagine == l.pagine)) && (this.anno == l.anno);
	}
	
	public void strappaPagina() {
		this.pagine = this.pagine - 1;
	}
	
	public void modificaPagine(int nuovoNum){
		this.pagine = nuovoNum;
	}
	
	public void modificaAutore(String nuovoAutore){
		this.autore = nuovoAutore;
	}
	
	/* costruttore */
	public Libro(String a, String t, int p, int y) {
		this.autore = a;
		this.titolo = t;
		this.pagine = p;
		this.anno = y;
	}
}