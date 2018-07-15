package IstruzioniRipetitive;
import fiji.io.Lettore;

public class DuePositiviConsecutivi {
	public static void main(String[] args) {
		
		int x;
		boolean consecutivi = false;
		boolean xPositivo = false;
		
		do {
			System.out.println("Utente, inserisci un intero");
			
			x=Lettore.in.leggiInt();
			
			if (x>0) {
				if (xPositivo) 
				    consecutivi = true;
			}
			
			if(x>0)
		        xPositivo = true; 
			
			else 
				xPositivo = false;
			
		}
		while (x!=0);

		if (consecutivi) {
			System.out.println("Utente, hai introdotto due interi positivi consecutivi");
		}
		else {
			System.out.println("Utente, non hai introdotto due interi positivi consecutivi");
		}
	}

}
