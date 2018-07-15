package IstruzioniCondizionali;

class BisestilePerIlGiornoDopo {
	//INPUT: un intero, data
	//pre: data > 1600
	//OUTPUT: un booleano, bis
	//post: bis e' vero se data corrisponde ad un anno bisestile, falso altrimenti
	public static boolean bisestile(int data){
			boolean bis;      //vero se l’anno e’ bisestile
			if(data%4==0){    // se è divisibile per 4
				if(data%100==0){
				    /* se è divisibile per 100              */
				    /* allora per essere bisestile          */
				    /* deve anche essere divisibile per 400 */
				    if(data%400==0)
						bis = true;
					else
						bis = false;
				}
				/* è divisibile per 4 ma non per 100 */
				else bis = true;
			}
	   	/* non e’ divisibile per 4 */
			else bis = false;
			return bis; }
	}
