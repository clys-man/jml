package me.clysman.jml.Linear;

import me.clysman.jml.TestCase;

import java.util.Arrays;

public class LinearAlgebraTest extends TestCase {
    public void testIfCanTransposeMatrix() {
        double [][] elements = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix matrix = new Matrix(elements);
        LinearAlgebra la = new LinearAlgebra();
        Matrix transposedMatrix = la.transpose(matrix);

        double [][] transposedElements = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        assertEquals(transposedElements, transposedMatrix.getElements());
    }

    public void testIfCanSumMatrix() {
        double [][] elementsA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double [][] elementsB = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double [][] elementsC = {
                {2.0, 4.0, 6.0},
                {8.0, 10.0, 12.0},
                {14.0, 16.0, 18.0}
        };

        Matrix a = new Matrix(elementsA);
        Matrix b = new Matrix(elementsB);
        LinearAlgebra la = new LinearAlgebra();

        Matrix c = la.sum(a, b);

        assertEquals(elementsC, c.getElements());
    }

    public void testIfCanTimesMatrix() {
        double [][] elementsA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double [][] elementsB = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double [][] elementsC = {
                {1.0, 4.0, 9.0},
                {16.0, 25.0, 36.0},
                {49.0, 64.0, 81.0}
        };

        Matrix a = new Matrix(elementsA);
        Matrix b = new Matrix(elementsB);
        LinearAlgebra la = new LinearAlgebra();

        Matrix c = la.times(a, b);

        assertEquals(elementsC, c.getElements());
    }

    public void testIfCanTimesMatrixByEscalar() {
        double [][] elementsA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double [][] elementsC = {
                {2.0, 4.0, 6.0},
                {8.0, 10.0, 12.0},
                {14.0, 16.0, 18.0}
        };

        Matrix a = new Matrix(elementsA);
        LinearAlgebra la = new LinearAlgebra();

        Matrix c = la.times(a, 2);

        assertEquals(elementsC, c.getElements());
    }

    public void testIfCanDotMatrix() {
        double [][] elementsA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double [][] elementsB = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double [][] elementsC = {
                {30.0, 36.0, 42.0},
                {66.0, 81.0, 96.0},
                {102.0, 126.0, 150.0}
        };

        Matrix a = new Matrix(elementsA);
        Matrix b = new Matrix(elementsB);
        LinearAlgebra la = new LinearAlgebra();

        Matrix c = la.dot(a, b);

        assertEquals(elementsC, c.getElements());
    }

    public void testIfGaussMatrix() {
        double [][] elementsA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double [][] elementsC = {
                {1.0, 0.0, -1.0},
                {0.0, 1.0, 2.0},
                {0.0, 0.0, 0.0}
        };

        Matrix a = new Matrix(elementsA);
        LinearAlgebra la = new LinearAlgebra();
        Matrix c = la.gauss(a);

        assertEquals(elementsC, c.getElements());
    }
}
