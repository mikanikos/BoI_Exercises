package EserciziEsame;
import StruttureCollegate.NodoListaI;
import StruttureCollegate.OperazioniListaInteri;

public class UnioneIntersezione {
	
	/* metodo che crea una lista intersezione di due array */
	public static NodoListaI intersezione(int[] a1, int[] a2) {
		
		NodoListaI l = new NodoListaI();
		NodoListaI app = l;
		boolean esiste;
		
		for(int i=0; i<a1.length; i++) {
			esiste = false;
			for(int j=0; j<a2.length; j++)
				if(a1[i] == a2[j])
					esiste = true;
			if(esiste) {
				app.next = new NodoListaI(a1[i]);
				app = app.next;
			}
		}
		return l.next;
	}
	
	/* metodo che crea il complementare dell'intersezione */
	public static NodoListaI complInt(int[] a1, int[] a2) {
		
		NodoListaI l = new NodoListaI();
		NodoListaI app = l;
		boolean esiste;
		
		for(int i=0; i<a1.length; i++) {
			esiste = false;
			for(int j=0; j<a2.length; j++)
				if(a1[i] == a2[j])
					esiste = true;
			if(!esiste) {
				app.next = new NodoListaI(a1[i]);
				app = app.next;
			}
		}
		
		for(int i=0; i<a2.length; i++) {
			esiste = false;
			for(int j=0; j<a1.length; j++)
				if(a2[i] == a1[j])
					esiste = true;
			if(!esiste) {
				app.next = new NodoListaI(a2[i]);
				app = app.next;
			}
		}
		return l.next;
	}
	
	/* metodo che crea l'unione tra due array */
	public static NodoListaI unione(int[] a1, int[] a2) {
		
		NodoListaI l = new NodoListaI();
		NodoListaI app = l;
		int i;
		for(i=0; i<a1.length; i++) {
			app.next = new NodoListaI(a1[i]);
			app = app.next;
		}	
		for(i=0; i<a2.length; i++) {
			app.next = new NodoListaI(a2[i]);
			app = app.next;
		}
		
		NodoListaI c1 = l;
		NodoListaI c2 = l;
		while(c1.next != null) {
			c2 = l;
			while(c2.next != null) {
				if(c1.next.info == c2.next.info && c1.next != c2.next)
					c2.next = c2.next.next;
				c2 = c2.next;
			}
			c1 = c1.next;
		}
		return l.next;
	}
	
	public static void main(String[] args) {
		
		int[] a1 = new int[]{1,3,400,3,55,1};
		int[] a2 = new int[]{1,1,-2,67,55,9,400,3,99};
		
		OperazioniListaInteri.stampaLista(intersezione(a1,a2));
		System.out.println();
		OperazioniListaInteri.stampaLista(complInt(a1,a2));
		System.out.println();
		OperazioniListaInteri.stampaLista(unione(a1,a2));
	}
}
