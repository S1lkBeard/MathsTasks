package s1lkbeard.home;

public class Task_1_3_3 {
    public static void main(String[] args) {
        //шаг минутной стрелки
        byte N = 5;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j = j + N) {
                //величина угла минутной стрелки относительно нуля на циферблате
                double angleMin = j * 6;
                //величина угла часовой стрелки относительно нуля на циферблате
                //приращение минутной стрелки на каждые 5 минут даёт приращение часовой стрелки на 2.5 градуса
                double angleHour = j / 2.0;
                double diff = angleMin - angleHour;
                System.out.println("Величина угла минутной стрелки относительно нуля на циферблате: " + angleMin);
                System.out.println("Величина угла часовой стрелки относительно нуля на циферблате: " + angleHour);
                System.out.printf("Величина угла между часовой и минутной стрелками равна: %.1f %n %n", diff);
            }
        }
    }
}
