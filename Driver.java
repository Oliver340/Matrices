package ca.bcit.comp1510.lab12;

public class Driver {

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setValue(2, 0, 0);
        matrix1.setValue(3, 0, 1);
        matrix1.setValue(4, 1, 0);
        matrix1.setValue(5, 1, 1);
        
        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setValue(1, 0, 0);
        matrix2.setValue(2, 0, 1);
        matrix2.setValue(3, 1, 0);
        matrix2.setValue(4, 1, 1);
        
        System.out.println(matrix1);
        System.out.println(matrix2);
        
        Matrix addMatrix = matrix1.add(matrix2);
        System.out.println(addMatrix);
        
        Matrix errorMatrix = new Matrix(2, 3);
        errorMatrix.setValue(1, 0, 0);
        errorMatrix.setValue(2, 0, 1);
        errorMatrix.setValue(3, 0, 2);
        errorMatrix.setValue(4, 1, 0);
        errorMatrix.setValue(5, 1, 1);
        errorMatrix.setValue(6, 1, 2);
        System.out.println(errorMatrix);
        
        try {
            errorMatrix.add(matrix1);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        
        Matrix multiplyMatrix = matrix2.multiply(errorMatrix);
        System.out.println(matrix2 + "*\n" + errorMatrix + "=\n" + multiplyMatrix);
        
        try {
            errorMatrix.multiply(matrix1);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

}
