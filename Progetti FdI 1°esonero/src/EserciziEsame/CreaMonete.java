package EserciziEsame;

import fiji.io.Lettore;

/* classe per creare oggetti moneta */
public class CreaMonete {
	/* metodo main */
	public static void main(String[] args) { 
		Moneta m1,m2;
		double v1,v2;
		String n1,n2;
		int a1,a2;
		
		/* lettura dei dati da tastiera e creazione della prima moneta */
		System.out.println("Inserisci il valore della prima moneta");
		v1 = Lettore.in.leggiDouble();
		Lettore.in.leggiLinea();
		System.out.println("Inserisci la nazione di provenienza della prima moneta");
		n1 = Lettore.in.leggiLinea();
		System.out.println("Inserisci l'anno di fabbricazione della prima moneta");
		a1 = Lettore.in.leggiInt();
		
		m1 = new Moneta(v1,n1,a1);
		
		/* lettura dei dati da tastiera e creazione della seconda moneta */
		System.out.println("Inserisci il valore della seconda moneta");
		v2 = Lettore.in.leggiDouble();
		Lettore.in.leggiLinea();
		System.out.println("Inserisci la nazione di provenienza della seconda moneta");
		n2 = Lettore.in.leggiLinea();
		System.out.println("Inserisci l'anno di fabbricazione della seconda moneta");
		a2 = Lettore.in.leggiInt();
		
		m2 = new Moneta(v2,n2,a2);
		
		/* verifica dell'uguaglianza delle due monete */
		if (m1.equals(m2))
			System.out.println("Le monete sono uguali");
		
		/* stampa dello stato con toString della moneta più antica */
		if (m1.getAnno() <= m2.getAnno()) {
			System.out.println("La moneta più antica è la prima");
			System.out.println(m1.toString());
			
			/* incremento del valore della moneta più antica */
			m1.modificaValore();
			System.out.println(m1.toString());
		}
		else {
			System.out.println("La moneta più antica è la seconda");
			System.out.println(m2.toString());
			
			/* incremento del valore della moneta più antica */
			m2.modificaValore();
			System.out.println(m2.toString());
		}	
	}

}
