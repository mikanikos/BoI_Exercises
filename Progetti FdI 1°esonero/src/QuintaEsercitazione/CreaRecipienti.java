package QuintaEsercitazione;
import fiji.io.Lettore;

/* crea due oggetti di tipo Recipiente leggendone lo stato da tastiera
 * e stampa una descrizione testuale del recipiente(invocando il metodo
 * toString() della classe Recipiente) con capacit� maggiore. */
public class CreaRecipienti {

	/* metodo principale */
	public static void main(String[] args) {
		double c1,c2;       // capacit�
		int a1,a2;       // altezza
		String m1,m2;       // materiale

		/* leggi lo stato del primo recipiente */
		System.out.println("Qual e' il materiale del primo recipiente?");
		m1 = Lettore.in.leggiLinea();
		System.out.println("Qual e' la capacit� del primo recipiente(in litri)?");
		c1 = Lettore.in.leggiDouble();
		System.out.println("Qual e' l'altezza del primo recipiente(in centimetri)?");
		a1 = Lettore.in.leggiInt();
		
		/* crea il primo recipiente */
		Recipiente recipiente1 = new Recipiente(m1,a1,c1);
		
		/* leggi la fine linea precedente */
		Lettore.in.leggiLinea();

		/* leggi lo stato del secondo recipiente */
		System.out.println("Qual e' il materiale del secondo recipiente?");
		m2 = Lettore.in.leggiLinea();
		System.out.println("Qual e' la capacit� del secondo recipiente(in litri)?");
		c2 = Lettore.in.leggiDouble();
		System.out.println("Qual e' l'altezza del secondo recipiente(in centimetri)?");
		a2 = Lettore.in.leggiInt();
		
		
		/* crea il secondo recipiente */
		Recipiente recipiente2 = new Recipiente(m2,a2,c2);		
		
		/* leggi la fine linea precedente */
		Lettore.in.leggiLinea();
		
		/* stampa una descrizione testuale del recipiente con capacit� maggiore */
		if(recipiente1.getCapacita()>recipiente2.getCapacita()) {
			System.out.println("Il recipiente con la capacit� maggiore � il primo.");
			System.out.println(recipiente1.toString());
		}
		else {
			System.out.println("Il recipiente con la capacit� maggiore � il secondo.");
			System.out.println(recipiente2.toString());
		}
		/* se i due recipienti hanno la stessa capacit� viene stampatata
		 * una descrizione testuale del primo recipiente */
		if (recipiente1.getCapacita()==recipiente2.getCapacita()) {
			System.out.println("I due recipienti hanno la stessa capacit�");
			System.out.println("Consideriamo il primo." +recipiente1.toString());
		}
			
	}
}