package TerzaEsercitazione;

import fiji.io.*;
/**
Applicazione che calcola la data del giorno dopo
*/
class IlGiornoDopo{

	public static void main(String[] args){
		int g,m,a;  //INPUT
		int gg,mm,aa;//OUTPUT
		int giorni_del_mese; //quanti giorni ha il mese m

		/*lettura dei coefficienti da input */
		/* senza il controllo sulla correttezza dei dati*/
		System.out.println("Scrivi tre interi che rappresentano una data: giorno, mese e anno separati da spazi: ");
		g = Lettore.in.leggiInt();
		m = Lettore.in.leggiInt();
		a = Lettore.in.leggiInt();

		aa=a; //nel caso in cui non vengano modificate
		mm=m;

		//calcolo dei giorni del mese
		if (m==2)
			if (bisestile(a))
				giorni_del_mese = 29;
			else
				giorni_del_mese = 28;
		else
			if (m==4 || m==6 || m==9 || m==11)//mesi con 30 giorni
				giorni_del_mese = 30;
			else
				giorni_del_mese = 31;

		//calcolo della data successiva
		if (g==giorni_del_mese){//se il giorno e' l'ultimo del mese
			gg=1;
			if (m==12){//ultimo giorno dell'anno
				mm=1;
				aa=a+1;
			}
			else {
				mm=m+1;
				aa=a;
			}
		}
	
		else
			gg=g+1; //nel caso generale basta incrementare il giorno

		System.out.print("Il giorno successivo e' il ");
		System.out.println(gg + " " +mm+ " " + aa);
	}//end main

	public static boolean bisestile(int data){
	return (data%4==0)&&(!(data%100==0)||(data%400==0));
	}

}//end class
