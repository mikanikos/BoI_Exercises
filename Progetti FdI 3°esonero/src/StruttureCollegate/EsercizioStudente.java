package StruttureCollegate;

class Data{
	 int giorno;
	 int mese;
	 int anno;

	public Data(int g, int  m, int a){
		giorno = g;
		mese = m;
		anno = a;
	}

	public String toString(){
		return "\n"+giorno+"/"+mese+"/"+anno+"\n";
	}
}

class Esame{
	private String materia;
	private int voto;
	private Data data;

	public Esame(String m, int v, Data d){
		materia = m;
		voto = v;
		data = d;
	}

	public int getVoto(){ return voto;}
	public String getMateria() {return materia;}
	public Data getData() {return data;}

	public void setVoto(int nuovoVoto){ voto = nuovoVoto;}
	public void setMateria( String nuovaMat){ materia = nuovaMat;}

	public String toString(){
		return materia + "  " + voto+data.toString();
	}
}

/** Un oggetto Studente rappresenta uno studente. */
class Studente{
    private String cognome;
    private String nome;
    private String universita;
    private String matricola;
    private Esame[] esami;

    public Studente(String cognome, String nome, String universita, String matricola, Esame[] esami) {
       this.cognome=cognome;
       this.nome=nome;
       this.universita=universita;
       this.matricola=matricola;
       this.esami=esami;
    }

	public Esame[] getEsami(){ return esami;}

	public String toString() {
		String l="";
        for (int i= 0; i<esami.length; i++) l= l+ esami[i].toString() + "\n";
	    return "Mi chiamo " + cognome + " " +  nome +
	           "\n Studio a " + universita +
	           "\n matricola n. " + matricola +
	           "\n il mio libretto \n" + l + " ";
    }
}

/** Un oggetto Persona rappresenta una persona. */
class Persona {
    /** Il nome. */
    public String nome;

    /** Crea una Persona, dato il nome. */
    public Persona(String nome) {
        this.nome = nome;
    }
    
    /** Restituisce il nome della Persona. */
    public String getNome() {
    	return this.nome;
    }

	/** Restituisce una descrizione. */
    public String toString() {
        return "Mi chiamo " + getNome() + ".";
    }
}

class NodoListaO{
	Studente info;
	NodoListaO next;

	public NodoListaO(Studente s, NodoListaO n){
		info = s;
		next = n;
	}
}

class ElencoStudenti {
	
	public static void main(String[] args){
		NodoListaO l;
		Studente s1,s2,s3;
		Esame[] app;
		Data a = new Data(3,3,3);

		app = new  Esame[]{new Esame("analisi",25,a), new Esame("geometria",28,a)};
		s1 = new Studente("Bruno","Neri", "Roma Tre", "1234", app);

		app = new  Esame[]{new Esame("analisi",19,a), new Esame("fisica",28,a), new Esame("geometria",24,a)};
		s2 = new Studente("Aldo","Bianchi", "Sapienza", "2993", app);

		app = new  Esame[]{new Esame("analisi",23,a), new Esame("fisica",24,a), new Esame("geometria",19,a)};
		s3 = new Studente("Mario","Rossi", "Sapienza", "3263", app);

		l = new NodoListaO(s1, new NodoListaO(s2, new NodoListaO(s3, null)));

		System.out.println("********* lista studenti ****************");
		stampaLista(l);

		System.out.println("**** l.next.info.getEsami()[0] = " + l.next.info.getEsami()[0]);

		System.out.println("lista studenti con voti superiori alla media");
		stampaLista(creaNuovalista(l));

	}

	public static void stampaLista(NodoListaO l){
		while (l!= null){
			System.out.println(l.info.toString());
			l = l.next;
		}
	}

	public static double mediaVoti(Studente s){
		double m;
		int i,somma;
		somma=0;

		for(i=0; i<s.getEsami().length; i++)
			somma=somma+s.getEsami()[i].getVoto();
		m = somma/s.getEsami().length;
		return m;
	}

	public static double mediaStud(NodoListaO l){
		double media=0;
		int cont=0;
		while(l!=null){
			media=media + mediaVoti(l.info);
			cont++;
			l=l.next;
		}
		media = media/cont;
		return media;
	}


	public static NodoListaO creaNuovalista(NodoListaO l){
		NodoListaO app,p;
		double mediaEsami;
		app=new NodoListaO(null,null);
		p=app;
		mediaEsami=mediaStud(l);
		while(l!=null){
			if(mediaVoti(l.info)>= mediaEsami){
				app.next= new NodoListaO(l.info,null);
				app=app.next;
			}
			l=l.next;
		}
		return p.next;
	}

}

class ElencoStudenti1{

	public static void main(String[] args){
		NodoListaO lis;
		Studente s1,s2;
		Esame[] app;

		app = new  Esame[]{new Esame("analisi",25, new Data(13,2,2015)), new Esame("geometria",28,new Data(20,2,2015))};
		s1 = new Studente("Bruno","Neri", "Roma Tre", "1234", app);

		app = new  Esame[]{new Esame("analisi",19, new Data(19,9,2014)), new Esame("fisica",28,new Data(5,2,2015)), new Esame("geometria",24, new Data(25,2,2015))};
		s2 = new Studente("Aldo","Bianchi", "Sapienza", "2993", app);

		lis = new NodoListaO(s1, new NodoListaO(s2, null));

		System.out.println("======= COSA STAMPA ==============");
		System.out.println(lis.next.info.toString());
		System.out.println(lis.next.info.getEsami()[0].getVoto());
		System.out.println(lis.next.info.getEsami()[0].getData().giorno);
		System.out.println(lis.info.getEsami()[1].getMateria());
		System.out.println(lis.info.getEsami()[0].getData().mese);
	}

}