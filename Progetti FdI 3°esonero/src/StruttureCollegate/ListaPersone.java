package StruttureCollegate;

public class ListaPersone {
	
	public Persona info;
	public ListaPersone next;
	
	public ListaPersone(Persona i, ListaPersone n) {
		this.info = i; 
		this.next = n; 
	}

	public ListaPersone(Persona i) {
		this.info = i; 
		this.next = null; 
	}

	public ListaPersone() {
		this.info = null;
		this.next = null; 
	}
}
