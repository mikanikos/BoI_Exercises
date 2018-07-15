package ArrayDiOggetti;

public class EserciziArrayOggetti {
	
	/* metodo che verifichi se un array, non nullo e non vuoto,
	 * di stringhe, non nulle e non vuote, sia costituito da 
	 * stringhe che contengano tutte almeno un carattere cifra */
	// verfica universale (con verifica esitenziale interna)
	public static boolean tutteUnaCifra(String[] a) {
		boolean universale = true;
		int i=0;
		
		while(i<a.length && universale) {
			if(!(unaCifra(a[i])))
				universale = false;
			i++;
		}
		return universale;
	}
	
	/* metodo che, data una stringa, verifica se essa contiene
	 * almeno una cifra */
	public static boolean unaCifra(String s) {
		boolean contiene = false;
		int i = 0;
		
		while(i<s.length() && !contiene) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
				contiene = true;
			i++;
		}
		return contiene;
	}
	
	/* metodo che verifichi se un array, non nullo e non vuoto,
	 * di stringhe, non nulle e non vuote, sia costituito da almeno
	 * una stringa con caratteri tutti minuscoli */
	// verfica universale (con verifica esitenziale interna)
	public static boolean verificaStringa(String[] s) {
		boolean verifica = false;
		int i=0;
		
		while(i<s.length && !verifica) {
			if(tutteMinuscole(s[i]))
				verifica = true;
			i++;
		}
		return verifica;
	}
	
	/* metodo che, data una stringa, verifica se essa contiene
	 * tutti caratteri minuscoli */
	public static boolean tutteMinuscole(String s) {
		boolean contiene = true;
		int i = 0;
		
		while(i<s.length() && contiene) {
			if(!(s.charAt(i) >= 'a' && s.charAt(i) <= 'b'))
				contiene = false;
			i++;
		}
		return contiene;
	}
	
	/* Dato un array di triangoli definiti in precedenza, 
	 * calcolare un nuovo array che contiene solo trianogli rettangoli */
	public static Triangolo[] soloRettangoli(Triangolo[] t) {
		
		Triangolo[] rettangoli;
		double l1, l2, l3;
		int i, n=0;
		
		for(i=0; i<t.length; i++) {
			l1 = t[i].lato1();
			l2 = t[i].lato2();
			l3 = t[i].lato3();
			if(ternaPit(l1,l2,l3))
				n++;
		}
		rettangoli = new Triangolo[n];
		
		for(i=0; i<t.length; i++) {
			l1 = t[i].lato1();
			l2 = t[i].lato2();
			l3 = t[i].lato3();
			if(ternaPit(l1,l2,l3))
				rettangoli[i] = t[i];
		}
		return rettangoli;
	}
	
	/* metodo che verifica se, dati tre lati, compongono una 
	 * terna pitagorica */
	public static boolean ternaPit(double a, double b, double c) {
		boolean isPit = false;
		
		if(Math.pow(a, 2) == (Math.pow(b, 2)) + Math.pow(c, 2))
			isPit = true;
		if(Math.pow(a, 2) == (Math.pow(c, 2)) + Math.pow(b, 2))
			isPit = true;
		if(Math.pow(b, 2) == (Math.pow(a, 2)) + Math.pow(c, 2))
			isPit = true;
		if(Math.pow(b, 2) == (Math.pow(c, 2)) + Math.pow(a, 2))
			isPit = true;
		if(Math.pow(c, 2) == (Math.pow(a, 2)) + Math.pow(b, 2))
			isPit = true;
		if(Math.pow(c, 2) == (Math.pow(b, 2)) + Math.pow(a, 2))
			isPit = true;
		
		return isPit;
	}
}
