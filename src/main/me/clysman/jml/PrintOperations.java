package me.clysman.jml;

import me.clysman.jml.Linear.LinearAlgebra;
import me.clysman.jml.Linear.Matrix;
import me.clysman.jml.Linear.Vector;

public class PrintOperations {
    private final LinearAlgebra linearAlgebra = new LinearAlgebra();

    public void vectorTranspose() {
        System.out.println("------------");
        System.out.println("Vector transpose");
        System.out.println("------------");

        double [] elementsA = {
                2, -4, 3
        };

        Vector vectorA =  new Vector(elementsA);
        Matrix vectorB = linearAlgebra.transpose(vectorA);

        System.out.println("Vector A");
        System.out.println(vectorA);
        System.out.println("Vector B = A^T");
        System.out.println(vectorB);
    }

    public void matrixTranspose() {
        System.out.println("------------");
        System.out.println("Matrix transpose");
        System.out.println("------------");

        double [][] elementsA = {
                {2, -4, 3},
                {6, 12, 9},
                {4, -8, 6}
        };

        Matrix matrixA =  new Matrix(elementsA);
        Matrix matrixB = linearAlgebra.transpose(matrixA);

        System.out.println("Matrix A");
        System.out.println(matrixA);
        System.out.println("Matrix B = A^T");
        System.out.println(matrixB);
    }

    public void vectorSum() {
        System.out.println("------------");
        System.out.println("Vector sum");
        System.out.println("------------");

        double [] elementsA = {
                2, -4, 3
        };

        double [] elementsB = {
                1, 2, 3
        };

        Vector vectorA =  new Vector(elementsA);
        Vector vectorB =  new Vector(elementsB);

        Matrix vectorC = linearAlgebra.sum(vectorA, vectorB);

        System.out.println("Vector A");
        System.out.println(vectorA);
        System.out.println("Vector B");
        System.out.println(vectorB);
        System.out.println("Vector C = A + B");
        System.out.println(vectorC);
    }

    public void matrixSum() {
        System.out.println("------------");
        System.out.println("Matrix sum");
        System.out.println("------------");

        double [][] elementsA = {
                {2, -4, 3},
                {6, 12, 9},
                {4, -8, 6}
        };

        double [][] elementsB = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix matrixA =  new Matrix(elementsA);
        Matrix matrixB =  new Matrix(elementsB);
        Matrix matrixC = linearAlgebra.sum(matrixA, matrixB);

        System.out.println("Matrix A");
        System.out.println(matrixA);
        System.out.println("Matrix B");
        System.out.println(matrixB);
        System.out.println("Matrix C = A + B");
        System.out.println(matrixC);
    }

    public void vectorTimes() {
        System.out.println("------------");
        System.out.println("Times vector");
        System.out.println("------------");

        double [] elementsA = {
                2, -4, 3
        };

        double [] elementsB = {
                1, 2, 3
        };

        Vector vectorA =  new Vector(elementsA);
        Vector vectorB =  new Vector(elementsB);
        Matrix vectorC = linearAlgebra.times(vectorA, vectorB);

        System.out.println("Vector A");
        System.out.println(vectorA);
        System.out.println("Vector B");
        System.out.println(vectorB);
        System.out.println("Vector C = A * B");
        System.out.println(vectorC);
    }

    public void matrixTimes() {
        System.out.println("------------");
        System.out.println("Times matrix");
        System.out.println("------------");

        double [][] elementsA = {
                {2, -4, 3},
                {6, 12, 9},
                {4, -8, 6}
        };

        double [][] elementsB = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix matrixA =  new Matrix(elementsA);
        Matrix matrixB =  new Matrix(elementsB);
        Matrix matrixC = linearAlgebra.times(matrixA, matrixB);

        System.out.println("Matrix A");
        System.out.println(matrixA);
        System.out.println("Matrix B");
        System.out.println(matrixB);
        System.out.println("Matrix C = A * B");
        System.out.println(matrixC);
    }

    public void matrixDot() {
        System.out.println("------------");
        System.out.println("Dot matrix");
        System.out.println("------------");

        double [][] elementsA = {
                {2, -4, 3},
                {6, 12, 9},
                {4, -8, 6}
        };

        double [][] elementsB = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix vectorA =  new Matrix(elementsA);
        Matrix vectorB =  new Matrix(elementsB);
        Matrix dot = linearAlgebra.dot(vectorA, vectorB);

        System.out.println("Matrix A");
        System.out.println(vectorA);
        System.out.println("Matrix B");
        System.out.println(vectorB);
        System.out.println("Dot = A . B");
        System.out.println(dot);
    }

    public void gauss() {
        System.out.println("------------");
        System.out.println("Gauss");
        System.out.println("------------");

        double [][] elementsA = {
                {2, -4, 3},
                {6, 12, 9},
                {4, -8, 6}
        };

        Matrix matrixA =  new Matrix(elementsA);
        Matrix gauss = linearAlgebra.gauss(matrixA);

        System.out.println("Matrix A");
        System.out.println(matrixA);
        System.out.println("Gauss = A");
        System.out.println(gauss);
    }

    public void solve() {
        System.out.println("------------");
        System.out.println("Solve");
        System.out.println("------------");

        double [][] elementsA = {
                {2, -4, 3},
                {6, 12, 9},
                {4, -8, 6}
        };

        Matrix matrixA =  new Matrix(elementsA);
        Matrix solve = linearAlgebra.solve(matrixA);

        System.out.println("Matrix A");
        System.out.println(matrixA);
        System.out.println("Solve = A");
        System.out.println(solve);
    }
}
