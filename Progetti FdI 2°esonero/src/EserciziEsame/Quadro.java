package EserciziEsame;

/* classe per creare oggetti di tipo Quadro */
public class Quadro {
	
	/* variabili d'istanza */
	private String titolo;   // titolo dell'opera
	private String autore;   // autore dell'opera
	private int anno;        // anno dell'opera
	
	/* metodi get */
	/* titolo */
	public String getTitolo() {
		return this.titolo;
	}
	
	/* autore */
	public String getAutore() {
		return this.autore;
	}
	
	/* anno */
	public int getAnno() {
		return this.anno;
	}
	
	/* metodi set */
	/* titolo */
	public void setTitolo(String t) {
		this.titolo = t;
	}
	
	/* autore */
	public void setAutore(String a) {
		this.autore = a;
	}
	
	/* anno */
	public void setAnno(int y) {
		this.anno = y;
	}
	
	/* costruttore */
	public Quadro(String t, String a, int y) {
		this.titolo = t;
		this.autore = a;
		this.anno = y;
	}
	
	/* metodo toString */
	public String toString() {
		return ("Titolo = " + this.titolo + "\n" +
				"Autore = " + this.autore + "\n" +
				"Anno =   " + this.anno);
	}
}
