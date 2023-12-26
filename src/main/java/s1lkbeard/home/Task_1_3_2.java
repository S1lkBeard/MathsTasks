package s1lkbeard.home;

import static java.lang.Math.*;

public class Task_1_3_2 {
    public static void main(String[] args) {

        double X = 0.5;
        int n = 20;

        //Получение значения уравнения на 1 итерации
        double res = (getEq(X, 1));
        //Получение и перемножение значений уравнений с 2 по 20 итерацию
        for (double k = 2; k <= n; k++) {
            res = res * (getEq(X, k));
        }
        //Последнее действие
        res = getfinalEq(X, res);
        System.out.printf("f(k) = sqrt(X) * log(X) - П(от_k=1_до_n) ((pow((pow(X, (k - 1)) / (k + 1.0 / 3.0)), 1.0 / k) + 0.5)) = %.4f %n %n", res);
    }

    public static double getEq(double X, double k) {
        double res = (pow((pow(X, (k - 1)) / (k + 1.0 / 3.0)), 1.0 / k) + 0.5);

        return res;
    }

    public static double getfinalEq(double X, double res) {
        double finalRes = sqrt(X) * log(X) - res;

        return finalRes;
    }
}
