package IstruzioniRipetitive;
import fiji.io.Lettore;

public class MCD {
	public static void main(String[] args) {
		
		int x;
		int y;
		
		System.out.println("Inserisci due numeri per calcolarne il massimo comune divisore");
		
		x=Lettore.in.leggiInt();
		y=Lettore.in.leggiInt();
		
		int risultato;
		
		if (x<=y) {
			risultato = x;
		}
		else {
			risultato = y;
		}
		while (x%risultato!=0 || y%risultato!=0) {
			risultato=risultato-1;
		}
		
		System.out.println("MCD = " +risultato);
	
	}

}
