package decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class DecompositionTask12 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа K и N");
        int k = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Arrays.toString(createResultArray(k, n)));
    }


    private int sumOfNumbers(int number){
        int sum = 0;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++){
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }

    private int[] createResultArray(int k, int n){
        int[] result = new int[0];
        for (int i = 1; i < n; i++){
            if (sumOfNumbers(i) == k){
                result = addElement(result, i);
            }
        }
        return result;
    }

    private int[] addElement(int[] array, int element){
        int size = array.length + 1;
        int[] newArray = Arrays.copyOf(array, size);
        newArray[size - 1] = element;
        return newArray;
    }

}
