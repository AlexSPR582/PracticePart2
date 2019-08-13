package arrays;

import java.util.Scanner;

public class ArraysTask5 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = sc.nextInt();
        double[] numbers = new double[size];
        System.out.println("Введите массив");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextDouble();
            if (numbers[i] > i){
                System.out.print(numbers[i] + " ");
            }
        }

    }
}
