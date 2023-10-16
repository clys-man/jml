package edu.unifor.clysman;

public class Main {
    public static void main(String[] args) {
        PrintOperations printOperations = new PrintOperations();

        printOperations.vectorSum();
        printOperations.matrixSum();
        printOperations.vectorTranspose();
        printOperations.matrixTranspose();
        printOperations.vectorTimes();
        printOperations.matrixTimes();
        printOperations.matrixDot();
        printOperations.gauss();
        printOperations.solve();
    }
}