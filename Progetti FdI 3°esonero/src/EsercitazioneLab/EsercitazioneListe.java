package EsercitazioneLab;

/* esercizi sulle liste */
public class EsercitazioneListe {
	
	/* metodo per inserire ordinatamente un oggetto Rettangolo 
	 * in una lista di oggetti Rettangolo */
	public static NodoListaR inserisciRettangolo(NodoListaR l, Rettangolo r) {
		NodoListaR m = l;
		if(l!=null){
			if(l.info.base() > r.base())
				l = new NodoListaR(r,l);
			else {
				if(l.info.base() == r.base()) {
					if(l.info.altezza() > r.altezza())
					    l = new NodoListaR(r,l);
					if(l.info.altezza() < r.altezza())
						l.next = new NodoListaR(r,l.next);
				}
				else {
					while(m.next!=null && !(m.next.info.base() >= r.base()))
						m = m.next;
					if(m.next != null) {
						if(m.next.info.base() > r.base())
							m.next = new NodoListaR(r,m.next);
						else {
							if(m.next.info.base() == r.base()) {
								if(m.next.info.altezza() > r.altezza())
									m.next = new NodoListaR(r,m.next);
								if(m.next.info.altezza() < r.altezza())
									m.next.next = new NodoListaR(r,m.next.next);
							}
						}
					}
					else
						m.next = new NodoListaR(r,null);
				}
			}
		}
		return l;
	}
	
	/* stampaLista per liste di Rettangoli */
	public static void stampaListaR(NodoListaR p) {
		NodoListaR q = p;
		while (q != null) {
		    System.out.print(q.info.base());
		    System.out.println();
		    q = q.next;
		}
		System.out.println();
	}
	
	/* metodo per la fusione di liste di stringhe */
	public static NodoListaS merge(NodoListaS s1, NodoListaS s2) {
		NodoListaS f = new NodoListaS(null,null);
		NodoListaS g = f;
		NodoListaS t1 = s1;
		NodoListaS t2 = s2;
		while ((t1 != null) && (t2 != null)) {
			if (t1.info.compareTo(t2.info) == 0) {
				g.next = new NodoListaS(t1.info,null);
				t1 = t1.next;
				t2 = t2.next;
			}
			else {
				if (t1.info.compareTo(t2.info) > 0) {
					g.next = new NodoListaS(t2.info,null);
				    t2 = t2.next;
				}
				else {
					g.next = new NodoListaS(t1.info,null);
					t1 = t1.next;
			    }
			} 
			g = g.next;
		}
		if (t2 == null)
			while(t1 != null) {
			    g.next = new NodoListaS(t1.info,null);
		        t1 = t1.next;
		        g = g.next;
			}
		else
			while(t2 != null) {
			    g.next = new NodoListaS(t2.info,null);
		        t2 = t2.next;
		        g = g.next;
		    }
		return f.next;	
	}
	
	/* stampaLista per liste di stringhe */
	public static void stampaListaS(NodoListaS s) {
		NodoListaS q = s;
		while (q != null) {
		    System.out.print(q.info);
		    q = q.next;
		}
		System.out.println();
	}
	
	/* metodo per convertire un intero in Lista (dalla cifra meno significativa) */
	public static NodoListaC interoToLista(int k) {
		int a = k;
		int lun=1;
		String s = ""+k;
		NodoListaC c = new NodoListaC(s.charAt(0),null);;
		if(a >= 10) { 
			while(a >= 10) {
				a = a/10;
				lun++;
			}
			s = a+"";
			c = new NodoListaC(s.charAt(0),null);
			s = k+"";
			for(int i = 1; i<lun; i++)
				c = new NodoListaC(s.charAt(i),c);
		}
		if(a <= -10) {
			while(a <= -10) {
				a = a/10;
				lun++;
			}
			s = a+"";
			c = new NodoListaC(s.charAt(1),null);
			c = new NodoListaC(s.charAt(0),c);
			s = k+"";
			for(int i = 1; i<lun; i++)
				c = new NodoListaC(s.charAt(i+1),c);
		}
		return c;
	}
	
	/* metodo che elimina un dato carattere da una lista di char */
	public static NodoListaC eliminazioneRic(NodoListaC l, char c) {
		NodoListaC q;
		if (l.info == c) {
			// se si vuole eliminare solo la prima occorrenza basta togliere
			// l'if successivo e lasciare il corpo dell'else
			if(l.next != null)
			    q = eliminazioneRic(l.next,c);
			else
				q = l.next;
		}
		else {
			if(l.next != null) {
		        l.next = eliminazioneRic(l.next,c);
		        q = l;
		    }
			else
				q = l;
		}
		return q;
	}
	
	/* stampaLista per liste di caratteri */
	public static void stampaListaC(NodoListaC s) {
		NodoListaC q = s;
		while (q != null) {
		    System.out.print(q.info);
		    q = q.next;
		}
		System.out.println();
	}
	
	/* main */
	public static void main(String[] args) {
		test();
	}
	
