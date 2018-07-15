package EserciziEsame;

public class Cane {
	
	/* nome */
	private String nome;
	
	/* et� */
	private int eta;
	
	/* colore */
	private String colore;
	
	/* cucciolosita' */
	private boolean cucciolosita;
	
	/* metodi get */
	public String getNome() {
		return this.nome;
	}
	
	public int getEta() {
		return this.eta;
	}
	
	public String getColore() {
		return this.colore;
	}
	
	public boolean getCucciolosita() {
		return this.cucciolosita;
	}
	
	/* metodi set */
	public void setNome(String n) {
		this.nome = n;
	}
	
	public void setEta(int e) {
		this.eta = e;
	}
	
	public void setColore(String co) {
		this.colore = co;
	}
	
	public void setCucciolosita(boolean cu) {
		this.cucciolosita = cu;
	}
	
	/* metodo toString */
	public String toString() {
		String res;
		
		if(cucciolosita)
			res = "Il cane di nome " +this.nome+ " ha " +this.eta+ " anno/i, � di colore "
					+this.colore+ " ed e' molto cuccioloso";
		
		else
			res = "Il cane di nome " +this.nome+ " ha " +this.eta+ " anno/i, � di colore "
					+this.colore+ " e non e' molto cuccioloso";
				
		return res;
	}
	
	/* metodo equals */
	public boolean equals(Cane c) {
		return (this.nome.equals(c.nome) && this.eta == c.eta && this.colore.equals(c.colore) 
				&& this.cucciolosita == c.cucciolosita);
	}
	
	/* metodo cambiaCucciolosita' */
	public void cambiaCucciolosita() {
		this.cucciolosita = !this.cucciolosita;
	}

	/* costruttore */
	public Cane(String n, int e, String co, boolean cu) {
		this.nome = n;
		this.eta = e;
		this.colore = co;
		this.cucciolosita = cu;
	}
	
	

}
