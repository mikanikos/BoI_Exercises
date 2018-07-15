package EserciziEsame;

/* classe per la creazione di una lista di oggetti Libro */
public class ListaLibri {

    /* variabili d'istanza */
    public Libro info;          // campo info � occupato da un oggetto Libro
    public ListaLibri next;     // campo next � occupato dal sucessivo nodo

    /* costruttore */
    public ListaLibri (Libro l, ListaLibri x) {
        this.info = l;
        this.next = x;
    }
}