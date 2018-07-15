package EserciziEsame;

/* Classe Automobile per istanziare oggetti che rappresentano automobili. 
 * Tali oggetti hanno (almeno) le seguenti proprietà: una marca, una targa, 
 * un anno di immatricolazione ed un contachilometri */
public class Automobile {
	
	/* marca */
    private String marca;
	
    /* targa */
	private String targa;
	
	/* anno di immatricolazione */
	private int annoImm;
	
	/* conta chilometri */
	private double contaKm;
	
	/* metodi get */
	public String getMarca() {
		return this.marca;
	}
	
	public String getTarga() {
		return this.targa;
	}
	
	public int getAnnoImm() {
		return this.annoImm;
	}
	
	public double getContaKm() {
		return this.contaKm;
	}
	
	/* metodi set */
	public void setMarca(String m) {
		this.marca = m;
	}
	
	public void setTarga(String t) {
		this.targa = t;
	}
	
	public void setAnnoImm(int i) {
		this.annoImm = i;
	}
	
	public void setContaKm(double k) {
		this.contaKm = k;
	}
	
	/* Metodo che restituisce una descrizione testuale dello stato dell’automobile */
	public String toString() {
		String s;
		s = "L’automobile di marca " + this.getMarca() + " è targata " + this.getTarga() + ","
				+ " è stata immatricolata nel " + this.getAnnoImm() + " ed ha percorso "
						+  this.getContaKm() + " chilometri";
		
		return s;
	}
	
	/* Metodo che restituisce true se l’automobile che esegue l’operazione ed a sono 
	 * uguali, ovvero hanno lo stesso stato, restituisce false altrimenti*/
	public boolean equals(Automobile a) {
		return ((this.marca.equals(a.marca)) || ((this.targa.equals(a.targa)) ||
				(this.annoImm == a.annoImm) || (this.contaKm == a.contaKm)));
	}
	
	/* Metodo che aggiorna il contachilometri con la lunghezza di un nuovo viaggio */
	public void inserisciViaggio(int lunghezza) {
		this.contaKm = this.contaKm + lunghezza;
	}
	
	/* costruttore */
	public Automobile(String m, String t, int i, double k) {
		this.marca = m;
		this.targa = t;
		this.annoImm = i;
		this.contaKm = k;
	}

}
