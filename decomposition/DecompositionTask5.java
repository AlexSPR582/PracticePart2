package decomposition;

import arraysSorting.Array;

import java.io.IOException;

public class DecompositionTask5 {
    public void getResult() throws IOException {
        Array arr = new Array();
        Integer[] array = arr.array;
        Array.setRandomElements(array, 30);
        Array.printArray(array);
        System.out.println("Второе по величине число равно: " + findSecondMax(array));
    }

    private int findMax(Integer[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    private int findSecondMax(Integer[] array){
        int max = findMax(array);
        int secondMax = max;
        for (int i = 0; i < array.length; i++){
            if (array[i] < max){
                secondMax = array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > secondMax & array[i] < max){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

}
