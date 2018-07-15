package Ricorsione;

import Ordinamenti.BubbleSort;

public class EserciziRicorsione {
	
	public static void main(String[] args) {
		/* test per Inverti */
    	testInverti();
    	/* test per contaCifre */
    	testContaCifre();
    	/* test per convertToInt */
    	testConvertToInt();
    	/* test per convertToArray */
    	testConvertToArray();
    	
    	/* test per arrayIntersezione1 */
    	int[] a = new int[] {3,67,756,11,0};
		int[] b = new int[] {3,4,11,2,0,7};
		//int[] c = arrayIntersezione1(a,b);
		int[] c = arrayIntersezione2(a,b);
		for(int i=0; i<c.length; i++)
			System.out.print(c[i]+ " ");
		System.out.println();
		
		/* test per sommaArrayRic */
		double[] s = new double[] {3,6,2,4};
		System.out.println(sommaArrayRic(s));
    }
	
	/* metodo ricorsivo che restituisce true se s è composta
	 *  da tutti caratteri cifra, false altrimenti */
    public static boolean verifica(String s) {
		boolean verifica;
		
		if(s.length()==0)
			verifica = true;
		else {
			if(!(s.charAt(0)>='0' && s.charAt(0)<='9'))
				verifica = false;
			else
				verifica = verifica(s.substring(1));
		}
		return verifica;
	}
    
    /* metodo che ha come parametro un intero n e che 
     * calcola e restituisce il numero di cifre di n */
    public static int contaCifre(int n) {
    	int contatore=0;
    	
    	if(n>=-9 && n<=9)
    		contatore++;
    	else 
    		contatore = 1 + contaCifre(n/10);
    	
    	return contatore;
    }
    
    /* test per contaCifre */
    public static void testContaCifre() {
    	/* n = 0 */
    	System.out.println("contaCifre(\"0\"): 1 = " +contaCifre(0));
    	/* n = -6 */
    	System.out.println("contaCifre(\"-6\"): 1 = " +contaCifre(-6));
    	/* n = 22 */
    	System.out.println("contaCifre(\"22\"): 2 = " +contaCifre(22));
    	/* n = 894 */
    	System.out.println("contaCifre(\"894\"): 3 = " +contaCifre(894));
    	/* n = 843089283 */
    	System.out.println("contaCifre(\"843089283\"): 9 = " +contaCifre(843089283));
    	/* n = -325829 */
    	System.out.println("contaCifre(\"-325829\"): 6 = " +contaCifre(-325829));
    }
    
    /* metodo ricorsivo che verifica se una stringa contiene almeno un carattere alfabetico minuscolo */
    public static boolean verifica2(String s) {
    	boolean verifica;
    	
    	if(s.length()==0)
    		verifica = false;
    	else {
    		if(s.charAt(0)>='a' && s.charAt(0)<='z')
    			verifica = true;
    		else
    			verifica = verifica2(s.substring(1));
    	}
    	return verifica;
    }
    
    /* metodo ricorsivo che inverte una stringa */
    public static String inverti(String s) {
    	String inverso;
    	if(s.length()<2)
    		inverso = s;
    	else 
    		inverso = s.charAt(s.length()-1) + inverti(s.substring(0,s.length()-1));
    	return inverso;
    }
    
    /* metodo di test per inverti */
    public static void testInverti() {
    	System.out.println("inverti(\"\"): = " +inverti(""));
    	System.out.println("inverti(\"a\"): = " +inverti("a"));
    	System.out.println("inverti(\"ADa12!\"): !21aDA = " +inverti("ADa12!"));
    	System.out.println("inverti(\"   \"):    = " +inverti("   "));
    	System.out.println("inverti(\"aaa\"): aaa =  " +inverti("aaa"));
    }
    
    /* dato un array non nullo e non vuoto di interi, metodo ricorsivo
     * che restituisce un intero composto dalle cifre dell’array */
    public static int convertToInt(int[] s) {
    	int n;
    	String a = "";
    	int[] t;
    	
    	if(s.length == 1)
    		a = s[0] + a;
    	else {
    		t = new int[s.length-1];
    		for(int i=0; i<t.length; i++)
    			t[i] = s[i];
    		a = a + convertToInt(t) + s[s.length-1];
    	}
    	
    	n = Integer.parseInt(a);
    	return n;
    }
    
