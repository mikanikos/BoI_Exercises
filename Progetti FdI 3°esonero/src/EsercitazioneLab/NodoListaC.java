package EsercitazioneLab;

/* NodoLista per oggetti char */
public class NodoListaC {
	
	public char info;
	public NodoListaC next;
	
	public NodoListaC(char c, NodoListaC n) {
	    info = c; 
	    next = n;
	}
}
