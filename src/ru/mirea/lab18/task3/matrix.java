package ru.mirea.lab18.task3;

import ru.mirea.lab18.task2.calculator;


public class matrix<N extends Number> {
    private N[][] nMatrix;
    private int lengthy;
    private int lengthx;
    public matrix(N[][] nMatrix) {
        this.nMatrix = nMatrix;
        lengthy = nMatrix.length;
        if (lengthy > 0)
            lengthx = nMatrix[0].length;
    }
    public void sum(matrix matrix0, matrix matrixr) {
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                matrixr.nMatrix[i][j] = calculator.sum(matrix0.nMatrix[i][j], nMatrix[i][j]);
            }
        }
    }
    public void subtraction(matrix matrix0, matrix matrixr) {
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                matrixr.nMatrix[i][j] = calculator.subtraction(nMatrix[i][j], matrix0.nMatrix[i][j]);
            }
        }
    }
    public N det() {
        return calculator.subtraction(calculator.multiply(nMatrix[0][0],nMatrix[1][1]),
                calculator.multiply(nMatrix[0][1],nMatrix[1][0]));
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                result += nMatrix[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
