package s1lkbeard.home;

import java.text.DecimalFormat;

import static java.lang.Math.*;

public class App_12
{
    public static void main(String[] args )
    {
        byte N=10;
        double A=0.55;
        double B=1.0;

        System.out.println();
        System.out.println("Значение функции f(x) = (sqrt(exp(2.2 * x))) - abs(sin((PI * x)/(x + 2.0 / 3))) + 1.7 равно:");
        for (double x = A; x < B; x=x+(B-A)/N) {
            double task01 = (sqrt(exp(2.2 * x))) - abs(sin((PI * x)/(x + 2.0 / 3))) + 1.7;
            System.out.print(new DecimalFormat("#0.000").format(task01));
            System.out.print(" при x = ");
            System.out.print(new DecimalFormat("#0.000").format(x));
            System.out.println();
        }
    }
}
