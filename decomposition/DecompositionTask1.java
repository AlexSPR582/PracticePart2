package decomposition;

import java.util.Scanner;

public class DecompositionTask1 {
    public static int findNod(int a, int b){
        int nod = 0;
        if (a <= b){
            nod = a;
        }
        else {
            nod = b;
        }
        while (nod > 0){
            if (a % nod == 0 && b % nod == 0){
                break;
            }
            else {
                nod = nod - 1;
            }
        }
        return nod;
    }

    public static int findNok(int a, int b){
        int nok = (a * b) / findNod(a, b);
        return nok;
    }

    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        System.out.println("Результат:");
        System.out.println("НОД(a, b) = " + findNod(a, b));
        System.out.println("НОК(a, b) = " + findNok(a, b));
    }
}
