package EserciziEsame;

/* classe per rappresentare e gestire oggetti computer portatili */
public class Portatile {
    
    /* variabili di istanza */
    private String marca;        // marca
    private double processore;   // velocità del processore
    private int memCentrale;     // capacità della memoria centrale
    private int memMassa;        // capacità della memoria di massa

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

    // velocità del processore
    public double getProcessore() {
        return this.processore;
    }

    // capacità della memoria di centrale
    public int getMemCentrale() {
        return this.memCentrale;
    }

    // capacità della memoria di massa
    public int getMemMassa() {
        return this.memMassa;
    }

    /* metodo toString */
    public String toString() {
        return "Marca = " + this.marca + "\n" +
               "Velocità del processore = " + this.processore + "\n" +
               "Capacità della memoria centrale = " + this.memCentrale + "\n" +
               "Capacità della memoria di massa = " + this.memMassa;
    }

    /* metodo equals */
    public boolean equals(Portatile p) {
        return ((this.marca.equals(p.marca)) && (this.processore == p.processore) &&
                (this.memCentrale == p.memCentrale) && (this.memMassa == p.memMassa));
    }
}