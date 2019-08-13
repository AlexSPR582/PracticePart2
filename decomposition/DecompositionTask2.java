package decomposition;

import java.util.Scanner;

public class DecompositionTask2 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4 числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Наибольший общий делитель = " + findCommonFactor(a, b, c, d));
    }


    public static int findCommonFactor(int a, int b, int c, int d){
        int min = findMin(a, b, c, d);
        int commonFactor  = 1;
        int i = 1;
        while (i <= min){
            if (a % i == 0 & b % i == 0 & c % i == 0 & d % i == 0){
                commonFactor = i;
                i++;
            }
            else {
                i++;
            }
        }
        return commonFactor;
    }

    public static int findMin(int a, int b, int c, int d){
        int min = 0;
        if (a <= b & a <= c & a <= d){
            min = a;
        }
        else if (b <= a & b <= c & b <= d){
            min = b;
        }
        else if (c <= a & c <= b & c <= d){
            min = c;
        }
        else {
            min = d;
        }
        return min;
    }
}
