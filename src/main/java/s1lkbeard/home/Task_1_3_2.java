package s1lkbeard.home;

import static java.lang.Math.*;

public class Task_1_3_2 {
    public static void main(String[] args) {

        double X = 0.5;
        int n = 20;

        double res = 1;

        for (double k = 1; k < n + 1; k++) {
            res = (getEq(res, X, k));
            if (k == 20) {
                double finalRes = sqrt(X) * log(X) - res;
                System.out.printf("f(k) = sqrt(X) * log(X) - П(от_k=1_до_n) ((pow((pow(X, (k - 1)) / (k + 1.0 / 3.0)), 1.0 / k) - 0.5)) = %.4f %n %n", finalRes);
            }
        }
    }

    public static double getEq(double res, double X, double k) {
        res = res * (pow((pow(X, (k - 1)) / (k + 1.0 / 3.0)), 1.0 / k) - 0.5);

        return res;
    }
}
