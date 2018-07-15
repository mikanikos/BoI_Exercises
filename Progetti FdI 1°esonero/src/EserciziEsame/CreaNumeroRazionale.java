package EserciziEsame;

import fiji.io.Lettore;

public class CreaNumeroRazionale {
	
	public static void main(String[] args) {
		
		NumeroRazionale n;
		int num, den;
		
		System.out.println("Inserisci il numeratore del numero razionale");
		num = Lettore.in.leggiInt();
		
		System.out.println("Inserisci il denominatore del numero razionale");
		den = Lettore.in.leggiInt();
		
		n = new NumeroRazionale(num,den);
		
		n.riduciMinimiTermini();
		
		System.out.println(n.toString());
		
	}

}
