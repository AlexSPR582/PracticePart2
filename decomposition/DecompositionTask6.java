package decomposition;

import java.util.Scanner;

public class DecompositionTask6 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int nod = findNod(a, b, c);
        if (nod > 1){
            System.out.println("Эти числа не являются взаимно простыми");
        }
        else {
            System.out.println("Данные числа являются взаимопростыми");
        }

    }

    public int findNod(int a, int b, int c){
        int nod = 1;
        for (int i = 2; i <= a; i++){
            if (a % i == 0 & b % i == 0 & c % i == 0){
                nod = i;
            }
        }
        return nod;
    }




}
