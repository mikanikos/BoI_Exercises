package IstruzioniCondizionali;

import fiji.io.*;
/* Applicazione che calcola la data del giorno dopo */
//INPUT: giorno, mese, anno, numeri interi
//pre: giorno, mese e anno sono valori ammissibili
//OUTPUT: g, m, a, numeri interi
//post: g, m, a, corrispondono al giorno successivo alla data di input

class IlGiornoDopoSenzaBisestile{

	 public static void main(String[] args){

		  int giorno, mese, anno;  //INPUT
		  int g,m,a;//OUTPUT
		  int giorni_del_mese; //quanti giorni ha il mese m

		  /*lettura della data di partenza senza controllo
    		* sulla correttezza dei dati */
    	  System.out.println("scrivi una data gg mm aaaa");
		  giorno = Lettore.in.leggiInt();
		  mese = Lettore.in.leggiInt();
		  anno = Lettore.in.leggiInt();

		a=anno; //nel caso in cui non vengano modificate
		m=mese;
		/* calcolo dei giorni del mese */
		giorni_del_mese=GiorniMese(mese, anno);

		/* calcolo della data successiva */
		/* se il giorno e' l'ultimo del mese */
		if (giorno==giorni_del_mese){
			g=1;
			if (mese==12){   //ultimo giorno dell'anno
				m=1;
				a=anno+1;}
			else
				m=mese+1;
		       }
		else   //nel caso generale basta incrementare il giorno
			g=giorno+1;

		System.out.println(g + " " +m+ " " + a);
	}

	public static int GiorniMese(int mese,int anno){
		 int giorni;
		 if(mese==2)
			  if(BisestilePerIlGiornoDopo.bisestile(anno))
				  giorni = 29;
			  else giorni = 28;
		 else
    	 	if(mese==4 || mese==6 || mese==9 || mese==11)
				  giorni = 30;
			else giorni = 31;
	 	return giorni;
	}
}
