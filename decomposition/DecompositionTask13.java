package decomposition;

import java.util.Scanner;

public class DecompositionTask13 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n");
        int n = sc.nextInt();
        findTwinsNumbers(n);


    }

    private boolean checkSimpleNumber(int number){
        for (int i = 2; i < number / 2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    private void findTwinsNumbers(int n){
        for (int i = n; i <= 2 * n - 2; i++){
            if (checkSimpleNumber(i) && checkSimpleNumber(i + 2)){
                System.out.println(i + " " + (i + 2));
            }
        }

    }


}
