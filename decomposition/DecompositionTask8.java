package decomposition;

import java.util.Random;
import java.util.Scanner;
import arraysSorting.Array;

public class DecompositionTask8 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        int size = sc.nextInt();
        Integer[] array = new Integer[size];
        setElements(array);
        Array.printArray(array);
        System.out.println("Введите числа k");
        int k = sc.nextInt();
        int m = k + 2;
        System.out.println("Результат: " + sum(array, k, m));


    }

    private int sum(Integer[] array, int k, int m){
        int sum = 0;
        for (int i = k; i <= m; i++){
            sum += array[i];
        }
        return sum;
    }

    private Integer[] setElements(Integer[] array){
        Random rd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(20);
        }
        return array;
    }
}
