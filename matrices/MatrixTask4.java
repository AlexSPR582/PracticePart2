package matrices;

import java.util.Scanner;

public class MatrixTask4 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        Integer[][] numbers = new Integer[n][n];
        for (int i = 0; i < numbers.length; i++){
            if (i % 2 == 0){
                for (int j = 0; j < numbers.length; j++){
                    numbers[i][j] = j + 1;
                }
            }
            else {
                for (int j = 0; j < numbers.length; j++){
                    numbers[i][j] = numbers.length - j;
                }
            }
        }
        Matrix.printMatrix(numbers);
    }
}
