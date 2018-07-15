package ArrayDiArray;

public class ProdottoMatrici{
	public static void main(String[] args){
		test();
	}
	 	public static void test(){
		int[][] a,b;
		a = new int[][] {{1,2},{0,1},{0,-1}};
		b = new int[][]{{2,0,1,-1},{2,1,0,-1}};
		stampa(a);
		stampa(b);
		stampa(prodotto(a,b));

		a = new int[][] {{1,0},{0,1}};
		b = new int[][]{{1,0},{0,1}};
		stampa(a);
		stampa(b);
		stampa(prodotto(a,b));

		a = new int[][] {{1}};
		b = new int[][]{{3}};
		stampa(a);
		stampa(b);
		stampa(prodotto(a,b));
	}

public static void stampa(int[][] m){
		int righe,colonne;
		int i,j;
		righe = m.length;
		colonne = m[0].length;
		for(i=0;i<righe;i++){
			for(j=0;j<colonne;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

/* elemento da memorizzare in posizione i,j della matrice risultato */

public static int rigacolonna(int[][]a,int[][]b,int i, int j){
		int k,prod;
		int rb;
		rb =b.length; // che e' uguale a a[0].length
		/* le righe di a sono uguali alle colonne di b */
		prod=0;
		for(k=0; k<rb; k++)
			prod = prod+ a[i][k]*b[k][j];
		return prod;
}

public static int[][] prodotto(int[][] a, int[][] b){
		int[][] res;
		int i,j;
		int ra, cb;
		ra = a.length;
		cb = b[0].length;

		res = new int[ra][cb];
		for (i=0; i<ra; i++)
			for(j=0; j<cb; j++)
				res[i][j] = rigacolonna(a,b,i,j);
		return res;
	}
}