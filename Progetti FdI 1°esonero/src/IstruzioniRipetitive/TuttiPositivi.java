package IstruzioniRipetitive;

import fiji.io.Lettore;

public class TuttiPositivi {
	public static void main(String[] args) {
		
        int n;
        int m;
        boolean negativo = false;
		
		System.out.println("Utente, inserisci un intero n per sapere se n interi sono positivi");
		
		n=Lettore.in.leggiInt();
		
		System.out.println("Utente, ora inserisci " +n+ " intero/i per sapere se sono tutti positivi");
		
		for (int i=1; i<=n; i++){
			m=Lettore.in.leggiInt();
			if (m<=0) {
				negativo=true;
			}
		}
		if (negativo==true){
			System.out.println("Utente, gli interi non sono tutti positivi");
		}
		if (negativo==false) {
			System.out.println("Utente, gli interi sono tutti positivi");
		}
	
		
	}
}