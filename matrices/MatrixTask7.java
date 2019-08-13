package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTask7 {
    public void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите порядок матрицы");
        final int size = Integer.parseInt(br.readLine());
        Double[][] numbers = new Double[size][size];
        int plusElements = 0;
        double row = 0;
        double column = 0;
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                numbers[i][j] = Math.sin((row * row - column * column) / (double) size);
                column += 1;
                if (numbers[i][j] >= 0){
                    plusElements += 1;
                }
            }
            row += 1;
            column = 0;
        }
        Matrix.printMatrix(numbers);
        System.out.println("\n" + "количество положительных элементов: " + plusElements);

    }
}
