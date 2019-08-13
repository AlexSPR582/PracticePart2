package matrices;

import java.io.IOException;

import static matrices.Matrix.getColumns;
import static matrices.Matrix.getRows;

public class MatrixTask11 {
    public void getResult() throws IOException {
        Matrix mx = new Matrix(10, 20);
        Integer[][] matrix = mx.matrix;
        mx.getRandomIntMatrix(16, matrix);
        Matrix.printMatrix(matrix);
        int fiveRepeat = 0;
        System.out.println("Номера строк где число 5 встречается 3 более раз:");
        for (int i = 0; i < getRows(matrix); i++){
            for (int j = 0; j < getColumns(matrix); j++){
                if (matrix[i][j] == 5){
                    fiveRepeat += 1;
                }

            }
            if (fiveRepeat >= 3){
                int row = i + 1;
                System.out.print(row + " ");
            }
        }
    }
}
