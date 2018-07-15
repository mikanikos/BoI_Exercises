package EserciziEsame;

public class GestionePortatili {
	
	/* metodo che assumendo come parametro un array di oggetti Portatile calcola e restituisce
	 * una struttura collegata di oggetti Portatile costituita da tutti gli oggetti dell’array
	 * in ordine crescente di memoria centrale e a parità in ordine crescente di memoria di massa,
	 * eliminando eventuali doppioni */
	public static ListaPortatili trasforma(Portatile [] a) {
	    
	    ListaPortatili l = new ListaPortatili(null,null);  // nodo generatore
	    l.next = new ListaPortatili(a[0],null);            // attacco il primo elemento al nodo generatore
	    ListaPortatili app;                                // nodo di appoggio

	    /* scansiono ogni elemento a partire dal secondo */
	    for(int i=1; i<a.length; i++) {
	        /* per ogni ciclo vado a puntare al primo nodo */
	        app = l;
	        /* fintanto che il nodo successivo non è nullo oppure non soddisfa la condizione, vado avanti */
	        while(app.next != null && !minore(a[i],app.next.info))
	            app = app.next;
	        /* aggiungo l'elemento dell'array nel posto giusto (i.e. dove si è fermato il ciclo while) */
	        app.next = new ListaPortatili(a[i],app.next);
	    }

	    return elimina(l.next);
	}

	/* metodo di supporto che restituisce true se il primo elemento ha memoria centrale minore del secondo o,
	 * a parità, ha memoria di massa minore del secondo */
	public static boolean minore(Portatile p1, Portatile p2) {
	    
	    boolean verifica = false;
	    if(p1.getMemCentrale() < p2.getMemCentrale())
	          verifica = true;
	    else
	        if(p1.getMemCentrale() == p2.getMemCentrale()) 
                if(p1.getMemMassa() < p2.getMemMassa()) 
	                verifica = true;
	    
	    return verifica;
	}

	/* metodo che elimina gli elementi che si ripetono */
	public static ListaPortatili elimina(ListaPortatili l) {
	    
	    ListaPortatili app = l;

	    while(app.next != null) {
	        if(app.info.equals(app.next.info))
	            app.next = app.next.next;
	        else
	            app = app.next;
	    }
	    return l;
	}
	
public static void main(String[] args) {
		
		Portatile[] a = new Portatile[10];
		a[0] = new Portatile("hp",1,99,2200);
		a[1] = new Portatile("acer",100,41,3000);
		a[2] = new Portatile("dell",32,98,3000);
		a[3] = new Portatile("asus",86,3,3000);
		a[4] = new Portatile("acer",32,6,300);
		a[5] = new Portatile("hp",1,98,2200);
		a[6] = new Portatile("hp",1,99,2200);
		a[7] = new Portatile("asus",32,6,66000);
		a[8] = new Portatile("acer",20,98,8);
		a[9] = new Portatile("asus",32,6,300);
		
		stampa(trasforma(a));
	}
	
	public static void stampa(ListaPortatili p) {
		while (p.next !=null) {
			System.out.println(p.info.toString());
			p = p.next;
			System.out.println();
		}
		System.out.println(p.info.toString());
    }

}
