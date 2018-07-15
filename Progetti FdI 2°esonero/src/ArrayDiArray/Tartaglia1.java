package ArrayDiArray;

public class Tartaglia1{
	public static void main(String[] args){
		test();
	}

	public static void stampa(int[][] m){
		int l=m.length;
		for(int i=0;i<l;i++){
			for(int j=0;j<m[i].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void test(){
		stampa(tartaglia(0));
		stampa(tartaglia(1));
		stampa(tartaglia(3));
		stampa(tartaglia(5));
		stampa(tartaglia(7));

	}

	public static int[][] tartaglia(int n){
		int[][] res;
		int i;
		// ******** Creazione Struttura Array Frastagliato *****
		res=new int[n+1][];
		for(i=0; i<=n;i++){
			res[i]=new int[i+1];
			riempi(res,i);
		}
		return res;
	}

	public static void riempi(int[][] t, int i){
		int j;
		t[i][0] = 1;
		for (j=1; j<t[i].length-1; j++)
			t[i][j] = t[i-1][j-1]+t[i-1][j];
		t[i][t[i].length-1] = 1;
	}

}