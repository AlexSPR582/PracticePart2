package arraysSorting;

import java.io.IOException;
import java.util.Scanner;

public class ArraySortingTask1 {
    public void getResult() throws IOException {
        Array aw1 = new Array();
        Integer[] array1 = aw1.array;
        Array.setRandomElements(array1);
        Array aw2 = new Array();
        Integer[] array2 = aw2.array;
        Array.setRandomElements(array2);
        int size = array1.length + array2.length;
        Array aw3 = new Array(size);
        Integer[] array3 = aw3.array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число K");
        int k = sc.nextInt();
        int j = 0;
        for (int i = 0; i < size; i++){
            if (i <= k){
                array3[i] = array1[i];
            }
            else if (i > k && j < array2.length){
                array3[i] = array2[j];
                j += 1;
            }
            else {
                array3[i] = array1[k + 1];
                k += 1;
            }
        }
        System.out.println("Первый массив:");
        Array.printArray(array1);
        System.out.println("Второй массив:");
        Array.printArray(array2);
        System.out.println("Результирующий массив:");
        Array.printArray(array3);




    }
}
