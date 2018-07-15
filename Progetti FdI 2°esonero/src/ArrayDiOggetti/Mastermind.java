package ArrayDiOggetti;

import fiji.io.Lettore;

public class Mastermind {
	
	/* calcolo numero di strike */
	public static int strike(int[] sequenzaC, int[] sequenzaU) {
		
		int strike = 0;
    	/* conteggio di cifre giuste in posizione corretta */
    	for(int i=0; i<4; i++)
    		if(sequenzaC[i] == sequenzaU[i])
    			strike++;
		
		return strike;
	}
	
	/* calcolo numero di ball */
    public static int ball(int[] sequenzaC, int[] sequenzaU) {
		
		int ball = 0;
		int numeroStrike = -1, numeroRip = -1;
		
		/* conteggio di cifre giuste ma in posizione diversa */
    	for(int i=0; i<4; i++) {
    		numeroStrike = -1;
    		if(sequenzaC[i] == sequenzaU[i])
    			numeroStrike = sequenzaC[i];
    		numeroRip = -1;
    		for(int j=0; j<4; j++)
    		    if(sequenzaC[i] == sequenzaU[j] && sequenzaC[i] != numeroStrike && sequenzaC[i] != numeroRip && sequenzaC[j] != sequenzaU[j]) {
    		    	ball++;	
    		    	numeroRip = sequenzaC[i];
    		    }	    	
    	}
    	/* se gli strike sono 3, i ball sono per forza 0 */
    	if(strike(sequenzaC, sequenzaU)==3)
    		ball = 0;
    	
		return ball;
	}
    
    /* valutazione partita finita */
    public static boolean partitaFinita(int[] sequenzaC, int[] sequenzaU) {
    	
    	boolean finita = false;
    	int uguali = 0;
    	
    	/* conteggio di elementi uguali */
    	for(int i=0; i<4; i++)
    		if(sequenzaC[i] == sequenzaU[i])
    			uguali++;
    	
    	/* se sono tutti uguali, partita finita */
    	if(uguali == 4)
    		finita = true;
    	
    	return finita;
    }
    
    /* metodo principale */
    public static void main(String[] args) {
    	
    	/* messaggio all'utente e istruzioni */
    	System.out.println(args[0]);
    	
    	int tentativi = 0;
    	
    	/* generazione sequenza da indovinare */
    	int[] sequenzaC;
    	sequenzaC = new int[4];
    	for(int i=0; i<4; i++)
    		sequenzaC[i] = (int)(Math.random()*10);
    	
    	/*
    	PER LA VERIFICA(TEST 1244)
    	
    	sequenzaC[0] = 1;
    	sequenzaC[1] = 2;
    	sequenzaC[2] = 4;
    	sequenzaC[3] = 4;
    	
    	for(int i=0; i<4; i++)
    		System.out.print(sequenzaC[i]);
    	System.out.println();*/
    	
    	
    	/* sequenza immessa dall'utente */
    	int[] sequenzaU;
    	do {
    		sequenzaU = new int[4];
    		/* lettura sequenza dell'utente */
        	System.out.println("Inserisci la sequenza di cifre, premendo invio dopo ciascuna");
        	for(int i=0; i<4; i++)
        		sequenzaU[i] = Lettore.in.leggiInt();
        	
        	/* stampa di ball e strike */
        	System.out.println("| Tentativo | Strike | Ball |");
        	System.out.print("    ");
        	for(int i=0; i<4; i++)
        		System.out.print(sequenzaU[i]);
        	System.out.println("        " +strike(sequenzaC, sequenzaU)+ "        " +ball(sequenzaC, sequenzaU));
        	tentativi++;
    	}
    	while(partitaFinita(sequenzaC, sequenzaU) == false);
    	
    	System.out.println("Sequenza indovinata! Tentativi effettuati: "+tentativi);
    }
}
