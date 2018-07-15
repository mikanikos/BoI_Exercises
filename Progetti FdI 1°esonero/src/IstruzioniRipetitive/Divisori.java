package IstruzioniRipetitive;
import fiji.io.Lettore;

public class Divisori {
	public static void main(String[] args) {
		
		int x;
		int i;
		
		System.out.println("Utente, inserisci un intero per calcolare i suoi divisori");
		x=Lettore.in.leggiInt();
		
		System.out.println("Utente, i divisore di " +x +" sono ");
		
		
		for (i=1; i<=x; i++) {
			if (x%i == 0) {
			    System.out.println(i);
		    }
		}
		
		
		
			
			
			
		
		
	}

}