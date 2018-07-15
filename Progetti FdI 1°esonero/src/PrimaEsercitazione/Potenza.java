package PrimaEsercitazione;

import fiji.io.*;

/* elevamento a potenza tra numeri naturali positivi (o nulli) */
class Potenza
{
    public static void main(String[] args)
    {
		/* Definizione variabili */
        int base;            // base
        int esp;       // esponente
        int pot;         // risultato
        /** Corpo programma **/
        System.out.println("elevamento a potenza:");
        System.out.print("base: ");
        base = Lettore.in.leggiInt();
        System.out.print("esponente:");
        esp = Lettore.in.leggiInt();

        if ((base == 0) && (esp == 0))
        	System.out.println("errore");
        else{
			pot = 1;
        	while (esp > 0) {
				pot = pot * base;
				esp = esp - 1;
			}
			System.out.println("risultato = " + pot);
		}
    }
}