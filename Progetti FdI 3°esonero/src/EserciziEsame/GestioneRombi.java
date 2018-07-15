package EserciziEsame;

public class GestioneRombi {
	
	public static boolean isQuadrato(Rombo r) {
		return r.getDiagMin()==r.getDiagMax();
	}
	
	public static ListaRombi soloRombi(ListaRombi b) {
		
		ListaRombi a = new ListaRombi(null,null);
		ListaRombi app = a;
		while(b != null) {
			if(!isQuadrato(b.info)) {
				app.next = new ListaRombi(b.info,null);
				app = app.next;
			}
			b = b.next;
		}
		
		ListaRombi c1 = a;
		ListaRombi c2 = a;
		while(c1.next != null) {
			c2 = a;
			while(c2.next != null) {
				if(c1.next.info.equals(c2.next.info) && c1.next != c2.next)
					c2.next = c2.next.next;
				else
					c2 = c2.next;
			}
			c1 = c1.next;
		}
		return a.next;
	}
	
	public static void main(String[] args) {
		
		Rombo r1 = new Rombo(3,4);
		Rombo r2 = new Rombo(4,4);
		Rombo r3 = new Rombo(3,4);
		
		ListaRombi l = new ListaRombi(r1,new ListaRombi(r2,new ListaRombi(r3,null)));
		stampa(soloRombi(l));
		
		ListaRombi lis;

		lis = new ListaRombi(new Rombo(3,3),
				  new ListaRombi(new Rombo(7,5),
				      new ListaRombi(new Rombo(4,4),
				          new ListaRombi(new Rombo(2,1),
				              new ListaRombi(new Rombo(5,5),
				                  new ListaRombi(new Rombo(7,5), null)
				               )
				           )
				       )
				   )
				);
		
		stampa(soloRombi(lis));
	}
	
	public static void stampa(ListaRombi p) {
		while(p.next!=null) {
		    System.out.println(p.info.stampa() +" ");
		    p = p.next;
		}
		System.out.println(p.info.stampa());
	}

}

/* ESERCIZIO SVOLTO */
/*class NienteQuadrati{

public static void main(String[] args){
	NodoListaR lis;

	lis = new NodoListaR(new Rombo(3,3),
			  new NodoListaR(new Rombo(5,8),
			      new NodoListaR(new Rombo(4,4),
			          new NodoListaR(new Rombo(2,1),
			              new NodoListaR(new Rombo(5,5),
			                  new NodoListaR(new Rombo(7,5), null)
			               )
			           )
			       )
			   )
			);
	System.out.println("lista di rombi in input");
	stampalista(lis);

	lis = togliquadrati(lis);

	System.out.println("lista di rombi senza quadtrati");
	stampalista(lis);
}

	public static NodoListaR togliquadrati(NodoListaR l){
		NodoListaR res,app;

		res = new NodoListaR(null, null);
		app = res;

		while (l!=null){
			if (l.info.getDmin()!=l.info.getDmax()){
				app.next = new NodoListaR(l.info,null);
				app = app.next;
			}
			l=l.next;
		}
		return res.next;
	}


	/* =================================================================== */
		/*public static void stampalista(NodoListaR r) {
				while (r.next !=null) {
					System.out.println(r.info.toString());
					r = r.next;
				}
				System.out.println(r.info.toString());
		}

}*/
