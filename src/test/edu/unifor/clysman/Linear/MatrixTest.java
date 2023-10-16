package edu.unifor.clysman.Linear;

import edu.unifor.clysman.TestCase;

public class MatrixTest extends TestCase {
    public void testIfCanGetValueInMatrix() {
        double [][] elements = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix a = new Matrix(elements);
        assertEquals(1.0, a.get(0, 0));
    }

    public void testIfCanSetValueInMatrix() {
        double [][] elements = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix a = new Matrix(elements);
        a.set(0, 0, 10);
        assertEquals(10.0, a.get(0, 0));
    }

    public void testIfCanGetRowsInMatrix() {
        double [][] elements = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix a = new Matrix(elements);
        assertEquals(3, a.getRows());
    }

    public void testIfCanGetColsInMatrix() {
        double [][] elements = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix a = new Matrix(elements);
        assertEquals(3, a.getCols());
    }

    public void testIfCanGetElementsInMatrix() {
        double [][] elements = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix a = new Matrix(elements);
        assertEquals(elements, a.getElements());
    }
}