    /* test per convertToInt */
    public static void testConvertToInt() {
    	int[] a;
    	a = new int[] {1,2,3};
    	System.out.println("123 = " +convertToInt(a));
    	a = new int[] {1};
    	System.out.println("1 = " +convertToInt(a));
    	a = new int[] {74,879,0};
    	System.out.println("748790 = " +convertToInt(a));
    	a = new int[] {3,3,3};
    	System.out.println("333 = " +convertToInt(a));
    }
    
    /* dato un intero n scrivere un metodo ricorsivo che restituisce un array di
     * interi in cui ogni componente dell’array corrisonde a una cifra del numero */
    public static int[] convertToArray(int n) {
    	int[] a = new int[contaCifre(n)];
    	a = creaArray(a,n,a.length-1);
    	return a;
    }
    
    /* metodo di supporto a convertToArray */
    public static int[] creaArray(int[] a, int n, int i) {
    	
    	String s = "" + n;
    	
    	if(n>=-9 && n<=9)
    		a[i] = (Integer.parseInt(""+s.charAt(0)));
    	else {
    		a[i] = (Integer.parseInt(""+s.charAt(s.length()-1)));
    	    creaArray(a,n/10,i-1);
    	}
    	return a;
    }
    
    /* test per convertToArray */
    public static void testConvertToArray() {
    	/* n = 0 */
    	System.out.print("0 = "); 
    	stampa(convertToArray(0));
    	/* n = 123 */
    	System.out.print("1 2 3 = "); 
    	stampa(convertToArray(123));
    	/* n = 743830 */
    	System.out.print("7 4 3 8 3 0 = "); 
    	stampa(convertToArray(743830));
    }
    
    /* stampa array */
    public static void stampa(int[] a) {
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
    }
    
    /* metodo che ricorsivo che calcola la somma degli elementi di un array */
	public static double sommaArrayRic(double[] a) {
		double somma;
		
		if(a.length==1)
			somma = a[0];
		else
			somma = a[0] + sommaArrayRic(sottoSeq(a));
			
		return somma;
	}
	
	/* metodo di supporto a sommaArrayRic che calcola una sottosequenza dell'array dato
	 * con gli stessi elementi meno il primo */
	public static double[] sottoSeq(double[] a) {
		double[] b = new double[a.length-1];
		for(int i=0; i<b.length; i++)
			b[i] = a[i+1];
		return b;
	}
	
	/* metodo che calcola l'array intersezione tra due array dati */
    public static int[] arrayIntersezione1(int[] a, int[] b) {
		
		int[] c;
		BubbleSort.bubbleSort(a);
		BubbleSort.bubbleSort(b);
		
		int i,j, comuni;
		i=0;
		j=0;
		comuni=0;
		
		while(i < a.length && j < b.length) {
			if(a[i] == b[j]) {
				comuni++;
				i++;
				j++;
			}
			else {
				if(a[i] < b[j])
					i++;
				else
					j++;
			}
		}
		c = new int[comuni];
		int k = 0;
		i=0;
		j=0;
		while(i < a.length && j < b.length) {
			if(a[i] == b[j]) {
				c[k] = a[i];
				i++;
				j++;
				k++;
			}
			else {
				if(a[i] < b[j])
					i++;
				else
					j++;
			}
		}
		return c;	
	}
    
    /* metodo ricorsivo che calcola l'array intersezione tra due array dati */
    public static int[] arrayIntersezione2(int[] a, int[] b) {
    	int[] c = new int[0];
    	return intersezioneAux(a,b,c);
    }
    
    public static int[] intersezioneAux(int[] a, int[] b, int[] c) {
    	int[] d = new int[0];
    	boolean trovato = false;
    	if(b.length !=0) {
    		for(int i=0; i<a.length && !trovato; i++) {
        		if(a[i] == b[0]) {
        			d = new int[c.length+1];
        			for(int j=0; j<c.length; j++)
        				d[j]=c[j];
        			d[d.length-1]=a[i];
        			trovato = true;
        		}
        		else {
        			d = new int[c.length];
        			d = c;
        		}
    		}	
    	    c = intersezioneAux(a,sottoSeq2(b),d);
    	}
        return c;
    }
    
    /* metodo di supporto a sommaArrayRic che calcola una sottosequenza dell'array dato
	 * con gli stessi elementi meno il primo */
	public static int[] sottoSeq2(int[] a) {
		int[] b = new int[a.length-1];
		for(int i=0; i<b.length; i++)
			b[i] = a[i+1];
		return b;
	}
}
