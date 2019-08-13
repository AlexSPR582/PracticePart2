package matrices;

import java.io.IOException;

public class MatrixTask15 {
    public void getResult() throws IOException {
        Matrix mx = new Matrix();
        Integer[][] matrix = mx.matrix;
        mx.getRandomIntMatrix(20, matrix);
        System.out.println("Исходная матрица:");
        Matrix.printMatrix(matrix);
        int max = findMax(matrix);
        System.out.println("Максимальный элемент: " + max);
        for (int i = 0; i < Matrix.getRows(matrix); i++){
            for (int j = 0; j < Matrix.getColumns(matrix); j++){
                if (matrix[i][j] % 2 != 0){
                    matrix[i][j] = max;
                }
            }
        }
        System.out.println("Результат:");
        Matrix.printMatrix(matrix);
    }

    private static int findMax(Integer[][] matrix){
        int max = matrix[0][0];
        for (int i = 0; i < Matrix.getRows(matrix); i++){
            for (int j = 0; j < Matrix.getColumns(matrix); j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
