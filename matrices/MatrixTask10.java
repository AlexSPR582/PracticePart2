package matrices;

import java.io.IOException;

public class MatrixTask10 {
    public void getResult() throws IOException {
        Integer[][] matrix = Matrix.getIntRandomSquareMatrixWithNegative(10);
        System.out.println("Исходная матрица:");
        Matrix.printMatrix(matrix);
        System.out.println("Положительные элементы главной диагонали:");
        for (int i = 0; i < Matrix.getRows(matrix); i++){
            if (matrix[i][i] >= 0){
                System.out.print(matrix[i][i] + " ");
            }
        }
    }
}
