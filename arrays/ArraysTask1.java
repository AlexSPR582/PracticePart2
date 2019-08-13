package arrays;
import java.util.Scanner;

public class ArraysTask1 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива N");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Введите кратное число К");
        int K = sc.nextInt();
        int sum = 0;
        System.out.println("Введите элементы массива А");
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
            if (A[i] % K == 0){
                sum += A[i];
            }
        }
        System.out.print(sum);
    }
}
