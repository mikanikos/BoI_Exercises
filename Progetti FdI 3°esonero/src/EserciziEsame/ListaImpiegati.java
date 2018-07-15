package EserciziEsame;

/* classe per la creazione di una lista di oggetti Impiegato */
public class ListaImpiegati {

    /* variabili d'istanza */
    public Impiegato info;        // campo info
    public ListaImpiegati next;   // campo next

    /* costruttore */
    public ListaImpiegati (Impiegato i, ListaImpiegati l) {
        this.info = i;
        this.next = l;
    }
}
