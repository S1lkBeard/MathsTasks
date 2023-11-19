package s1lkbeard.home;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.Math.*;

public class Task_1_2 {
    public static void main(String[] args) {

        int N = 10;
        double A = 0.55;
        double B = 1.0;

        System.out.println();
        System.out.println("Значение функции f(x) = (sqrt(exp(2.2 * x))) - abs(sin((PI * x)/(x + 2.0 / 3))) + 1.7 равно:");

        for (Map.Entry<Double, Double> r : getNEqFromAtoB(N, A, B).entrySet()) {
            System.out.printf("При x = %.3f, f(x) = %.3f %n", r.getKey(), r.getValue());
        }
    }

    /**
     * Функция возвращает словарь из N элементов, в котором от A до B по аргументу x, который является ключем,
     * вычисляется значение функции, которое является результатом<b>sdfsdfsdfsdf<b/>
     * @param N - количество шагов, на указанном отрезке
     * @param A - начало отрезка по оси x
     * @param B - конец отрезка по оси x
     * @return словарь со связными элементами, ключом является x, значением f(x)
     */
    public static Map<Double, Double> getNEqFromAtoB(int N, double A, double B) {
        Map<Double, Double> res = new LinkedHashMap<>();

        if (N > 0) {
            double step = (B - A) / N;

            for (double x = A; x < B; x += step) {
                if (x <= 0) {
                    break;
                }
                res.put(x, getEq1(x));
            }
        }

        return res;
    }

    public static double getEq1(double x) {
        double res = (sqrt(exp(2.2 * x))) - abs(sin((PI * x) / (x + 2.0 / 3))) + 1.7;

        return res;
    }
}
