package StruttureCollegate;

public class CreaStampaListaI{

	public static void main (String[] args){
		NodoListaI a;

		a = crea3Nodi();
		stampaLista(a);

		a = creaAltri3Nodi();
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
		NodoListaI a = new NodoListaI(4,new NodoListaI(5,new NodoListaI(6,null)));
		return a;
	}
}