package s1lkbeard.home;

import java.util.Scanner;

public class Task_1_4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //задаем размер массива
        System.out.println("Введите размер массива");
        byte N = in.nextByte();
        //создаем массив заданного размера
        double msvX[] = new double[N];
        //получаем значение величин P и T
        double P = getRandomNumber();
        double T = getRandomNumber() + P;
        System.out.printf("Значение величины P = %.3f %n", P);
        System.out.printf("Значение величины T = %.3f %n", T);
        double sum = 0;
        //задаем данные массива с помощью рандомных значений
        for (int i = 0; i < N; i++) {
            msvX[i] = getRandomNumber();
            System.out.printf("msvX[i] = %.3f %n", msvX[i]);
            //определяем, больше ли значение элемента массива, чем P и меньше, чем T
            if ((msvX[i] > P) && (msvX[i] < T)) {
                sum = sum + msvX[i];
            }
        }
        System.out.printf("sum = %.3f %n", sum);
    }

    public static double getRandomNumber() {
        double x = Math.random() * 10;

        return x;
    }
}
