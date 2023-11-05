package s1lkbeard.home;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task_1_1 {
    public static void main(String[] args) {
        System.out.println("Введите значение аргумента x. При вводе дробного значения необходимо указывать ',':");
        Scanner in = new Scanner(System.in);
        double x = in.nextFloat();

        double eq1 = getEq1(x);
        double eq2 = getEq2(x);
        double eq3 = getEq3(x);
        double eq4 = getEq4(x);
        double eq5 = getEq5(x);

        System.out.printf("При x = " + x + " значение функции f(x): %n %n");
        System.out.printf("1) (sqrt(exp(2.2 * x))) - abs(sin((PI * x)/(x + 2.0 / 3))) + 1.7 = %.3f %n %n", eq1);
        System.out.printf("2) sqrt(pow(pow(x, 4), 0.2) + pow(pow(x, (4 - x)), 0.2)) + log(abs(x - 20.5)) = %.3f %n %n", eq2);
        System.out.printf("3) (1.0 / 7 + log(sqrt(x))) * exp(sqrt(x - 2)) = %.3f %n %n", eq3);
        System.out.printf("4) (sqrt(x) * sin(pow(x, 2) / 2 )- 1.3)/(pow(x, 0.2) + exp(3 * x) + abs(cos(x))) = %.3f %n %n", eq4);
        System.out.printf("5) (sqrt(exp(abs(pow(sin(x), 3))))) + 2 * log(3 * x) - 1.0 / 9 = %.3f %n %n", eq5);
    }

    public static double getEq1(double x) {
        double res = (sqrt(exp(2.2 * x))) - abs(sin((PI * x) / (x + 2.0 / 3))) + 1.7;

        return res;
    }

    public static double getEq2(double x) {
        double res = sqrt(pow(pow(x, 4), 0.2) + pow(pow(x, (4 - x)), 0.2)) + log(abs(x - 20.5));

        return res;
    }

    public static double getEq3(double x) {
        double res = (1.0 / 7 + log(sqrt(x))) * exp(sqrt(x - 2));

        return res;
    }

    public static double getEq4(double x) {
        double res = (sqrt(x) * sin(pow(x, 2) / 2) - 1.3) / (pow(x, 0.2) + exp(3 * x) + abs(cos(x)));

        return res;
    }

    public static double getEq5(double x) {
        double res = (sqrt(exp(abs(pow(sin(x), 3))))) + 2 * log(3 * x) - 1.0 / 9;

        return res;
    }
}
