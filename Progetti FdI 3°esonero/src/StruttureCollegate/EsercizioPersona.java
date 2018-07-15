package StruttureCollegate;

public class EsercizioPersona {
	
	/* creazione Lista */
	public static ListaPersone creaPersone() {
		Persona p1 = new Persona("Andrea");
		Persona p2 = new Persona("Marco");
		Persona p3 = new Persona("Silvio");
		ListaPersone a = new ListaPersone();
		ListaPersone b = new ListaPersone();
		ListaPersone c = new ListaPersone();
		a.info = p1; a.next = b;
		b.info = p2; b.next = c;
		c.info = p3; c.next = null;
		return a;
	}
	
	/* creazione Lista alternativa */
	public static ListaPersone creaAltrePersone() {
		Persona p4 = new Persona("Carlo");
		Persona p5 = new Persona("Ugo");
		Persona p6 = new Persona("Lorenzo");
		ListaPersone a = new ListaPersone(p4,new ListaPersone(p5,new ListaPersone(p6,null)));
		return a;
	}
	
	/* stampa lista */
	public static void stampaLista(ListaPersone a) {
		while(a != null) {
			System.out.println(a.info.toString());
			a = a.next;
		}
		System.out.println();	
	}
	
	public static void main(String[] args) {
		ListaPersone a;
		
		a = creaPersone();
		stampaLista(a);
		
		a = creaAltrePersone();
		stampaLista(a);
	}
}
