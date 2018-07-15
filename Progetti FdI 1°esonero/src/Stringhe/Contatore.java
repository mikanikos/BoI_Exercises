package Stringhe;

//oggetto contatore
class Contatore {
    /* Variabile d’istanza - valore del numero */
  	 private int valore;

	  /* Costruttore
    *  Crea un nuovo oggetto Contatore con valore iniziale 0 */
		 public Contatore() {
      	    this.valore = 0;
		}

	  /* Metodi – Accesso e modifica valore */
		 public int getValore() {
			return this.valore;
		}

		 public void setValore(int n) {
			this.valore = n ;
		}

	  /* Metodo – Incrementa Contatore */
	 	 public void incrCont() {
     		setValore(getValore() + 1);
     	}

    /* Metodo per visualizzare l'oggetto */
    public String toString(){
		  return "contatore = "+this.getValore();
	  }
	}