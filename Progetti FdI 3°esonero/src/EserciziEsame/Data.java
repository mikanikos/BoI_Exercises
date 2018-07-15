package EserciziEsame;

/* classe per la creazione e gestione di oggetti Data */
public class Data {
    
    /* variabili d'istanza */
    private int giorno;      // giorno
    private int mese;        // mese
    private int anno;        // anno

    /* metodi get */
    public int getGiorno() { return this.giorno; }     // giorno
    public int getMese() { return this.mese; }         // mese
    public int getAnno() { return this.anno; }         // anno

    /* costruttore */
    public Data (int g, int m, int a) {
        this.giorno = g;
        this.mese = m;
        this.anno = a;
    }

    /* metodo toString */
    public String toString() {
        return this.giorno + "/" + this.mese + "/" + this.anno;
    }
}