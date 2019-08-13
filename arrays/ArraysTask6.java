package arrays;

import java.util.Scanner;

public class ArraysTask6 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = sc.nextInt();
        double[] numbers = new double[size];
        System.out.println("Введите массив");
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextDouble();
            if (checkSimpleNumber(i)){
                sum += numbers[i];
            }
        }
        System.out.print(sum);
    }

    private boolean checkSimpleNumber(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
