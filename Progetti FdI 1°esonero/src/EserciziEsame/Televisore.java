package EserciziEsame;

/* classe per rappresentare televisori */
public class Televisore {

	/* marca */
	private String marca;
	
	/* stato di accensione */
	private boolean acceso;
	
	/* canale */
	private int canale;
	
	/* volume */
	private int volume;
	
	/* metodi get */
	public String getMarca() {
		return this.marca;
	}
	
	public boolean getAcceso() {
		return this.acceso;
	}
	
	public int getCanale() {
		return this.canale;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	/* metodi set */
	public void setMarca(String m) {
		this.marca = m;
	}
	
	public void setAcceso(boolean a) {
		this.acceso = a;
	}
	
	public void setCanale(int c) {
		this.canale = c;
	}
	
	public void setVolume(int v) {
		this.volume = v;
	}

	/* metodo toString */
	public String toString() {
		String res;
		if(acceso)
			res = "il televisore di marca " + this.getMarca() +
			" e' acceso sul canale " + this.getCanale() + 
			" con volume " + this.getVolume();
		else
			res = "il televisore di marca " + this.getMarca() +
			" e' spento";
		return res;
	}
	
	/* metodo equals */
	public boolean equals(Televisore t) {
		return (this.volume==t.volume) && (this.canale==t.canale) 
				&& (this.acceso==t.acceso) && (this.marca.equals(t.marca));
	}
	
	/* metodo alzaVolume */
	public void alzaVolume() {
		this.volume++;
	}
	
	/* costruttore */
	public Televisore(String m, boolean a, int c, int v) {
		this.marca=m;
		this.acceso=a;
		this.canale=c;
		this.volume=v;
	}
}