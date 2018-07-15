package IstruzioniRipetitive;
import fiji.io.Lettore;

public class MinimoComuneMultiplo {
	public static void main(String[] args) {
		
		int x;
		int y;
		
		System.out.println("Utente, inserisci due interi per calcolarne il minimo comune multiplo");
		
		x=Lettore.in.leggiInt();
		y=Lettore.in.leggiInt();
		
		int risultato=x*y;
		
		if (risultato%x==0 || risultato%y==0) {
		
		    if (x%y==0) {
			    risultato = x;
		    }
		
		    if (y%x==0) {
			    risultato = y;
		    }
		}
		else {
		     while (risultato%x!=0 || risultato%y!=0) {
	    	        risultato--;
	         }
		}
	
	    System.out.println("Utente, il minimo comune multiplo è " +risultato);
	    
	}
}