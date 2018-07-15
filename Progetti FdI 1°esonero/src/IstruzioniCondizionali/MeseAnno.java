package IstruzioniCondizionali;
import fiji.io.Lettore;

		/* Applicazione che chiede all'utente di inserire due interi mese e anno 
		 * da tastiera, legge gli interi inseriti dall'utente ed informa l'utente 
		 * su quale sia il mese successivo dell'anno */

public class MeseAnno {
	public static void main(String[] args) {
		
		int m, a;
		
		System.out.println("Utente, inserisci due interi per conoscere il mese successivo al mese e all'anno inseriti");
			
		m=Lettore.in.leggiInt();
		a=Lettore.in.leggiInt();
		
		int n = m, b = a;
		
		if (m>0 && m<12) {
			n = m++;
			b = a;
			System.out.println("Utente, la data del mese successivo al mese e all'anno inseriti è " + n + " " + b);
		}
		
		else {
			if (m==12) {
				n = 1;
				b = a++;
				System.out.println("Utente, la data del mese successivo al mese e all'anno inseriti è " + n + " " + b);
			}
			
			else {
			    System.out.println("Utente, non hai inserito correttamente i dati");
		    }
		
		}	
			
		
		
	}
}