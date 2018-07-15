package ArrayDiOggetti;

import fiji.io.Lettore;

public class GestioneLibri {
	public static void main(String[] args) {
		Libro[] elencoLibri;

		//verifica con il metodo di test
		testElencoLibri();

		//crea da input un array di libri e lo restiutisce
		elencoLibri = creaElenco(2);
		stampaElenco(elencoLibri);
/*
		//restituisce il libro con il maggior numero di pagine
		System.out.print("Il libro con il maggior numero di pagine e' ");
		System.out.println(maxPagine(elencoLibri));
*/
		
		/* test per ordinaAutore */
		Libro[] array = new Libro[3];
		array[0] = new Libro("Dostoevskij","Sosia",300,1850);
		array[1] = new Libro("Machiavelli","Interpretazione dei sogni",500,1910);
		array[2] = new Libro("Machiavelli","Principe",100,1500);
		array = ordinaAutore(array);
		for(int i=0; i<array.length; i++)
			array[i].toString();
	}
	
	/* metodo che restituisce un array di oggetti Libro con stesso autore */
	public static Libro[] stessoAutore(Libro[] e,String autore){
		int i,k,cont;
		Libro[] app;
		//conto i libri di autore presenti in e
		cont=0;
		for (i=0; i<e.length; i++)
			if (e[i].getAutore().equals(autore))
				cont++;
		app = new Libro[cont];
		//memorizzo in app i cont libri di autore
		k=0;
		for (i=0; i<e.length; i++)
			if (e[i].getAutore().equals(autore)){
				app[k] = e[i];
				k++;
			}
		return app;
	}
	
	/* metodo che restituisce l'oggetto Libro con il maggior numero di pagine */
	public static int maxPagine(Libro[] e){
		int i,indMax,max;

		max = e[0].getPagine();
		indMax = 0;
		for (i=1; i<e.length; i++){
			if (e[i].getPagine()>max){
				max = e[i].getPagine();
				indMax = i;
			}
		}
		return indMax;
	}
	
	//crea un array di n libri
	public static Libro[] creaElenco(int n){
		Libro[] l;
		String a,t;
		int i;
		int p,y;
		l = new Libro[n];
		System.out.println("Dati del libro: ");
		for (i=0; i<n; i++){
		    System.out.println("inserisci autore ");
		    a = Lettore.in.leggiString();
		    System.out.println("inserisci titolo ");
		    t = Lettore.in.leggiString();
		    System.out.println("inserisci numero pagine ");
		    p = Lettore.in.leggiInt();
		    System.out.println("inserisci anno ");
		    y = Lettore.in.leggiInt();
		    l[i] = new Libro(a,t,p,y);
		}
		return l;
	}
	
	public static void stampaElenco(Libro[] e){
		int i;
		System.out.println("================================");
		System.out.println("======== ELENCO LIBRI ==========");
		System.out.println("================================");
		for (i=0; i<e.length; i++)
			e[i].toString();
		System.out.println();
	}
	
