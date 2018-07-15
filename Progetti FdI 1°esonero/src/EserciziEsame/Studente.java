package EserciziEsame;

public class Studente {
	
	private String nome;
	
	private String cognome;
	
	private int matricola;
	
	private int numEsami;
	
	private double mediaVoto;
	
	/* metodi get */
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public int getMatricola() {
		return this.matricola;
	}
	
	public int getNumEsami() {
		return this.numEsami;
	}
	
	public double getMediaVoto() {
		return this.mediaVoto;
	}
	
	/* metodi set */
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setCognome(String c) {
		this.cognome = c;
	}
	
	public void setMatricola(int m) {
		this.matricola = m;
	}
	
	public void setNumEsami(int e) {
		this.numEsami = e;
	}
	
	public void setMediaVoto(double v) {
		this.mediaVoto = v;
	}
	
	public String toString() {
		String s;
		s = "Lo studente " + this.getNome() + " " + this.getCognome() + ", con numero di matricola"
				+ " " + this.getMatricola() + ", ha sostenuto " + this.getNumEsami() + " "
						+ "esami con una media voto di " + this.getMediaVoto();
		return s;
	}
	
	public boolean equals (Studente s) {
		boolean uguali;
		uguali = (this.nome == s.nome) && (this.cognome == s.cognome) &&
				(this.matricola == s.matricola) && (this.numEsami == s.numEsami) &&
				(this.mediaVoto == s.mediaVoto);
		return uguali;
	}
	
	public void acquisisciEsame(int voto) {
		this.numEsami++;
		this.mediaVoto = ((this.mediaVoto * this.numEsami) + voto)/(this.numEsami+1);
	}
	
	/* costruttore */
	public Studente (String n, String c, int m, int e, double v) {
		this.nome = n;
		this.cognome = c;
		this.matricola = m;
		this.numEsami = e;
		this.mediaVoto = v;
	}

}
