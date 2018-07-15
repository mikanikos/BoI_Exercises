package Stringhe;

/* Applicazione di prova per la classe Numero. */
class DemoNumero {

    public static void main(String[] args) {
        Numero n1, n2;       // due numeri
        int v1, v2;          // valore di n1 e n2

        /* crea i due numeri */
        n1 = new Numero(10);
        n2 = new Numero(20);

        /* calcola e visualizza il valore di n1 */
        v1 = n1.getValore();
        System.out.println(v1);         // 10

   		/* calcola e visualizza il valore di n2 */
        v2 = n2.getValore();
        System.out.println(v2);         // 20
        // oppure, al posto delle due istruzioni precedenti
        // System.out.println(n2.getValore());

		/* cambia il valore di n1 e poi lo visualizza */
        n1.setValore(50);
        v1 = n1.getValore();
        System.out.println(v1);         // 50
        // oppure, al posto delle due istruzioni precedenti
        // System.out.println(n1.getValore());
    }
}
