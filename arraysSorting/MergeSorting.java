package arraysSorting;

public class MergeSorting {
    public Integer[] merge(Integer[] left, Integer[] right){
        int size = left.length + right.length;
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        Integer[] result = new Integer[size];
        while(leftIndex < left.length & rightIndex < right.length){
            if (left[leftIndex] <= right[rightIndex]){
                result[resultIndex] = left[leftIndex];
                leftIndex += 1;
                resultIndex += 1;
            }
            else if (right[rightIndex] <= left[leftIndex]){
                result[resultIndex] = right[rightIndex];
                rightIndex += 1;
                resultIndex += 1;
            }
        }
        if (rightIndex < right.length){
            for (int i = resultIndex; i < size; i++){
                result[i] = right[rightIndex];
                rightIndex += 1;
            }
        }
        else if (leftIndex < left.length){
            for (int i = resultIndex; i < size; i++){
                result[i] = left[leftIndex];
                leftIndex += 1;
            }
        }
        return result;
    }

    public Integer[] mergeSort(Integer[] array){
        if (array.length <= 1){
            return array;
        }
        int index = 0;
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        Integer[] left = new Integer[leftSize];
        Integer[] right = new Integer[rightSize];
        for (int i = 0; i < leftSize; i++){
            left[i] = array[i];
            index += 1;
        }
        for (int i = 0; i < rightSize; i++){
            right[i] = array[index];
            index += 1;
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }
}
