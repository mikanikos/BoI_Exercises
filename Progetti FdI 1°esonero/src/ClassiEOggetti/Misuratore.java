package ClassiEOggetti;

/* Oggetto che sa calcolare la distanza tra due punti. */
class Misuratore {
    /* Calcola la distanza tra i punti p1 e p2 */
    public static double distanza(Punto2 p1, Punto2 p2) {
        double qd;    // quadrato della distanza tra p1 e p2
        double d;     // distanza tra p1 e p2

        /* calcola il quadrato della distanza tra p1 e p2 */
        qd = (p1.getX()-p2.getX())*(p1.getX()-p2.getX()) + (p1.getY()-p2.getY())*(p1.getY()-p2.getY());

        /* calcola la distanza tra p1 e p2 */
        d = Math.sqrt(qd);

        /* restituisce la distanza tra p1 e p2 */
        return d;
    }
}
