package EserciziEsame;

public class ListaNumComplessi {
	
	NumeroComplesso info;
	ListaNumComplessi next;
	
	public ListaNumComplessi(NumeroComplesso n, ListaNumComplessi l) {
		this.info = n;
		this.next = l;
	}
}
