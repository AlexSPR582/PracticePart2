package decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class DecompositionTask10 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.println(Arrays.toString(getArrayOfNumber(number)));
    }

    private int[] getArrayOfNumber(int number){
        String str = Integer.toString(number);
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++){
            array[i] = Character.getNumericValue(str.charAt(i));
        }
        return array;
    }
}
