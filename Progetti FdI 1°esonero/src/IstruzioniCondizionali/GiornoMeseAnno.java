package IstruzioniCondizionali;
import fiji.io.*;

public class GiornoMeseAnno {

	/* metodo principale */
	public static void main(String[] args) {
		int giorno, mese, anno; 				// giorno, mese e anno da leggere 
		int giornoSucc, meseSucc, annoSucc;		// giorno, mese e anno da restituire
		
		/* leggi tre numeri */
		System.out.println("Introduci un giorno");
		giorno = Lettore.in.leggiInt();
		System.out.println("Introduci un mese");
		mese = Lettore.in.leggiInt();
		System.out.println("Introduci un anno");
		anno = Lettore.in.leggiInt();
	
		/* calcola l'anno: e' sempre uguale a quello dato, tranne se la
		 * data di partenza e' il 31 dicembre */
		if(giorno==31 && mese==12){ 	// auguri di buon anno!!!
			giornoSucc = 1;
			meseSucc = 1;
			annoSucc = anno +1;
		}
		else { 
			annoSucc = anno; // rimani nello stesso anno
			
			/* calcola il mese e il giorno: sono rispettivamente lo stesso e
			 * lo stesso piu' uno a meno che non sei nell'ultimo giorno del mese */
			if(mese==1||mese==3||mese==5||
			   mese==7||mese==8||mese==10||mese==12){ // il mese ha 31 giorni
				if(giorno==31) { 	// fine mese, osserva che mese!=12
					giornoSucc = 1;
					meseSucc = mese+1;		
				}
				else {// non fine mese
					giornoSucc = giorno+1;
					meseSucc = mese;
				}
			} else {
				if(mese==4||mese==6||mese==9||mese==11) { // il mese ha 30 giorni
					if(giorno==30) { // fine mese
						giornoSucc = 1;
						meseSucc = mese+1;		
					}
					else {// non fine mese
						giornoSucc = giorno+1;
						meseSucc = mese;
					}
				}
				else { // sei a febbraio
					if(((anno%4==0)&&(anno%100!=0))||(anno%400==0)) {// anno bisestile
						if(giorno==29) {// fine mese
							giornoSucc = 1;
							meseSucc = 3;
						}
						else {// non fine mese
							giornoSucc=giorno+1;
							meseSucc=mese;
						}
					} 
					else { // anno non bisestile 
						if(giorno==28) {// fine mese
							giornoSucc = 1;
							meseSucc = 3;
						}
						else {// non fine mese
							giornoSucc = giorno+1;
							meseSucc = mese;
						}
					}
				}
			}
		}
		
		/* stampa un messaggio per l'utente */
		System.out.println("Il giorno successivo e' " +giornoSucc+
				"/" +meseSucc+ "/" +annoSucc);

	}
}