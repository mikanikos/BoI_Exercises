package QuartaEsercitazione;

import fiji.io.Lettore;

/* programma per giocare a battaglia navale unidimensionale contro il computer */
public class BattagliaNavaleUnidimensionale {
	
	/* metodo che restituisce una stringa che rappresenta una configurazione randomica
	 * iniziale ovvero una stringa randomica composta da 7 caratteri "acqua",
	 * 2 caratteri adiacenti "nave di lunghezza due non colpita" ed 1 carattere
	 * "nave di lunghezza uno non colpita". */
	public static String costruisciConfigurazione() {
		
		/* modo utilizzato prima della conoscenza di array 
		char acqua = 'a';
		String nave2a = "mn";
		String nave2b = "nm";
		char nave1 = 'x';
		int n,i = 9;
		String t = ""+acqua+nave1+acqua+acqua+acqua+nave2a+acqua+acqua+acqua;
		String s = "";
		boolean consecutivi = false;
		
		while(s.length() != 10) {
			n = (int)(Math.random()*i);
		    if(t.charAt(n) == 'n') {
		    	s = s+nave2b;
		    	i--;
		    }
		    else {
		    	 if(t.charAt(n) == 'm') {
		    	     s = s+nave2a;
		    	     i--;
		    	     consecutivi = true;
		         }
		    	 else
		    		 s = s + t.charAt(n);
		    }
		    if(n == t.length()-1)
			    t = t.substring(0,n);
			else {
				if(n == 0) {
					if(consecutivi)
						t = t.substring(n+2);
					else
						t = t.substring(n+1);
				}
				else {
					if(t.charAt(n) == 'm')
						t = t.substring(0,n)+t.substring(n+2);
					else {
						if(t.charAt(n) == 'n')
							t = t.substring(0,n-1)+t.substring(n+1);
						else
							t = t.substring(0,n)+t.substring(n+1);
					}
				}		
			}
		    i--;
		    consecutivi = false;
		}*/
		
		String s = "";
		String acqua = "a";
		String nave2 = "mn";
		String nave1 = "x";
		int i, a, n;
		
		String[] plancia;
		plancia = new String[9];

		for(i = 0; i < plancia.length; i++)
			plancia[i] = acqua;
		
		n = (int)(Math.random()*9);
		plancia[n] = nave1;
		
		do {
			a = (int)(Math.random()*9);
		}
		while(a == n);
		plancia[a] = nave2;
		
		for(i=0; i < plancia.length; i++)
			s = s + plancia[i];
	
		return s;
	}
	
	/* metodo che indica se una confgurazione corrisponde ad una partita finita o meno */
	public static boolean partitaFinita(String s) {
		
		boolean terminata = true;
		int i = 0;
		
		while(i < s.length() && terminata) {
			if(s.charAt(i) == 'n' || s.charAt(i) == 'm' || s.charAt(i) == 'x')
				terminata = false;
			else
				i++;
		}
		
		return terminata;
	}
	
	/* metodo che data una configurazione intermedia della plancia ed uno sparo verso
	 * la posizione p, stampa un messaggio per l'utente che indica l'esito dello sparo
	 * e restituisce la nuova configurazione della plancia. */
	public static String gestisciSparo(String s, int p) {
		
		boolean ops;
		ops = false;
		System.out.print("C: ");
		
		if(s.charAt(p) == '0') {
		    System.out.println("hai già sparato su questa casella");
		    ops = true;
		}
			
	    if(s.charAt(p)=='a' && !ops) {
		    System.out.println("acqua");
		    if(p == s.length()-1)
		        s = s.substring(0,p)+'0';
		    else {
			    if(p == 0)
				    s = '0'+s.substring(p+1);
			    else					   
			    	s = s.substring(0,p)+'0'+s.substring(p+1);	
			}
		}
		
		if((s.charAt(p)=='n' || s.charAt(p)=='m') && !ops) {
			if(p == s.length()-1)
			    s = s.substring(0,p)+'0';
			else {
				if(p == 0)
					s = '0'+s.substring(p+1);
				else
					s = s.substring(0,p)+'0'+s.substring(p+1);	
			}
			
			if(s.indexOf('n') == -1 && s.indexOf('m') != -1) 
				System.out.println("colpito");
			else {
				if(s.indexOf('m') == -1 && s.indexOf('n') != -1)
					System.out.println("colpito");
				else
					System.out.println("affondato");
			}
		}
		
		if((s.charAt(p)=='x') && !ops) {
			if(p == s.length()-1)
			    s = s.substring(0,p)+'0';
			else {
				if(p == 0)
					s = '0'+s.substring(p+1);
				else
					s = s.substring(0,p)+'0'+s.substring(p+1);	
			}
			
		    System.out.println("affondato");
		}
		return s;
	}
	
