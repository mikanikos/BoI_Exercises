package IstruzioniCondizionali;
import fiji.io.*;

/* classe che realizza la seguente applicazione: vengono letti i coefficienti 
 * di un'equazione di secondo grado e vengono calcolate la radici reali*/

public class RadiciReali {
	
	/* metodo principale */
	public static void main(String[] args) {

		int a, b, c; 		// variabili per i coefficienti
		int d;				// variabile per il discriminante
		double x1, x2;		// variabili per le radici
		
		/* leggi i coefficienti */
		System.out.println("Caro utente, per favore introduci a, b e c, con a diverso da zero");
		a=Lettore.in.leggiInt();
		b=Lettore.in.leggiInt();
		c=Lettore.in.leggiInt();
		
		d = b*b - 4*a*c; 		// calcola il discriminante
		
		if(a==0) { // l'equazione non e' di secondo grado
			System.out.println("Mi dispiace, io risolvo solo equazioni di secondo grado, e questa non sembra esserlo!!");
		}
		      else {
			        if(d<0) { // discriminante minore di 0 
				    System.out.println("Non esistono soluzioni reali");
			  }
			  else {
				    if(d==0) { // discriminante uguale a 0 
					x1=(0-b)/(2*a); 
					System.out.println("Esistono due soluzioni reali coincidenti: x1 = x2 = " + x1);
			  }
			  else { 
					if(d>0) { // discriminante maggiore di 0
					x1=((0-b)-Math.sqrt(d))/(2*a); 
					x2=((0-b)+Math.sqrt(d))/(2*a); 
					System.out.println("Esistono due soluzioni reali distinte: x1 = " + x1 + " e x2 = " + x2);
				      }
			     }
		    }
	    }
    }
}