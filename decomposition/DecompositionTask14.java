package decomposition;

import java.util.Scanner;

public class DecompositionTask14 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число k");
        int k = sc.nextInt();
        findArmstrongNumber(k);
    }

    private double calculateArmstrongNumber(int number){
        int sum = 0;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++){
            sum += Math.pow(Character.getNumericValue(str.charAt(i)), str.length());
        }
        return sum;
    }

    private void findArmstrongNumber(int k){
        for (int i = 1; i <= k; i++){
            if (calculateArmstrongNumber(i) == i){
                System.out.print(i + " ");
            }
        }
    }
}
