package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTaks4 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = sc.nextInt();
        double[] numbers = new double[size];
        System.out.println("Введите массив");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextDouble();
        }
        double min = numbers[0];
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
                minIndex = i;
            }
        }
        double max = numbers[0];
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
                maxIndex = i;
            }
        }
        double buffer = numbers[maxIndex];
        numbers[maxIndex] = numbers[minIndex];
        numbers[minIndex] = buffer;
        System.out.println(Arrays.toString(numbers));
    }
}
