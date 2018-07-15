package IstruzioniRipetitive;
import fiji.io.Lettore;

public class AlmenoUnPositivo {
	public static void main(String[] args) {
		
		int x;
		boolean positivo=false;
		
		do {
			System.out.println("Utente, inserisci un intero");
			
			x=Lettore.in.leggiInt();
			
			if (x>0) {
				positivo = true;
			}
			
		}
		while (x!=0);
		
		if (positivo == true) {
			System.out.println("Utente, hai introdotto almeno un intero positivo");
		}
		else {
			System.out.println("Utente, non hai mai introdotto un intero positivo");
		}
	}
}
