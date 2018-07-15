package ArrayDiArray;

public class NewArray {
	
	public static int[][] newArray(int[][] a, int r) {
		int[][] nuovo;
		
		nuovo = new int[r][];
		
		int k=0;
		int l=0;
		
		for(int i=0; i<a.length; i++) {
			int lunghezza=0;
			boolean rigaZeri=true;
			int m = 0;
			while(m<a[i].length && a[i].length != 0 && rigaZeri) {
				if(a[i][m] != 0)
					rigaZeri = false;
				else
					m++;
			}
			for(int j=0; j<a[i].length && !rigaZeri ; j++)
				if(a[i][j] != 0 && a[i].length != 0)
					lunghezza++;
			if(a[i].length != 0 && !rigaZeri) {
				int[] array;
			    array=new int[lunghezza];
			    k=0;
			    for(int j=0; j<a[i].length; j++) {
				    if(a[i][j] != 0) {
					    array[k] = a[i][j];
					    k++;
				    }
		        }
			    nuovo[l]=array;
			    l++;
			}
		}
		return nuovo;	
	}
	
	public static int righe(int[][] a) {
		boolean rigaZeri;
		int righe = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i].length != 0)
				righe++;
			rigaZeri = true;
			int j=0;
			while(j<a[i].length && a[i].length != 0 && rigaZeri) {
				if(a[i][j] != 0)
					rigaZeri = false;
				else
					j++;
			}
			if(rigaZeri && a[i].length != 0)
				righe--;
		}
		return righe;
	}
	
    public static void main(String[] args) {
		
		int[][] a,b;
		a = new int[][] {{},{0,8,88,0},{0,0,0},{0,2,0,3,2,0},{},{2,0,1,0},{}};
    	
		int r;
		r = righe(a);
		b = new int[r][];
		
		b = newArray(a,r);
		
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++)
				System.out.print(b[i][j]+ " ");
			System.out.println();
		}
    }
}