	/* classe di test */
	public static void testElencoLibri(){
		Libro[] elencoLibri;

		//1 solo libro
		elencoLibri = new Libro[1];
		elencoLibri[0] = new Libro("Esopo","Le storie dell'asino",20,0);
		stampaElenco(elencoLibri);
		System.out.println("il libro con il max. numero di pagine e':");
		elencoLibri[maxPagine(elencoLibri)].toString();

		//2 libri con diverso numero di pagine
		elencoLibri = new Libro[3];
		elencoLibri[0] = new Libro("Esopo","Le storie dell'asino",20,0);
		elencoLibri[1] = new Libro("Italo Calvino", "Il visconte dimezzato",158,0);
		elencoLibri[2] = new Libro("Esopo","Le storie del cane",20,0);
		stampaElenco(elencoLibri);
		System.out.println("il libro con il max. numero di pagine e':");
		elencoLibri[maxPagine(elencoLibri)].toString();

		//4 libri con due volumi di n. pagine uguali
		elencoLibri = new Libro[4];
		elencoLibri[0] = new Libro("Esopo","Le storie dell'asino",20,0);
		elencoLibri[1] = new Libro("Italo Calvino", "Il visconte dimezzato",158,0);
		elencoLibri[2] = new Libro("Esopo","Le storie del cane",20,0);
		elencoLibri[3] = new Libro("Esopo","Le favole piu' belle",98,0);
		stampaElenco(elencoLibri);
		System.out.println("il libro con il max. numero di pagine e':");
		elencoLibri[maxPagine(elencoLibri)].toString();

		//10 libri con n. pagine distinti
		elencoLibri = new Libro[10];
		elencoLibri[0] = new Libro("Esopo","Le storie dell'asino",20,0);
		elencoLibri[1] = new Libro("Italo Calvino", "Il visconte dimezzato",158,0);
		elencoLibri[2] = new Libro("Esopo","Le storie del cane",20,0);
		elencoLibri[3] = new Libro("Esopo","Le favole piu' belle",98,0);
		elencoLibri[4] = new Libro("Giovanni Rodari","Filastrocche lunghe e corte",80,0);
		elencoLibri[5] = new Libro("Italo Calvino","le cosmicomiche",250,0);
		elencoLibri[6] = new Libro("Gianni Rodari","Enciclopedia della favola",1120,0);
		elencoLibri[7] = new Libro("Italo Calvino","Il barone rampante",135,0);
		elencoLibri[8] = new Libro("Fratelli Grimm","Raperonzolo",36,0);
		elencoLibri[9] = new Libro("Italo Calvino","Il cavaliere inesistente",124,0);
		stampaElenco(elencoLibri);
		//stampa l'elenco di libri con il massimo numero di pagine
		System.out.println("il libro con il max. numero di pagine e':");
		elencoLibri[maxPagine(elencoLibri)].toString();

		//stampa l'elenco di libri con lo stesso autore
		System.out.println("stampa di tutti i libri di Italo Calvino");
		stampaElenco(stessoAutore(elencoLibri,"Italo Calvino"));


		System.out.println("stampa di tutti i libri di Esopo");
		stampaElenco(stessoAutore(elencoLibri,"Esopo"));

	}//end test
	
	public static String[] titoliAutore(Libro[] e, String autore){
		int i,k; //k rappresenta la lunghezza del nuovo array
		String[] app;
		/* scorro l'array solo per calcolare il numero di libri
		che hanno l'autore richiesto e dimensionare app*/
		k=0;
		for (i=0; i<e.length; i++)
		    if (e[i].getAutore().equals(autore))
		        k++;
		
		/* creo l'array di k componenti */
		app = new String[k];
		/* scorro nuovamente l'array e per inserie in app
		i k libri che hanno l'autore richiesto */
		k = 0;
		for (i=0; i<e.length; i++)
		    if (e[i].getAutore().equals(autore)){
		        app[k] = e[i].getTitolo();
		        k++;
		    }
		return app;
	}
	
	/* metodo che ordina i libri per autore */
	public static Libro[] ordinaAutore(Libro[] l) {
		selectionSortRic(l,0,l.length);
		return l;
	}
	
	/* metodo di ordinamento per oggetti Libro */
	public static void selectionSortRic(Libro[] v, int i, int n) {
		if (i < n-1)
			selectionSortRic(scambiaLibro(v,i,minLibro(v,i,n-1)),
			i+1, n);
	}
	
	/* metodo per scambiare due oggetti Libro in un array */
	private static Libro[] scambiaLibro(Libro[] dati, int i, int j) {
		Libro temp; 
		temp = dati[i];
		dati[i] = dati[j];
		dati[j] = temp;
		return dati;
	}
	
	/* metodo che ordina i libri alfabeticamente per autore e, a parità di autore, per anno */
	private static int minLibro(Libro[] a, int inf, int sup){
		int i,indmin;
		indmin = inf;
		for (i = inf+1; i <= sup; i++) {
		    if (a[i].getAutore().compareTo(a[indmin].getAutore()) < 0)
		    	indmin = i;
		    if(a[i].getAutore().compareTo(a[indmin].getAutore()) == 0)
	    		if(a[i].getAnno() > a[indmin].getAnno())
	    			indmin = i;
		}
		return indmin;
	}
}
