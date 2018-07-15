package SecondaEsercitazione;
import fiji.io.Lettore;

public class EsercizioA {
	public static void main(String[] args) {
		
		double a,b,c;
		double d;
		double x1,x2;
	
		System.out.println("Utente, inserisci tre numeri reali a, b, e c, con a diverso da 0, per calcolare le soluzioni reali dell'equazione di secondo grado ax^2 + bx + c = 0");
		
		a=Lettore.in.leggiDouble();
		b=Lettore.in.leggiDouble();
		c=Lettore.in.leggiDouble();
		
		d=(b*b)-(4*a*c);
		
		if (d>0) {
			x1=((-b+Math.sqrt(d))/(2*a));
			x2=((-b-Math.sqrt(d))/(2*a));
			System.out.println("Utente, le soluzioni dell'equazione sono x1 = " +x1+ "e x2 = " +x2);
		}
		
		if (d==0) {
			x1=x2=-b/(2*a);
			System.out.println("Utente, le soluzioni dell'equazione sono x1 = x2 = " +x1);		
		}
		
		if (d<0) {
			System.out.println("Utente, l'equazione non ha soluzioni reali, il determinante vale " +d);	
		}
		
	}
	
}