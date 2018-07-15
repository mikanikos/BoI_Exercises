package ArrayDiArray;

public class Spirale{

	public static void main(String[] args){
		test();
	}

	public static void test(){
		System.out.println("spirale di ordine 1: ");
		stampa(spirale(1));
		System.out.println();

		System.out.println("spirale di ordine 2: ");
		stampa(spirale(2));
		System.out.println();

		System.out.println("spirale di ordine 10: ");
		stampa(spirale(10));
	}

	public static void stampa(int[][] m){
		int l=m.length;
		for(int i=0;i<l;i++){
			for(int j=0;j<l;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

	//public static void inserisciInSpirale(int indice, int[][] matrice){
	public static int[][] spirale(int n){
		int[][] res=new int[n][n]; // creazione della matrice;
		int i,j; // indici della matrice
		int num; // conterrà di volta in volta l'elemento da inserire.
		int direzione;

		/**** Inizializzazione delle variabili ***/

		i=0;
		j=0;
		res[i][j]=1;
		direzione = 0; // inizializzata per default da sinistra verso destra

		for(num=2;num<=n*n; num++){
			direzione=AggiornaDirezione(direzione,i,j,n); // Calcola la nuova direzione
			if((direzione==1)||(direzione==3))
				i=AggiornaRiga(i,direzione); // Aggiorna l'indice delle righe dove necessario
			else
				j=AggiornaColonna(j,direzione); // Aggiorna l'indice delle colonne dove necessario
			res[i][j]=num; // Inserisce il nuovo elemento nella posizione precedentemente calcolata.
		}
		return res;
	}

	public static int AggiornaDirezione(int direzione, int i, int j, int n){
		if (i+j == n-1)  // se si trova lungo la diagonale secondaria
			direzione++;
		if (i==j && j+j>=n) // se si trova lungo la diagonale principale con somma degli indici >= n
			direzione++;
		if (i==j+1 && i+j<n) // riassume gli altri casi di cambio direzione.
			direzione++;
		return direzione % 4;
	}

	public static int AggiornaRiga(int i,int direzione){
		int res;
		if (direzione==1) res=i+1; // muove dall'alto verso il basso
		else res=i-1; // muove dal basso verso l'alto
		return res;
	}

	public static int AggiornaColonna(int j,int direzione){
		int res;
		if(direzione==0) res=j+1; // muove da sinistra verso destra
		else res=j-1;  // muove da destra verso sinistra
		return res;
	}

}