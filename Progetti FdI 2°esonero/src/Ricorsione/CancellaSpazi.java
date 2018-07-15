package Ricorsione;

public class CancellaSpazi {
	
	public static String cancellaSpazi(String s) {
		
		String res;
		if(s.equals(""))
			res = "";
		else {
			if(s.charAt(0) == ' ')
				res = cancellaSpazi(s.substring(1));
			else
				res = s.charAt(0) + cancellaSpazi(s.substring(1));
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		System.out.println(cancellaSpazi("buon giorno"));
	}
}
