package ca.bcit.comp1510.lab12;

public class Matrix {
    
    private int[][] array;
    
    public Matrix(int rows, int columns) {
        array = new int[rows][columns];
    }
    
    public int getRows() {
        return array.length;
    }
    
    public int getColumns() {
        return array[0].length;
    }
    
    public int getValue(int row, int column) {
        return array[row][column];
    }
    
    public void setValue(int newValue, int row, int column) {
        array[row][column] = newValue;
    }
    
    public String toString() {
        String str = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                str += array[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
    
    public Matrix add(Matrix matrix) {
        Matrix newMatrix = new Matrix(this.array.length, this.array[0].length);
        for (int i = 0; i < this.array.length; i++) {
            if (this.array.length != matrix.array.length || this.array[i].length != matrix.array[i].length) {
                throw new IllegalArgumentException("Cannot add these matrices");
            }
            for (int j = 0; j < array[i].length; j++) {
                newMatrix.array[i][j] = this.array[i][j] + matrix.array[i][j];
            }
        }
        return newMatrix;
    }
    
    public Matrix multiply(Matrix matrix) {
        Matrix newMatrix = new Matrix(this.array.length, matrix.array[0].length);
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].length != matrix.array.length) {
                throw new IllegalArgumentException("Cannot multiply these matrices");
            }
            for (int j = 0; j < matrix.array[i].length; j++) {
                for (int k = 0; k < this.array.length; k++) {
                    newMatrix.array[i][j] += this.array[i][k] * matrix.array[k][j];
                }
            }
        }
        return newMatrix;
    }

}
