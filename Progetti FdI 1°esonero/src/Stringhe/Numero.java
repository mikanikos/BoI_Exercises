package Stringhe;

/* Un oggetto Numero rappresenta un numero intero, con
 * un valore che può essere acceduto e modificato */

class Numero {

   /* Variabile d’istanza - valore del numero */
   private int valore;

   /* Costruttore – Crea un nuovo Numero
    * che ha valore iniziale v. */
   	public Numero(int v) {
        this.valore = v;
        }

	/* Metodo - calcola il valore di questo numero */
    public int getValore() {
        return this.valore;
    }

	/* Metodo - cambia in v il valore di questo numero */
    public void setValore(int v) {
        this.valore = v;
    }
}