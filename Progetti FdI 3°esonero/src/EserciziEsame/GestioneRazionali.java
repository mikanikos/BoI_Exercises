package EserciziEsame;

public class GestioneRazionali {
	
	public static void main(String[] args){
		NumeroRazionale[] a;

		//creazione dell'array di razionali
		a = new NumeroRazionale[]{new NumeroRazionale(2,3),new NumeroRazionale(1,6),
		    new NumeroRazionale(7,5),new NumeroRazionale(5,2),new NumeroRazionale(2,5),
		    new NumeroRazionale(1,4)};
		System.out.println("lista ordinata");
		stampaLista(ordina(a));
		System.out.println("lista ordinata");
		stampaLista(ordina1(a));
	}

	//restituisce true se r1 <= r2
	public static boolean minoreU(NumeroRazionale r1, NumeroRazionale r2){
		return r1.getNum()*r2.getDen() <= r2.getNum()*r1.getDen();
	}

/* primo esempio di metodo */
	public static NodoListaR ordina(NumeroRazionale[] a){
		NodoListaR l,app;
		boolean inserito;
		int i;

		l=new NodoListaR(null, null);
		l.next = new NodoListaR(a[0],null);
		for(i=1; i<a.length; i++){
			app = l;
			inserito= false;
			while(app.next!=null && !inserito){
				if (minoreU(a[i],app.next.info)){
						app.next = new NodoListaR(a[i],app.next);
						inserito=true;
					}
				else app=app.next;
			}
			//se sono uscita dal while senza inserire
			//(caso numero piu' grande come ultimo della lista)
			if (app.next==null)
				app.next = new NodoListaR(a[i],null);
		}
		return l.next;
	}

/*secondo esempio non uso il booleano*/
	public static NodoListaR ordina1(NumeroRazionale[] a){
		NodoListaR l,app;
		int i;

		l=new NodoListaR(null, null);
		l.next = new NodoListaR(a[0],null);
		for(i=1; i<a.length; i++){
			app = l; // ogni volta che inserisco un a[i] app deve tornare alla testa della lista
			//finche' non sono arrivato alla fine della lista
			//o a[i] e' piu' grande del razionale sul nodo successivo
			// vado avanti con app
			while(app.next!=null && !minoreU(a[i],app.next.info))
				app = app.next;
			//sia che sono uscita perche' a[i]<=app.next.info
			//sia che sono uscita dal while senza inserire
			//(caso numero piu' grande come ultimo della lista)
			app.next = new NodoListaR(a[i],app.next);
			}
		return l.next;
	}

	/* =================================================================== */
		public static void stampaLista(NodoListaR p) {
				while (p.next !=null) {
					System.out.println(p.info.toString());
					p = p.next;
				}
				System.out.println(p.info.toString());
		}
	/* =================================================================== */
}
