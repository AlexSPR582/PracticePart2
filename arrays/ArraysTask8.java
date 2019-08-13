package arrays;
import java.util.Scanner;

public class ArraysTask8 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введите массив");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        int sizeResultArray = size - repeatNumber(findMin(numbers), numbers);
        int[] resultArray = new int[sizeResultArray];
        int index = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != findMin(numbers)){
                resultArray[index] = numbers[i];
                index += 1;
            }
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n" + findMin(numbers));

        for (int i = 0; i < resultArray.length; i++){
            System.out.print(resultArray[i] + " ");
        }

    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


    private static int repeatNumber(int n, int[] array){
        int repeat = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] == n){
                repeat += 1;
            }
        }
        return repeat;
    }
}
