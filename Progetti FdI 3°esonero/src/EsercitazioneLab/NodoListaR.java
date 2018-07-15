package EsercitazioneLab;

/* NodoLista per oggetti Rettangolo */
public class NodoListaR {
	
	public Rettangolo info;
	public NodoListaR next;
	
	public NodoListaR(Rettangolo r, NodoListaR i) {
		info = r;
		next = i;
	}
	
	public NodoListaR(Rettangolo r) {
		info = r;
		next = null;
	}

}