package ClassiEOggetti;

class Punto2 {
	private double x,y;

	public Punto2(double x, double y){
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
	public boolean equals(Punto2 p){
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