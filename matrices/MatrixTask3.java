package matrices;

import java.util.Scanner;

public class MatrixTask3 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        Integer[][] numbers = Matrix.setIntMatrix();
        System.out.println("Введите номер строки");
        int k = sc.nextInt() - 1;
        System.out.println("Введите номер столбца");
        int p = sc.nextInt() - 1;
        for(int i = 0; i < Matrix.getRows(numbers); i++){
            System.out.print(numbers[k][i] + " ") ;
        }
        System.out.print("\n");
        for (int i = 0; i < Matrix.getColumns(numbers); i++){
            System.out.print(numbers[i][p] + " ");
        }
    }
}
