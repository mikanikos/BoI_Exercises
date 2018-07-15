package Ricorsione;

public class RicorsioneMultipla {
	
	/* fibonacci */
	static int natt;
	
	public static long fibonacci(long n) {
	    natt = 0;
	    return _fibonacci(n);
	}
	
	public static long _fibonacci(long n) {
		natt++;
		long fib;
		if (n == 0) {
		    fib = 0;
		} 
		else {
			if (n == 1)
		        fib = 1;
			else {
		        fib = _fibonacci(n-1);
		        fib += _fibonacci(n-2);
		    }
		}
		return fib;
	}
	
	public static void testFibonacci() {
		System.out.println("fib 8 = "+fibonacci(8L));
		System.out.println("attivazioni fib 8 = "+natt);
		System.out.println("fib 2 = "+ fibonacci(2L));
		System.out.println("attivazioni fib 2 = "+natt);
		System.out.println("fib 1 = "+ fibonacci(1L));
		System.out.println("attivazioni fib 1 = "+natt);
		System.out.println("fib 0 = "+fibonacci(0L));
		System.out.println("attivazioni fib 0 = "+ natt);
	}
	
	public static void main(String[] args) {
		testFibonacci();
	}
	
	/* torri di hanoi */
	public static void muoviUnDisco(int sorg, int dest) {
		System.out.println("muovi un disco da "+sorg+" a "+dest);
	}
	public static void muovi(int n, int sorg, int dest, int aux){
		if (n == 1)
		    muoviUnDisco(sorg, dest);
		else {
		    muovi(n-1, sorg, aux, dest);
		    muoviUnDisco(sorg, dest);
		    muovi(n-1, aux, dest, sorg);
		}
	}
	
	public static void testHanoi() {
		/* muovere n dischi da 1 a 2
		* con 3 come appoggio */
		int n = 3;
		System.out.println("n = " + n);
		muovi(n, 1, 2, 3);
		n = 1;
		System.out.println("n = " + n);
		muovi(n, 1, 2, 3);
		n = 10;
		System.out.println("n = " + n);
		muovi(n, 1, 2, 3);
	}
	
	/* modificare il main di fibonacci e questo per avere quello di hanoi */
	public static void main2(String[] args) {
		testHanoi();
	}
}
