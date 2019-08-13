package arraysSorting;

public class InsertionSort {
    public Integer[] insertionSorting(Integer[] array){
        for (int i = 1; i < array.length; i++){
            int j = i - 1;
            int value = array[i];
            while (j >= 0 && array[j] > value){
                array[j + 1] = array[j];
                //array[j] = value;
                j = j - 1;
            }
            array[j + 1] = value;
        }
        return array;
    }
}
