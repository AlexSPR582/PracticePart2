package decomposition;

import java.util.Scanner;

public class DecompositionTask16 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        int sum = findSumOddNumbers(n);
        System.out.println("Сумма: " + sum);
        System.out.println("Количество нечётных цифр в сумме " + countOddNumbersInSum(sum));
    }

    private boolean checkOddNumber(int number){
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++){
            if (Character.getNumericValue(str.charAt(i)) % 2 == 0){
                return false;
            }
        }
        return true;
    }

    private int findSumOddNumbers(int n){
        int sum = 0;
        for (int i = pow(10, n - 1); i < pow(10, n); i++){
            if (checkOddNumber(i)){
                sum += i;
            }
        }
        return sum;
    }

    private int pow(int number, int n){
        int result = 1;
        while (n > 0){
            result *= number;
            n = n - 1;
        }
        return result;
    }

    private int countOddNumbersInSum(int number){
        int count = 0;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++){
            if (Character.getNumericValue(str.charAt(i)) % 2 != 0){
                count += 1;
            }
        }
        return count;
    }
}
