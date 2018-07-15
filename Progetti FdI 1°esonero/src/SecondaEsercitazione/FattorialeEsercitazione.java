package SecondaEsercitazione;
import fiji.io.*;

/*Calcolo di alcuni fattoriali */
class FattorialeEsercitazione {

	public static void main(String[] args){

		/* dichiarazione delle variabili */
		int i; //conta il numero di volte che deve essere eseguita la moltiplicazione
		int f; //risultato
		int n; // numero letto da input per il calcolo di n!

		/* calcolo del fattoriale di 5 */
		f = 1*2*3*4*5;
		System.out.print("il fattoriale di 5 e' ");
		System.out.println(f);

		/* calcolo del fattoriale di 17 con il for */
		f=1; //se i=0 l'istruzione for non viene eseguita e f rimane 1

		for(i=1; i<=17; i++)
			f = f * i;

		System.out.print("il fattoriale di 17 e' ");
		System.out.println(f);

		/* oppure, non conoscendo ancora le istruzioni ripetitive */
		f = 1*2*3*4*5*6*7*8*9*10*11*12*13*14*15*16*17;
		System.out.print("il fattoriale di 17 e' ");
		System.out.println(f);

		System.out.print("scrivi ora tu un numero di cui vuoi calcolare il fattoriale");
		n=Lettore.in.leggiInt();

		f=1; //se i=0 l'istruzione while non viene eseguita e f rimane 1
		for(i=1; i<=n; i++)
			f = f * i;

		System.out.print("il fattoriale di n e' ");
		System.out.println(f);


	}//end main

}//end class