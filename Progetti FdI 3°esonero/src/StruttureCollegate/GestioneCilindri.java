package StruttureCollegate;

public class GestioneCilindri {
	
	/* 1° ESERCIZIO: dato in input un array di cilindri (o una lista) restituire
	 * una lista di cilindri ordinata in base al volume */

	/* metodo che restituisce true se il primo cilindro ha volume <= del secondo */
	public static boolean volMin (Cilindro c1, Cilindro c2) {
	    return Math.pow(c1.getRaggio(),2)*Math.PI*c1.getAltezza() < Math.pow(c2.getRaggio(),2)*Math.PI*c2.getAltezza();
	} 

	/* metodo che restituisce la lista ordinata a partire dall'array */
	public static ListaCilindri ordinaCil (Cilindro[] a) {

	    /* variabili */
	    ListaCilindri l = new ListaCilindri (null,new ListaCilindri(a[0],null));
	    ListaCilindri app;
	    
	    /* scansiono ogni elemento dell'array, dal secondo fino all'ultimo */
	    for(int i=1; i<a.length; i++) {
	        app = l;  // punto il nodo di appoggio all'inizio della lista
	        /* finché il volume dell'elemento i-esimo non è minore del volume 
	         * del cilindro nel nodo puntato, vado avanti */ 
	        while(app.next != null && !volMin(a[i],app.next.info))
	            app = app.next;
	        /* uscito dal while, inserisco il nodo a quello successivo, vale per ogni caso */
	        if(app == l || !(a[i].equals(app.info)))
	            app.next = new ListaCilindri(a[i],app.next);
	    }
	    return l.next;
	}
	
	/* metodo che restituisce la lista ordinata a partire dalla lista */
	public static ListaCilindri ordinaCil2(ListaCilindri a) {

	    /* variabili */
	    ListaCilindri l = new ListaCilindri (null,null);
	    l.next = new ListaCilindri(a.info,null);
	    ListaCilindri app;
	    
	    /* scansiono ogni elemento dell'array dal secondo fino all'ultimo */
	    while(a.next!=null) {
	        app = l;  // punto il nodo di appoggio all'inizio della lista
	        /* finché il volume dell'elemento i-esimo non è minore del volume 
	         * del cilindro nel nodo puntato vado avanti */ 
	        while(app.next != null && !volMin(a.next.info,app.next.info))
	            app = app.next;
	        /* uscito dal while, inserisco il nodo a quello successivo ma se è già presente no */
	        if(app == l || !(a.next.info.equals(app.info)))
	            app.next = new ListaCilindri(a.next.info,app.next);
	        a = a.next;
	    }
	    return l.next;
	}

	/* 2° ESERCIZIO: dato in input un array di Cilindri restituisce una nuova lista
	 * solo con quelli che hanno superficie di base minore di 100 */

	/* metodo che verifica se la superificie di base è minore di 100 */
	public static boolean supBase (Cilindro c) {
	    return Math.pow(c.getRaggio(),2)*Math.PI < 100;
	}

	/* metodo che crea la lista solo con gli elementi desiderati */
	public static ListaCilindri soloMin10(Cilindro[] a) {
	    
	    /* variabili */
	    ListaCilindri l = new ListaCilindri(null,null);
	    ListaCilindri app = l;
	    /* scorro gli elementi dell'array uno ad uno */
	    for(int i=0; i<a.length; i++) {
	        /* se soddisfa la condizione lo inserisco nella lista */
	        if(supBase(a[i])) {
	            app.next = new ListaCilindri(a[i],app.next);
	            app = app.next;
	        }
	    }

	    return l.next;
	}

	/* 3° ESERCIZIO: dato in input una lista di cilindri restituisce una nuova lista
	 * con gli elementi che hanno superifice di base minore di 100 */
	public static ListaCilindri newLista(ListaCilindri l) {
	    
	    /* variabili */
	    ListaCilindri app = l;
	    ListaCilindri a = new ListaCilindri(null,null);
	    ListaCilindri b = a;
	    /* fintanto che l'elemento della lista di input non è nullo scorri gli elementi */
	    while(app!=null) {
	        /* se soddisfa la condizione lo inserisce nella nuova lista */
	        if(supBase(app.info)) {
	            b.next = new ListaCilindri(app.info,b.next);
	            b = b.next;
	        }
	        /* va avanti nella scansione */
	        app = app.next;
	    }
	    return a.next;
	}

	/* 4° ESERCIZIO: data una lista di cilindri restituisce la lista senza
	 * il primo elemento con raggio < 5 */
	public static ListaCilindri eliminaRaggio(ListaCilindri l) {
	    // metodo ricorsivo 
	    ListaCilindri a;   
	    /* passo base: se il primo nodo è nullo restituisco quello */
	    if(l==null)
	        a = l;
	    else {
	        /* passo base: se ho trovato l'elemento da eliminare restituisco la lista successiva */
	        if(l.info.getRaggio() < 5)
	            a = l.next;
	        /* passo induttivo: richiamo ricorsivamente il metodo sul successivo nodo */
	        else {
	            l.next = eliminaRaggio(l.next);
	            a = l;
	        }
	    }
	    return a;    
	}

	/* 5° ESERCIZIO: data una lista di cilindri restituisce la lista senza
	 * tutti gli elementi con raggio < 5 */
	public static ListaCilindri eliminaRaggio2(ListaCilindri l) {
	    // metodo ricorsivo 
	    ListaCilindri a;   
	    /* passo base: se il primo nodo è nullo restituisco quello */
	    if(l==null)
	        a = l;
	    else {
	        /* passo ricorsivo: se ho trovato l'elemento da eliminare vado avanti e richiamo il metodo ricorsivamente */
	        if(l.info.getRaggio() < 5)
	            a = eliminaRaggio2(l.next);
	        /* passo induttivo: richiamo ricorsivamente il metodo sul successivo nodo */
	        else {
	            l.next = eliminaRaggio2(l.next);
	            a = l;
	        }
	    }
	    return a;    
	}
	
	public static void main(String[] args) {
		Cilindro[] a = new Cilindro[3];
		a[0] = null;
		a[1] = new Cilindro(2,3);
		a[2] = new Cilindro(2,3);
		
		stampa(ordinaCil(a));
		stampa(soloMin10(a));
		
		ListaCilindri b = new ListaCilindri(new Cilindro(4,4),new ListaCilindri(new Cilindro(2,16),new ListaCilindri(new Cilindro(5,3),null)));
		stampa(ordinaCil2(b));
		stampa(newLista(b));
		stampa(eliminaRaggio(b));
		stampa(eliminaRaggio2(b));
	}
	
	public static void stampa(ListaCilindri p) {
		while (p.next !=null) {
			System.out.println(p.info.toString());
			p = p.next;
		}
		System.out.println(p.info.toString());
}
}
