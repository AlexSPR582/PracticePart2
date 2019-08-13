package decomposition;

public class DecompositionTask7 {
    public void getResult(){
        System.out.println(sumFactorial());
    }

    private int findFactorial(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    private int sumFactorial(){
        int sum = 0;
        for (int i = 1; i < 10; i++){
            if (i % 2 != 0){
                sum += findFactorial(i);
            }
        }
        return sum;
    }


}
