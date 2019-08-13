package arraysSorting;

public class QuickSort {
    public Integer[] quickSorting(Integer[] array){
        if (array.length <= 1){
            return array;
        }
        int pivot = array[0];
        int leftSize = count(pivot, array);
        int rightSize = array.length - leftSize - 1;
        int leftInd = 0;
        int rightInd = 0;
        Integer[] left = new Integer[leftSize];
        Integer[] right = new Integer[rightSize];
        for (int i = 1; i < array.length; i++){
            if (array[i] < pivot){
                left[leftInd] = array[i];
                leftInd += 1;
            }
            else {
                right[rightInd] = array[i];
                rightInd += 1;
            }
        }

        Integer[] result = merge(quickSorting(left), quickSorting(right), pivot);
        return result;
    }


    public static int count(int number, Integer[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < number){
                count += 1;
            }
        }
        return count;
    }

    public static Integer[] merge(Integer[] left, Integer[] right, int pivot){
        int size = left.length + right.length + 1;
        Integer[] result = new Integer[size];
        int index = 0;
        for (int i = 0; i < left.length; i++){
            result[index] = left[i];
            index += 1;
        }
        result[index] = pivot;
        index += 1;
        for (int i = 0; i < right.length; i++){
            result[index] = right[i];
            index += 1;
        }
        return result;
    }
}
