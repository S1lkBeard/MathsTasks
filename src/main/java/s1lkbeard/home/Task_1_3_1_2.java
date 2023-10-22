package s1lkbeard.home;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task_1_3_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //количество прямоугольных треугольников
        System.out.println("Укажите количество прямоугольных треугольников:");
        byte N = in.nextByte();
        //диаметр окружности = гипотенуза треугольника
        System.out.println("Укажите диаметр окружности:");
        double D = in.nextDouble();
        //радиус окружности = сторона треугольника
        double R = D / 2.0;

        System.out.println();
        for (int x = 1; x < (N + 1); x++) {
            double angle = PI / (2 * (N + 1));
            double S1 = pow(R, 2) * sin(angle * x);
            double S2 = pow(R, 2) * sin(PI - (angle * x));
            double S = S1 + S2;
            System.out.printf("Площадь " + x + "-го треугольника S = %.3f %n %n", S);
        }
    }
}
