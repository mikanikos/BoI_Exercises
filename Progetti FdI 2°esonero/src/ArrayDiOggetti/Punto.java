package ArrayDiOggetti;

public class Punto {
	private double x,y;

	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}

	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public boolean equals(Punto p){
		return ((this.x==p.x)&&(this.y==p.y));
	}

	public String toString(){
		return "(X= "+this.x+" , Y= "+this.y+")";
	}

	public void cambia(double x, double y){
		this.x = x;
		this.y = y;
	}
}