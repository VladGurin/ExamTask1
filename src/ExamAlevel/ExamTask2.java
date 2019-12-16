package ExamAlevel;

import java.util.Scanner;

public class ExamTask2 { //Даны точки A,B,C на плоскости. Вычислить площадь треугольника ABC.
    public static void main(String[] args) {

       // int x1, x2, x3, y1, y2, y3;
        double square;
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int y3 = scanner.nextInt();

        square = (1/2) * (((x1-x3)*(y2-y3))- ((x2-x3)*(y2-y3)));
        if (square < 0)
            square = - square;
        System.out.println("Square of trangle equels: " + square);


    }
}
