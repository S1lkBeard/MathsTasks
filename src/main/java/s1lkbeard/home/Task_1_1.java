package s1lkbeard.home;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task_1_1
{
    public static void main(String[] args )
    {
        System.out.println("Введите значение аргумента x. При вводе дробного значения необходимо указывать ',':");
        Scanner in = new Scanner(System.in);
        double x = in.nextFloat();

        double eq1 = (sqrt(exp(2.2 * x))) - abs(sin((PI * x)/(x + 2.0 / 3))) + 1.7;
        double eq2 = sqrt(pow(pow(x, 4), 0.2) + pow(pow(x, (4 - x)), 0.2)) + log(abs(x - 20.5));
        double eq3 = (1.0 / 7 + log(sqrt(x))) * exp(sqrt(x - 2));
        double eq4 = (sqrt(x) * sin(pow(x, 2) / 2 )- 1.3)/(pow(x, 0.2) + exp(3 * x) + abs(cos(x)));
        double eq5 = (sqrt(exp(abs(pow(sin(x), 3))))) + 2 * log(3 * x) - 1.0 / 9;

        System.out.printf("При x = " + x + " значение функции f(x): %n %n");
        System.out.printf("1) (sqrt(exp(2.2 * x))) - abs(sin((PI * x)/(x + 2.0 / 3))) + 1.7 = %f %n %n", eq1);
        System.out.printf("2) sqrt(pow(pow(x, 4), 0.2) + pow(pow(x, (4 - x)), 0.2)) + log(abs(x - 20.5)) = %f %n %n", eq2);
        System.out.printf("3) (1.0 / 7 + log(sqrt(x))) * exp(sqrt(x - 2)) = %f %n %n", eq3);
        System.out.printf("4) (sqrt(x) * sin(pow(x, 2) / 2 )- 1.3)/(pow(x, 0.2) + exp(3 * x) + abs(cos(x))) = %f %n %n", eq4);
        System.out.printf("5) (sqrt(exp(abs(pow(sin(x), 3))))) + 2 * log(3 * x) - 1.0 / 9 = %f %n %n", eq5);
    }
}
