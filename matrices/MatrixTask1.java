package matrices;


import java.util.Scanner;

public class MatrixTask1 {
    public void getResult(){
       Integer[][] numbers = Matrix.setIntMatrix();
        for (int i = 0; i < Matrix.getRows(numbers); i++){
            for (int j = 0; j < Matrix.getColumns(numbers); j++) {
                if (j % 2 == 0 & numbers[0][j] > numbers[numbers.length - 1][j]) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
