package TerzaEsercitazione;
import fiji.io.*;

/* Applicazione che legge dalla tastiera una sequenza
 * non vuota di numeri interi disposti su una singola linea
 * (i numeri sono separati da spazi e la sequenza è terminata
 * da <invio>) e verifica se la sequenza è crescente. */
class SequenzaCrescente {
    public static void main(String[] args) {
        int n;              // elemento corrente della sequenza
        int prec;           // elemento precedente della sequenza
        boolean crescente;  // la sequenza è crescente

        /* inizializzazioni */

        /* stampa un messaggio */
        System.out.println("Scrivi una sequenza non vuota di numeri interi " +
                           "(terminata da <invio>): ");
        
        /* errore di semantica dinamica : il numero viene letto ma poi viene perso alla successiva istruzione

        /* verifica se la sequenza è crescente:
         * lo fa confrontando ciascun elemento della sequenza con
         * quello che lo precede, verificando che non si sia
         * nessun elemento che sia non maggiore di quello che precede */
        /* legge il primo elemento della sequenza */
        prec = Lettore.in.leggiInt(); // errore di semantica dinamica: il primo numero immesso deve essere memorizzato subito come prec
        /* sarà il precedente del prossimo elemento letto */
        /* per ora la sequenza non è crescente */
        crescente = true; 
        /* legge e elabora gli altri elementi della sequenza */
        while (Lettore.in.eoln()); {  /* errore logico: la negazione alla condizione del while non permette di scrivere una sequenza di numeri */
            /* legge il prossimo elemento */
            n = Lettore.in.leggiInt();
            /* verifica che n sia strettamente maggiore del precedente */
            if (n<=prec) // errore logico: per poter dare il risultato giusto n deve essere minore di 0
                crescente = false;
                /* se n non è maggiore del precedente,
                 * la sequenza non è sicuramente crescente */

            /* prepara la prossima iterazione */
            prec = n;
        }

        /* stampa il risultato */
        if (crescente)
            System.out.println("Sequenza crescente");
        else
            System.out.println("Sequenza non crescente");
    }
}