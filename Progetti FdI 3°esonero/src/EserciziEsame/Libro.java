package EserciziEsame;

/* classe per la creazione e gestione di oggetti Libro */
public class Libro {

    /* variabili d'istanza */
    private String autore;        // autore del libro
    private String titolo;        // titolo del libro
    private String utente;        // utente che ha preso il libro
    private Data prestito;        // data di presa in prestito
    private Data restituzione;    // data della restituzione

    /* metodi get */
    public String getAutore() { return this.autore; }              // autore del libro 
    public String getTitolo() { return this.titolo; }              // titolo del libro
    public String getUtente() { return this.utente; }              // utente che ha preso il libro
    public Data getPrestito() { return this.prestito; }            // data di presa in prestito
    public Data getRestituzione() { return this.restituzione; }    // data della restituzione

    /* costruttore */
    public Libro (String a, String t, String u, Data p, Data r) {
        this.autore = a;
        this.titolo = t;
        this.utente = u;
        this.prestito = p;
        this.restituzione = r;
    }

    /* metodo toString */
    public String toString() {
        return "Autore: " + this.autore + "\n" +
               "Titolo: " + this.titolo + "\n" +
               "Utente: " + this.utente + "\n" +
               "Data prestito: " + this.prestito + "\n" +
               "Data restituzione: " + this.restituzione;
    }
}