    /* metodo principale che gestisce le letture, le chiamate agli altri
     * metodi e la stampa finale. */
	public static void main(String[] args) {
		
		System.out.println(args[0]+ " " +args[1]+ " " +args[2]);
		
		System.out.println("Regole: 1. Rispondi con un numero da 0 a 9, quando è il tuo turno, per colpire le navi avversarie");
		System.out.println("        2. Rispondi, dopo ogni attacco dell'avversario, con le parole \"acqua\", \"colpito\", \"affondato\"");  
		
		String s;
		int turno;
		int navi = 0;
		int p, n = 0;
		int i = 0,j = 0;
		boolean finita = false, vittoria = false, colpito = false, ripetizione = false, stampaN= false;
		String mossa = "";
		int[] numRandom;
		numRandom = new int[10];
		
		for(j=0; j < numRandom.length; j++)
			numRandom[j] = 22; 
        
		s = costruisciConfigurazione();
		
		System.out.println("Ho configurato la mia plancia di gioco (di lunghezza 10"
				+ " ed altezza uno) con una nave di lunghezza due");
		System.out.println("ed una di lunghezza uno. Quando vuoi cominciare premi invio,"
				+ " a te la prima mossa");
		Lettore.in.leggiLinea();
		
		for (turno=1; !finita; turno++) {
			
			System.out.println(turno+"° turno");
			
			do {
				System.out.print("U: ");
            	p = Lettore.in.leggiInt();
            	if(!(p >= 0 && p <= 9))
            		System.out.println("Inserimento non corretto, riprova");
            }
			while(!(p >= 0 && p <= 9));
			
			s = gestisciSparo(s,p);
			finita = partitaFinita(s);
			
			if(!finita) {
			    System.out.print("C: ");
			    
			    do {
			    	ripetizione = false;
			    
			    if(mossa.equals("colpito") && n == 9 )
			    	n = 8;
			    else {
			        if(mossa.equals("colpito") && n == 0) 
			        	n = 1;
			        else {
			        	if(mossa.equals("acqua") && colpito)
			        		n = n-1;
			        	else {
			        		if(mossa.equals("colpito") && (n > 0 && n < 9)) {
			        			for(j = 0; j < numRandom.length && !stampaN; j++)
			    					if(n+1 == numRandom[j])
			    						stampaN = true;
			        			if (!stampaN) {
			        				n = n+1;
			        			    colpito = true;
			        			}
			        			else
			        				n = n-1;
				            }
			        		else {
			        			colpito = false;
			        			n = (int)(Math.random()*10);
			        		}
			            }
			        }   
			    }
			    
			    for(j=0; j < numRandom.length; j++)
					if(n == numRandom[j])
						ripetizione = true;
			}
			    while(ripetizione);
			    
			    System.out.println(n);
			    numRandom[i] = n;
			    
	            do {
	            	System.out.print("U: ");
	            	mossa = Lettore.in.leggiString();
	            	if(!(mossa.equals("acqua") || mossa.equals("affondato") || mossa.equals("colpito")))
	            		System.out.println("Inserimento non corretto, riprova");
	            }
			    while(!(mossa.equals("acqua") || mossa.equals("affondato") || mossa.equals("colpito")));
			    
			    if(mossa.equals("affondato"))
				    navi++;
			    if(navi == 2) {
				    System.out.println("C: Ho vinto, ho affondato tutte le tue navi! "
				    		+ "Spari effettuati da parte del calcolatore: " +turno);
				    finita = true;
				    vittoria = true;
			    }
		    }
			i++;
		}
		
		if(!vittoria)
		    System.out.println("Hai vinto, tutte le mie navi sono state affondate! "
		    		+ "Spari effettuati da parte dell'utente: " + (turno-1));
	}
}
