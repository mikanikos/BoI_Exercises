package ClassiEOggetti;

/* Un oggetto Triangolo rappresenta un triangolo sul piano cartesiano. */
class Triangolo {
    /* coordinate dei vertici */
    private Punto2 v1,v2,v3;

    public Triangolo (Punto2 p1, Punto2 p2, Punto2 p3){
		 this.v1 = p1;
 		 this.v2 = p2;
		 this.v3 = p3;
    }

 	public Punto2 getV1(){
		return this.v1;
	}

 	public Punto2 getV2(){
		return this.v2;
	}

 	public Punto2 getV3(){
		return this.v3;
	}

	public void setV1(Punto2 p){
		this.v1 = p;}

	public boolean equals(Triangolo t){
		return (this.v1).equals(t.v1)&&(this.v2).equals(t.v2)&&(this.v3).equals(t.v3);
	}

	public String toString(){
		return ("V1= "+this.v1.toString()+"\n V2="+this.v2.toString()+"\n V3="+this.v3.toString());
	}

	public double perimetro(){
		return (Misuratore.distanza(this.v1,this.v2)+Misuratore.distanza(this.v2,this.v3)+Misuratore.distanza(this.v1,this.v3));
	}
}
