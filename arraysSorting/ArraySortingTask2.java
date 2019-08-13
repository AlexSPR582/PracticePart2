package arraysSorting;

import java.io.IOException;

public class ArraySortingTask2 {
    public void getResult() throws IOException {
        Array aw1 = new Array();
        Integer[] array1 = aw1.array;
        Array.setElements(array1);
        Array aw2 = new Array();
        Integer[] array2 = aw2.array;
        Array.setElements(array2);
        int size = array1.length + array2.length;
        Integer[] array3 = new Integer[size];
        int firstInd = 0;
        int secondInd = 0;
        int resultInd = 0;
        while (firstInd < array1.length && secondInd < array2.length){
            if (array1[firstInd] <= array2[secondInd]){
                array3[resultInd] = array1[firstInd];
                firstInd += 1;
                resultInd += 1;
            }
            else {
                array3[resultInd] = array2[secondInd];
                secondInd += 1;
                resultInd += 1;
            }
        }
        if (firstInd < array1.length){
            for (int i = resultInd; i < size; i++){
                array3[i] = array1[firstInd];
                firstInd += 1;
            }
        }
        else if (secondInd < array2.length){
            for (int i = resultInd; i < size; i++){
                array3[i] = array2[secondInd];
                secondInd += 1;
            }
        }
        Array.printArray(array3);
    }
}
