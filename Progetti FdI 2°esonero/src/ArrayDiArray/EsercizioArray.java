package ArrayDiArray;
import fiji.io.*;

public class EsercizioArray
	{
	public static void main(String[]args)
		{
		System.out.println("quanti numeri vuoi confrontare?");

		int lunghezza=Lettore.in.leggiInt();
		while(lunghezza<0)
			{
			System.out.println("il programma non funzionerà con una quantità di numeri negativa");
			System.out.println("scrivi un numero maggiore o uguale a zero");
			lunghezza=Lettore.in.leggiInt();
			}

		int[] valori=new int[lunghezza];
		System.out.println();
		System.out.println("scrivi i numeri");
		int posizione=0;
		while(posizione<lunghezza)
			{
			valori[posizione]=Lettore.in.leggiInt();
			posizione++;
			}
		System.out.println();
		System.out.println("in che tipo di matrice vuoi ordinare i numeri?");
		System.out.println("scrivi il numero delle righe");
		int righe=Lettore.in.leggiInt();
		while(lunghezza%righe!=0)
			{
			System.out.println("non puoi creare una matrice con questo numero di righe");
			righe=Lettore.in.leggiInt();
			}
		int colonne=lunghezza/righe;
		System.out.println();
		System.out.println("la matrice avrà dunque "+righe+" righe e "+colonne+" colonne");
		System.out.println();
		System.out.println("ecco la matrice");

		int[][] matrice=new int[righe][colonne];

		posizione=0;
		int conteggioRighe=0;
		int conteggioColonne=0;
		int posizioneInColonna=1;
		/* questa parte del programma stampa sullo schermo i valori dell'array "valori"
		in modo da riprodurre la matrice desiderata e contemporaneamente crea un array di array
		che sia effettivamente congruente alla suddetta matrice*/
		while(conteggioRighe<righe)
			{
			System.out.print("( ");
			while(conteggioColonne<colonne)
				{
				System.out.print(valori[posizione]);
				matrice[conteggioRighe][conteggioColonne]=valori[posizione];
				if(posizioneInColonna<colonne)
					{
					System.out.print(", ");
					posizioneInColonna++;
					}
				conteggioColonne++;
				posizione++;
				}
			System.out.print(" )");
			System.out.println();
			posizioneInColonna=1;
			conteggioColonne=0;
			conteggioRighe++;
			}
		System.out.println();
		System.out.println("il valore massimo è "+Massimo(valori));


		System.out.println();
		System.out.println();
		System.out.println();
		/*per verificare la correttezza di questo procedimento
		faremo stampare al programma l'array matrice per vedere
		se corrisponde graficamente alla prima matrice stampata
		dal programma*/
		System.out.println("è stato creato un array di array chiamato 'Matrice' corrispondente alla matrice stampata");
		System.out.println("TEST");
		System.out.println();
		System.out.println("Matrice["+righe+"]["+colonne+"]");
		System.out.println();
		posizione=0;
		conteggioRighe=0;
		conteggioColonne=0;
		posizioneInColonna=1;
		while (conteggioRighe<righe)
			{
			System.out.print("Matrice["+conteggioRighe+"]: { ");
			while (conteggioColonne<colonne)
				{
				System.out.print(matrice[conteggioRighe][conteggioColonne]);
				if(posizioneInColonna<colonne)
					{
					System.out.print(", ");
					posizioneInColonna++;
					}
				conteggioColonne++;
				}
			System.out.print(" }");
			System.out.println();
			posizioneInColonna=1;
			conteggioColonne=0;
			conteggioRighe++;
			}

		}
	public static int Massimo(int[] numeri)
		{
		int massimo=numeri[0];
		int posizione=1;
		int valore;
		while(posizione<numeri.length)
			{
			valore=numeri[posizione];
			if(valore>massimo)
			massimo=valore;
			posizione++;
			}
		return massimo;
		}
	}