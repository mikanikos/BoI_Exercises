package ArrayDiArray;

class MatriceQuadrata {
    public double[][] matrix;
    int dim;

    MatriceQuadrata(int n, double[][] arrd) {
        this.dim = n;
        this.matrix = new double[n][n];
        this.matrix = arrd;
    }

    private static double determinante2Per2(double[][] arrd) {
        return arrd[0][0] * arrd[1][1] - arrd[1][0] * arrd[0][1];
    }

    public double determinante() {
        double d = 0.0;
        double[][] arrd = new double[this.dim - 1][this.dim - 1];
        if (this.dim == 2) {
            d = MatriceQuadrata.determinante2Per2(this.matrix);
        } else if (this.dim == 1) {
            d = this.matrix[0][0];
        } else {
            int n;
            int n2;
            double[][] arrd2 = new double[this.dim][this.dim];
            for (n2 = 0; n2 < this.dim; ++n2) {
                for (n = 0; n < this.dim; ++n) {
                    arrd2[n2][n] = this.matrix[n2][n];
                }
            }
            boolean bl = false;
            n2 = 0;
            while (!bl) {
                int n3;
                double d2;
                if (n2 == this.dim) {
                    bl = true;
                    continue;
                }
                if (this.matrix[n2][0] == 0.0) {
                    ++n2;
                    continue;
                }
                for (n = 0; n < n2; ++n) {
                    d2 = (- arrd2[n][0]) / this.matrix[n2][0];
                    for (n3 = 0; n3 < this.dim; ++n3) {
                        arrd2[n][n3] = arrd2[n][n3] + this.matrix[n2][n3] * d2;
                    }
                }
                for (n = n2 + 1; n < this.dim; ++n) {
                    d2 = (- this.matrix[n][0]) / this.matrix[n2][0];
                    for (n3 = 0; n3 < this.dim; ++n3) {
                        arrd2[n][n3] = arrd2[n][n3] + this.matrix[n2][n3] * d2;
                    }
                }
                bl = true;
            }
            for (n2 = 0; n2 <= this.dim - 1; ++n2) {
                if (arrd2[n2][0] == 0.0) continue;
                arrd = MatriceQuadrata.eliminaRigaColonna((double[][])arrd2, (int)this.dim, (int)n2, (int)0).matrix;
                d += arrd2[n2][0] * Math.pow(-1.0, n2 + 2) * new MatriceQuadrata(this.dim - 1, arrd).determinante();
            }
        }
        return d;
    }

    public MatriceQuadrata matriceAggiunta() {
        double[][] arrd = new double[this.dim][this.dim];
        MatriceQuadrata matriceQuadrata = this.trasposta();
        for (int i = 0; i < this.dim; ++i) {
            for (int j = 0; j < this.dim; ++j) {
                arrd[j][i] = Math.pow(-1.0, i + j + 2) * MatriceQuadrata.eliminaRigaColonna(matriceQuadrata.matrix, this.dim, j, i).determinante();
            }
        }
        return new MatriceQuadrata(this.dim, arrd);
    }

    public MatriceQuadrata matriceInversa() {
        double d = this.determinante();
        if (d == 0.0) {
            return new MatriceQuadrata(this.dim, this.matrix);
        }
        double[][] arrd = new double[this.dim][this.dim];
        for (int i = 0; i < this.dim; ++i) {
            for (int j = 0; j < this.dim; ++j) {
                arrd[i][j] = this.matriceAggiunta().matrix[i][j] / d;
            }
        }
        return new MatriceQuadrata(this.dim, arrd);
    }

    public MatriceQuadrata trasposta() {
        double[][] arrd = new double[this.dim][this.dim];
        for (int i = 0; i < this.dim; ++i) {
            for (int j = 0; j < this.dim; ++j) {
                arrd[i][j] = this.matrix[j][i];
            }
        }
        return new MatriceQuadrata(this.dim, arrd);
    }

    public static MatriceQuadrata eliminaRigaColonna(double[][] arrd, int n, int n2, int n3) {
        double[][] arrd2 = new double[n - 1][n - 1];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == n3 || j == n2) continue;
                if (i < n3) {
                    if (j < n2) {
                        arrd2[j][i] = arrd[j][i];
                        continue;
                    }
                    arrd2[j - 1][i] = arrd[j][i];
                    continue;
                }
                if (j < n2) {
                    arrd2[j][i - 1] = arrd[j][i];
                    continue;
                }
                arrd2[j - 1][i - 1] = arrd[j][i];
            }
        }
        return new MatriceQuadrata(n - 1, arrd2);
    }

    public double[][] getArray() {
        return this.matrix;
    }
}