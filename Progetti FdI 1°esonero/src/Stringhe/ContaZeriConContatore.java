package Stringhe;

import fiji.io.*;
//esercizi istruzioni ripetitive pag.31
class ContaZeriConContatore{

	public static void main(String[] args){
	    int numero;    // elemento corrente della sequenza
	    Contatore zeri;    // numero di zeri nella sequenza
	    /* leggi una sequenza di numeri interi e
	     * calcolane il numero di zeri */
	    /* creazione dell'oggetto contatore che viene inizializzato a zero */
	    zeri = new Contatore();
	    /* finché ci sono altri elementi nella sequenza,
	     * leggili e calcola il numero di zeri */
	    while (!Lettore.in.eoln()) {
	        /* leggi un elemento della sequenza */
	        numero = Lettore.in.leggiInt();
	        if (numero==0)
	        	zeri.incrCont();
	    }
	    /* visualizza zeri */
	    System.out.println(zeri);
	}
}