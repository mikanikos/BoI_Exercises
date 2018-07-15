package Array;

public class AlternanzaLettereCifre {
	/* metodo principale */
	public static void main(String[] args){
        testAlternanza();
    }
    
	/* metodo di test */
    public static void testAlternanza() {
    	String[] a;
    	a = new String[]{};
    	System.out.println(unaAlternanza(a) + " = FALSE");
    	System.out.println();
    	a = new String[]{"2"};
    	System.out.println(unaAlternanza(a) + " = FALSE");
    	System.out.println();
    	a = new String[]{"a"};
    	System.out.println(unaAlternanza(a) + " = FALSE");
    	System.out.println();
    	a = new String[]{"P1"};
    	System.out.println(unaAlternanza(a) + " = TRUE");
    	System.out.println();
    	a = new String[]{"a7B8d9c0"};
    	System.out.println(unaAlternanza(a) + " = TRUE");
    	System.out.println();
    	a = new String[]{"A1B21C"};
    	System.out.println(unaAlternanza(a) + " = FALSE");
    	System.out.println();
    	a = new String[]{"4o5k6w"};
    	System.out.println(unaAlternanza(a) + " = TRUE");
    	System.out.println();
    	a = new String[]{"2","a","A1B2C","pippo"} ;
    	System.out.println(unaAlternanza(a) + " = TRUE");
    	System.out.println();
    	a = new String[]{"2","a","A1BeC","pippo"} ;
    	System.out.println(unaAlternanza(a) + " = FALSE");
    	System.out.println();
    }
    
    public static boolean unaAlternanza(String[] a){
    	int i;
    	boolean trovata; //true se ho trovato una stringa con lettere e cifre
    	/* verifica esistenziale: inizialmente la variabile
    	booleana e' falsa: non appena trovo l'elemento che soddisfa
    	la verifica, la varabile booleana diventa vera */
    	trovata=false;
    	i = 0;
    	while (i<a.length && !trovata){
    	    if(alternanza(a[i]))
    	        trovata = true;
    	    i++;
    	}
    	return trovata;
    }
    
    public static boolean alternanza(String s){
    	int i;
    	boolean verifica;
    	char c, primo;
    	/* caso particolare lunghezza 0 o 1 */
    	if (s.length() == 0 || s.length() == 1)
    	    verifica = false;
    	else { //caso generale
    	/* verifica universale: inizialmente la variabile booleana e' true */
    	    verifica = true;
    	    primo = s.charAt(0);
    	    /* se il primo carattere e' una lettera */
    	    if ((primo>='a' && primo<='z') || (primo>='A' && primo<='Z')){
    	        i=1;
    	        /* tutti gli indici pari devono essere lettere e tutti i dispari cifre */
    	        while (i<s.length() && verifica){
    	            c = s.charAt(i);
    	            if (i%2 == 0 && !( (c>='a' && c<='z') || (c>='A' && c<='Z')))
    	                verifica = false;
    	            if (i%2 == 1 && !(c>='0' && c<='9'))
    	                verifica = false;
    	            i++;
    	        }
    	    }
    	    /* il primo carattere e' una cifra */
    	    if ((primo>='0' && primo<='9')) {
	    	    i=1;
	    	    /* tutti gli indici pari devono essere cifre e tutti i dispari lettere */
	    	    while (i<s.length() && verifica){
	    	        c = s.charAt(i);
	    	        if (i%2 ==1 && !( (c>='a' && c<='z') || (c>='A' && c<='Z')))
	    	            verifica = false;
	    	        if (i%2 ==0 && !(c>='0' && c<='9'))
	    	            verifica = false;
	    	        i++;
	    	    }
	    	}
    	} //chiude il primo else
	    return verifica;
    }
}
