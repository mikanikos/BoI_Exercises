package ArrayDiOggetti;

/* Dato un array di rettangoli trova i due rettangoli che hanno intersezione massima*/
/* Utilizza il metodo definito in precedenza, che verifica se due rettangoli hanno intersezione massima */
/* Le stampe di controllo sono state commentate  */

/* Algoritmo:
   Input: un array di rettangoli
   		-inizializzo a zero l'area massima relativa (l'area intersezione non puo' essere negativa)
   		 e come rettangolo iniziale null.
   		-fissato l'iesimo rettangolo ri dell'array lo confronto con tutti i successivi.
   		 Sia rj uno dei rettangoli successivi
   	    -se ri e rj hanno intersezione non vuota (vedi metodo della classe VerificaIntersezioneRettangoli)
   	       allora calcolo l'area dell'intersezione mettendo le 4 ascisse dei vertici in un array ascisse,
   	       le 4 ordinate in un array ordinate; ordino i due array in ordine crescente e il rettangolo intersezione
   	       avra' come vbs gli elementi in posizione di indice 1 dei due array e come vad gli elementi in posizione d'indice 2.
		-se l'area dl rettangolo e' maggiore del massimo relativo, aggiorno il massimo relativo e l'area max.
  Output: le coordinate del rettangolo di intersezione massima e la relativa area
*/
public class RettangoliIntersezioneMassima{

    public static void main (String[] args){
		testIntersezione();
	}

	public static void testIntersezione(){
		Rettangolo2 rett;
		Rettangolo2[] ar = new Rettangolo2[6];
		ar[0] = new Rettangolo2(new Punto2(1,1), new Punto2(2,4));
		ar[1] = new Rettangolo2(new Punto2(3,3), new Punto2(8,8));
		ar[2] = new Rettangolo2(new Punto2(1,1), new Punto2(6,4));
		ar[3] = new Rettangolo2(new Punto2(2,5), new Punto2(6,8));
		ar[4] = new Rettangolo2(new Punto2(3,3), new Punto2(5,5));
		ar[5] = new Rettangolo2(new Punto2(1,1), new Punto2(3,4));
		rett = maxRettangoloIntersezione(ar);
		System.out.println("Rettangolo con intersezione massima: \n" + rett.toString());
	}

	public static Rettangolo2 maxRettangoloIntersezione(Rettangolo2[] ar){
		int i,j;
		double areaMax;
		Rettangolo2 rettMax,rett;
		//System.out.println("entro nel metodo maxRettangoloIntersezione");
		areaMax = 0;
		rettMax = null;
		for(i=0; i<ar.length; i++)
			for(j=i+1; j<ar.length; j++){
				//System.out.println("entro nel for: i = "+i+" j = "+j);
				if(VerificaIntersezioneRettangoli.intersezione(ar[i],ar[j])){
				    rett = rettIntersezione(ar[i],ar[j]);
				    //System.out.println("il rettangolo \n"+ ar[i].toString() + "e il rettangolo \n" +ar[j].toString() +
				    //                "\n si intersecano con area = " + rett.area());
					if (rett.area()>areaMax){
						areaMax=rett.area();
					    rettMax=rett;
					}
			    }
				//else
					//System.out.println("il rettangolo \n"+ ar[i].toString() + "e il rettangolo \n" +ar[j].toString() +
				    //                   "\n NON si intersecano");
			}
		return rettMax;
	}


	    public static Rettangolo2 rettIntersezione(Rettangolo2 r1, Rettangolo2 r2) {
	        // pre: r1!=null && r2!=null
	        double[] ascisse, ordinate;

	        /* inserisco le 4 ascisse in ascisse e le 4 oridnate in ordinate
	           i due array hanno i valori in ordine crescente*/
	        ascisse = new double[4];
	        ascisse[0] = r1.getVad().getX();
	        ascisse[1] = r1.getVbs().getX();
	        ascisse[2] = r2.getVad().getX();
	        ascisse[3] = r2.getVbs().getX();
	        /* ordino i 4 double  */
			SelectionSort.selectionSort(ascisse);

	        ordinate = new double[4];
	        ordinate[0] = r1.getVad().getY();
	        ordinate[1] = r1.getVbs().getY();
	        ordinate[2] = r2.getVad().getY();
	        ordinate[3] = r2.getVbs().getY();
	        /* ordino i 4 double  */
			SelectionSort.selectionSort(ordinate);

	        return new Rettangolo2(new Punto2(ascisse[1],ordinate[1]), new Punto2(ascisse[2],ordinate[2]));
		}
}
