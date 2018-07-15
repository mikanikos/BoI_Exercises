package StruttureCollegate;

class NodoListaC {
    public char info;
    public NodoListaC next;
    public NodoListaC() {next = null;}
}

class NodoListaS {
	public String info;
	public NodoListaS next;
	public NodoListaS(String i, NodoListaS n) { info = i; next = n; }
}

public class OperazioniListe {
	
	/* costruzione in coda */
	public static NodoListaC creaInCoda() {
		NodoListaC a = new NodoListaC();
		NodoListaC p = a; //a rimane in testa alla lista
		p.info = 'A';
		p.next = new NodoListaC();
		p = p.next;
		char c;
		for (c = 'B'; c < 'Z'; c++) {
		    p.info = c;
		    p.next = new NodoListaC();
	 	    p = p.next; 
		}
		p.info = 'Z';
		p.next = null;
		
		return a; 
	}
	
	/* costruzione in testa */
	public static NodoListaC creaInTesta() {
		NodoListaC a = new NodoListaC();
		a.info = 'A';
		a.next = null;
		NodoListaC p = a;
		char c;
		for (c = 'B'; c <= 'Z'; c++) {
		    a = new NodoListaC();
		    a.info = c;
		    a.next = p;
		    p = a; // p va a puntare
		} // all’inizio della lista
		return p; // oppure return a;
	}
	
	/* Per stampare gli elementi sulla stessa riga */
	public static void stampa(NodoListaC p) {
		while(p.next!=null) {
		    System.out.print(p.info+" ");
		    p = p.next;
		}
		System.out.println(p.info);
	}
	
	/* Per stampare gli elementi uno sotto l’altro */
	public static void stampaColonna(NodoListaC p) {
		while(p!=null) {
			System.out.println(p.info);
			p = p.next;
		}
	}
	
	public static NodoListaC creaDaArray(char[] s) {
		NodoListaC a = new NodoListaC();
		NodoListaC p = a;
		p.info = s[0];
		p.next = new NodoListaC();
		p = p.next;
		int i;
		for (i = 1; i < s.length-1; i++) {
		    p.info = s[i];
	 	    p.next = new NodoListaC();
		    p = p.next; 
		}
		p.info = s[s.length-1];
		p.next = null;
		return a;
	}
	
	/* inserimento elemento */
	public static NodoListaS aggiungiPrimaDi(NodoListaS p, String x, String y) {
		NodoListaS q = p;
		if (p!=null)
			if(p.info.equals(y)) 
				p = new NodoListaS(x,p);
			else {
				while (q.next!=null && !q.next.info.equals(y))
					q = q.next;
				if (q.next!=null)
				    q.next = new NodoListaS(x,q.next);
			}
		return p;
	}
	
	/* ricerca elemento */
	public static boolean cerca(NodoListaS p, String x) {
		boolean trovato = false;
		if (p!=null) {
		    NodoListaS q = p;
		    while (q!=null && !trovato) {
		        if (q.info.equals(x))
		            trovato = true;
		        q = q.next;
		    }
		}
		return trovato;
	}
	
	/* eliminazione elemento */
	public static NodoListaS elimina(NodoListaS p, String x){
		if (p != null)
		    if (p.info.equals(x)) //eliminazione primo nodo
		        p = p.next;
		    else {
		    	NodoListaS q = p;
				while (q.next!=null && !q.next.info.equals(x))
				    /* Esco dal while se non ho trovato l’elemento o se ho trovato x 
				    * sul nodo successivo a q */
				    q = q.next;
				if (q.next!=null) 
					q.next = q.next.next;
			}
		return p;
	}
	
	/* modifica la prima occorrenza di x in p */
	public static void modifica(NodoListaS p, String x, String y){
		if(p!=null) {
			NodoListaS q = p;
			while(q!=null && !q.info.equals(x))
			    q = q.next;
			if(q!=null)
			    q.info = y;
		}
	}
	
	/* lunghezza lista */
	public static int lunghezza(NodoListaS p) {
		int n=0;
		NodoListaS q = p;
		while (q!=null) {
		    n++;
		    q = q.next;
		}
		return n;
	}
	
	/* copia lista */
	public static NodoListaS copia(NodoListaS p) {
		// uso un nodo generatore
		NodoListaS r = new NodoListaS(null,null); 
		NodoListaS t = r;
		NodoListaS q = p;
		while (q!=null) {
			t.next = new NodoListaS(q.info,null);
			q = q.next;
			t = t.next;
		}
		return r.next;
		// elimino il nodo generatore
	}
	
	/* concatenazione di liste */
	public static NodoListaS append(NodoListaS p1, NodoListaS p2) {
		NodoListaS r = new NodoListaS(null,null);
		// nodo generatore
		NodoListaS t = r;
		NodoListaS q = p1;
		while (q != null) {
			t.next = new NodoListaS(q.info,null);
			q = q.next;
			t = t.next;
		}
		q = p2;
		while (q != null) {
			t.next = new NodoListaS(q.info,null);
			q = q.next;
			t = t.next;
		}
		return r.next;
	}
	
	/* inversione di una lista */
	public static NodoListaS invertiLista(NodoListaS p) {
		// p riferimento alla lista da invertire
		// ris riferimento alla lista invertita
		NodoListaS ris = null;
		while (p != null) {
			// suggerimento: considerare le operazioni
			// nel ciclo come se operassero
			// su due liste p e ris:
			// -estrazione del primo elemento di p
			// -inserimento in testa alla lista ris
			NodoListaS aux = p.next;
			p.next = ris;
			ris = p;
			p = aux; 
		}
		return ris;
	}
	
	/* GESTIONE NODI TRAMITE POSIZIONE */
	
	// Inserimento in posizione data
	public static NodoListaS add(NodoListaS p, int k, String x) {
		if (k==0)
			p = new NodoListaS(x,p);
		else {
			NodoListaS q = p;
			for (int i=0; i<k-1 && q!=null; i++)
			    q = q.next;
			if (q!=null)
			    q.next = new NodoListaS(x,q.next); 
		}
		return p; 
	}
	
	// ricerca di un elemento in posizione data
	// restituisce null se non lo trova
	public static String cerca(NodoListaS p, int k) {
		String s;
		NodoListaS q = p;
		for (int i=0; i<k && q!=null; i++)
		    q = q.next;
		if (q!=null)
		    s = q.info;
		else
		    s = null;
		return s;
	}
	
	// ricerca della posizione di un elemento
	// (restituisce -1 se non lo trova)
	public static int posizione(NodoListaS p, String x) {
		NodoListaS q = p;
		int n = -1;
		int i = 0;
		while (q!=null) {
		    if (q.info.equals(x)) n = i;
		        q = q.next;
		    i++; 
		}
		return n;
	}
	
	// modifica l’elemento in posizione k
	// (se esiste !)
	public static void modifica(NodoListaS p, int k, String x) {
		NodoListaS q = p;
		for (int i=0; i<k && q!=null; i++)
		    q = q.next;
		if (q!=null)
		    q.info = x;
	}
	
	
}
