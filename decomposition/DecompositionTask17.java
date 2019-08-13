package decomposition;

import java.util.Scanner;

public class DecompositionTask17 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        System.out.println(findResult(number));

    }

    private int sumNumber(int number){
        int sum = 0;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++){
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }

    private int findResult(int number){
        int operations = 0;
        while (number > 0){
            number -= sumNumber(number);
            operations += 1;
        }
        return operations;
    }
}
