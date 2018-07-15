package IstruzioniRipetitive;
import fiji.io.Lettore;

public class NumeriSommaDivisibileTre {
	public static void main(String[] args) {
		
		int n;
		int i,j;
		
		System.out.println("Utente, inserisci un intero n per conoscere tutte le coppie di interi (i,j)");
		System.out.println("tali che i e j sono compresi tra 1 e n e la loro somma è divisibile per 3");
		
		n=Lettore.in.leggiInt();
		
		System.out.println("Le coppie (i,j) sono:");
		
		for (i=1; i<=n; i++) {
			
			for (j=1; j<=n; j++) {
				
				if ((i+j)%3==0) {
					System.out.println("(" +i+ "," +j+ ")");
					
				}
			}
			
		}
		
		
	}

}
