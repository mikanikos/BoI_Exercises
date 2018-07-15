package EserciziEsame;

/* classe per la creazione e gestione di oggetti Impiegato */
public class Impiegato {
    
    /* variabili d'istanza */
    private String nome;         // nome dell'impiegato
    private String cognome;      // cognome dell'impiegato
    private int eta;             // et� dell'impiegato
    private double stipendio;    // stipendio dell'impiegato

    /* costruttore */
    public Impiegato (String n, String c, int e, double s) {
        this.nome = n;
        this.cognome = c;
        this.eta = e;
        this.stipendio = s;
    }

    /* metodi get */
    public String getNome() { return this.nome; }               // nome dell'impiegato
    public String getCognome() { return this.cognome; }         // cognome dell'impiegato
    public int getEta() { return this.eta; }                    // et� dell'impiegato
    public double getStipendio() { return this.stipendio; }     // stipendio dell'impiegato

    /* metodo toString */
    public String toString() {
        return "Nome: " + this.nome + "\n" +
               "Cognome: " + this.cognome + "\n" +
               "Et�: " + this.eta + "\n" +
               "Stipendio: " + this.stipendio;
    }

    /* metodo equals */
    public boolean equals(Impiegato i) {
        return (this.nome.equals(i.nome) && this.cognome.equals(i.cognome) && this.eta == i.eta && this.stipendio == i.stipendio);
    }
}