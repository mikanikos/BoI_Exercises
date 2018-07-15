package Correttezza;

/* SPECIFICA:
INPUT:due stringhe a e b
PRE: a!=null, b!=null
OUTPUT: booleano uguali
POST: uguali=true se le due stringhe sono uguali, false altrimenti
*/
class StringheUguali{

public static void main(String[] args){
	testUguali();
}

public static void testUguali(){
	String a,b;

	/* stringhe entrambi vuote */
	a="";
	b="";
	System.out.println("a = \"\"  b = \"\" valore atteso [true] " + stringheUguali(a,b));

	/* la prima e' vuota */
	a="";
	b="Aa";
	System.out.println("a = \"\"  b = \"Aa\" valore atteso [false] " + stringheUguali(a,b));

	/* la seconda e' vuota */
	a="Aa";
	b="";
	System.out.println("a = \"Aa\"  b = \"\" valore atteso [false] " + stringheUguali(a,b));

	/* stringhe di lunghezza 1 uguali*/
	a="a";
	b="a";
	System.out.println("a = \"a\"  b = \"a\" valore atteso [true] " + stringheUguali(a,b));

	/* stringhe di lunghezza 1 diverse*/
	a="a";
	b="b";
	System.out.println("a = \"a\"  b = \"b\" valore atteso [false] " + stringheUguali(a,b));

	/* stringhe di lunghezza >1 uguali*/
	a="bianco";
	b="bianco";
	System.out.println("a = \"bianco\"  b = \"bianco\" valore atteso [true] " + stringheUguali(a,b));

	/* stringhe di lunghezza diversa */
	a="aaa";
	b="b";
	System.out.println("a = \"aaa\"  b = \"b\" valore atteso [false] " + stringheUguali(a,b));

	/* stringhe uguali tranne l'ultimo carattere */
	a="abc";
	b="abk";
	System.out.println("a = \"abc\"  b = \"abk\" valore atteso [false] " + stringheUguali(a,b));

	/* stringhe uguali tranne il primo carattere */
	a="abc";
	b="kbc";
	System.out.println("a = \"abc\"  b = \"kbc\" valore atteso [false] " + stringheUguali(a,b));

	/* stringhe uguali tranne un carattere intermedio */
	a="abc";
	b="akc";
	System.out.println("a = \"abc\"  b = \"akc\" valore atteso [false] " + stringheUguali(a,b));
}

public static boolean stringheUguali(String s1, String s2){
	int i;
	boolean uguali;

	// suppongo che le stringhe siano uguali...
	uguali = true;

	if (s1.length()==s2.length()){
		i=0;
		while(i<s1.length() && uguali){
			// ... finche' non trovo due caratteri diversi nella stessa posizione
			if (s1.charAt(i) != s2.charAt(i))
				uguali=false;
			i=i+1;
		}
	}
	else //stringhe di lunghezza diversa
		uguali=false;
	return uguali;
}

}