package decomposition;

import java.util.Scanner;

public class DecompositionTask4 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество точек");
        int numPoints = sc.nextInt();
        double[][] points = new double[numPoints][2];
        System.out.println("Введите координаты точек (x y):");
        getPoints(points);
        findFurtherPoints(points);
    }

    private static double[][] getPoints(double[][] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i][0] = sc.nextDouble();
            array[i][1] = sc.nextDouble();
        }
        return array;
    }

    private static double pointDistance(double x1, double y1, double x2, double y2){
        double dist = Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
        return dist;
    }

    private static void findFurtherPoints(double[][] points){
        double maxDist = findMaxDistance(points);
        for (int i = 0; i < points.length - 1; i++){
            for(int j = i + 1; j < points.length; j++){
                double dist = pointDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (dist == maxDist){
                    System.out.println(points[i][0] + " " + points[i][1]);
                    System.out.println(points[j][0] + " " + points[j][1] + "\n");
                }
            }
        }
    }

    private static double findMaxDistance(double[][] points){
        double maxDist = 0;
        for (int i = 0; i < points.length - 1; i++){
            for (int j = 1; j < points.length; j++){
                double dist = pointDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (dist > maxDist){
                    maxDist = dist;
                }
            }
        }
        return maxDist;
    }
}
