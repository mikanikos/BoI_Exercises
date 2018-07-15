package IstruzioniRipetitive;

/*import fiji.io.Lettore;*/

/* Serie di Fibonacci per n numeri: due varianti */

/*public class SerieFibonacci {
	public static void main(String[] args) {
		
		int x;
		int numeroSerie1,numeroSerie2, numeroSerie3;
		
		System.out.println("Utente, introduci un intero n per ottenere i primi n numeri della serie di Fibonacci ");
		
		x=Lettore.in.leggiInt();
		numeroSerie1=1;
		numeroSerie2=1;
		
		System.out.print("Ecco la serie: " +numeroSerie1+ " " +numeroSerie2+ " ");
		
		int i;
		
		for (i=1; i<=x-2; i++) {
			numeroSerie3=(numeroSerie1+numeroSerie2);
			System.out.print(numeroSerie3+ " ");
			numeroSerie1=numeroSerie2;
			numeroSerie2=numeroSerie3;
	    }
			
	}

}*/

/*public class SerieFibonacci {
	public static void main(String[] args) {
		
		int x;
		int numeroSerie1,numeroSerie2, numeroSerie3;
		
		System.out.println("Utente, introduci un intero n per ottenere i numeri della serie di Fibonacci fino a tale numero");
		
		x=Lettore.in.leggiInt();
		numeroSerie1=1;
		numeroSerie2=1;
		numeroSerie3=2;
		
		System.out.print("Ecco la serie: " +numeroSerie1+ " " +numeroSerie2+ " ");
		
		do {
			System.out.print(numeroSerie3+ " ");
			if (numeroSerie3<=x) {
			    numeroSerie1=numeroSerie2;
			    numeroSerie2=numeroSerie3;
			    numeroSerie3=(numeroSerie1+numeroSerie2);
			}
	    }
		while (numeroSerie3<=x);
	}

}*/
