package StruttureCollegate;

import fiji.io.Lettore;

/* repository di diverse operazioni su liste di interi */
public class OperazioniListaInteri{

	public static void main (String[] args){
		NodoListaI a;

		a = crea3Nodi();
		stampaLista(a);

		a = creaAltri3Nodi();
		stampaLista(a); //4,6,7
		stampaLista(eliminaPrimoDispari(a));
		
		stampaLista(creaListaDaInput());
		
		stampaLista(inserisciInOrdine(5,null));
		a = eliminaValore(1,a);
		stampaLista(a);
	}

	public static void stampaLista(NodoListaI l){
		while(l!=null){
			System.out.print(l.info + " ");
			l=l.next;
		}
		System.out.println();
	}

	public static NodoListaI crea3Nodi() {
		NodoListaI a = new NodoListaI();
		NodoListaI b = new NodoListaI();
		NodoListaI c = new NodoListaI();
		a.info = 1; a.next = b;
		b.info = 2; b.next = c;
		c.info = 3; c.next = null;
		return a;
	}

	public static NodoListaI creaAltri3Nodi() {
		NodoListaI a = new NodoListaI(4,new NodoListaI(6,new NodoListaI(8,null)));
		return a;
	}


	/* inserimento al primo posto in una lista di interi */
	public static NodoListaI inserisciInTesta(int n, NodoListaI l){
		NodoListaI app = new NodoListaI(n,l);
		return app;
	}

	/* inserimento in coda di un intero in una lista */
	public static NodoListaI inserisciInCoda(int n, NodoListaI l){
		NodoListaI app;
		//se la lista e' nulla
		if (l==null)
			l=new NodoListaI(n,null);
		else {
			app=l;
			while (app.next!=null)
				app=app.next;
			app.next = new NodoListaI(n,null);
		}
		return l;
	}

	/* eliminazione del primo nodo di un lista */
	//PRE: l!= null
	public static NodoListaI eliminaPrimoNodo(NodoListaI l){
		return l.next;
	}

	/* eliminazione dell'ultimo nodo di una lista */
	public static NodoListaI eliminaUltimoNodo(NodoListaI l){
		NodoListaI app;
		app=l;
		while (app.next.next!=null)
			app=app.next;
		app.next=null;
		return l;
	}

	/* eliminazione del primo nodo che contiene un numero dispari */
	public static NodoListaI eliminaPrimoDispari(NodoListaI l){
		NodoListaI app;
		app=l;
		// se e' il primo nodo
		if (app.info%2!=0)
			l=l.next;
		else{
			//finche' c'e' un nodo successivo ad app e il suo contenuto e' pari
			//procedo oltre sulla lista
			while (app.next!= null && app.next.info%2==0)
				app=app.next;
			//se sono uscita dal while perche' app.next==null
			//allora ho finito di esaminare la lista
			//e non devo fare niente, se invece il nodo
			//successivo e' dispari lo devo eliminare
			if (app.next!=null)
				app.next=app.next.next;
		}
		return l;
	}
	
	// I METODI SEGUENTI SONO STATI FATTI DA ME //

	/* calcolo della lunghezza di una lista */
	public static int lunghezza(NodoListaI a) {
		int cont=0;
		NodoListaI p = a; 
		while(p!=null) { 
			cont++;
			p = p.next; 
		}
		return cont;
	}
	
	/* eliminazione dell'i-esimo nodo in una lista */
	public static NodoListaI eliminaInMezzo(NodoListaI l){
		l.next = l.next.next;
		return l;
	}
	
	/* metodo per acquisire da input gli interi per creare una lista: METODO RECORD GENERATORE*/
	public static NodoListaI creaListaDaInput() {
		NodoListaI a;
		System.out.println("Inserisci quanti interi vuoi inserire nella lista");
		int n = Lettore.in.leggiInt();
		System.out.println("Inserisci gli interi");
		NodoListaI app = new NodoListaI();
		a = app;
		for(int i=0; i<n; i++) {
			app.next = new NodoListaI(Lettore.in.leggiInt(), null);
			app = app.next;
		}
		return a.next;
	}
	
	/* metodo che, dato un intero n e una lista l i cui elementi sono ordinati in ordine 
	 * crescente, inserisce n ordinatamente nella nuova lista, restituendo la nuova lista */
	public static NodoListaI inserisciInOrdine(int n, NodoListaI a) {
		NodoListaI l = new NodoListaI();
		l.next = a;
		
		NodoListaI app = l;
     	while(app.next!= null && !(app.next.info>n))
     		app = app.next;
	     app.next = new NodoListaI(n,app.next);
	     
     	return l.next;
	}
	
	/* metodo che, dato un intero n e una lista l elimina n dalla lista (se è presente) */
	public static NodoListaI eliminaValore(int n, NodoListaI l) {
		NodoListaI app = l;
		if(app.info == n)
			l = l.next;
		else {
			while(app.next!= null && app.next.info!=n)
				app=app.next;
			if(app.next!=null)
				app.next=app.next.next;
		}
		return l;
	}
}