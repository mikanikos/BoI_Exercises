package EserciziEsame;

public class EliminaSpazi {
	
	public static void main(String[] args) {
		testEliminaSpazi();
	}
	
	public static String eliminaSpazi(String s) {
		
		String t;
		boolean noSpazi;
		int i;
		
		noSpazi = false;
		i = 0;
		
		while (i<s.length() && !noSpazi) {
			if (s.charAt(i) != ' ')
				noSpazi = true;
			else
				i++;
		}
		
		t = s.substring(i);
		i = t.length()-1;
		
		while (i > 0 && !noSpazi) {
			if(t.charAt(i) != ' ')
				noSpazi = true;
			else
				i--;
		}
		
		t = t.substring(0,i+1);
		
		return t;
	}
	
	public static void testEliminaSpazi() {
		
		System.out.println("eliminaSpazi (\"\") : [] = " +eliminaSpazi(""));
		
		System.out.println("eliminaSpazi (\"     \") : [] = " +eliminaSpazi("     "));
		
		System.out.println("eliminaSpazi (\"c     \") : [c] = " +eliminaSpazi("c     "));
	
		System.out.println("eliminaSpazi (\"      r\") : [r] = " +eliminaSpazi("      r"));
		
		System.out.println("eliminaSpazi (\"a       r\") : [a       r] = " +eliminaSpazi("a       r"));
		
		System.out.println("eliminaSpazi (\"  ciao\") : [ciao] = " +eliminaSpazi("  ciao"));
		
		System.out.println("eliminaSpazi (\"miao   \") : [miao] = " +eliminaSpazi("miao   "));
		
		System.out.println("eliminaSpazi (\"  f r a  \") : [f r a] = " +eliminaSpazi("  f r a  "));
		
		System.out.println("eliminaSpazi (\"ciao a tutti\") : [ciao a tutti] = " +eliminaSpazi("ciao a tutti"));
	}
}