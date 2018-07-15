package IstruzioniRipetitive;
import fiji.io.Lettore;

public class DispariFinoN {
	public static void main(String[] args) {
		
		int n;
		
        System.out.println("Utente, inserisci un numero per avere tutti gli interi positivi dispari minori di esso");
		
		n=Lettore.in.leggiInt();	
		
		for (int i=0; i<=n; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
				
		}
       
		
    }
}