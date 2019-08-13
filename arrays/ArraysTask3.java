package arrays;
import java.util.Scanner;

public class ArraysTask3 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int size = sc.nextInt();
        int plus = 0;
        int negative = 0;
        int zero = 0;
        double[] numbers = new double[size];
        System.out.println("Введите массив");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextDouble();
            if (numbers[i] > 0){
                plus += 1;
            }
            else if (numbers[i] < 0){
                negative += 1;
            }
            else if (numbers[i] == 0) {
                zero += 1;
            }
        }
        System.out.println("количество положительных чисел: " + plus);
        System.out.println("количество отрицательных чисел: " + negative);
        System.out.println("количество нулевых чисел: " + zero);

    }
}
