package matrices;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;

public class Matrix {

    public Integer[][] matrix;

    public Matrix() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк");
        int rows = Integer.parseInt(br.readLine());
        System.out.println("Введите количество столбцов");
        int columns = Integer.parseInt(br.readLine());
        this.matrix = new Integer[rows][columns];
    }

    public Matrix(int rows, int columns){
        this.matrix = new Integer[rows][columns];
    }

    public Matrix(int size){
        this.matrix = new Integer[size][size];
    }



    public static Integer[][] setIntMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int rows = sc.nextInt();
        System.out.println("Введите количество столбцов");
        int columns = sc.nextInt();
        Integer[][] numbers = new Integer[rows][columns];
        System.out.println("Введите матрицу");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        return numbers;
    }

    public static double[][] setDoubleMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int rows = sc.nextInt();
        System.out.println("Введите количество столбцов");
        int columns = sc.nextInt();
        double[][] numbers = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextDouble();
            }
        }
        return numbers;
    }

    public static <T> void printMatrix(T[][] matrix){
        int rows = getRows(matrix);
        int columns = getColumns(matrix);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static <T> int getRows(T[][] matrix){
        int rows = matrix.length;
        return rows;
    }

    public static <T> int getColumns(T[][] matrix){
        int columns = matrix[0].length;
        return columns;
    }


    public Integer[][] getRandomIntMatrix(int max, Integer[][] matrix){
        Random random = new Random();
        for (int i = 0; i < Matrix.getRows(matrix); i++){
            for (int j = 0; j < Matrix.getColumns(matrix); j++){
                matrix[i][j] = random.nextInt(max);
            }
        }
        return matrix;
    }

    public static Integer[][] getIntRandomSquareMatrix(int max) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите порядок матрицы");
        int size = Integer.parseInt(br.readLine());
        Integer[][] matrix = new Integer[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrix[i][j] = random.nextInt(max);
            }
        }
        return matrix;
    }

    public static Integer[][] getIntRandomSquareMatrixWithNegative(int max) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите порядок матрицы");
        int size = Integer.parseInt(br.readLine());
        Integer[][] matrix = new Integer[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                int number = random.nextInt(10);
                if (number >= 5){
                    matrix[i][j] = random.nextInt(max);
                }
                else {
                    matrix[i][j] = random.nextInt(max) * (-1);
                }
            }
        }
        return matrix;
    }
}
