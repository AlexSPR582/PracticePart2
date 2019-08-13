package matrices;

import java.io.IOException;

public class MatrixTask12 {
    public void getResult() throws IOException {
        Matrix mx = new Matrix();
        Integer[][] matrix = mx.matrix;
        mx.getRandomIntMatrix(10, matrix);
        System.out.println("Исходная матрица:");
        Matrix.printMatrix(matrix);
        for (int i = 0; i < Matrix.getRows(matrix); i++){
            matrix[i] = sortAscending(matrix[i]);
        }
        System.out.println("Значения элементов строк отсортированные по возрастанию:");
        Matrix.printMatrix(matrix);
        for (int i = 0; i < Matrix.getRows(matrix); i++){
            matrix[i] = descendingSorting(matrix[i]);
        }
        System.out.println("Значения элементов строк отсортированные по убыванию:");
        Matrix.printMatrix(matrix);
    }


    public static Integer[] sortAscending(Integer[] numbers){
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] > numbers[j]){
                    int buffer = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = buffer;
                }
            }
        }
        return numbers;
    }

    public static Integer[] descendingSorting(Integer[] numbers){
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] < numbers[j]){
                    int buffer = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = buffer;
                }
            }
        }
        return numbers;
    }
}
