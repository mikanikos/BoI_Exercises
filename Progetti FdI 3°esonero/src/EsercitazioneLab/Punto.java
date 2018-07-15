package EsercitazioneLab;

public class Punto{

	// Ascissa del punto
		private double x;
	// Ordinata del punto
		private double y;
	// Costruttore della Classe Punto
		public Punto(double x, double y){
			this.x=x;
			this.y=y;
		}

	// Restituisce la coordinata x del punto
		public double getX(){
			return x;
		}

	// Restituisce la coordinata y del punto
		public double getY(){
			return y;
		}

	// Verifica se questo punto è uguale al punto p
		public boolean equals(Punto p){
		// pre != null
			return((this.getX()==p.getX())&&(this.getY()==p.getY()) );
		}

	// Produce la descrizione testuale dell'oggetto
		public String toString(){
			return "( X= "+this.getX() + ", Y= " +this.getY()+")";
		}
}
