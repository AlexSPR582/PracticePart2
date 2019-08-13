package decomposition;

import java.util.Scanner;

public class DecompositionTask11 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (longerNumber(a, b) != -1){
            System.out.println("Наибольшее количество цифр в числе " + longerNumber(a, b));
        }
        else {
            System.out.println("В числах одинаковое количество цифр");
        }
    }

    private int longerNumber(int a, int b){
        String num1 = Integer.toString(a);
        String num2 = Integer.toString(b);
        if (num1.length() > num2.length()){
            return Integer.parseInt(num1);
        }
        else if(num1.length() < num2.length()) {
            return Integer.parseInt(num2);
        }
        return -1;
    }
}
