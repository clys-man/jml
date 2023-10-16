package me.clysman.jml.Linear;

import java.util.Arrays;

public class Vector extends Matrix {
    public Vector(int cols) {
        super(1, cols);
    }

    public Vector(double[] elements) {
        super(1, elements.length);
        set(0, elements);
    }

    public Vector(int dim, double[] elements) {
        super(1, dim);
        set(0, elements);
    }

    public double[] get(int cols) {
        return super.get(0);
    }

    public void set(int cols, double value) {
        super.set(0, cols, value);
    }

    public void setElements(double[] elements) {
        super.set(0, elements);
    }

    public String toString() {
        StringBuilder text = new StringBuilder();

        text.append("____".repeat(Math.max(0, getCols())));
        text.append("\n");

        for (double[] v : getElements()) {
            String str = Arrays.toString(v);
            text.append(str, 1, str.length() - 1).append("|");
        }
        text.append("\n");

        text.append("____".repeat(Math.max(0, getCols())));
        text.append("\n");

        return text.toString();
    }
}
