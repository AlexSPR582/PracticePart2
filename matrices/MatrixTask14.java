package matrices;

import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MatrixTask14 {
    public void getResult() throws IOException {
        System.out.println("Количество строк должно быть больше или равно количеству столбцов");
        Matrix mx = new Matrix();
        Integer[][] matrix = mx.matrix;
        if (Matrix.getRows(matrix) < Matrix.getColumns(matrix)){
            System.out.println("Вы ввели некорректные входные данные. Попробуйте снова");
            System.exit(0);
        }
        Set<Integer> randomIndex = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < Matrix.getRows(matrix); i++){
            for (int j = 0; j < Matrix.getColumns(matrix); j++){
                matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < Matrix.getColumns(matrix); i++){
            while (randomIndex.size() < i + 1){
                int index = random.nextInt(Matrix.getRows(matrix));
                if (randomIndex.contains(index) == false){
                    randomIndex.add(index);
                    matrix[index][i] = 1;
                }
            }
            randomIndex.clear();
        }
        Matrix.printMatrix(matrix);
    }
}