	/* metodo di test per gli esercizi */
	public static void test() {
		// INSERISCI RETTANGOLO IN ORDINE
		// inserisce 10 rettangoli in modo ordinato e li stampa
		Punto p1 = new Punto(0,1);
		Punto p2 = new Punto(2,8);
		Rettangolo r = new Rettangolo(p1, p2);
		NodoListaR l = new NodoListaR(r, null);
		for (int i = 0; i < 9; i++) {
			p1 = new Punto(Math.random()*10, Math.random()*10);
			p2 = new Punto(Math.random()*10, Math.random()*10);
			r = new Rettangolo(p1, p2);
			l = inserisciRettangolo(l, r);
		}
		stampaListaR(l);
		// continuare il test inserendo 1 solo rettangolo,
		// N rettangoli in modo gia’ ordinato, N rettangoli
		// in ordine inverso.
		
		/* 1 solo rettangolo */
		l = new NodoListaR(r, null);
		p1 = new Punto(Math.random()*10, Math.random()*10);
		p2 = new Punto(Math.random()*10, Math.random()*10);
		r = new Rettangolo(p1, p2);
		l = inserisciRettangolo(l, r);
		stampaListaR(l);
		
		/* 3 rettangoli ordinati */
		l = new NodoListaR(r, null);
		for (int i = 0; i < 4; i++) {
			p1 = new Punto(i+3, Math.random()*10);
			p2 = new Punto((i+1)*4, Math.random()*10);
			r = new Rettangolo(p1, p2);
			l = inserisciRettangolo(l, r);
		}
		stampaListaR(l);
		
		/* 3 rettangoli non ordinati(ordine inverso) */
		l = new NodoListaR(r, null);
		for (int i = 0; i < 4; i++) {
			p1 = new Punto(i+1, Math.random()*10);
			p2 = new Punto(10-i, Math.random()*10);
			r = new Rettangolo(p1, p2);
			l = inserisciRettangolo(l, r);
		}
		stampaListaR(l);
		
		/* rettangolo con stessa base */
		p1 = new Punto(0,1);
		p2 = new Punto(2,7);
		r = new Rettangolo(p1, p2);
		l = new NodoListaR(r, null);
		Punto p3 = new Punto(0,1);
		Punto p4 = new Punto(2,8);
		Rettangolo r2 = new Rettangolo(p3, p4);
		l = inserisciRettangolo(l, r2);
		stampaListaR(l);
		
		/* rettangolo uguale */
		p1 = new Punto(0,1);
		p2 = new Punto(2,7);
		r = new Rettangolo(p1, p2);
		l = new NodoListaR(r, null);
		Punto p5 = new Punto(0,1);
		Punto p6 = new Punto(2,7);
		Rettangolo r3 = new Rettangolo(p5, p6);
		l = inserisciRettangolo(l, r3);
		stampaListaR(l);
		
		// FUSIONE DI STRINGHE ORDINATE
		NodoListaS l1, l2, l3;
		l1 = new NodoListaS("e", null);
		l1 = new NodoListaS("c", l1);
		l1 = new NodoListaS("a", l1);
		l2 = new NodoListaS("f", null);
		l2 = new NodoListaS("e", l2);
		l2 = new NodoListaS("c", l2);
		l2 = new NodoListaS("b", l2);
		l2 = new NodoListaS("a", l2);
		l3 = merge(l1, l2);
		// aggiungere la stampa di come ti aspetti la lista in output
		System.out.print("abcef = ");
		stampaListaS(l3);
		// seguono altri test con variazioni sulle dimensioni
		// delle due liste (es. l1 dimensione 0 oppure 1)
		
		/* l1 dimensione 1 */
		l1 = new NodoListaS("g", null);
		l2 = new NodoListaS("a", null);
		l3 = merge(l1,l2);
		System.out.print("ag = ");
		stampaListaS(l3);
		
		/* nodi uguali */
		l1 = new NodoListaS("a", null);
		l2 = new NodoListaS("a", null);
		l3 = merge(l1,l2);
		System.out.print("a = ");
		stampaListaS(l3);
		System.out.println();
		
		// CONVERSIONE NUMERO (>10) IN LISTA (a partire dalla cifra meno significativa)
		NodoListaC a = interoToLista(1234567); 
		System.out.print("7654321 => ");
		stampaListaC(a);
		a = interoToLista(-7654);
		System.out.print("456-7 => ");
		stampaListaC(a);
		a = interoToLista(7654);
		System.out.print("4567 => ");
		stampaListaC(a);
		a = interoToLista(8);
		System.out.print("8 => ");
		stampaListaC(a);
		a = interoToLista(0);
		System.out.print("0 => ");
		stampaListaC(a);
		System.out.println();
		
		// CANCELLAZIONE CARATTERE DA UNA LISTA
		NodoListaC m = interoToLista(441455445);
		m = eliminazioneRic(m,'4');
		System.out.print("5551 => ");
		stampaListaC(m);
		m = interoToLista(4);
		m = eliminazioneRic(m,'4');
		System.out.print("null => ");
		stampaListaC(m);
		m = interoToLista(1);
		m = eliminazioneRic(m,'4');
		System.out.print("1 => ");
		stampaListaC(m);
		m = interoToLista(12345);
		m = eliminazioneRic(m,'2');
		System.out.print("5431 => ");
		stampaListaC(m);
	}
}
