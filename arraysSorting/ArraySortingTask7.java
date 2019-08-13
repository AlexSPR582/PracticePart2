package arraysSorting;

import java.io.IOException;
import java.util.Scanner;

public class ArraySortingTask7 {
    public void getResult() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность первого массива");
        int size1 = sc.nextInt();
        Integer[] arr1 = new Integer[size1];
        Array.setRandomElements(arr1);
        ArraySortingTask6.shellSort(arr1);
        Array.printArray(arr1);
        System.out.println("Введите размерность второго массива");
        int size2 = sc.nextInt();
        Integer[] arr2 = new Integer[size2];
        Array.setRandomElements(arr2);
        ArraySortingTask6.shellSort(arr2);
        Array.printArray(arr2);
        System.out.println("Результат:");
        getIndexes(arr1, arr2);
    }

    public static void getIndexes(Integer[] array1, Integer[] array2){
        int firstInd = 0;
        int secondInd = 0;
        int index = 0;
        while (firstInd < array1.length && secondInd < array2.length){
            if (array2[secondInd] <= array1[firstInd]){
                System.out.print(index + " ");
                secondInd += 1;
                index += 1;
            }
            else {
                firstInd += 1;
                index += 1;
            }
        }
        for (int i = secondInd; i < array2.length; i++){
            System.out.print(index + " ");
            index += 1;
        }
    }
}
