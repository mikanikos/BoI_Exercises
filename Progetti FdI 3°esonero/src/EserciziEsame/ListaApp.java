package EserciziEsame;

/* lista per rappresenare una struttura collegata di oggetti Appartamento */
public class ListaApp {
    
    /* variabili di istanza */
    Appartamento info;   // rappresenta l'oggetto appartamento
    ListaApp next;       // rappresenta il nodo successivo

    /* costruttore */
    public ListaApp(Appartamento t, ListaApp l) {
        this.info = t;
        this.next = l;
    }
}