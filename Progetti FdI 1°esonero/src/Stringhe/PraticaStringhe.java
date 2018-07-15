package Stringhe;
import fiji.io.*;


/* applicazione per illustrare concetti sulle stringhe */
public class PraticaStringhe {
	/* metodo principale */
	public static void main(String[] args) {
		/* dichiara una variabile di tipo String con nome s */
		String s;
		
		/* dichiara una variabile di tipo String con nome t */
		String t;
		
		/* dichiara tre variabili di tipo String con nome s1, s2, e s3 */
		String s1, s2, s3;
		
		/* memorizza dentro ad s il riferimento alla stringa "ciao belli" */
		s = "ciao belli";
		
		/* stampa la stringa referenziata da s */
		System.out.println(s);
		
		/* leggi una stringa da tastiera e memorizzane un riferimento in t */
		System.out.println("Introduci una stringa");
		t = Lettore.in.leggiLinea();

		/* memorizza in due variabili diverse s e t il riferimento 
		 * alla stringa "ciao belli" */
		s1 = "ciao belli";
		s2 = "ciao belli";
		System.out.println("Stampo s1: " + s1);
		System.out.println("Stampo s2: " + s2);

		/* memorizza in una variabile s prima il riferimento alla 
		 * stringa "ciao belli" e poi il riferimento alla stringa 
		 * "ci vediamo" */
		s = "ciao belli";
		System.out.println("Stampo s: " + s);
		s = "ci vediamo";
		System.out.println("Stampo s: " + s);

		/* memorizza in una variabile s il riferimento alla stringa 
		 * "ciao belli" e poi ne stampa la lunghezza */
		s = "ciao belli";
		int lunghezza = s.length();
		System.out.println("La lunghezza della stringa \"ciao belli\" e' " + lunghezza );

		/* stampa la lunghezza della stringa "ciao belli" */
		System.out.println("La lunghezza della stringa \"ciao belli\" e' " + "ciao belli".length());
		
		/* stampa la lunghezza della stringa vuota */
		s = "";
		lunghezza = s.length();
		System.out.println("La lunghezza della stringa vuota e' " + lunghezza );

		/* memorizza in una variabile s1 il riferimento alla stringa 
		 * "mappa", memorizza in una variabile s2 il riferimento alla 
		 * stringa "mondo", memorizza in una variabile s3 la concatenazione 
		 * di s1 con s2, ed infine stampa s3 */
		s1 = "mappa";
		s2 = "mondo";
		s3 = s1.concat(s2);
		System.out.println(s3);
		
		/* Fai la stessa cosa con l'operatore + */
		s1 = "mappa";
		s2 = "mondo";
		s3 = s1 + s2;
		System.out.println(s3);
			
		/* memorizza in una variabile s il riferimento ad "automobile", 
		 * memorizza in una variabile t il riferimento ad "auto" 
		 * concatenato a mobile tramite concat e poi verifica l'uguaglianza 
		 * fra i due oggetti tramite l'operatore == */
		s = "automobile";
		t = "auto".concat("mobile");
		System.out.print("Le due stringhe sono uguali? ");
		System.out.println(s==t);

		/* stessa cosa ma effettua la concatenazione tramite + */
		s = "automobile";
		t = "auto"+"mobile";
		System.out.print("Le due stringhe sono uguali? ");
		System.out.println(s==t);

		/* stessa cosa ma effettua la verifica tramite il metodo equals */
		s = "automobile";
		t = "auto".concat("mobile");
		System.out.print("Le due stringhe sono uguali? ");
		System.out.println(s.equals(t));
	
		/* verifica il valore restituito dal metodo compareTo se la stringa 
		 * sul quale e' invocato e' la stessa della stringa parametro */
		System.out.println("La comparazione fornisce " + "ciao".compareTo("ciao"));
		
		/* verifica il valore restituito dal metodo compareTo se la stringa 
		 * sul quale e' invocato precede lessicograficamente la stringa 
		 * parametro */
		System.out.println("La comparazione fornisce " + "alfa".compareTo("beta"));
		
		/* verifica il valore restituito dal metodo compareTo se la stringa 
		 * sul quale e' invocato segue lessicograficamente la stringa 
		 * parametro */
		System.out.println("La comparazione fornisce " + "gamma".compareTo("beta"));
		
		/* memorizza in una variabile s il riferimento ad "automobile", 
		 * memorizza in una variabile t il riferimento alla sottostringa 
		 * di "automobile" compresa fra gli indici 2 (incluso) e 
		 * 6 (escluso); stampa la stringa  memorizzata in t */
		s = "automobile";
		t = s.substring(2,6);
		System.out.println(t);

		/* stessa cosa con gli indici 7 (incluso) e 11 (escluso) */
		s = "automobile";
		t = s.substring(7,10);
		System.out.println(t);

		/* memorizza in una variabile s il riferimento ad "automobile" 
		 * e stampa i caratteri con indice 0, 3 e 10 */
		s = "automobile";
		System.out.println("Il carattere con indice 10 nella stringa " + s + " e' ");
		System.out.println(s.charAt(9));
		
		/* memorizza in una variabile s il riferimento ad "automobile",
		 * stampa il valore restituito da charAt(2) e 
		 * stampa il valore restituito da substring(2,3) */
		s = "automobile";
		System.out.println("Stampa con charAt " + s.charAt(2));
		System.out.println("Stampa con substring " + s.substring(2,3));
		 
		/* testa il metodo myEquals */
		System.out.println("ciao e ciao: " + myEquals("ciao", "ciao"));
		System.out.println("ciaojfgk e ciao: " + myEquals("ciaojfgk", "ciao"));
		System.out.println("ciao e ciaojfgk: " + myEquals("ciao", "ciaojfgk"));
		System.out.println("ciao e ciio: " + myEquals("ciao", "ciio"));
		
		/* memorizza in una variabile s il riferimento ad "automobile" 
		 * e poi stampa il valore di s.indexOf('m') ed s.indexOf('r') */
		s = "automobile";
		System.out.println("indexOf 'm': " +s.indexOf('m'));
		System.out.println("indexOf 'r': " +s.indexOf('r'));

		/* memorizza in una variabile s il riferimento ad "automobile" 
		 * e poi stampa il valore di s.indexOf("tom") ed s.indexOf("ton") */
		s = "automobile";
		System.out.println("indexOf \"tom\": " +s.indexOf("tom"));
		System.out.println("indexOf \"ton\": " +s.indexOf("ton"));
		
		/* se s non e' null stampalo */
		if(s!=null) 
			System.out.println("La stringa s ha un valore: " + s);

		/* prova a stampare la lunghezza di una stringa null */
		s = null;
		//System.out.println("La stringa s ha lunghezza: " + s.length());

		/* stampa una variabile di classe non inizializzata */
		System.out.print("Stampo la stringa variabile di classe: ");
		System.out.print(stringaDiClasse);
	}
	
	/* variabile di classe per l'oggetto PraticaStringhe */
	public static String stringaDiClasse;
	
	/* metodo con la stessa semantica di equals, ma che non utilizza 
	 * equals o compareTo */
	public static boolean myEquals(String s, String t) {
		boolean uguali = true;		// le stringhe sono uguali?
		/* se hanno lunghezza diversa, allora sono diverse */
		if(s.length()!=t.length()) 
			uguali = false;
		else 
			// hanno la stessa lunghezza
			for(int i=0;i<s.length();i++) 
				/* confronta i singoli caratteri */
				if(s.charAt(i)!=t.charAt(i))
					uguali = false;
		return uguali;
	}
}