package arraysSorting;

import java.util.Random;
import java.util.Scanner;

public class ArraySortingTask8 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество дробей:");
        int size = sc.nextInt();
        Integer[] numerators = new Integer[size];
        Integer[] denominators = new Integer[size];
        Array.setRandomElements(numerators);
        setElements(denominators);
        for (int i = 0; i < size; i++){
            System.out.print(numerators[i] + "/" + denominators[i] + " ");
        }
        System.out.print("\n");
        int commonDenominator = findCommonDenominator(denominators);
        System.out.println("Общий знаменатель: " + commonDenominator);
        for (int i = 0; i < size; i++){
            numerators[i] = numerators[i] * (commonDenominator / denominators[i]);
        }
        sort(numerators);
        System.out.println("Резултат:");
        for (int i = 0; i < size; i++){
            System.out.print(numerators[i] + "/" + commonDenominator + " ");
        }
    }

    private static int findMax(Integer[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    private static int findCommonDenominator(Integer[] array){
        int i = 0;
        int max = findMax(array);
        int commonDenominator = max;
        while (i < array.length){
            if (commonDenominator % array[i] != 0){
                commonDenominator += max;
                i = 0;
            }
            else {
                i++;
            }
        }
        return commonDenominator;
    }

    private static Integer[] setElements(Integer[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            int number = random.nextInt(10);
            if (number == 0){
                while (number == 0){
                    number = random.nextInt(10);
                }
                array[i] = number;
            }
            else {
                array[i] = number;
            }
        }
        return array;
    }

    private static Integer[] sort(Integer[] array){
        for (int i = 1; i < array.length; i++){
            int j = i - 1;
            int value = array[i];
            while (j >= 0 && array[j] > value){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = value;
        }
        return array;
    }
}
