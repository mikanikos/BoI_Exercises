package ArrayDiArray;

import java.util.*;
import fiji.io.Lettore;

public class RigheUguali {
	
	public static boolean righeUguali(int[][] a) {
		
		boolean r2 = false;
		int i,j;
		i=0;
		
		while(i<a.length-1 && !r2) {
			j=i+1;
			while(j<a.length && !r2) {
				if(a[i].length == a[j].length)
					if(Arrays.equals(a[i],a[j]))
						r2 = true;		
				j++;
			}
			i++;
		}
		return r2;
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
