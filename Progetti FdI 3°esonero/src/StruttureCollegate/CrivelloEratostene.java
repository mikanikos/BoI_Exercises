package StruttureCollegate;

public class CrivelloEratostene {
	
	public static int[] arrayInteri(int n) {
		
		int[] a = new int[n+1];
		
		for(int i = 0; i < n+1; i++)
			a[i] = i;
		
		return a;
	}
	
	public static NodoListaI creaLista(int[] s, boolean[] b) {
		
		NodoListaI a = new NodoListaI(s[0],null);
		NodoListaI p = a;
		for (int i = 1; i < s.length; i++) {
		    if(b[i]==true) {
	 	        p.next = new NodoListaI(s[i],null);
		        p = p.next;
		    }
		}
			
		return a;
		
	}
	
	public static NodoListaI generaPrimi(int n) {
		
		int[] a = arrayInteri(n);
		boolean[] b = new boolean[a.length];
		
		for(int i=0; i < b.length; i++)
			b[i]=true;
		
		for(int i = 2; i < a.length/2; i++)
			if(b[i] != false) {
				for(int j = 2; j < a.length; j++) {
				    if(a[j] % a [i] == 0 && a[j] != a[i])
					    b[j] = false;
			        }
		    }
		
		NodoListaI primi = creaLista(a,b);
		
		return primi;
	}
	
	public static void stampa(NodoListaI p) {
		while(p.next!=null) {
		    System.out.print(p.info+" ");
		    p = p.next;
		}
		System.out.println(p.info);
	}
	
	public static void main(String[] args) {
		stampa(generaPrimi(1000));
	}

}
