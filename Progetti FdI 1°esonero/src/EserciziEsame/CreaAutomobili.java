package EserciziEsame;

import fiji.io.Lettore;

/* Classe CreaAutomobili che crea due oggetti di tipo Automobile leggendone 
 * lo stato da tastiera e stampa una descrizione testuale dell’automobile 
 * (invocando il metodo toString() della classe Automobile) che ha percorso meno chilometri */
public class CreaAutomobili {
	/* metodo principale */
	public static void main(String[] args) {
		
		/* dichiarazioni */
		Automobile auto1, auto2;
		String m1,m2;
		String t1,t2;
		int i1,i2;
		double k1,k2;
		
		/* creazione prima auto */
		System.out.println("Inserisci la marca della prima automobile");
		m1 = Lettore.in.leggiString();
		
        System.out.println("Inserisci la targa della prima automobile");
		t1 = Lettore.in.leggiString();
		
        System.out.println("Inserisci l'anno di immatricolazione della prima automobile");
		i1 = Lettore.in.leggiInt();
		
        System.out.println("Inserisci i chilometri percorsi dalla prima automobile");
		k1 = Lettore.in.leggiDouble();
		
		/* invocazione costruttore */
		auto1 = new Automobile(m1,t1,i1,k1);
		
		/* creazione seconda auto */
        System.out.println("Inserisci la marca della seconda automobile");
		m2 = Lettore.in.leggiString();
		
        System.out.println("Inserisci la targa della seconda automobile");
		t2 = Lettore.in.leggiString();
		
        System.out.println("Inserisci l'anno di immatricolazione della seconda automobile");
		i2 = Lettore.in.leggiInt();
		
        System.out.println("Inserisci i chilometri percorsi dalla seconda automobile");
		k2 = Lettore.in.leggiDouble();
		
		/* invocazione costruttore */
		auto2 = new Automobile(m2,t2,i2,k2);
		
		/* se la prima auto ha percorso meno chilometri della seconda ne viene stampato lo stato */
		if (k1 < k2) {
			System.out.println("La prima auto ha percorso meno chilometri della seconda");
			System.out.println(auto1.toString());
		}
		
		/* altrimenti... */
		else {
			/* se le due auto hanno gli stessi chilometri viene stampato lo stato della prima */
			if (k1 == k2) {
				System.out.println("Le due auto hanno percorso gli stessi chilometri");
				System.out.println(auto1.toString());
			}
			/* sela seconda auto ha percorso meno chilometri della prima ne viene stampato lo stato */
			else {
				System.out.println("La seconda auto ha percorso meno chilometri della prima");
				System.out.println(auto2.toString());
			}		
		}
	}

}
