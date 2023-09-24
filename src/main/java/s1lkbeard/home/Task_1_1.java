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

        System.out.println("При x = " + x + " значение функции f(x):");
        System.out.println();
        System.out.print("1) (sqrt(exp(2.2 * x))) - abs(sin((PI * x)/(x + 2.0 / 3))) + 1.7 = ");
        System.out.println(new DecimalFormat("#0.000").format(eq1));
        System.out.println();
        System.out.print("2) sqrt(pow(pow(x, 4), 0.2) + pow(pow(x, (4 - x)), 0.2)) + log(abs(x - 20.5)) = ");
        System.out.println(new DecimalFormat("#0.000").format(eq2));
        System.out.println();
        System.out.print("3) (1.0 / 7 + log(sqrt(x))) * exp(sqrt(x - 2)) = ");
        System.out.println(new DecimalFormat("#0.000").format(eq3));
        System.out.println();
        System.out.print("4) (sqrt(x) * sin(pow(x, 2) / 2 )- 1.3)/(pow(x, 0.2) + exp(3 * x) + abs(cos(x))) = ");
        System.out.println(new DecimalFormat("#0.000").format(eq4));
        System.out.println();
        System.out.print("5) (sqrt(exp(abs(pow(sin(x), 3))))) + 2 * log(3 * x) - 1.0 / 9 = ");
        System.out.println(new DecimalFormat("#0.000").format(eq5));
    }
}
