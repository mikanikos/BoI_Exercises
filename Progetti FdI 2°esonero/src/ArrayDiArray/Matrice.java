package ArrayDiArray;

class Matrice {
    double[][] matrice;
    int xDim;
    int yDim;

    Matrice(int n, int n2, double[][] arrd) {
        this.xDim = n;
        this.yDim = n2;
        this.matrice = new double[n][n2];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                this.matrice[i][j] = arrd[i][j];
            }
        }
    }

    public int rango() {
        int n;
        int n2;
        double[][] arrd = new double[this.xDim][this.yDim];
        for (n2 = 0; n2 < this.xDim; ++n2) {
            for (n = 0; n < this.yDim; ++n) {
                arrd[n2][n] = this.matrice[n2][n];
            }
        }
        for (n = 0; n < this.yDim; ++n) {
            double[][] arrd2 = Matrice.annullaElementi(this.xDim, this.yDim, Matrice.ordinaRighe(this.xDim, this.yDim, arrd), n);
            for (n2 = 0; n2 < this.xDim; ++n2) {
                for (int i = 0; i < this.yDim; ++i) {
                    arrd[n2][i] = arrd2[n2][i];
                }
            }
        }
        int n3 = 0;
        int n4 = this.yDim;
        for (n = 0; n < this.yDim; ++n) {
            for (n2 = 0; n2 < this.xDim; ++n2) {
                if (arrd[n2][n] != 0.0) continue;
                ++n3;
            }
            if (n3 == this.xDim) {
                --n4;
            }
            n3 = 0;
        }
        return n4;
    }

    private static double[][] annullaElementi(int n, int n2, double[][] arrd, int n3) {
        int n4;
        int n5;
        double[][] arrd2 = new double[n][n2];
        for (n5 = 0; n5 < n; ++n5) {
            for (n4 = 0; n4 < n2; ++n4) {
                arrd2[n5][n4] = arrd[n5][n4];
            }
        }
        for (n5 = 0; n5 < n; ++n5) {
            if (arrd[n5][n3] == 0.0) continue;
            for (n4 = n3 + 1; n4 < n2; ++n4) {
                double d = (- arrd[n5][n4]) / arrd[n5][n3];
                for (int i = n5; i < n; ++i) {
                    arrd2[i][n4] = arrd[i][n4] + d * arrd[i][n3];
                    if (arrd2[i][n4] > Math.pow(10.0, -14.0)) continue;
                    arrd2[i][n4] = 0.0;
                }
            }
            n5 = n;
        }
        return arrd2;
    }

    private static double[][] ordinaRighe(int n, int n2, double[][] arrd) {
        int n3;
        int n4;
        int n5 = 0;
        int[] arrn = new int[n2];
        for (n3 = 0; n3 < n2; ++n3) {
            for (n4 = 0; n4 < n; ++n4) {
                if (arrd[n4][n3] == 0.0) {
                    ++n5;
                    continue;
                }
                n4 = n;
            }
            arrn[n3] = n5;
            n5 = 0;
        }
        int[] arrn2 = new int[n2];
        n5 = n + 1;
        int n6 = 0;
        for (n3 = 0; n3 < n2; ++n3) {
            for (n4 = 0; n4 < n2; ++n4) {
                if (arrn[n4] > n5) continue;
                n5 = arrn[n4];
                n6 = n4;
            }
            arrn[n6] = n + 1;
            arrn2[n3] = n6;
            n5 = n + 1;
        }
        double[][] arrd2 = new double[n][n2];
        for (int i = 0; i < n2; ++i) {
            for (n4 = 0; n4 < n; ++n4) {
                arrd2[n4][i] = arrd[n4][arrn2[i]];
            }
        }
        return arrd2;
    }
}