import fiji.io.Lettore;

public class TestCiolino {
	
	public static void main(String[] args) {
		
		
		System.out.println("Ciao! Sono Bingo, il programma informatico di cucciolino!");
		
		Lettore.in.leggiString();
		
		System.out.println("Inserisci un nome per inizare il test");
		
		Lettore.in.leggiString();
		
		System.out.println("Domanda n°1: descrivi cucciolina con una parola");
				
	    Lettore.in.leggiString();
		
		System.out.println("Domanda n°2: ti piace la pizza? Rispondi con un numero da 1 a 10");
		
		Lettore.in.leggiString();
		
		System.out.println("Domanda n°3: quanto ti piacciono i cagnolini da 1 a 10? In base alla risposta ti dirò chi sei");
		
		
		int x;
		
		x = Lettore.in.leggiInt();
		
		if(x<6){
			System.out.println("Sei per caso Dadone?!");
		}
		
		else {
		if(x==6){
		System.out.println("O sei Nenne o sei Dadone");
			
			}
		
		else {
		if(x==7){
		System.out.println("Nenne, sei per caso tu?!");
				
				}
			
		else {
		if(x==8){
		System.out.println("Nenne, sei per caso tu?!");
					
					}
				
		else {
		if(x==9){
		System.out.println("Nenne, sei per caso tu?!");
						
						}
					
		else {
		if(x==10){
		System.out.println("Tu sei sicuramente Cucciolina!");
		
		}
		}	       
		}
		}		
		}
		}	
	}
}