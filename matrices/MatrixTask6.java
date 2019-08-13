package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTask6 {
    public void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность матрицы(чётное число)");
        int size = Integer.parseInt(br.readLine());

        Integer[][] numbers = new Integer[size][size];
        for (int i = 0; i < size; i++){
            if (i < size / 2){
                for (int j = 0; j < size; j++){
                    if (j < size / 2){
                        if (j < i){
                            numbers[i][j] = 0;
                        }
                        else {
                            numbers[i][j] = 1;
                        }
                    }
                    else if (j >= size / 2){
                        if (j < size - i){
                            numbers[i][j] = 1;
                        }
                        else{
                            numbers[i][j] = 0;
                        }
                    }
                }
            }
            else if (i >= size / 2){
                for (int j = 0; j < size; j++){
                    if (j < size / 2) {
                        if (j < size - i - 1) {
                            numbers[i][j] = 0;
                        } else {
                            numbers[i][j] = 1;
                        }
                    }
                    else {
                        if (j > i){
                            numbers[i][j] = 0;

                        }
                        else {
                            numbers[i][j] = 1;
                        }
                    }
                }
            }


        }
        Matrix.printMatrix(numbers);

    }
}
