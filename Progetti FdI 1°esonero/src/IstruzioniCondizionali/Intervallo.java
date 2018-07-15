package IstruzioniCondizionali;

import fiji.io.Lettore;

public class Intervallo {
	public static void main (String[] args) {
		
		int x,y;
		int c;
		
		System.out.println("Utente, inserisci due interi per determinare un intervallo chiuso con tali estremi");
		
		x=Lettore.in.leggiInt();
		y=Lettore.in.leggiInt();
		
		System.out.println("Utente, l'intervallo chiuso scelto � [" +x+ "," +y+ "]");
		System.out.println("Ora, inserisci un intero per sapere se tale intero � compreso nell'intervallo suddetto");
		
		c=Lettore.in.leggiInt();
		
		if (c>=x && c<=y) {
			System.out.println("Utente, "+c+" � compreso nell'intervallo chiuso [" +x+ "," +y+ "]");
		}
		else {
			System.out.println("Utente, "+c+" non � compreso nell'intervallo chiuso [" +x+ "," +y+ "]");
		}
		
	}

}
