package me.clysman.jml.Linear;

public class Matrix {
    private final int rows;

    private final int cols;

    private final double[][] elements;

    public Matrix(double[][] elements) {
        this.rows = elements.length;
        this.cols = elements[0].length;
        this.elements = elements;
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.elements = new double[rows][cols];
    }

    public Matrix(int rows, int cols, double[][] elements) {
        this.rows = rows;
        this.cols = cols;
        this.elements = elements;
    }

    public double get(int rows, int cols) {
        return elements[rows][cols];
    }

    public double[] get(int rows) {
        return elements[rows];
    }

    public void set(int rows, int cols, double value) {
        elements[rows][cols] = value;
    }

    public void set(int rows, double[] value) {
        elements[rows]=value;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public double[][] getElements() {
        return elements;
    }

    public String toString() {
        StringBuilder text = new StringBuilder();

        text.append("____".repeat(Math.max(0, cols)));
        text.append("\n");

        for (double[] matrix : elements) {
            for (double v : matrix) {
                text.append(v).append("|");
            }
            text.append("\n");
        }

        text.append("____".repeat(Math.max(0, cols)));
        text.append("\n");

        return text.toString();
    }
}
