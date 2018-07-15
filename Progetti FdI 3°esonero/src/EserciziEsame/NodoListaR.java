package EserciziEsame;

public class NodoListaR {
	
	NumeroRazionale info;
	NodoListaR next;
	
	public NodoListaR (NumeroRazionale r, NodoListaR n) {
	    this.info = r; this.next = n;
	}
}