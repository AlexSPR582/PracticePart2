package decomposition;

import java.util.Scanner;

public class DecompositionTask3 {
    public static double findHeight(double side, double angle){
        double height = side * Math.cos(Math.toRadians(angle));
        return height;
    }

    public static double findBase(double side, double angle){
        double height = findHeight(side, angle);
        double base = 2 * (Math.sqrt(Math.pow(side, 2) - Math.pow(height, 2)));
        return base;
    }

    public double findTriangleArea(double height, double base){
        double area = 0.5 * height * base;
        return area;
    }

    public double findRegularPolygonArea(double side){
        double polygonArea = 3 * findTriangleArea(findHeight(side, 60), findBase(side, 60)) + findTriangleArea(findHeight(findBase(side, 60), 30), findBase(side, 60));
        return polygonArea;
    }

    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну стороны а");
        double side = sc.nextDouble();
        System.out.println("Площадь правильного шестиугольника равна: " + findRegularPolygonArea(side));
    }
}
