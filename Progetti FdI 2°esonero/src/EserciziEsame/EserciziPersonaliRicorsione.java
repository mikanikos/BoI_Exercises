package EserciziEsame;

public class EserciziPersonaliRicorsione {
	
	public static void main(String[] args) {
		/* test per massimoRic */
		int[] a = new int[]{13,1,1,43,23,31};
		System.out.println(massimoRic(a,a.length-1));
		/* test per diffMinRic */
		System.out.println(minDiffRic(a,a.length-1));
		/* test per verificaCifre */
		System.out.println(verificaCifre(a,0,1));
		/* test per verificaSimmetrica */
		int[][] b = new int[][]{{1,2,3},{2,1,2},{3,2,1}};
		System.out.println(verificaSimmetrica(b,0,0));
		/* test per senzaVocali */
		System.out.println(senzaVocali("ciao"));
		/* test per contaVocali */
		System.out.println(contaVocali("ciao"));
		/* test per contaZeri */
		System.out.println(contaZeri(a));
		/* test per invertiArray */
		a = invertiArray(a);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		/* test per verificaNeg */
		System.out.println(verificaNeg(a));
		/* test per verificaNeg */
		System.out.println(verificaDisp(a));
	}
	
	/* calcolo dell'elemento massimo di un array */
	public static int massimoRic(int[] a, int n) {
		int max=0;
		if(n>0) {
			if(a[n]>massimoRic(a,n-1))
				max = a[n];
			else
				max = massimoRic(a,n-1);
		}
		return max;		
	}
	
	/* calcolo della minima differenza tra due elementi adiacenti */
	public static int minDiffRic(int[] a, int n) {
		int min=0;
		if(n>0) {
			if((a[n]-a[n-1]) < minDiffRic(a,n-1))
				min = a[n]-a[n-1];
			else
				min = minDiffRic(a,n-1);
		}
		return min;
	}
	
	/* true se le cifre in posizione pari sono uguali alle
	 * cifre in posizione dispari */
	public static boolean verificaCifre(int[] a, int i, int j) {
		boolean verifica;
		if(i == a.length-2 && j == a.length-1)
			verifica = (a[i] == a[j]);
		else
			verifica = (a[i] == a[j]) && verificaCifre(a,i+2,j+2);
	
		return verifica;
	}
	
	/* verifica se la matrice è simmetrica */
	public static boolean verificaSimmetrica(int[][] a, int i, int j) {
		boolean verifica;
		if(a.length < 2)
			verifica = true;
		else {
			if(i == a.length-1 || j == a.length-1)
				verifica = (a[i][j] == a[j][i]);
			else
				verifica = (a[i][j] == a[j][i]) && verificaSimmetrica(a,i+1,j) && verificaSimmetrica(a,i,j+1) ;
		}
		
		return verifica;
	}
	
	/* restituisce la stringa senza vocali */
	public static String senzaVocali(String s) {
		String t = "";
		if(s.equals(""))
			t = "";
		else {
			if(!(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' ||
					s.charAt(0)=='o' || s.charAt(0)=='u'))
				t = s.charAt(0) + senzaVocali(s.substring(1));
			else
				t = senzaVocali(s.substring(1));
		}
		
		return t;
	}
	
	/* conta le vocali di una stringa */
	public static int contaVocali(String s) {
		int cont;
		if(s.length() == 0)
			cont = 0;
		else {
			if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' ||
					s.charAt(0)=='o' || s.charAt(0)=='u')
				cont = 1 + contaVocali(s.substring(1));
			else
				cont = contaVocali(s.substring(1));
		}
		
		return cont;
	}
	
	/* conta il numero di 0 in un array di interi */
	public static int contaZeri(int[] v) {
		return contatore(v,0,v.length);
	}
	/* metodo di supporto a contaZeri */
	public static int contatore(int[] v, int i, int n) {
		int cont;
		if(i > n-1)
			cont = 0;
		else {
			if(v[i] == 0)
				cont = 1 + contatore(v,i+1,n);
			else
				cont = contatore(v,i+1,n);
		}
		
		return cont;
			
	}
	
	/* inverte gli elementi dell'array di interi dato */
	public static int[] invertiArray(int[] v) {
		int[] supp = new int[v.length];
		supp = inverti(v,supp,0);
		return supp;
	}
	/* metodo di supporto a invertiArray */
	public static int[] inverti(int[] v, int[] supp, int i) {
		if(i<v.length) {
			supp[i] = v[v.length-i-1];
			supp = inverti(v,supp,i+1);
		}
		
		return supp;
	}
	
	/* metodo che verifica se un array è composto da almeno un numero negativo */
	public static boolean verificaNeg(int[] v) {
		return verificaN(v,0,v.length);
	}
	/* metodo di supporto a verificaNeg */
	public static boolean verificaN(int[] v, int i, int n) {
		boolean verifica;
		if(i>n-1)
			verifica = false;
		else
			verifica = (v[i] < 0) || verificaN(v,i+1,n);
		
		return verifica; 
	}
	
	/* metodo che verifica se un array ha tutti elementi dispari */
	public static boolean verificaDisp(int[] v) {
		return verificaD(v,0,v.length);
	}
	/* metodo di supporto per verificaDisp */
	public static boolean verificaD(int[] v, int i, int n) {
		boolean disp;
		if(i>n-1)
			disp = true;
		else
			disp = (v[i] % 2 == 1) && verificaD(v,i+1,n);
		
		return disp;
			
	}
}
