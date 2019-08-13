package arraysSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public Integer[] array;

    public Array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива");
        int size = Integer.parseInt(br.readLine());
        this.array = new Integer[size];
    }

    public Array(int size){
        this.array = new Integer[size];
    }


    public static Integer[] setRandomElements(Integer[] array, int max){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(max);
        }
        return array;
    }

    public static Integer[] setRandomElements(Integer[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static Integer[] setElements(Integer[] array){
        System.out.println("Введите " + array.length + " элементов");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
}
