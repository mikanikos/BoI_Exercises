package Ricorsione;

/* classe per il calcolo della sottostringa più lunga
 * di un dato carattere */
public class LunghezzaSequenza {
	
	public static int sottoseqRic(String s, char c) {
		return sottoseqRic(s, c, 0);
	}
	
	private static int sottoseqRic(String s,char c,int nc) {
		int len;
		if (s.length() == 0) {
		len = nc;
		}
		else 
			if (s.charAt(0) == c) {
			    nc++;
			    len = sottoseqRic(s.substring(1), c, nc);
			    if (len < nc)
			        len = nc;
		    } 
		    else { // s.charAt(0) != c
			    len = sottoseqRic(s.substring(1), c, 0);
			    if (len < nc) 
			        len = nc;
			}
			return len;
	}
	
	/* test */
	public static void testSottoseqRic() {
		String s = new String("tprottatttchttttetttx");
		char c = 't';
		int max = sottoseqRic(s, c);
		System.out.println("max lung sottoseq ch "+
		c+" in "+s+": "+max);
		s = new String("tt");
		c = 't';
		max = sottoseqRic(s, c);
		System.out.println("max lung sottoseq ch "+
		c+" in "+s+": "+max);
		s = new String("");
		c = 't';
		max = sottoseqRic(s, c);
		System.out.println("max lung sottoseq ch "+
		c+" in "+s+": "+max);
		s = new String("abc");
		c = 't';
		max = sottoseqRic(s, c);
		System.out.println("max lung sottoseq ch"+
		c+" in "+s+": "+max);
	}
	public static void main(String[] args) {
		testSottoseqRic();
	}
}