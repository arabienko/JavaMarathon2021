package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int floor;
        Scanner scanDom = new Scanner(System.in);
        System.out.println("Введи количество этажей в доме:");
        floor = scanDom.nextInt();
        if (0 < floor && floor <= 4) {
            System.out.println("Дом малоэтажный");
        } else if (4 < floor && floor <= 8) {
            System.out.println("Дом среднеэтажный");
        }
        if (floor >= 9) {
            System.out.println("Дом многоэтажный");
        }
        if (floor <= 0) {
            System.out.println("Вы ввели некорректные данные");
        }
    }
}
