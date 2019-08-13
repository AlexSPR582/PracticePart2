package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MatrixTask5 {
    public void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность матрицы");
        int size = Integer.parseInt(br.readLine());
        Integer[][] numbers = new Integer[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (j < size - i){
                    numbers[i][j] = i + 1;
                }
                else {
                    numbers[i][j] = 0;
                }
            }
        }
        Matrix.printMatrix(numbers);
    }
}
