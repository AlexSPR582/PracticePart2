package arrays;
import java.util.Scanner;

public class ArraysTask7 {
    public void getResult(){
        double[] numbers = getArray();
        double[] resultArray = new double[numbers.length / 2];
        for (int i = 0; i < resultArray.length; i++){
            resultArray[i] = numbers[i] + numbers[numbers.length - i - 1];
        }
        for (int i = 0; i < resultArray.length; i++){
            System.out.print(resultArray[i] + " ");
        }
        System.out.println("\n" + findMax(resultArray));
    }





    private static double[] getArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n");
        int n = sc.nextInt();
        double[] numbers = new double[2 * n];
        System.out.println("Введите массив");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextDouble();
        }
        return numbers;
    }


    private static double findMax(double[] array){
        double max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
