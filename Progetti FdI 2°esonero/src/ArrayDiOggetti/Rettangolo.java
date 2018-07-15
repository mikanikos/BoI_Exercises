package ArrayDiOggetti;

/* classe per rappresentare oggetti Rettangolo */
public class Rettangolo {
	
	/* lato maggiore */
	private double lato1;
	
	/* lato minore */
	private double lato2;
	
	/* costruttore */
	public Rettangolo(double lato1, double lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
	
	/* metodi get */
	public double getLato1() {
		return lato1;
	}
	
	public double getLato2() {
		return lato2;
	}
	
	public double area() {
		double area = this.getLato1()*this.getLato2();
		return area;
	}
	
	/* metodo che crea e restituisce un array di oggetti Rettangolo casuali */
	public Rettangolo[] arrayRettangoli(int n) {
		/* dichiarazione e creazione array */
		Rettangolo[] rc;
		rc = new Rettangolo[n];
		
		for(int i=0; i<n; i++) {
			/* genera i lati dei rettangoli casualmente */
			this.lato1 = (int)Math.random()*100;
			this.lato2 = (int)Math.random()*100;
			/* crea l'i-esimo rettangolo */
			rc[i] = new Rettangolo(lato1,lato2);
		}
		
		return rc;
	}
	
	/* metodo che, dato un array di oggetti Rettangolo, restituisce quello
	 * con area massima */
	public Rettangolo areaMassima(Rettangolo[] rc) {
		int i,posMax = 0;
		double areaMax,areaR;
		
		/* rettangolo di area massima è il primo inizialmente */
		areaMax = rc[posMax].getLato1()*rc[posMax].getLato2();
		
		/* confronto con gli altri e memorizza la posizione di quello massimo */
		for(i=1; i<rc.length; i++) {
			areaR = rc[i].getLato1()*rc[i].getLato2();
			if(areaMax < areaR) {
				areaMax = areaR;
				posMax = i;
			}
		}
		
		return rc[posMax];
	}
}

class Rettangolo3 {
	
	/* vertice in basso a sinistra */ 
	private double coordinataXBS;
	private double coordinataYBS;
	
	/* vertice in basso a destra */
	private double coordinataXAD;
	private double coordinataYAD;
	
	/* costruttore */
	public Rettangolo3(double cord1, double cord2, double cord3, double cord4) {
		this.coordinataXBS = cord1;
		this.coordinataYBS = cord2;
		this.coordinataXAD = cord3;
		this.coordinataYAD = cord4;
	}
	
	/* metodi get */
	public double getCoordinataXBS() { 
		return this.coordinataXBS;
	}
	
	public double getCoordinataYBS() {
		return this.coordinataYBS;
	}
	
	public double getCoordinataXAD() { 
		return this.coordinataXAD;
	}
	
	public double getCoordinataYAD() {
		return this.coordinataYAD;
	}
	
	/* metodo che, dati due rettangoli, restituisce un valore booleano
	 * a seconda se hanno intersezione vuota o meno */
	public boolean intersezione(Rettangolo3 r1) {
		
		boolean intersezione = false;
		
		if((this.getCoordinataXBS()>=r1.getCoordinataXBS() && this.getCoordinataXBS()<=r1.getCoordinataXAD()) && 
				(this.getCoordinataYBS()>=r1.getCoordinataYBS() && this.getCoordinataYBS()<=r1.getCoordinataYAD()))
			intersezione = true;
		if((r1.getCoordinataXBS()>=this.getCoordinataXBS() && r1.getCoordinataXBS()<=this.getCoordinataXAD()) && 
				(r1.getCoordinataYBS()>=this.getCoordinataYBS() && r1.getCoordinataYBS()<=this.getCoordinataYAD()))
			intersezione = true;
		if((this.getCoordinataYBS()>=r1.getCoordinataYBS() && this.getCoordinataYBS()<=r1.getCoordinataYAD()) && 
				(this.getCoordinataXAD()>=r1.getCoordinataXBS() && this.getCoordinataXAD()<=r1.getCoordinataXAD()))
			intersezione = true;
		if((r1.getCoordinataYBS()>=this.getCoordinataYBS() && r1.getCoordinataYBS()<=this.getCoordinataYAD()) && 
				(r1.getCoordinataXAD()>=this.getCoordinataXBS() && r1.getCoordinataXAD()<=this.getCoordinataXAD()))
			intersezione = true;
		if((this.getCoordinataXBS()>=r1.getCoordinataXBS() && this.coordinataXBS<=r1.getCoordinataXAD()) && 
				((this.getCoordinataYBS()<=r1.getCoordinataYBS() && this.getCoordinataYAD()>=r1.getCoordinataYBS()) || 
						this.getCoordinataYAD()>=r1.getCoordinataYAD() && this.getCoordinataYBS()<=r1.getCoordinataYAD()))
			intersezione = true;
		if((r1.getCoordinataXBS()>=this.getCoordinataXBS() && r1.coordinataXBS<=this.getCoordinataXAD()) && 
				((r1.getCoordinataYBS()<=this.getCoordinataYBS() && r1.getCoordinataYAD()>=this.getCoordinataYBS()) || 
						r1.getCoordinataYAD()>=this.getCoordinataYAD() && r1.getCoordinataYBS()<=this.getCoordinataYAD()))
			intersezione = true;
		
		return intersezione;
	}
}
