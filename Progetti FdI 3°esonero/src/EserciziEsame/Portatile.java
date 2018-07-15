package EserciziEsame;

/* classe per rappresentare e gestire oggetti computer portatili */
public class Portatile {
    
    /* variabili di istanza */
    private String marca;        // marca
    private double processore;   // velocit� del processore
    private int memCentrale;     // capacit� della memoria centrale
    private int memMassa;        // capacit� della memoria di massa

    /* costruttore */
    public Portatile (String m, double p, int mc, int mm) {
        this.marca = m;
        this.processore = p;
        this.memCentrale = mc;
        this.memMassa = mm;
    }

    /* metodi get */
    // marca
    public String getMarca() {
        return this.marca;
    }

    // velocit� del processore
    public double getProcessore() {
        return this.processore;
    }

    // capacit� della memoria di centrale
    public int getMemCentrale() {
        return this.memCentrale;
    }

    // capacit� della memoria di massa
    public int getMemMassa() {
        return this.memMassa;
    }

    /* metodo toString */
    public String toString() {
        return "Marca = " + this.marca + "\n" +
               "Velocit� del processore = " + this.processore + "\n" +
               "Capacit� della memoria centrale = " + this.memCentrale + "\n" +
               "Capacit� della memoria di massa = " + this.memMassa;
    }

    /* metodo equals */
    public boolean equals(Portatile p) {
        return ((this.marca.equals(p.marca)) && (this.processore == p.processore) &&
                (this.memCentrale == p.memCentrale) && (this.memMassa == p.memMassa));
    }
}