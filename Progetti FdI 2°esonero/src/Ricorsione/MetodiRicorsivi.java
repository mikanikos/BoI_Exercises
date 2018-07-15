package Ricorsione;

public class MetodiRicorsivi {
	/* fattoriale */
	public static int fattoriale(int n) {
		int f;
		if(n == 0) f = 1;
		else 
			f = n * fattoriale(n -1);
		return f;
	}
	
	/* somma */
	public static int somma(int x, int y) {
		// pre : x >= 0, y >= 0
		int s;
		if (y == 0) s = x;// se y = 0
		else s = 1 + somma(x, y-1); // se y > 0
		return s;
	}
	
	/* prodotto */
	public static int prodotto(int x, int y) {
		// pre : x >= 0, y >= 0
		int p;
		if (y == 0) p = 0;// se y = 0
		else p = somma(x, prodotto(x, y-1)); // se y > 0
		return p;
	}
	
	/* potenza */
	public static int potenza(int b, int e) {
		// pre : x >= 0, y >= 0
		int p;
		if (e == 0) p = 1;// se e = 0
		else p = prodotto(b, potenza(b, e-1)); // se e > 0
		return p;
	}
	
	/* occorrenza in stringa */
	public static int contaLettera(String s, char c) {
		int cont;
		if (s.length() == 0) cont = 0;
		else if (s.charAt(0) == c)
		cont = 1 + contaLettera(s.substring(1), c);
		else
		cont = contaLettera(s.substring(1), c);
		return cont;
	}
	
	/* occorrenza in stringa(alternativo) */
	public static int contaLettera2(String s, char c) {
		int cont, val;
		if (s.length() == 0) cont = 0;
		else {
		val = contaLettera2(s.substring(1), c);
		if (s.charAt(0) == c)
		cont = 1 + val ;
		else
		cont = val; }
		return cont;
	}
	
	/* palindroma */
	public static boolean palindroma(String s) {
		boolean ret;
		if (s.length() <= 1)
		ret = true;
		else
		ret = (s.charAt(0)==s.charAt(s.length()-1))
		&& palindroma(s.substring(1,s.length()-1));
		return ret;
	}
	
	/* numero cifre */
	public static int ncifre(int n){
		int cont;
		if (n/10==0) cont=1;
		else cont = 1 + ncifre(n/10);
		return cont;
	}
	
	/* tutte maiuscole in una stringa */
	public static boolean tutteMaiuscole(String s){
		boolean tuttemaiuscole;
		if(s.length()==0) // caso base
		tuttemaiuscole=true;
		else // caso induttivo
		tuttemaiuscole= (s.charAt(0)>='A' && s.charAt(0)<='Z') && tutteMaiuscole(s.substring(1));
		return tuttemaiuscole;
	}
	
	/* mcd */
	public static int mcd(int a, int b) {
		int mcd;
		if(a == b)
			mcd = b;
		else {
			if(a>b)
				mcd = mcd(a-b,b);
			else
				mcd = mcd(b-a, a);
		}
		return mcd;
	}
	
	/* mcd 2 */
	public static int mcd2(int x, int y) {
		int res;
		if (x == 0) res = y;
		else res = mcd2(y, x % y);
		return res;
	}
	
	/* resto */
	public static int resto(int x, int y) {
		int res = 0;
		if (x < 0)res = resto(x+y, y);
		else
		if (x > y) res = resto(x-y, y);
		else
		if ((x >= 0) && (x < y)) res = x;
		return res;
	}
	
	/* numeri tra loro primi */
	public static boolean primi(int x, int y){
		boolean res = false;
		if ((x == 1) || (y == 1)){
		res = true;
		} else if ((x != 1)&&(y != 1)&&(x == y)){
		res = false;
		} else if ((x != 1)&&(y != 1)&&(x < y)) {
		res = primi(x, y-x);
		} else if ((x != 1)&&(y != 1)&&(x > y)) {
		res = primi(x-y, y);
		}
		return res;
	}
	
	/* array simmetrico */
	public static boolean simmetrica(int[] v) {
		return simmetrica(v, 0, v.length-1);
	}
	public static boolean simmetrica(int[] v, int inf, int sup) {
		boolean sim;
		if (inf > sup) sim = true; // fine scansione
		else
		sim = (v[inf] == v[sup]) && simmetrica(v, inf+1, sup-1);
		return sim;
	}
}
