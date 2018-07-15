package ArrayDiArray;

import fiji.io.Lettore;

public class Tris {
	
	public static char partitaFinita(char[][] griglia) {
		char esito = ' ';
		int contatore=0;
		int i=0,j=0;
		
		/* parit� */
		for(i=0; i<griglia.length && contatore != 9; i++) {
			for(j=0; j<griglia[i].length; j++)
				if(griglia[i][j] == 'X' || griglia[i][j] == 'O')
					contatore++;
		}
		if(contatore == 9)
			esito = 'p';
		
		contatore = 0;
		
		/* riga di X */
		for(i=0; i<griglia.length && contatore != 3; i++) {
			contatore = 0;
			for(j=0; j<griglia[i].length; j++)
				if(griglia[i][j] == 'X')
					contatore++;
		}
		if(contatore == 3)
			esito = 'u';
		
		contatore = 0;
		
		/* riga di O */
		for(i=0; i<griglia.length && contatore != 3; i++) {
			contatore = 0;
			for(j=0; j<griglia[i].length; j++)
				if(griglia[i][j] == 'O')
					contatore++;
		}
		if(contatore == 3)
			esito = 'c';
		
		contatore = 0;
		
		/* colonna di X */
		for(j=0; j<3 && contatore != 3; j++) {
			contatore = 0;
			for(i=0; i<griglia.length; i++)
				if(griglia[i][j] == 'X')
					contatore++;
		}
		if(contatore == 3)
			esito = 'u';
		
		contatore = 0;
		
		/* colonna di O */
		for(j=0; j<3 && contatore != 3; j++) {
			contatore = 0;
			for(i=0; i<griglia.length; i++)
				if(griglia[i][j] == 'O')
					contatore++;
		}
		if(contatore == 3)
			esito = 'c';
		
		contatore = 0;
		
		/* diagonale pri di X */
		i=0;
		contatore = 0;
		for(j=0; j<3 && contatore != 3; j++) {
			if(griglia[i][j] == 'X')
				contatore++;
			i++;
		}
		if(contatore == 3)
			esito = 'u';
		
		contatore = 0;
		
		/* diagonale pri di O */
		i=0;
		contatore = 0;
		for(j=0; j<3 && contatore != 3; j++) {
			if(griglia[i][j] == 'O')
				contatore++;
			i++;
		}
		if(contatore == 3)
			esito = 'c';
		
		contatore = 0;
		
		/* diagonale sec di X */
		i=0;
		contatore = 0;
		for(j=2; j>=0 && contatore != 3; j--) {
			if(griglia[i][j] == 'X')
				contatore++;
			i++;
		}
		if(contatore == 3)
			esito = 'u';
		
		contatore = 0;
		
		/* diagonale sec di O */
		i=0;
		contatore = 0;
		for(j=2; j>=0 && contatore != 3; j--) {
			if(griglia[i][j] == 'O')
				contatore++;
			i++;
		}
		if(contatore == 3)
			esito = 'c';
		
		return esito;
	}

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		char rigioca;
		boolean inizio;
		int riga,colonna;
		char vincitore = ' ';
		char[][] griglia = new char[][] {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		
		System.out.println();
		System.out.println("ATTENZIONE: LA FINALITA' DI TALE APPLICAZIONE CONSISTE NEL VOLER METTERE ALLA PROVA IL GIOCATORE");
		System.out.println("IN UNA SFIDA CONTRO UN CALCOLATORE SEMI-INTELLIGENTE: L'ALGORITMO E' STATO CREATO PER EMULARE");
		System.out.println("L'INTELLIGENZA ARTIFICIALE MA POTREBBE COMUNQUE FALLARE IN SITUAZIONI PARTICOLARI.");
		System.out.println("Premi invio per iniziare");
		Lettore.in.leggiLinea();
		System.out.println("REGOLE DEL GIOCO DEL TRIS");
                System.out.println("A turno, i giocatori scelgono una cella vuota e vi disegnano il proprio simbolo\n"
                        + "(di solito un giocatore ha come simbolo una X e l'avversario un cerchio).\n"
                        + "Vince il giocatore che riesce a disporre tre dei propri simboli in linea retta orizzontale,\n"
                        + "verticale o diagonale. Se la griglia viene riempita senza che nessuno dei giocatori sia riuscito\n"
                        + "a completare una linea retta di tre simboli, il gioco finisce in parità. (Wikipedia)\n");
                System.out.println("Premi invio per generare un numero casuale tra 0 e 1 in modo da");
		System.out.println("stabilire chi iniziera' a giocare per primo (calcolatore: 0 - utente: 1)");
		Lettore.in.leggiLinea();
		do {
		vincitore = ' ';
		griglia = new char[][] {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		int utente = 1;
		int n = (int)(Math.random()*2);
		System.out.print("Numero random generato: " +n+ "\n");
		
		if(n == utente) {
			System.out.println("L'utente avra' la prima mossa");
			inizio = false;
		}
		else {
			System.out.println("Il calcolatore avra' la prima mossa");
			inizio = true;
		}
		
		System.out.println("La seguente è la griglia di partenza: quando vuoi iniziare, premi invio");
		System.out.println("   1   2   3");
		System.out.println("1 _ _|_ _|_ _");
		System.out.println("2 _ _|_ _|_ _");
		System.out.println("3    |   |   ");
		Lettore.in.leggiLinea();
		
		while((partitaFinita(griglia) != 'u') && (partitaFinita(griglia) != 'c') && (partitaFinita(griglia) != 'p')) {
			if(n == utente) {
				do {
					System.out.println("Inserisci gli indici di riga(1-3) e colonna(1-3) corrispondenti,");
					System.out.println("intervallati da invio, alla posizione nella quale vuoi inserire la X");
					riga = Lettore.in.leggiInt();
					colonna = Lettore.in.leggiInt();
					if(!((riga>=1 && riga<=3)&&(colonna>=1 && colonna<=3)) || griglia[riga-1][colonna-1] == 'O' || griglia[riga-1][colonna-1] == 'X')
						System.out.println("Inserimento non corretto, riprova");
				}
				while(!((riga>=1 && riga<=3)&&(colonna>=1 && colonna<=3)) || griglia[riga-1][colonna-1] == 'O' || griglia[riga-1][colonna-1] == 'X');
				
				griglia[riga-1][colonna-1] = 'X';
				
				if(partitaFinita(griglia) == 'u')
				    vincitore = 'u';
			}
			
			if((partitaFinita(griglia) != 'u') && (partitaFinita(griglia) != 'c') && (partitaFinita(griglia) != 'p')) {
				boolean ripeti;
				int[] mossa;
				mossa = new int[2];
				if(griglia[1][1] == ' ' && !inizio)
					griglia[1][1] = 'O';
				else {
					if(griglia[0][0] == ' ' && griglia[0][2] == ' ' && griglia[2][0] == ' ' && griglia[2][2] == ' ' ) {
						do {
							riga =(int)(Math.random()*3);
							colonna = (int)(Math.random()*3);
						}
						while(riga == 1 || colonna == 1);
						griglia[riga][colonna] = 'O';
					}
					else {
				do {
					ripeti = false;
					mossa = valutaMossa(griglia);
					if(mossa[0] == 9 && mossa[1] == 9) {
						riga = (int)(Math.random()*3);
						colonna = (int)(Math.random()*3);
					}
					else {
						riga = mossa[0];
						colonna = mossa[1];
					}
					if(griglia[riga][colonna] == ' ')
					    griglia[riga][colonna] = 'O';
					else
						ripeti = true;
				}
				while(ripeti);
				}
				}
				
				if(partitaFinita(griglia) == 'c')
				    vincitore = 'c';
			}
			n=1;
			System.out.println("   1   2   3");
		    System.out.println("1 _"+griglia[0][0]+"_|_"+griglia[0][1]+"_|_"+griglia[0][2]+"_");
		    System.out.println("2 _"+griglia[1][0]+"_|_"+griglia[1][1]+"_|_"+griglia[1][2]+"_");
		    System.out.println("3  "+griglia[2][0]+" | "+griglia[2][1]+" | "+griglia[2][2]+" ");
		}
		
		if(vincitore == 'u')
			System.out.println("Complimenti, mi hai battuto");
		else {
			if(vincitore == 'c')
				System.out.println("Ho vinto!");
			else 
				System.out.println("La partita � finita in parit�");
		}
		
		System.out.println("Vuoi rigiocare?(y/n)");
		rigioca = Lettore.in.leggiChar();
		
		}
		while(rigioca == 'y' || rigioca == 'Y');
	}
	
	public static int[] valutaMossa(char[][] griglia) {
		
		int[] mossa;
		mossa = new int[2];
		int contatore=0;
		int i=0,j=0;
		
		mossa[0]=9;
		mossa[1]=9;
		
		/* ATTACCA */
		
		/* riga di SPAZI */
		for(i=0; i<griglia.length && contatore != 5; i++) {
			contatore = 0;
			for(j=0; j<griglia[i].length; j++) {
				if(griglia[i][j] == ' ')
					contatore++;
				if(griglia[i][j] == 'O')
					contatore+=3;
			}
		}
		if(contatore == 5) {
			for(j=0; j<griglia[i-1].length; j++)
				if(griglia[i-1][j] == ' ') {
					mossa[0] = i-1;
					mossa[1] = (int)(Math.random()*3);
				}
		}
		
		contatore = 0;
		
		/* colonna di SPAZI */
		for(j=0; j<3 && contatore != 5; j++) {
			contatore = 0;
			for(i=0; i<griglia.length; i++) {
				if(griglia[i][j] == ' ')
					contatore++;
				if(griglia[i][j] == 'O')
				    contatore+=3;
			}
		}
		if(contatore == 5) {
			for(i=0; i<griglia.length; i++)
				if(griglia[i][j-1] == ' ') {
					if(i==0)
						mossa[0] = 2;
					if(i==2)
						mossa[0] = 0;
					do{
					if(i==1)
						mossa[0] = (int)(Math.random()*3);
					}
					while(mossa[0] == 1);
					mossa[1] = j-1;
				}
		}
		
		contatore = 0;
		
		/* diagonale pri di SPAZI */
		i=0;
		contatore = 0;
		for(j=0; j<3 && contatore != 5; j++) {
			if(griglia[i][j] == ' ')
				contatore++;
			if(griglia[i][j] == 'O')
				contatore+=3;
			i++;
		}
		if(contatore == 5) {
			if(griglia[0][0] == 'O') {
				mossa[0] = 2;
			    mossa[1] = 2;
			}
			if(griglia[2][2] == 'O') {
				mossa[0] = 0;
			    mossa[1] = 0;
			}
			/* METTERE QUESTO E TORGLIERE I DUE IF SOPRA SE SI VUOLE RENDERE MENO FORTE IL CALCOLATORE */
			/*
			i=0;
			for(j=0; j<3; j++) {
				if(griglia[i][j] == ' ') {
					mossa[0] = i;
					mossa[1] = j;
				}
				i++;
			}
			*/
		}
		
		contatore = 0;
		
		/* diagonale sec di SPAZI */
		i=0;
		contatore = 0;
		for(j=2; j>=0 && contatore != 5; j--) {
			if(griglia[i][j] == ' ')
				contatore++;
			if(griglia[i][j] == 'O')
				contatore+=3;
			i++;
		}
		if(contatore == 5) {
			if(griglia[0][2] == 'O') {
				mossa[0] = 2;
			    mossa[1] = 0;
			}
			if(griglia[2][0] == 'O') {
				mossa[0] = 0;
			    mossa[1] = 2;
			}
			/* METTERE QUESTO E TORGLIERE I DUE IF SOPRA SE SI VUOLE RENDERE MENO FORTE IL CALCOLATORE */
			/*
			i=0;
			for(j=2; j>=0; j--) {
				if(griglia[i][j] == ' ') {
					mossa[0] = i;
					mossa[1] = j;
				}
				i++;
			}
			*/
		}
		
		contatore = 0;
		
		/* SE SI VUOLE LASCIARE UNA POSSIBILITA' DI VINCITA ALL'AVVERSARIO CANCELLARE UNA O ENTRAMBE LE PARTI "inizia l'avversario"*/
		/* inizia l'avversario1 */
		for(i=0; i<griglia.length && contatore != 6; i++) {
			for(j=0; j<griglia[i].length; j++)
				if(griglia[i][j] == ' ')
					contatore++;
		}
		if(contatore==6 && griglia[1][1]=='O' && ((griglia[0][0]=='X' && griglia[2][2]=='X') || (griglia[2][0]=='X' && griglia[0][2]=='X'))) {
			mossa[0] = 1;
			mossa[1] = (int)(Math.random()*3);
		}
		
		contatore = 0;
		
		/* inizia l'avversario2 */
		for(i=0; i<griglia.length && contatore != 6; i++) {
			for(j=0; j<griglia[i].length; j++)
				if(griglia[i][j] == ' ')
					contatore++;
		}
		if(contatore==6 && griglia[1][1]=='X' && ((griglia[0][0]=='X' && griglia[2][2]=='O') || (griglia[2][0]=='X' && griglia[0][2]=='O') || (griglia[0][0]=='O' && griglia[2][2]=='X') || (griglia[2][0]=='O' && griglia[0][2]=='X'))) {
			if(griglia[0][0] == ' ') {
				mossa[0] = 0;
				mossa[1] = 0;
			}
			if(griglia[2][2] == ' ') {
				mossa[0] = 2;
				mossa[1] = 2;
			}
			if(griglia[0][2] == ' ') {
				mossa[0] = 0;
				mossa[1] = 2;
			}
			if(griglia[2][0] == ' ') {
				mossa[0] = 2;
				mossa[1] = 0;
			}
			/*mossa[0] = 2;
			mossa[1] = (int)(Math.random()*3);*/
		}
		contatore = 0;
			
		/* riga di X */
		for(i=0; i<griglia.length && contatore != 2; i++) {
			contatore = 0;
			for(j=0; j<griglia[i].length; j++)
				if(griglia[i][j] == 'X')
					contatore++;
		}
		if(contatore == 2) {
			for(j=0; j<griglia[i-1].length; j++)
				if(griglia[i-1][j] == ' ') {
					mossa[0] = i-1;
					mossa[1] = j;
				}
		}
		
		contatore = 0;
		
		/* colonna di X */
		for(j=0; j<3 && contatore != 2; j++) {
			contatore = 0;
			for(i=0; i<griglia.length; i++)
				if(griglia[i][j] == 'X')
					contatore++;
		}
		if(contatore == 2) {
			for(i=0; i<griglia.length; i++)
				if(griglia[i][j-1] == ' ') {
					mossa[0] = i;
					mossa[1] = j-1;
				}
		}
		
		contatore = 0;
		
		/* diagonale pri di X */
		i=0;
		contatore = 0;
		for(j=0; j<3 && contatore != 2; j++) {
			if(griglia[i][j] == 'X')
				contatore++;
			i++;
		}
		if(contatore == 2) {
			i=0;
			for(j=0; j<3; j++) {
				if(griglia[i][j] == ' ') {
					mossa[0] = i;
					mossa[1] = j;
				}
				i++;
			}
		}
		
		contatore = 0;
		
		/* diagonale sec di X */
		i=0;
		contatore = 0;
		for(j=2; j>=0 && contatore != 2; j--) {
			if(griglia[i][j] == 'X')
				contatore++;
			i++;
		}
		if(contatore == 2) {
			i=0;
			for(j=2; j>=0; j--) {
				if(griglia[i][j] == ' ') {
					mossa[0] = i;
					mossa[1] = j;
				}
				i++;
			}
		}
		
		contatore = 0;
		
		/* riga di O */
		for(i=0; i<griglia.length && contatore != 2; i++) {
			contatore = 0;
			for(j=0; j<griglia[i].length; j++)
				if(griglia[i][j] == 'O')
					contatore++;
		}
		if(contatore == 2) {
			for(j=0; j<griglia[i-1].length; j++)
				if(griglia[i-1][j] == ' ') {
					mossa[0] = i-1;
					mossa[1] = j;
				}
		}
		
		contatore = 0;
		
		/* colonna di O */
		for(j=0; j<3 && contatore != 2; j++) {
			contatore = 0;
			for(i=0; i<griglia.length; i++)
				if(griglia[i][j] == 'O')
					contatore++;
		}
		if(contatore == 2) {
			for(i=0; i<griglia.length; i++)
				if(griglia[i][j-1] == ' ') {
					mossa[0] = i;
					mossa[1] = j-1;
				}
		}
		
		contatore = 0;
		
		/* diagonale pri di O */
		i=0;
		contatore = 0;
		for(j=0; j<3 && contatore != 2; j++) {
			if(griglia[i][j] == 'O')
				contatore++;
			i++;
		}
		if(contatore == 2) {
			i=0;
			for(j=0; j<3; j++) {
				if(griglia[i][j] == ' ') {
					mossa[0] = i;
					mossa[1] = j;
				}
				i++;
			}
		}
		
		contatore = 0;
		
		/* diagonale sec di O */
		i=0;
		contatore = 0;
		for(j=2; j>=0 && contatore != 2; j--) {
			if(griglia[i][j] == 'O')
				contatore++;
			i++;
		}
		if(contatore == 2) {
			i=0;
			for(j=2; j>=0; j--) {
				if(griglia[i][j] == ' ') {
					mossa[0] = i;
					mossa[1] = j;
				}
				i++;
			}
		}
		
		return mossa;
	}
}
