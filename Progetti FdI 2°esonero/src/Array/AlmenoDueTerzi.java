package Array;
import fiji.io.Lettore;

/* applicazione per aiutare un prof che vuole promuovere
 * gli studenti che hanno preso almeno due terzi del voto medio
 * dei 215 studenti */
public class AlmenoDueTerzi {
	/* metodo principale */
	public static void main(String[] args) {
		String[] studenti;		// nomi degli studenti
		double[] voti;			// voti degli studenti
		double somma;			// somma dei voti 
		double media;			// media dei voti
		
		/* crea gli array */
		studenti = new String[215];
		voti = new double[215];
		
		/* INPUT */
		for(int i=0; i<215; i++){
			System.out.println("Prof, introduci nome e "
					+ "voto di uno studente");
			studenti[i] = Lettore.in.leggiString();
			voti[i] = Lettore.in.leggiDouble();
		}
			
		/* calcola la somma e poi la media */
		somma = 0;
		for(int i=0; i<215; i++)
			somma += voti[i];
		media = somma/215;
		System.out.println("La media e' stata " + media);
		
		/* stampa i voti degli studenti che hanno
		 * preso almeno 2/3 della media */
		for(int i=0; i<215; i++)
			if(voti[i]>media*2/3)
				System.out.println("Lo studente " + studenti[i] + 
					" ha superato l'esame prendendo " + voti[i]);
	}
}