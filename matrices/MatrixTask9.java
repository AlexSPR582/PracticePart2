package matrices;

import java.io.IOException;

public class MatrixTask9 {
    public void getResult() throws IOException {
        Matrix mx = new Matrix();
        Integer[][] matrix = mx.matrix;
        mx.getRandomIntMatrix(10, matrix);
        int sumColumn = 0;
        int maxSumColumn = 0;
        int column = 0;
        System.out.println("Исходная матрица");
        Matrix.printMatrix(matrix);
        System.out.println("Сумма элементов каждого столбца");
        for (int i = 0; i < Matrix.getColumns(matrix); i++){
            for (int j = 0; j < Matrix.getRows(matrix); j++){
                sumColumn += matrix[j][i];
            }
            if (sumColumn > maxSumColumn){
                maxSumColumn = sumColumn;
                column = i + 1;
            }
            System.out.print(sumColumn + " ");
            sumColumn = 0;
        }
        System.out.println("\n" + "максимальную сумму содержит столбец № " + column);
    }
}
