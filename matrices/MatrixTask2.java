package matrices;

public class MatrixTask2 {
    public void getResult(){
        Integer[][] numbers = Matrix.setIntMatrix();
        int rows = Matrix.getRows(numbers);
        for (int i = 0; i < rows; i++){
            System.out.print(numbers[i][i] + " ");
        }
        System.out.print("\n");
        int columns = 0;
        for (int i = rows - 1; i >= 0; i--){
            System.out.print(numbers[i][columns] + " ");
            columns += 1;
        }
    }
}
