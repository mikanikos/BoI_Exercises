package IstruzioniRipetitive;

import fiji.io.Lettore;

public class IndovinaNumero {
	public static void main(String[] args) {
		
		System.out.println("Utente, in questo gioco dovrai provare ad indovinare quale numero intero da 1 a 100 ho scelto. Dopo ogni tentativo, ti verrà "
				+ "indicato se il numero da indovinare è maggiore o minore di quello scelto. Nel caso tu ti voglia arrendere, dovrai digitare semplicemente 0");
		
		int n = (int)(Math.random()*100);
		
		System.out.println("Ho scelto un numero! Quando vuoi cominciare, digita un numero");
				
		int k = 0;
		int i = 0;
		
		do {
			k = Lettore.in.leggiInt();
			i++;
		    if (k>n)
			    System.out.println("Il numero immesso è troppo alto, riprova");
			if (k<n)
				System.out.println("Il numero immesso è troppo basso, riprova");
			if (k==n)
			    System.out.println("Giusto! Hai indovinato il numero facendo " +i+ " tentativi");
		}
		while (k!=n);
	}
}
