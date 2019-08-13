package arraysSorting;

import java.io.IOException;

public class ArraySortingTask4 {
    public void getResult() throws IOException {
        Array arr = new Array();
        Integer[] array = arr.array;
        Array.setRandomElements(array);
        System.out.println("Исходный массив:");
        Array.printArray(array);
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                }
            }
        }
        System.out.println("Результат:");
        Array.printArray(array);

    }
}
