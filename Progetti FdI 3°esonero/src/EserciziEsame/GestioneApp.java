package EserciziEsame;

public class GestioneApp {
	
	/* metodo che assumendo come parametro un array di oggetti Appartamento calcola
	 * e restituisce una struttura collegata di oggetti Appartamento costituita da 
	 * tutti gli oggetti dell’array in ordine crescente di mq e, a parità di mq, 
	 * in ordine crescente di costo */
	public static ListaApp trasforma(Appartamento[] t) {

	    ListaApp l = new ListaApp(null,null);    // nodo generatore
	    l.next = new ListaApp(t[0],null);        // primo elemento dell'array inserito nella lista
	    ListaApp a;                              // lista di supporto

	    /* scansiono ogni elemento per inserirlo ordinatamente nella lista */
	    for(int i=1; i<t.length; i++) {
	        /* puntatore fissato all'inizio della lista per ogni ciclo */
	        a = l;
	        /* fintanto che il nodo successivo nodo non è nullo o maggiore dell'elemento dell'array vado avanti */
	        while(a.next != null && !minoreU(t[i],a.next.info))
	            a = a.next;
	        /* se soddisfa la condizione lo inserisco tranquillamente */
	        a.next = new ListaApp(t[i],a.next);
	    }
	    return elimina(l.next);
	}
	
	/* elimina i doppioni */
	public static ListaApp elimina(ListaApp l) {
		
		ListaApp a = l;
		while(a.next != null) {
			if(a.info.equals(a.next.info))
				a.next = a.next.next;
			a = a.next;
		}
		return l;
	}
	
	/* metodo che assumendo come parametro un array di oggetti Appartamento calcola
	 * e restituisce una struttura collegata di oggetti Appartamento costituita da 
	 * tutti gli oggetti dell’array in ordine crescente di mq e, a parità di mq, 
	 * in ordine crescente di costo, eliminando eventuali doppioni */
	public static ListaApp trasforma2(Appartamento[] t) {

	    ListaApp l = new ListaApp(null,null);    // nodo generatore
	    l.next = new ListaApp(t[0],null);        // primo elemento dell'array inserito nella lista
	    ListaApp a;                              // lista di supporto

	    /* scansiono ogni elemento per inserirlo ordinatamente nella lista */
	    for(int i=1; i<t.length; i++) {
	        /* puntatore fissato all'inizio della lista per ogni ciclo */
	        a = l;
	        /* fintanto che il nodo successivo nodo non è nullo o maggiore dell'elemento dell'array vado avanti */
	        while(a.next != null && !minoreU(t[i],a.next.info))
	        	a = a.next;
	        /* se soddisfa la condizione lo inserisco tranquillamente, sennò non lo metto */
	    	if(a == l || !(t[i].equals(a.info)))
	    		a.next = new ListaApp(t[i],a.next);
	    }
	    return l.next;
	}

	/* metodo che dati due oggetti Appartamento restituisce true se il primo ha un
	 * minor numero (o uguale) di metri quadri e se uguali true se il costo del primo è minore */
	public static boolean minoreU(Appartamento t1, Appartamento t2) {
	    return (t1.getMq() < t2.getMq()) || ((t1.getMq() == t2.getMq()) && (t1.getCosto() < t2.getCosto()));
	}
	
	public static void main(String[] args) {
		
		Appartamento[] a = new Appartamento[10];
		a[0] = null;
		a[1] = new Appartamento("via balduina",100,3,3000);
		a[2] = new Appartamento("via yenner",32,3,3000);
		a[3] = new Appartamento("via portuense",86,3,3000);
		a[4] = new Appartamento("via magliana",40,3,3000);
		a[5] = new Appartamento("viale marconi",1330,3,3000);
		a[6] = new Appartamento("via isacco newton",100,3,3000);
		a[7] = new Appartamento("via yenner",32,3,3000);
		a[8] = new Appartamento("via otranto",98,3,3000);
		a[9] = new Appartamento("via roma",32,3,30999);
		
		Appartamento[] k = new Appartamento[]{
				
				new Appartamento("viale marconi",55,2,555555),
				new Appartamento("piazza di spagna",30,4,500000),
				new Appartamento("viale marconi",55,3,180000),
				new Appartamento("viale marconi",55,3,180000),
				new Appartamento("via segre",100,4,350000),
				new Appartamento("via cassia",12,5,400000),
				new Appartamento("via cassia",12,5,400000)
		};
		
		stampa(trasforma(a));
		System.out.println();
		stampa(trasforma(k));
		
		System.out.println();
		
		stampa(trasforma2(a));
		System.out.println();
		stampa(trasforma2(k));
	}
	
	public static void stampa(ListaApp p) {
		while (p.next !=null) {
			System.out.println(p.info.getMq() +" , "+ p.info.getCosto());
			p = p.next;
		}
		System.out.println(p.info.getMq() +" , "+ p.info.getCosto());
    }
}
