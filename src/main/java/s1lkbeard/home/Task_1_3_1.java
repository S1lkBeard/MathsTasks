package s1lkbeard.home;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task_1_3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //количество слоёв
        System.out.println("Укажите количество слоев:");
        byte N = in.nextByte();

        //внутренний радиус шарового резервуара
        System.out.println("Укажите внутренний радиус шарового резервуара:");
        double R = in.nextDouble();

        //толщина слоя
        System.out.println("Укажите толщину слоя:");
        byte H = in.nextByte();

        System.out.println();
        System.out.println("Объем каждого сферического слоя, начиная с самого внутреннего V = 4/3.0 * PI * pow((R + (H + x)), 3) - 4/3.0 * PI * pow(R, 3) равно:");
        for (int x = 0; x < N; x = (x + H)) {
            int j = x + 1;
            double V = 4 / 3.0 * PI * pow((R + (H + x)), 3) - 4 / 3.0 * PI * pow(R, 3);
            System.out.print("Номер слоя " + j + ":");
            System.out.printf(" V = %.1f %n %n", V);
        }
    }
}
