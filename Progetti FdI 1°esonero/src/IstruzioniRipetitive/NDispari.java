package IstruzioniRipetitive;
import fiji.io.Lettore;

public class NDispari {
	public static void main(String[] args) {
		
		int n;
		
        System.out.println("Utente, inserisci un numero n per avere i primi n interi positivi dispari");
		
		n=Lettore.in.leggiInt();	
		
		for (int i=0; i!=n; i++) {
				System.out.println(i*2+1);
		}
		
	 }
}