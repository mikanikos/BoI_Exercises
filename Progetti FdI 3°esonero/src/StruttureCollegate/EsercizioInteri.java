package StruttureCollegate;

import fiji.io.Lettore;

public class EsercizioInteri {
	
	public static void main(String[] args) {
		
		NodoListaI a;
		int i1,i2,i3;
		
		System.out.println("Inserisci gli interi della lista");
		i1 = Lettore.in.leggiInt();
		i2 = Lettore.in.leggiInt();
		i3 = Lettore.in.leggiInt();
		
		a = new NodoListaI(i1, new NodoListaI(i2,new NodoListaI(i3,null)));
		
		/* inserisci elemento */
		a = inserisci(a);
		CreaStampaListaI.stampaLista(a);
		
		/* elimina elemento */
		a = elimina(a);
		CreaStampaListaI.stampaLista(a);
		
		/* calcolo lunghezza */
		System.out.println("Lunghezza = " +lunghezza(a));
	}
	
	/* per inserire elementi */
	public static NodoListaI inserisci(NodoListaI a) {
		
		/* Inserisce elemento all'inizio */
		NodoListaI b = new NodoListaI(10,a);
		a = b;
		CreaStampaListaI.stampaLista(a);
		
		/* Inserisci elemento in mezzo */
		NodoListaI c = new NodoListaI(15,a.next.next);
		a.next.next = c;
		CreaStampaListaI.stampaLista(a);
		
		/* inserisci elemento alla fine */
		NodoListaI p = a; 
		while (p.next !=null) p = p.next; 
		NodoListaI d = new NodoListaI(55,null);
		p.next = d;
		
		return a;
	}
	
	/* per eliminare elementi */
	public static NodoListaI elimina(NodoListaI a) {
		/* elimina elemento all'inizio */
		a = a.next;
		CreaStampaListaI.stampaLista(a);
		
		/* elimina elemento in mezzo */
		a.next = a.next.next;
		CreaStampaListaI.stampaLista(a);
		
		/* elimina elemento alla fine */
		NodoListaI p = a; 
		while (p.next.next !=null) p = p.next; 
		p.next = null;
		
		return a;
	}
	
	/* calcolo lunghezza lista */
	public static int lunghezza(NodoListaI a) {
		int cont=0;
		NodoListaI p = a; 
		while(p!=null) { 
			cont++;
			p = p.next; 
		}
		return cont;
	}
}
