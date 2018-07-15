package EserciziEsame;

/* classe per rappresentare una struttura collegata di oggetti Portatile */
public class ListaPortatili {
    
    /* variabili di istanza */
    Portatile info;          // info � un oggetto portatile
    ListaPortatili next;     // nodo successivo � una lista di oggetti Portatile

    /* costruttore */
    public ListaPortatili(Portatile p, ListaPortatili l) {
        this.info = p;
        this.next = l;
    }
}