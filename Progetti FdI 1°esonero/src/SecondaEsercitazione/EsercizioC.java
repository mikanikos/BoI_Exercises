package SecondaEsercitazione;
import fiji.io.Lettore;

public class EsercizioC {
	public static void main(String[] args) {
		
		/* Scrivere un'applicazione che chiede all'utente di inserire tre numeri reali
		 * a, b, e c che rappresentano i coefficienti di un polinomio di secondo grado.*/
		
		double a,b,c;  // variabili coefficienti
		double d;      // variabile discriminante
		double x1,x2;  // variabili radici
		double i;      // variabile parte immaginaria radice
		double y;      // variabile parte reale radice
		
		/* Fintanto che il primo numero immesso a e' pari a 0, l'applicazione stampa un messaggio
		 * per l'utente "L'equazione non e' di secondo grado" e prova nuovamente a leggere i tre numeri.*/
		do {
			System.out.println("Utente, inserisci tre numeri reali a, b e c per calcolare le soluzioni reali o complesse dell'equazione di secondo grado ax^2 + bx + c = 0");
		
		    a=Lettore.in.leggiDouble();  // lettura coefficienti
		    b=Lettore.in.leggiDouble();  // lettura coefficienti
		    c=Lettore.in.leggiDouble();  // lettura coefficienti
		    d=(b*b)-(4*a*c);             // calcolo discriminante
	
			if (a==0) {
				System.out.println("Utente, l'equazione non e' di secondo grado");
			}
		}	
		while (a==0);
		
		if (d>0) {  // discriminante maggiore di 0: due soluzioni reali
			x1=((0-b)-Math.sqrt(d))/(2*a); 
			x2=((0-b)+Math.sqrt(d))/(2*a);
			System.out.println("Utente, le soluzioni dell'equazione sono x1 = " +x1+ " e x2 = " +x2);
		}
		
		if (d==0) {  // discriminante uguale a 0: due soluzioni reali e coincidenti
			 x1=x2=(0-b)/(2*a);
			 System.out.println("Utente, le soluzioni dell'equazione sono x1 = x2 = " +x1);		
		}
		
		if (d<0) {  // discriminante minore di 0: due soluzioni complesse
		    y=(0-b)/(2*a);
		    i=Math.sqrt(-d)/(2*a);
		    System.out.println("Utente, le soluzioni dell'equazione sono x1 = " +y+ " + " +i+ "*i e x2 = " +y+ " - " +i+ "*i");
		 
		}
	
	}
	
}