package IstruzioniRipetitive;
import fiji.io.Lettore;

public class PositiviNegativi {
     public static void main(String[] args) {
    	 
    	 int x;
    	
    	 do {
    		 System.out.println("Utente, inserisci un intero per sapere se esso � positivo o negativo" );
    		 x=Lettore.in.leggiInt();
    				
    				 if (x>0) {
    					 System.out.println("Utente, l'intero � positivo" );
    				 }
    				 if (x<0) {
    					 System.out.println("Utente, l'intero � negativo" );
    				 }
    	 }
    	 while (x!=0);
    	 
     }
}