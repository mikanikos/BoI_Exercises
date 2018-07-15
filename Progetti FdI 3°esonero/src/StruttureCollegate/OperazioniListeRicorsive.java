package StruttureCollegate;

class NodoLista {
	public String info;
	public NodoLista next;
	public NodoLista(String i, NodoLista n) { info = i; next = n; }
}

/* GESTIONE RICORSIVA DELLE OPERAZIONI SULLE LISTE */
public class OperazioniListeRicorsive {
	
	// Inserimento tramite posizione
	public static NodoLista addR(NodoLista p, int k, String x) {
		NodoLista q;
		if (k==0)
		    q = new NodoLista(x,p);
		else {
		    p.next = addR(p.next,k-1,x);
		    q = p;
		}
		return q;
	}
	
	// Inserimento tramite ricerca
	public static NodoLista addR(NodoLista p, String y, String x) {
		NodoLista q;
		if (p.info.equals(y))
		    q = new NodoLista(x,p);
		else {
		    p.next = addR(p.next,y,x);
		    q = p;
		}
		return q;
	}
	
	// Eliminazione tramite posizione
	public static NodoLista eliminaR(NodoLista p, int k) {
		NodoLista q;
		if (k==0) q = p.next;
		else {
		    p.next = eliminaR(p.next,k-1);
		    q = p;
		}
		return q;
	}
	
	// Eliminazione tramite ricerca
	public static NodoLista eliminaR(NodoLista p, String x) {
		NodoLista q;
		if (p.info.equals(x)) q = p.next;
		else {
		    p.next = eliminaR(p.next,x);
		    q = p;
		}
		return q;
	}
	
	// Ricerca di un elemento
	public static boolean cercaR(NodoLista p, String x) {
		boolean trovato = false;
		if (p != null)
		    if (p.info.equals(x))
		        trovato = true;
		    else trovato = cercaR(p.next,x);
		return trovato;
	}
	
	// Copia di una lista
	public static NodoLista copiaR(NodoLista p) {
		NodoLista q = null;
		if (p != null){
		    q = copiaR(p.next);
		    q = new NodoLista(p.info,q);
		}
		return q;
	}
	
	// Stampa di una lista
	public static void stampaListaR(NodoLista p) { if (p == null)
		System.out.println();
		else {
		    System.out.print(p.info + " "); 
		    stampaListaR(p.next);
		}
	}
	
	// Concatenazione liste
	public static NodoLista appendR(NodoLista p1, NodoLista p2) {
		NodoLista ris;
		if (p1 == null) ris = copiaR(p2);
		else
		    ris = new NodoLista(p1.info,appendR(p1.next,p2));
		return ris;
	}
	
	// Inversione lista
	public static NodoLista invertiListaR(NodoLista p) {
		NodoLista q;
		if (p==null) q = null;
		else {
		    NodoLista aux = invertiListaR(p.next);
		    q = aggiungiInCoda(aux,p.info);
		}
		return q;
	}
	
	// Aggiunge un nodo in coda
	public static NodoLista aggiungiInCoda(NodoLista a, String s) {
		NodoLista b;
		if (a==null)
			a=new NodoLista(s,null);
		else {
			b=a;
			while (b.next!=null)
				b=b.next;
			b.next = new NodoLista(s,null);
		}
		return a;
	}
	
	public static void main(String[] args) {
		NodoLista p = new NodoLista("ciao",new NodoLista("tre",new NodoLista("roma", null)));
		stampaListaR(invertiListaR(p));
	}
	
}
