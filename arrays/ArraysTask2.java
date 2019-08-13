package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask2 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = sc.nextInt();
        System.out.println("Введите число Z");
        double z = sc.nextDouble();
        int replacement = 0;
        double[] numbers = new double[size];
        System.out.println("Введите массив");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextDouble();
            if (numbers[i] < z){
                numbers[i] = z;
                replacement += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
