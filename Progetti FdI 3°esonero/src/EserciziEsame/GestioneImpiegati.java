package EserciziEsame;

public class GestioneImpiegati {
	
	/* metodo che, dato un array di oggetti Impiegato, restituisce una nuova lista solo con quelli
	 * che hanno et� maggiore o uguale a 30 e stipendio maggiore di 1500 euro */
	public static ListaImpiegati filtra (Impiegato[] a) {

	    ListaImpiegati l,app;
	    l = new ListaImpiegati (null,null);    // nodo generatore
	    app = l;
	    
	    /* scorro ciascun elemento dell'array per verificare se soddisfa la condizione */
	    for(int i=0; i<a.length; i++) {
	        /* se viene soddisfatta la condizione aggiungo l'elemento nella
	         * lista(creata col metodo generatore) e porto avanti la variabile di appoggio */  
	        if(a[i].getEta() >= 30 && a[i].getStipendio() > 1500) {
	            app.next = new ListaImpiegati (a[i],null);
	            app = app.next;
	        }
	    }
	    return l.next;
	}

	/* metodo che data una lista restiisce la stessa senza gli impiegati con stipendio minore di 1000 */
	public static ListaImpiegati elimina1(ListaImpiegati a) {

	    /* metodo ricorsivo */
	    ListaImpiegati res;
	   
	    if(a==null) // passo base: il nodo � nullo
	        res = a;
	    else {
	        /* passo induttivo: se � da eliminare richiamo ricorsivamente il metodo sul nodo successivo eliminando quello puntato */
	        if(a.info.getStipendio() < 1000) res = elimina1(a.next);
	        /* passo induttivo: se non � soddisfatta la condizione vado avanti e richiamo ricorsivamente il metodo sul nodo successivo */
	        else {
	            a.next = elimina1(a.next);
	            res = a;
	        }
	    }
	    return res;
	}

	/* metodo che data una lista ordinata di oggetti Impiegato elimina i doppioni */
	public static ListaImpiegati eliminaDopp (ListaImpiegati a) {
	    
	    ListaImpiegati app;
	    app = a;
	    while(app.next != null) {
	        if(app.info.equals(app.next.info))
	            app.next = app.next.next;
	        app = app.next;
	    }
	    return a;
	}

	/* metodo che data una lista ne elimina i doppioni */
	public static ListaImpiegati eliminaDopp2 (ListaImpiegati a) {

	    ListaImpiegati l,app1,app2;
	    l = new ListaImpiegati(null,a);
	    app1 = l;
	    app2 = l;

	    while(app1.next != null) {
	        app2 = l;
	        while(app2.next != null) {
	            if(app1.next.info == app2.next.info && app1.next != app2.next)
	                app2.next = app2.next.next;
	            app2 = app2.next;
	        }
	        app1 = app1.next;
	    }
	    return l.next;
	}

}
