package edu.unifor.clysman.Linear;

public class LinearAlgebra {
    public Matrix transpose(Matrix matrix) {
        Matrix transposedMatrix = new Matrix(matrix.getCols(), matrix.getRows());

        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                transposedMatrix.set(j, i, matrix.get(i, j));
            }
        }

        return transposedMatrix;
    }

    public Matrix sum(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        Matrix sum = new Matrix(a.getRows(), a.getCols());

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getCols(); j++) {
                sum.set(i, j, a.get(i, j) + b.get(i, j));
            }
        }

        return sum;
    }

    public Matrix times(Matrix matrix, double escalar) {
        Matrix product = new Matrix(matrix.getRows(), matrix.getCols());

        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getCols(); j++) {
                product.set(i, j, escalar * matrix.get(i, j));
            }
        }

        return product;
    }

    public Matrix times(Matrix a, Matrix b) {
        if (a.getRows() != b.getRows() || a.getCols() != b.getCols()) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        Matrix product = new Matrix(a.getRows(), a.getCols());

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getCols(); j++) {
                product.set(i, j, a.get(i, j) * b.get(i, j));
            }
        }

        return product;
    }

    public Matrix dot(Matrix a, Matrix b) {
        if (a.getCols() != b.getRows()) {
            throw new IllegalArgumentException("Imcompatibles dimensions");
        }

        Matrix product = new Matrix(a.getRows(), b.getCols());

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getCols(); j++) {
                for (int k = 0; k < a.getCols(); k++) {
                    product.set(i, j, product.get(i, j) + a.get(i, k) * b.get(k, j));
                }
            }
        }

        return product;
    }

    public Matrix gauss(Matrix matrix) {
        int column = 0;
        for (int row=0; row<matrix.getRows(); row++) {
            while (matrix.get(row, column) == 0.0) {
                boolean switched = false;
                int i=row;
                while (!switched && i< matrix.getRows()) {
                    if(matrix.get(i, column) != 0.0) {
                        double[] temp = matrix.get(i);
                        matrix.set(i, matrix.get(row));
                        matrix.set(row, temp);
                        switched = true;
                    }
                    i++;
                }

                if (matrix.get(row, column) == 0.0) {
                    column++;
                }

                if (column == matrix.getCols()) {
                    return matrix;
                }
            }

            if(matrix.get(row, column) != 1.0) {
                double divisor = matrix.get(row, column);
                for (int i=column; i<matrix.get(row).length; i++) {
                    matrix.set(row, i, matrix.get(row, i)/divisor);
                }
            }

            for (int i=0; i< matrix.getRows(); i++) {
                if (i!=row && matrix.get(i, column)!=0) {
                    double multiple = 0-matrix.get(i, column);
                    for (int j=column; j<matrix.get(row).length; j++) {
                        matrix.set(i, j, matrix.get(i, j) + multiple*matrix.get(row, j));
                    }
                }
            }

            column++;
        }

        return matrix;
    }

    public Matrix solve(Matrix matrix) {
        Matrix gauss = gauss(matrix);
        int resultColumn = matrix.getCols() - 1;
        Matrix result = new Matrix(resultColumn, 1);

        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < resultColumn; j++) {
                if (gauss.get(i, j) == 1.0) {
                    result.set(j, 0, gauss.get(i, resultColumn));
                }
            }
        }

        return result;
    }
}
