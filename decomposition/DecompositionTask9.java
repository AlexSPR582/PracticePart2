package decomposition;

import java.util.Scanner;

public class DecompositionTask9 {
    public void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну стороны X");
        double x = sc.nextDouble();
        System.out.println("Введите длинну стороны Y");
        double y = sc.nextDouble();
        System.out.println("Введите длинну стороны Z");
        double z = sc.nextDouble();
        System.out.println("Введите длинну стороны T");
        double t = sc.nextDouble();
        System.out.println("Площадь равна: " + findQuadrangleArea(x, y, z, t));
    }

    private double findHypotenuse(double side1, double side2){
        double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return hypotenuse;
    }

    private double findAreaRightTriangle(double side1, double side2){
        double area = (side1 * side2) / 2;
        return area;
    }

    private double findTriangleArea(double side1, double side2, double side3){
        double p = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }

    private double findQuadrangleArea(double x, double y, double z, double t){
        double area = findAreaRightTriangle(x, y) + findTriangleArea(z, t, findHypotenuse(x, y));
        return area;
    }
}
