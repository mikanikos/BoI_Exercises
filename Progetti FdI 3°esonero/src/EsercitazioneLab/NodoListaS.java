package EsercitazioneLab;

/* NodoLista per stringhe */
public class NodoListaS {
	
	public String info;
	public NodoListaS next;
	
	public NodoListaS(String i, NodoListaS n){
		info = i;
		next = n;
	}
}