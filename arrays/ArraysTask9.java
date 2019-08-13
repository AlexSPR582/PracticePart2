package arrays;

import java.util.Scanner;

public class ArraysTask9 {
    public void getResult(){
        int[] numbers = getArray();
        int maxRepeat = 1;
        int maxRepeatNumber = numbers[0];
        int repeat = 0;
        int repeatNumber = 0;
        for (int i = 0; i < numbers.length; i++){
            repeatNumber = numbers[i];
            repeat = 1;
            for(int j = i + 1; j < numbers.length; j++){
                if (repeatNumber == numbers[j]){
                    repeat += 1;
                }
            }
            if (repeat == maxRepeat & repeatNumber < maxRepeatNumber){
                maxRepeatNumber = repeatNumber;
                maxRepeat = repeat;
            }
            else if (repeat > maxRepeat){
                maxRepeatNumber = repeatNumber;
                maxRepeat = repeat;
            }
            repeat = 0;
        }
        System.out.println(maxRepeatNumber);
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
