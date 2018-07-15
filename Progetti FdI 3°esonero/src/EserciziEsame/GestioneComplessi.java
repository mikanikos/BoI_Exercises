package EserciziEsame;

public class GestioneComplessi {
	
	public static boolean moduloMin(NumeroComplesso n1, NumeroComplesso n2) {
		double modulo1 = Math.sqrt(Math.pow(n1.getReale(),2) + Math.pow(n1.getImmaginaria(), 2));
		double modulo2 = Math.sqrt(Math.pow(n2.getReale(),2) + Math.pow(n2.getImmaginaria(), 2));
		return modulo1 <= modulo2;
	}
	
	public static ListaNumComplessi ordina(NumeroComplesso[] n) {
		ListaNumComplessi a = new ListaNumComplessi(null,null);
		a.next = new ListaNumComplessi(n[0],null);
		ListaNumComplessi app;
		for(int i=1; i<n.length; i++) {
			app = a;
			while(app.next != null && !moduloMin(n[i], app.next.info))
				app = app.next;
			app.next = new ListaNumComplessi(n[i],app.next);
		}
		return a.next;
	}
	
	public static void main(String[] args){
		NumeroComplesso[] a;

		//creazione dell'array di razionali
		a = new NumeroComplesso[]{new NumeroComplesso(2,3),new NumeroComplesso(1,6),
		    new NumeroComplesso(7,5),new NumeroComplesso(5,2),new NumeroComplesso(2,5),
		    new NumeroComplesso(1,4)};
		System.out.println("lista ordinata");
		stampaLista(ordina(a));
	}
	
	public static void stampaLista(ListaNumComplessi p) {
		while (p.next !=null) {
			System.out.println(p.info.toString());
			p = p.next;
		}
		System.out.println(p.info.toString());
}
}
