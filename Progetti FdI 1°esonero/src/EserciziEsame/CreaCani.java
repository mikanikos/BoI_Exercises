package EserciziEsame;

import fiji.io.Lettore;

public class CreaCani {
	
	public static void main(String[] args) {
		
		Cane c1,c2;
		String n1,n2,co1,co2;
		int e1,e2,a;
		boolean cu1 = false,cu2 = false, errore = false;
		char car, b;
		
		System.out.println("Inserisci il nome del primo cane");
		n1 = Lettore.in.leggiLinea();
		System.out.println("Inserisci l'et� del primo cane");
		e1 = Lettore.in.leggiInt();
		Lettore.in.leggiLinea();
		System.out.println("Inserisci il colore del primo cane");
		co1 = Lettore.in.leggiLinea();
		do {
			errore = false;
			System.out.println("Il cane � cuccioloso?(Y/N)");
		    car = Lettore.in.leggiChar();
		    if(car == 'Y')
			    cu1 = true;
		    else {
		    	if(car == 'N')
		    		cu1 = false;
		    	else {
		    		System.out.println("Inseimento errato, riprova");
			        errore = true;
		    	}
		    }
		}
		while(errore);
		
		c1 = new Cane(n1,e1,co1,cu1);
		
		System.out.println("Inserisci il nome del secondo cane");
		n2 = Lettore.in.leggiLinea();
		n2 = Lettore.in.leggiLinea();
		System.out.println("Inserisci l'et� del secondo cane");
		e2 = Lettore.in.leggiInt();
		Lettore.in.leggiLinea();
		System.out.println("Inserisci il colore del secondo cane");
		co2 = Lettore.in.leggiLinea();
		do {
			errore = false;
			System.out.println("Il cane � cuccioloso?(Y/N)");
		    car = Lettore.in.leggiChar();
		    if(car == 'Y')
			    cu2 = true;
		    else {
		    	if(car == 'N')
		    		cu2 = false;
		    	else {
		    		System.out.println("Inserimento errato, riprova");
			        errore = true;
		    	}
		    }
		}
		while(errore);
		
		c2 = new Cane(n2,e2,co2,cu2);
		
		if (c1.getCucciolosita() == c2.getCucciolosita() && c2.getCucciolosita()==false)
			System.out.println("Sembra che nessuno dei due cani � cuccioloso...");
		
		if (c1.getCucciolosita() == c2.getCucciolosita() && c2.getCucciolosita()==true) {
			do {
				errore = false;
			    System.out.println("Qual � il cane pi� cuccioloso tra i due?(1/2)");
			    a = Lettore.in.leggiInt();
			    if (a == 1) {
				    System.out.println("Ecco il cane pi� cuccioloso");
				    System.out.println(c1.toString());
			    }
			    else {
			    	if(a==2) {
			    		System.out.println("Ecco il cane pi� cuccioloso");
			    		System.out.println(c2.toString());
			    	}
			    	else {
			    		System.out.println("Inseimento errato, riprova");
			    		errore = true;
			    	}
			    }   
			}
			while (errore);
		}
		else {
			if (c1.getCucciolosita()) {
				System.out.println("Ecco il cane pi� cuccioloso");
				System.out.println(c1.toString());
			}
				
			if (c2.getCucciolosita()) {
				System.out.println("Ecco il cane pi� cuccioloso");
				System.out.println(c2.toString());
			}
		}
		
		do {
			errore = false;
		    System.out.println("Vuoi cambiare la cucciolosit� di uno dei due cagnolini?(Y/N)");
		    b = Lettore.in.leggiChar();
		    if(b == 'N')
			    System.out.println("Creazione cagnolini completata!");
		    else {
		    	if (b == 'Y') {
		    		do {
		    			errore = false;
		    			System.out.println("Di quale cagnolino vuoi cambiare la cucciolosit�?(1/2)");
			            a = Lettore.in.leggiInt();
			            if(a==1) {
				            c1.cambiaCucciolosita();
				            System.out.println(c1.toString());
			            }
			            else {
			        	    if(a==2) {
				                c2.cambiaCucciolosita();
				                System.out.println(c2.toString());
			                }
			        	    else {
				    		    System.out.println("Inserimento errato, riprova");
					            errore = true;
				    	    }
			            }
		    		}
		    		while (errore);
			        
		    	}
		    	else {
		    		System.out.println("Inserimento errato, riprova");
			        errore = true;
		    	}
		    }
		}
		while(errore);
	}
}
