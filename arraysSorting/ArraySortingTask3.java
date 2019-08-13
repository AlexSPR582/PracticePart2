package arraysSorting;

import java.io.IOException;

public class ArraySortingTask3 {
    public void getResult() throws IOException {
        Array arr = new Array();
        Integer[] array = arr.array;
        Array.setRandomElements(array);
        Array.printArray(array);
        for (int i = 0; i < array.length; i++){
            int max = array[i];
            int maxInd = i;
            for (int j = i; j < array.length; j++){
                if (array[j] > array[maxInd]){
                    max = array[j];
                    maxInd = j;
                }
            }
            int buffer = array[i];
            array[i] = array[maxInd];
            array[maxInd] = buffer;
        }
        Array.printArray(array);
    }
}
