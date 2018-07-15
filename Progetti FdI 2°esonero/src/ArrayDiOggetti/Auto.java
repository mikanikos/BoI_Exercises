package ArrayDiOggetti;

public class Auto {
	
	/* marca */
    private String marca;
	
    /* targa */
	private String targa;
	
	/* anno di immatricolazione */
	private int annoImm;
	
	/* modello */
	private String modello;
	
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
	
	public String getModello() {
		return this.modello;
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
	
	public void setModello(String mod) {
		this.modello = mod;
	}
	
	/* Metodo che restituisce una descrizione testuale dello stato dell’automobile */
	public String toString() {
		String s;
		s = "L’automobile di marca " + this.getMarca() + " è targata " + this.getTarga() + ","
				+ " è stata immatricolata nel " + this.getAnnoImm();
		
		return s;
	}
	
	/* Metodo che restituisce true se l’automobile che esegue l’operazione ed a sono 
	 * uguali, ovvero hanno lo stesso stato, restituisce false altrimenti*/
	public boolean equals(Auto a) {
		return ((this.marca.equals(a.marca)) || ((this.targa.equals(a.targa)) ||
				(this.annoImm == a.annoImm)));
	}
	
	/* costruttore */
	public Auto(String m, String t, int i, String mod) {
		this.marca = m;
		this.targa = t;
		this.annoImm = i;
		this.modello = mod;
	}
	
	/* metodo che restituisce un array di oggetti Auto tutti con una certa marca e modello */
	public Auto[] marcaModello(Auto[] a, String marca, String modello) {
		
		Auto[] a2;
		int i, j, contatore=0;
		
		/* calcolo lunghezza dell'array con stessa marca e modello */
		for(i=0; i<a.length; i++)
			if(a[i].getMarca().equals(marca) && a[i].getModello().equals(modello))
				contatore++;
		
		/* creazione array da restituire */
		a2 = new Auto[contatore];
		
		j=0;
		/* copia gli elementi con stessa marca e modello desiderati nel nuovo array */
		for(i=0; i<a.length; i++)
			if(a[i].getMarca().equals(marca) && a[i].getModello().equals(modello)) {
				a2[j] = a[i];
				j++;
			}
		
		return a2;
	}
	
	/* metodo che restituisce l'oggetto Auto più vecchia */
	public Auto piuVecchia(Auto[] a) {
		
		int i, posizione=0;
		int anno = a[0].getAnnoImm();
		
		/* ricerca dell'auto più vecchia e memorizza l'indice */
		for(i=1; i<a.length; i++)
			if(a[i].getAnnoImm() < anno)
				posizione = i;
		
		return a[posizione];
	}
}