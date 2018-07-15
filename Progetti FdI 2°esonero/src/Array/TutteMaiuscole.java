package Array;

public class TutteMaiuscole {
	
	/* metodo main */
    public static void main(String[] args){
        testTutteMaiuscole();
    }
    
    /* metodo di test */
    public static void testTutteMaiuscole() {
    	String[] a;
        a = new String[]{};
        System.out.println(almenoUnaTuttaMaiuscola(a) + " = FALSE");
        System.out.println();
        a = new String[]{"2100"};
        System.out.println(almenoUnaTuttaMaiuscola(a) + " = FALSE");
        System.out.println();
        a = new String[]{"PIPPO"};
        System.out.println(almenoUnaTuttaMaiuscola(a) + " = TRUE");
        System.out.println();
        a = new String[]{"Abcde00","ACCaEEbcde","ABC","pippO"};
        System.out.println(almenoUnaTuttaMaiuscola(a) + " = TRUE");
        System.out.println();
        a = new String[]{"2001", "odissea", "nello", "spazio"};
        System.out.println(almenoUnaTuttaMaiuscola(a) + " = FALSE");
        System.out.println();
    }
    
    /* metodo per la verifica esistenziale di una stringa con lettere tutte
     * maiuscole dentro l'array */
    public static boolean almenoUnaTuttaMaiuscola(String[] a){
    	int i = 0;
    	boolean maiuscola = false;
    	while(i<a.length && !maiuscola) {
    		if(tutteMaiuscole(a[i]))
    			maiuscola = true;
    		i++;
    	}
    	
    	return maiuscola;
    }
    
    /* metodo per la verifica universale di lettere tutte maiuscole in una stringa */
    public static boolean tutteMaiuscole(String s) {
    	int i;
    	boolean tutteMaiuscole;
    	char c;
    	tutteMaiuscole = true;
    	i = 0;
    	while (i<s.length() && tutteMaiuscole){
    	    c=s.charAt(i);
    	    if (!(c>='A'&& c<='Z'))
    	        tutteMaiuscole = false;
    	    i++;
    	}
    	
    	return tutteMaiuscole;
    }
}
