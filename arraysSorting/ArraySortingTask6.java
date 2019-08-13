package arraysSorting;

import java.io.IOException;

public class ArraySortingTask6 {
    public void getResult() throws IOException {
        Array arr = new Array();
        Integer[] array = arr.array;
        Array.setRandomElements(array);
        System.out.println("Исходный массив:");
        Array.printArray(array);
        System.out.println("Результат:");
        Array.printArray(shellSort(array));
    }

    public static Integer[] shellSort(Integer[] array){
        int i = 0;
        while (i < array.length - 1){
            if (array[i] <= array[i + 1]){
                i++;
            }
            else if (array[i] > array[i + 1] && i > 0){
                int buffer = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buffer;
                i--;
            }
            else {
                int buffer = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buffer;
            }
        }
        return array;
    }
}
