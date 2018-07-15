package StruttureCollegate;

public class ListaCilindri {
	
	/* variabili di istanza */
	Cilindro info;
	ListaCilindri next;

	/* costruttore */
	public ListaCilindri (Cilindro c, ListaCilindri l) {
	    this.info = c;
	    this.next = l;
	}
}
