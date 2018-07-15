package SecondaEsercitazione;
/*Calcolo di alcune espressioni */
class Espressioni{

	public static void main(String[] args){

	int f,intero; //risultato intero
	double r; //risultato razionale
	double a, b, c; //altri razionali
	boolean bl;

    /*espressioni sugli int  */
	f = 6 + 2 + 1;
	System.out.print("6 + 2 + 1 = ");
	System.out.println(f);

	f = 2 * 3 + 4;
	System.out.print("2 * 3 + 4 = ");
	System.out.println(f);

	f = 4 + 2 * 3;
	System.out.print("4 + 2 * 3 = ");
	System.out.println(f);

	f = 6 -2 -1;
	System.out.print("6 -2 -1 = ");
	System.out.println(f);

    /*espressione con int e double  */
	f = 1/2 + 1/2;
	System.out.print("1/2 + 1/2 = ");
	System.out.println(f);

	r = 1/2 + 1/2;
	System.out.print("1/2 + 1/2 = ");
	System.out.println(r);

	r = 1.0/2 + 1/2.0;
	System.out.print("1.0/2 + 1/2.0 = ");
	System.out.println(r);

	r = 1.0/2 + 1/2;
	System.out.print("1.0/2 + 1/2 = ");
	System.out.println(r);

	intero = 10/3;
	System.out.print("intero = ");
	System.out.println(intero);

    /*espressione intera con divisione per zero */
	a = 2; b = 0; c = a/b;
	System.out.print("a = 2; b = 0; c = a/b; c = ");
	System.out.println(c); // stampa Infinity

	/*espressione sui booleani
	bl = !true && false;
	System.out.print("!true && false = ");
	System.out.println(bl);*/

	bl = !(true && false);
	System.out.print("!(true && false) = ");
	System.out.println(bl);

	bl = (true && false) || ! (true&& false);
	System.out.print("(true && false) || ! (true && false) = ");
	System.out.println(bl);

	bl = (f>=0) && (f<=10);
	System.out.print("(f>=0) && (f<=10) = ");
	System.out.println(bl);

	/* ESERCIZIO verificare con stampe di controllo, i valori delle seguenti espressioni
	10 > 5
	10.0 < 5.0
	10 > 10
	10 >= 10
	10.0 >= 5.0
	10 == 5
	10 == 10
	10 != 5
	10 != 10
	*/

	}//end main

}//end class