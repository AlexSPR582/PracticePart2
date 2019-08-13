package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTask8 {
    public void getResult() throws IOException {
        Matrix mx = new Matrix();
        Integer[][] matrix = mx.matrix;
        mx.getRandomIntMatrix(10, matrix);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер первого столбца от 1 до " + Matrix.getColumns(matrix));
        int firstColumn = Integer.parseInt(br.readLine()) - 1;
        System.out.println("Введите номер второго столбца от 1 до " + Matrix.getColumns(matrix));
        int secondColumn = Integer.parseInt(br.readLine()) - 1;
        System.out.println("исходный массив:");
        Matrix.printMatrix(matrix);
        System.out.println("результат:");
        for (int i = 0; i < Matrix.getRows(matrix); i++){
            int buffer = matrix[i][firstColumn];
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = buffer;
        }
        Matrix.printMatrix(matrix);
    }
}
