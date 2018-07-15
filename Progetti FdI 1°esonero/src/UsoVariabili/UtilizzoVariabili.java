package UsoVariabili;

import fiji.io.Lettore;

/* programma per testare l'utilizzo di variabili */
public class UtilizzoVariabili {

	/* metodo principale */
	public static void main(String[] args) {

		/* DICHIARAZIONI */
		int numero;						
		double reale1, reale2;
		
		Lettore.in.leggiInt();
		
		/* DICHIARAZIONE PIU' VARIABILI CON LO STESSO NOME
		 * Cancella il doppio slash per vedere che cosa 
		 * succede nel caso in cui vengano dichiarate due 
		 * variabili con lo stesso nome */
		int x, y;
		//int x;		
		
		

		/* CANCELLA I DOPPI SLASH PER VERIFICARE IL RISULTATO DELLE OPERAZIONI */

		

		/* LETTURA VARIABILE NON INIZIALIZZATA */
		//System.out.println("La variabile x vale " +x);


		
		/* SCRITTURA E LETTURA */ 
		x = -1;		// scrivi in x
		//System.out.println("La variabile x vale " +x);
			
		y = 3;		// scrivi in y
		numero = x + y;		// leggi da x e y e scrivi in numero
		//System.out.println("La variabile y vale " +y);
		//System.out.println("La variabile numero vale " +numero);
		
		//System.out.println("La variabile x vale " +x);
		x = x + 7;			// x viene letta e scritta nella stessa istruzione
		//System.out.println("La variabile x vale " +x);
		
		reale1 = 4.5;
		System.out.println("La variabile reale1 vale " +reale1);
		reale1 = 3;		// osserva: un intero dentro ad una variabile double		
		//System.out.println("La variabile reale1 vale " +reale1);
	
		
		
		/* DICHIARAZIONE CON INIZIALIZZAZIONE */
		int prodotto = x * numero;
		System.out.println("La variabile prodotto vale " +prodotto);
			
		
				
		/* L'OPERATORE + E' SOVRACCARICO */
		int intero1, intero2;
		intero1 = 3;
		intero2 = 5;
		reale1 = 3;
		reale2 = 5;
		System.out.println("Somma di interi " + (intero1+intero2));
		System.out.println("Somma di reali " + (reale1+reale2));
		//System.out.println("Concatenazione di stringhe " + ("3" + "5"));
		//System.out.println();
		
		
		
		/* INTERO FUORI DAL RANGE DEGLI INTERI CHE POSSONO ESSERE MEMORIZZATI CON INT.*/
		// x = 9999999999;

		
		
		/* DIVISIONE INTERA E REALE */
		x = 7 / 2;
		//System.out.println("La variabile x vale " +x);
		reale1 = 7. / 2.;
		//System.out.println("La variabile reale1 vale " + reale1);
		reale1 = 7. / 2.0;
		//System.out.println("La variabile reale1 vale " + reale1);
		reale1 = 7. / 2;
		//System.out.println("La variabile reale1 vale " + reale1);

		
		
		/* RESTO INTERO */
		x = 7 % 2;
		//System.out.println("La variabile x vale " +x);
		x = 7 % -2;
		//System.out.println("La variabile x vale " +x);
		x = -7 / 2;
		//System.out.println("La variabile x vale " +x);

		
		
		/* PRECEDENZA FRA OPERATORI */
		x = 2 + 3 * 4;
		//System.out.println("La variabile x vale " +x);
		x = ((2+3) * 4)/2;
		//System.out.println("La variabile x vale " +x);
		// x = (2 +3)4;
		x = 4 * 2 / 4;
		//System.out.println("La variabile x vale " +x);
		x = (4* 2)/4;
		//System.out.println("La variabile x vale " +x);
		
		
		/* INCREMENTO, DECREMENTO e ASSEGNAZIONE COMPOSTA*/
		x = 9;
		//System.out.println("La variabile x vale " +x);
		x++;
		//System.out.println("La variabile x vale " +x);
		x *= 2;
		//System.out.println("La variabile x vale " +x);
		x--;
		//System.out.println("La variabile x vale " +x);

		
		
		/* DIVISIONE PER ZERO */
		//System.out.println(2/0);			// divisione intera
		//System.out.println(2.0/0);		// divisione reale (Infinity)
		//System.out.println(0./0.0);		// divisione reale 0 su 0	(Not A Number)

		
		
		/* APPROSSIMAZIONI REALI */
		//System.out.println(99999999999999999999999999.);
		//System.out.println(1.000000000000000000000000001);
		//System.out.println(3E15 + 5E-15);
		
		
		
		/* OPERATORI BOOLEANI */
		//System.out.println(!true);		
		//System.out.println(true && false);		
		//System.out.println(true || false);
		
		
		
		/* OPERATORI RELAZIONALI */
		x = 3;
		//System.out.println(x == 7/2);		
		//System.out.println(x != 13/4);
		//System.out.println(x < 7/2);
		//System.out.println(x <= 4);
		//System.out.println(x > 4.3);
		//System.out.println(x >= 10/3);

		
		
		/* ESPRESSIONI BOOLEANE */
		boolean predicato;
		predicato = true;
		System.out.println("La variabile predicato vale " + predicato);
		
		boolean a, b, c;
		a = true;
		b = true;
		c = a && !b;
		b = (b && c) || (!b);
		a = !c;
		//System.out.println("Il valore di a e' " + a);
		//System.out.println("Il valore di b e' " + b);
		//System.out.println("Il valore di c e' " + c);
		
		/* verifica se un numero x e' positivo */ 
		//System.out.println("La variabile x vale " + x);
		predicato = x > 0;
		//System.out.println("La variabile predicato vale " + predicato);

		/* verifica se un numero x e' pari */ 
		//System.out.println("La variabile x vale " + x);
		predicato = ((x % 2) == 0);
		//System.out.println("La variabile predicato vale " + predicato);
	}
}