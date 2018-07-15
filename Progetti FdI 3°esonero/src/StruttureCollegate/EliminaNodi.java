package StruttureCollegate;

public class EliminaNodi {
/* scrivere una casse applicazione che data una lista di interi positivi,
  elimini tutti i nodi che contengano numeri pari */

	public static void main(String[] args){
		NodoListaI l;

		//creazione dell'array di interi
		System.out.println("nodi pari all'inizio e alla fine e al centro");
		l = new NodoListaI(3,new NodoListaI(4,new NodoListaI(5,
		    new NodoListaI(6,new NodoListaI(7,new NodoListaI(8,null))))));
		System.out.println("INPUT");
		stampaLista(l);
		System.out.println("=========================");
		System.out.println("elimina il primo pari iterativo");
		stampaLista(eliminaPrimoPari(l));

		l = new NodoListaI(3,new NodoListaI(4,new NodoListaI(5,
		    new NodoListaI(6,new NodoListaI(7,new NodoListaI(8,null))))));
		System.out.println("elimina il primo pari ricorsivo");
		stampaLista(eliminaPrimoPariRic(l));

		l = new NodoListaI(3,new NodoListaI(4,new NodoListaI(5,
		    new NodoListaI(6,new NodoListaI(7,new NodoListaI(8,null))))));
		System.out.println("elimina tutti i pari - metodo iterativo");
		stampaLista(eliminaTuttiPari(l));

		l = new NodoListaI(3,new NodoListaI(4,new NodoListaI(5,
		    new NodoListaI(6,new NodoListaI(7,new NodoListaI(8,null))))));
		System.out.println("elimina tutti i pari - metodo ricorsivo");
		stampaLista(eliminaTuttiPariRic(l));

		System.out.println("=========================");
		System.out.println("non ci sono nodi pari");
		l = new NodoListaI(3,new NodoListaI(5,new NodoListaI(7,
		    new NodoListaI(9,new NodoListaI(11,new NodoListaI(13,null))))));
		System.out.println("INPUT");
		stampaLista(l);
		System.out.println("elimina il primo pari iterativo");
		l = new NodoListaI(3,new NodoListaI(5,new NodoListaI(7,
		    new NodoListaI(9,new NodoListaI(11,new NodoListaI(13,null))))));
		stampaLista(eliminaPrimoPari(l));

		System.out.println("elimina il primo pari ricorsivo");
		l = new NodoListaI(3,new NodoListaI(5,new NodoListaI(7,
		    new NodoListaI(9,new NodoListaI(11,new NodoListaI(13,null))))));
		stampaLista(eliminaPrimoPariRic(l));

		System.out.println("elimina tutti i pari - metodo iterativo");
		stampaLista(eliminaTuttiPari(l));
		l = new NodoListaI(3,new NodoListaI(5,new NodoListaI(7,
		    new NodoListaI(9,new NodoListaI(11,new NodoListaI(13,null))))));
		System.out.println("elimina tutti i pari - metodo ricorsivo");
		stampaLista(eliminaTuttiPariRic(l));

	}

		//elimina la prima occorrenza di un nodo ITERATIVA
		// (elimina il primo numero pari)
		public static NodoListaI eliminaPrimoPari(NodoListaI l){
			NodoListaI app;
			app=l;
			//controllo a parte il primo nodo
			if (app.info%2==0) l=l.next;
			else{
				while(app.next!=null && app.next.info%2!=0)
					app=app.next;
				//uscita dal while, se app.next==null vuol dire che
				//non ci sono nodi pari da eliminare
				if (app.next!= null) app.next=app.next.next;
			}
			return l;
		}

		//elimina la prima occorrenza di un nodo RICORSIVA
		public static NodoListaI eliminaPrimoPariRic(NodoListaI l){
			NodoListaI res;
			if (l==null) res = l;  //PASSO BASE
			else if(l.info%2==0) res = l.next; //PASSO BASE
				 else {l.next = eliminaPrimoPariRic(l.next);
				 	   res = l;
				 }
			return res;
		}

		//elimina tutti i numeri pari dalla lista
		public static NodoListaI eliminaTuttiPari(NodoListaI l){
			NodoListaI app;
			app=l;
			while(app.next.next!=null){
				if (app.next.info%2==0)
					app.next=app.next.next;
				else app = app.next;
			}
			// controllo l'ultimo nodo
			if (app.next.info%2==0) app.next = null;
			// controllo il primo nodo
			if (l.info%2==0) l=l.next;
			return l;
		}

		//elimina tutti i numeri pari dalla lista RICORSIVA
		public static NodoListaI eliminaTuttiPariRic(NodoListaI l){
			NodoListaI res;
			//PASSO BASE
			if (l==null) res = l;
			else if(l.info%2==0) res = eliminaTuttiPariRic(l.next);
				 else {l.next = eliminaTuttiPariRic(l.next);
				 	   res = l;
				 }
			return res;
		}

	/* =================================================================== */
		public static void stampaLista(NodoListaI p) {
			if (p!=null){
				while (p.next !=null) {
					System.out.println(p.info);
					p = p.next;
				}
				System.out.println(p.info);
			}
		}
	/* =================================================================== */


}