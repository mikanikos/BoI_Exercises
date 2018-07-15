package ArrayDiOggetti;

public class FusioneSeqOrdinate {
	
	/* implementazione fusione */
	public static int[] fusione(int[] a, int[] b) {
		// pre: a!=null && b!=null &&
		// a e b ordinati in modo non decrescente
		int[] s; // risultato della fusione di a e b
		int ia, ib, is; // indici per a, b e s
		/* inizializzazioni */
		s = new int[a.length+b.length];
		ia = 0;
		ib = 0;
		is = 0;
		/* prima fase della fusione: inserisci da a e b */
		while (ia<a.length && ib<b.length) {
		    /* inserisci in s il più piccolo tra a[ia] e b[ib] */
		    if (a[ia]<b[ib]) {
		        s[is] = a[ia];
		        ia++;
		    }
		    else {
		        s[is] = b[ib];
		        ib++;
		    }
		    is++;
		}
		/* ora ia==a.length || ib==b.length */
		/* seconda fase della fusione: inserisci da a o b */
		if (ib==b.length)
		/* inserisci da a; l'indice ib non serve piu': lo riutilizzo nel ciclo */
		for (ib=ia; ib<a.length; ib++){
		    s[is] = a[ib];
		    is++;
		}
		else
		/* inserisci da b; l'indice ia non serve piu': lo riutilizzo nel ciclo */
		for (ia=ib; ia<b.length; ia++){
		    s[is] = b[ia];
		    is++;
		}
		/* ora la fusione è stata completata */
		return s;
	}
	
	/* metodo che calcola gli elementi comuni ai due array */
	public static int comuni(int[] a, int[] b) {
		
		int comuni=0;
		int ia=0, ib=0;
		
		/* utilizzo dei due indici per scandire contemporaneamente gli elementi di a e b */
		/* se sono uguali incrementa il contatore, altrimenti incrememta i rispettivi indici di a o b */
		while (ia<a.length && ib<b.length) {
		    /* inserisci in s il più piccolo tra a[ia] e b[ib] */
		    if (a[ia]<b[ib])
		        ia++;
		    else {
		    	if (a[ia]>b[ib])
			        ib++;
		    	else {
			        ia++;
			        ib++;
			        comuni++;
		    	}
		    }
	    }
		return comuni;
	}
	
	/* metodo che crea un nuovo array di fusione senza duplicati */
	public static int[] fusioneConDuplicati(int[] a, int[] b) {
		// pre: a!=null && b!=null &&
		// a e b ordinati in modo non decrescente
		int[] s; // risultato della fusione di a e b
		int ia, ib, is; // indici per a, b e s
		/* inizializzazioni */
		s = new int[a.length+b.length];
		ia = 0;
		ib = 0;
		is = 0;
		/* prima fase della fusione: inserisci da a e b */
		while (ia<a.length && ib<b.length) {
		    /* inserisci in s il più piccolo tra a[ia] e b[ib] */
		    if (a[ia]<b[ib]) {
		        s[is] = a[ia];
		        ia++;
		    }
		    else {
		    	if (a[ia]>b[ib]) {
			        s[is] = b[ib];
		    		ib++;
		    	}
		    	/* se sono uguali incrementa entrambi gli indici e ne insierisce uno in s */
		    	else {
		    		s[is] = b[ib];
			        ia++;
			        ib++;
		    	}
		    }
		    is++;
		}
		/* ora ia==a.length || ib==b.length */
		/* seconda fase della fusione: inserisci da a o b */
		if (ib==b.length)
		/* inserisci da a; l'indice ib non serve piu': lo riutilizzo nel ciclo */
		for (ib=ia; ib<a.length; ib++){
		    s[is] = a[ib];
		    is++;
		}
		else
		/* inserisci da b; l'indice ia non serve piu': lo riutilizzo nel ciclo */
		for (ia=ib; ia<b.length; ia++){
		    s[is] = b[ia];
		    is++;
		}
		
		/* copia degli elementi dell'array creato in uno di lunghezza giusta */
		int[] t = new int[is];
		for(int i=0; i<t.length; i++)
			t[i] = s[i];
		/* ora la fusione è stata completata */
		return t;
	}
	
	/* metodo main */
	public static void main(String[] args) {
		/* stampa per verifica metodo comuni */
		System.out.println("3 = " +comuni((new int[] {2,7,11,21,48,89}),(new int[] {7,11,15,21,42,45})));
		/* stampa per verifica metodo fusioneConDuplicati */
		System.out.print("5 8 12 26 34 = ");
		for(int i=0; i<fusioneConDuplicati((new int[] {5,12,26,34}),(new int[] {5,8,26})).length; i++)
			System.out.print(fusioneConDuplicati((new int[] {5,12,26,34}),(new int[] {5,8,26}))[i]+ " ");
	}
}
