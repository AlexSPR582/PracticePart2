package decomposition;

import java.util.Scanner;

public class DecompositionTask15 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        findIncreasingNumbers(n);
    }

    private boolean checkIncreaseNumber(int number){
        String str = Integer.toString(number);
        for (int i = 1; i < str.length(); i++){
            if (Character.getNumericValue(str.charAt(i)) <= Character.getNumericValue(str.charAt(i - 1))){
                return false;
            }
        }
        return true;
    }

    private void findIncreasingNumbers(int n){
        for (int i = pow(10, n - 1); i < pow(10, n); i++){
            if (checkIncreaseNumber(i)){
                System.out.print(i + " ");
            }
        }
    }

    private int pow(int number, int n){
        int result = 1;
        while (n > 0){
            result *= number;
            n = n - 1;
        }
        return result;
    }
}
