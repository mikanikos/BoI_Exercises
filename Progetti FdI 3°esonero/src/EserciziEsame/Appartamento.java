package EserciziEsame;

/* classe per definire e rappresentare oggetti appartamento */
public class Appartamento  {
    
    /* variabili di istanza */
    private String indirizzo;  // indirizzo
    private double mq;         // metri quadri
    private int piano;         // piano
    private double costo;      // costo

    /* costruttore */
    public Appartamento(String i, double m, int p, double c) {
        this.indirizzo = i;
        this.mq = m;
        this.piano = p;
        this.costo = c;
    }

    /* metodi get */
    // indirizzo
    public String getIndirizzo() {
        return this.indirizzo;
    }

    // metri quadri
    public double getMq() {
        return this.mq;
    }

    // piano
    public int getPiano() {
        return this.piano;
    }
 
    // costo
    public double getCosto() {
        return this.costo;
    }

    /* metodo toString */
    public String toString() {
        return "L'appartamento situato in " +this.indirizzo+ " di " +this.mq+ " si trova al "
               +this.piano+ "° piano e costa " +this.costo+ " euro";
    }

    /* metodo equals */
    public boolean equals(Appartamento app){
    	return this.indirizzo.equals(app.indirizzo)&& this.mq==app.mq && this.piano==app.piano&&this.costo==app.costo;
    }
}
