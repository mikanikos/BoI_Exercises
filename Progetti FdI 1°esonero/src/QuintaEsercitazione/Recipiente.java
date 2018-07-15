package QuintaEsercitazione;

/* classe Recipiente per istanziare oggetti che rappresentano recipienti
 * per liquidi. Tali oggetti hanno (almeno) le seguenti propriet�: una capacit�
 * massima (in litri), una altezza (in centimetri), ed un materiale di cui sono composti */
public class Recipiente {
	
	/* materiale */
	private String materiale;
	
	/* capacit� */
	private double capacita;
	
	/* altezza */
	private int altezza;
	
	/* metodi get */
	public String getMateriale() {
		return this.materiale;
	}
	
	public double getCapacita() {
		return this.capacita;
	}
	
	public int getAltezza() {
		return this.altezza;
	}
	
	/* metodi set */
	public void setMateriale(String m) {
		this.materiale = m;
	}
	
	public void setCapacita(double c) {
		this.capacita = c;
	}
	
	public void setAltezza(int a) {
		this.altezza = a;
	}
	
	/* metodo toString che restituisce una descrizione
	 * testuale dello stato del recipiente */
	public String toString() {
		String res ;
		res = "Il recipiente � composto di " + this.getMateriale() +
			", � alto " + this.getAltezza() + 
			"cm e pu� contenere " + this.getCapacita()+ " litri d'acqua.";
		return res;
	}
	
	/* metodo equals restituisce true se il recipiente che 
	 * esegue l�operazione ed r sono uguali, ovvero hanno lo
	 * stesso stato, restituisce false altrimenti */
	public boolean equals(Recipiente r) {
		return (this.capacita==r.capacita) && (this.altezza==r.altezza) 
				&& (this.materiale==r.materiale);
	}
	
	/* costruttore */
	public Recipiente(String m, int a, double c) {
		this.materiale=m;
		this.capacita=c;
		this.altezza=a;
		
	}
}
