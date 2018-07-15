package SecondaEsercitazione;
/* considerazioni sul massimo intero rappresentabile:
diversi modi per generare il massimo intero rappresentabile*/
class MaxInt{

	public static void main(String[] args){
		int n,n1,n2; //numeri interi

		/*calcolo del massimo intero positivo rappresentabile con il tipo int */
		n = (int)((Math.pow(2,31))-1) ;
		System.out.print(" (int)((Math.pow(2,31))-1) = ");
		System.out.println(n);	
	
		/***** PERCHE' IL MAXINT  CALCOLATO NON E' ESATTO? ******/
		n = (int)(Math.pow(2,31))-1;
		System.out.print(" (int)(Math.pow(2,31))-1  = ");
		System.out.println(n);
		System.out.println(" PERCHE' IL MAXINT  CALCOLATO NON E' ESATTO? ");
		System.out.println();
		/* cosa succede se si prova a trasformare in intero Math.pow(2,33)? */
		/* VERIFICARE */
				
		/* calcolo esplicito */
		System.out.println(" elevamento a potenza: calcolo esplicito ");
		n = 2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2*2-1;
		System.out.println("massimo intero rappresentabile");
		System.out.println(n);

		/* cosa succesde se si somma 1 al massimo intero? */
		n1 = n + 1;
		System.out.println("intero successivo");
		System.out.println(n1);

		n2 = n1 + 1;
		System.out.println("intero successivo");
		System.out.println(n2);


	}//end main

}//end class

/*SUGGERIMENTO: provate a vedere cosa viene stampato da
 System.out.println("2^32  "+(int)(Math.pow(2,32)));
 System.out.println("2^33  "+(int)(Math.pow(2,33)));
 ...
 */