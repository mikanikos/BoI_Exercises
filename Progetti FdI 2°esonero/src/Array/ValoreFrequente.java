package Array;
/* Direttiva per importare la classe Scanner */

import fiji.io.Lettore;

/* Una classe che legge un array di interi da tastiera, e 
 * stampa un messaggio che indica qual e' l'elemento che
 * appare piu' spesso */

public class ValoreFrequente {

	/* metodo che calcola il massimo in un array */
	public static int massimo(int[] x){
		int i, massimo;					// contatore e valore da restituire
		
		/* inizializza massimo a x[0], poi scorri ogni elemento
		 * dell'array e aggiorna massimo, se ce n'e' bisogno */
		massimo = x[0];
		for(i=1;i<x.length;i++){					
			if(x[i]>massimo){						
				massimo=x[i];						
			}									
		} 										
		return massimo;							
	}

	/* metodo che calcola il numero di occorrenze di un valore
	 * all'interno di un array */
	public static int numeroOccorrenze(int[] x,int val){
		int numero;			// il numero da restituire
		int i;				// variabile contatore

		/* inizializza numero a 0; poi considera ciasscun 
		 * elemento dell'array e incrementa numero se quell'elemento
		 * ha valore val */
		numero = 0;
		for(i=0;i<x.length;i++) {
			if(x[i]==val){
				numero++;
			}
		}
		
		/* restituisci il valore calcolato */
		return numero;
	}
	
	/* Metodo che calcola un array che per ciascun valore in x 
	 * memorizza quante occorrenze quel valore ha in x. Ad esempio
	 * se x e' l'array {2,3,1,3,7,4,3,6,3,4} l'array calcolato deve essere
	 * {1,4,1,4,1,2,4,1,4,1} */
	public static int[] arrayOccorrenze(int[] x){
		int[] occorrenze;	// l'array da restituire
		int i;				// variabile contatore

		/* occorrenze e x hanno lo stesso numero di elementi */
		occorrenze = new int[x.length];
		
		/* per ciascun elemento di x invoca il metodo numeroOccorrenze
		 * per contare quante volte quell'elemento appare in x */
		for(i=0;i<x.length;i++) {
			occorrenze[i]=numeroOccorrenze(x,x[i]);
		}
		
		/* restituisci l'array calcolato */
		return occorrenze;
	}
	
	/* metodo che calcola qual e' il valore piu' frequente
	 * nell'array passato come parametro e ne restituisce l'indice */
	public static int valoreFrequente(int[] x){
		int[] occorrenze;		// array per il numero di occorrenze
		int massimo;			// numero massimo di volte che un elemento appare in x
		int indiceMassimo;		// l'indice dell'elemento piu' frequente
		int i;					// contatore
		
		/* calcola quante volte ciascun elemento appare dentro x */
		occorrenze = arrayOccorrenze(x);
		
		/* calcola il massimo numero di occorrenze dello stesso valore */
		massimo = massimo(occorrenze);
		
		/* inizializza indiceMassimo ad un valore non indicativo */
		indiceMassimo = -1;
		
		/* trova l'indice del valore che appare piu' di frequente */
		i=0;
		while(i<occorrenze.length && indiceMassimo <0)
			if(occorrenze[i]==massimo)
				indiceMassimo = i;
			else
				i++;
		return indiceMassimo;
	}

	/* metodo principale */
	public static void main(String[] args){
		int[] sequenza;			// sequenza da leggere
		int lunghezza;			// lunghezza della sequenza
		int indiceM;			// indice elemento piu' frequente
		
		/* leggi la lunghezza della sequenza */
		System.out.println("Quanti numeri hai intenzione di scrivere?");
		lunghezza = Lettore.in.leggiInt();
		sequenza = new int[lunghezza];
		
		/* leggi la sequenza */
		for(int i=0; i<lunghezza; i++) {
			System.out.println("Introduci un numero");
			sequenza[i] = Lettore.in.leggiInt(); 
		}

		/* quale e' l'elemento piu' presente? */
		indiceM = valoreFrequente(sequenza);

		/* stampa i risultati */
		System.out.print("Il valore che appare piu' di frequente e' " );
		System.out.println(sequenza[indiceM] + " che appare " + 
		numeroOccorrenze(sequenza, sequenza[indiceM]) + " volte.");
		System.out.print("Le posizioni in cui compare " +  sequenza[indiceM] +
				" sono ");
		for(int i=0;i<sequenza.length; i++){
			if(sequenza[i]==sequenza[indiceM]) {
				System.out.print(i + " ");
			}
		}

	}
}