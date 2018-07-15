package ArrayDiArray;

import fiji.io.Lettore;

public class DueUguali {
	
	public static boolean righeUguali(int[][] a) {
		
		boolean uguali = false;
		int i,j,k,l,m,ele;
		
		
		for(i=0; i<a.length && !uguali; i++) {
			for(l=0; l<a[i].length && !uguali; l++) {
				ele = a[i][l];
				m = l+1;
			    for(k=i; k<a.length && !uguali; k++) {
				    j=m;
				    while(j<a[i].length && !uguali) {
				        if(ele == a[k][j])
					        uguali = true;
				        else
				    	    j++;
			        }
				    m=0;
			    }
			}
		}
		return uguali;
	}
	
    public static void main(String[] args) {
		boolean righe;
    	
		System.out.println("Inserisci il numero di righe e di colonne della tabella");
		int r = Lettore.in.leggiInt();
		int c = Lettore.in.leggiInt();
		int[][] a = new int[r][c];
		
		System.out.println("Inserisci gli elementi della tabella");
		for(int i=0; i<r; i++) {
			System.out.println((i+1)+ "° riga");
			for(int j=0; j<c; j++)
				a[i][j] = Lettore.in.leggiInt();
		}
		righe = righeUguali(a);
		System.out.println(righe);
    }
}
