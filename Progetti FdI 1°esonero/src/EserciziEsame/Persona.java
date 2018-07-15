package EserciziEsame;

/* classe per rappresentare persone */
public class Persona {

	/* nome */
	String nome;
	
	/* cognome */
	String cognome;
	
	/* peso in kg */
	int peso;

	/* altezza in cm */
	int altezza;

	/* eta' in anni */
	int eta;
	
	/* metodi get */
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getAltezza() {
		return altezza;
	}

	/* metodi set */
	public void setNome(String n) {
		nome = n;
	}

	public void setCogome(String c) {
		cognome = c;
	}

	public void setAltezza(int a) {
		altezza = a;
	}

	public void setPeso(int p) {
		peso = p;
	}

	public void setEta(int e) {
		eta = e;
	}

	/* metodo toString */
	public String toString() {
		return nome + " " + cognome + " ha " + eta + " anni, pesa " + 
	peso + " chili ed e' alto " + altezza + " centimetri.";
	}
	
	/* metodo equals */
	public boolean equals(Persona p) {
		return (nome.equals(p.nome)) &&  (cognome.equals(p.cognome)) && (peso == p.peso)
				 && (altezza == p.altezza)  && (eta == p.eta);
	}
	
	/* metodo ingrassa */
	public void ingrassa() {
		peso = peso +1;
	}
	
	/* costruttore */
	public Persona(String n, String c, int e, int a, int p) {
		nome = n;
		cognome = c;
		eta = e;
		altezza = a;
		peso = p;
	}
}