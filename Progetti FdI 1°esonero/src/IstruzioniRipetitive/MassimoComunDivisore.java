package IstruzioniRipetitive;
import fiji.io.Lettore;

public class MassimoComunDivisore {
	public static void main(String[] args) {
		
		int x;
		int y;
		int w;
		int z;
		int t;
		
		System.out.println("Inserisci due numeri per calcolarne il massimo comune divisore");
		
		x=Lettore.in.leggiInt();
		y=Lettore.in.leggiInt();
		
		if (x<=y) {
			w = x;
			z = y; 
		}
		else {
			w = y;
			z = x; 
		}
		
		while (z%w!=0) {
			t =w;
			w = z%w;
			z =t;
		}
		
		System.out.println("MCD = " +w);
	
	}

}
