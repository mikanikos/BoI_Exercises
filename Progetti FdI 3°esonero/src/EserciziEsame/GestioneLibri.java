package EserciziEsame;

public class GestioneLibri {
	
	/* metodo che data una lista di oggetti Libro restituisce una nuova lista
	 * con tutti i Libri il cui prestito è scaduto */
	public static ListaLibri filtra (ListaLibri l) {
	    
	    ListaLibri f = new ListaLibri(null,null);
	    ListaLibri app = f;
	    Data oggi = new Data(24,5,2016);
	    
	    while(l!=null) {
	        if(scaduto(l.info.getRestituzione(),oggi)) {
	            app.next = new ListaLibri(l.info,null);
	            app = app.next;
	        }
	        l = l.next;
	    }
	    return f.next;
	}

	/* metodo che resituisce true se la prima data è posteriore alla seconda */
	public static boolean scaduto(Data d, Data o) {
	    return(d.getAnno() < o.getAnno()) || (d.getAnno() == o.getAnno() && d.getMese() < o.getMese()) ||
	      (d.getAnno() == o.getAnno() && d.getMese() == o.getMese() && d.getGiorno() < o.getGiorno());
	}
	
	public static void main(String[] args) {
		Data d1 = new Data(10,5,2013);
		Data d2 = new Data(10,5,2013);
		Data d3 = new Data(10,3,2016);
		Data d4 = new Data(20,5,2016);
		Data d5 = new Data(30,5,2016);
		Libro l1 = new Libro("Il cane","Ciolin","Io",d1,d3);
		Libro l2 = new Libro("Il cane","Ciolin","Io",d1,d4);
		Libro l3 = new Libro("Il cane","Ciolin","Io",d1,d1);
		Libro l4 = new Libro("Il cane","Ciolin","Io",d1,d5);
		Libro l5 = new Libro("Il cane","Ciolin","Io",d1,d2);
		
		ListaLibri x = new ListaLibri(l5,new ListaLibri(l1,new ListaLibri(l3,new ListaLibri(l4,new ListaLibri(l2,null)))));
		
		stampa(filtra(x));
	}
	
	public static void stampa(ListaLibri p) {
		while (p.next !=null) {
			System.out.println(p.info.toString());
			p = p.next;
			System.out.println();
		}
		System.out.println(p.info.toString());
    }
}
