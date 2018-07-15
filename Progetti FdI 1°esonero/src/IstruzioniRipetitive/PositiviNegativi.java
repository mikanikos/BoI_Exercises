package IstruzioniRipetitive;
import fiji.io.Lettore;

public class PositiviNegativi {
     public static void main(String[] args) {
    	 
    	 int x;
    	
    	 do {
    		 System.out.println("Utente, inserisci un intero per sapere se esso è positivo o negativo" );
    		 x=Lettore.in.leggiInt();
    				
    				 if (x>0) {
    					 System.out.println("Utente, l'intero è positivo" );
    				 }
    				 if (x<0) {
    					 System.out.println("Utente, l'intero è negativo" );
    				 }
    	 }
    	 while (x!=0);
    	 
     }
}