package EserciziEsame;

import fiji.io.Lettore;

public class CreaStudente {
	
	public static void main(String[] args) {
		
		Studente s;
		String n;
		String c;
		int m;
		int e;
		double v;
		char a;
		int voto;
		
		System.out.println("Qual è il nome dello studente?");
		n = Lettore.in.leggiString();
		System.out.println("Qual è il cognome dello studente?");
		c = Lettore.in.leggiString();
		System.out.println("Qual è il numero di matricola dello studente?");
		m = Lettore.in.leggiInt();
		System.out.println("Quanti esami ha sostenuto lo studente?");
		e = Lettore.in.leggiInt();
		do {
			System.out.println("Qual è la media voto degli esami sostenuti dallo studente?");
		    v = Lettore.in.leggiDouble();
		    if (v > 30 || v < 0)
		    System.out.println("Inserimento errato");
		}
		while (v > 30 || v < 0);
		
		s = new Studente (n, c, m, e, v);
		
		System.out.println(s.toString());
		
		System.out.println("Desideri aggiungere un esame(Y/N)?");
		a = Lettore.in.leggiChar();
		
		if (a=='y' || a == 'Y') {
			System.out.println("Inserisci il voto dell'esame da aggiungere");
			 voto = Lettore.in.leggiInt();
			 s.acquisisciEsame(voto);
			 System.out.println("Aggiornamento effettuato");
			 System.out.println(s.toString());
		}
			
	}

}
