package matrices;

import java.io.IOException;

public class MatrixTask13 {
    public void getResult() throws IOException {
        Matrix mx = new Matrix();
        Integer[][] matrix = mx.matrix;
        mx.getRandomIntMatrix(10, matrix);
        System.out.println("Исходная матрица:");
        Matrix.printMatrix(matrix);
        Integer[] numbers = new Integer[Matrix.getRows(matrix)];
        for (int i = 0; i < Matrix.getColumns(matrix); i++){
            for (int j = 0; j < Matrix.getRows(matrix); j++){
                numbers[j] = matrix[j][i];
            }
            numbers = MatrixTask12.sortAscending(numbers);
            for (int j = 0; j < Matrix.getRows(matrix); j++){
                matrix[j][i] = numbers[j];
            }
        }
        System.out.println("Значения элементов столбцов отсортированные по возрастанию:");
        Matrix.printMatrix(matrix);
        for (int i = 0; i < Matrix.getColumns(matrix); i++){
            for (int j = 0; j < Matrix.getRows(matrix); j++){
                numbers[j] = matrix[j][i];
            }
            numbers = MatrixTask12.descendingSorting(numbers);
            for (int j = 0; j < Matrix.getRows(matrix); j++){
                matrix[j][i] = numbers[j];
            }
        }
        System.out.println("Значения элементов столбцов отсортированные по убыванию:");
        Matrix.printMatrix(matrix);
    }
}
