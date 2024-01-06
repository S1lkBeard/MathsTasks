package s1lkbeard.home;

import java.util.Scanner;

public class Task_1_4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //задаем размер массива
        System.out.println("Введите размер массива");
        byte N = in.nextByte();
        //создаем массивы заданных размеров
        double msvX[] = new double[N];
        double msvZ[] = new double[N];
        //заданные коэффициенты
        double A = 1;
        double B = 1;
        double C = 1;
        double D = 1;
        //задаем данные массива с помощью рандомных значений
        for (int i = 0; i < N; i++) {
            msvX[i] = getRandomNumber();
            msvZ[i] = getRandomNumber();
            //вычисляем значение заданной функции
            double res = getEq(A, B, C, D, msvX[i], msvZ[i]);
            System.out.printf("res = %.3f %n", res);
        }
    }

    public static double getEq(double A, double B, double C, double D, double X, double Z) {
        double result = (A * X + B) / (C * Z + D);

        return result;
    }

    public static double getRandomNumber() {
        double x = Math.random();

        return x;
    }
}
