package arrays;

import java.util.Scanner;

public class ArraysTask10 {
    public void getResult(){
        int[] numbers = getArray();
        for (int i = 1; i < numbers.length; i++){
            numbers[i] = 0;
            i++;
        }
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] == 0){
                for (int j = i + 1; j < numbers.length; j++){
                    if (numbers[j] != 0){
                        numbers[i] = numbers[j];
                        numbers[j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }


    }

    public static int[] getArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите массив");
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
}
