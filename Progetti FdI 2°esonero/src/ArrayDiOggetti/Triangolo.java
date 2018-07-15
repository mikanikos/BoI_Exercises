package ArrayDiOggetti;
/* Un oggetto Triangolo rappresenta un triangolo sul piano cartesiano. */
public class Triangolo {
    /* coordinate dei vertici */
    private Punto v1,v2,v3;

    public Triangolo (Punto p1, Punto p2, Punto p3){
		 this.v1 = p1;
 		 this.v2 = p2;
		 this.v3 = p3;
    }

 	public Punto getV1(){
		return this.v1;
	}

 	public Punto getV2(){
		return this.v2;
	}

 	public Punto getV3(){
		return this.v3;
	}

	public void setV1(Punto p){
		this.v1 = p;}

	public boolean equals(Triangolo t){
		return (this.v1).equals(t.v1)&&(this.v2).equals(t.v2)&&(this.v3).equals(t.v3);
	}

	public String toString(){
		return ("V1= "+this.v1.toString()+"\n V2="+this.v2.toString()+"\n V3="+this.v3.toString());
	}

	public double lato1(){
		return Misuratore.distanza(this.v1,this.v2);
	} 
	
	public double lato2(){
		return Misuratore.distanza(this.v2,this.v3);
	}
	
	public double lato3(){
		return Misuratore.distanza(this.v1,this.v3);
	}
	
	public boolean verificaIsoscele() {
		boolean isoscele=false;
		
		if(this.lato1() == this.lato2() || this.lato1() == this.lato3() || this.lato2() == this.lato3())
			isoscele = true;
		
		return isoscele;
	}

}
