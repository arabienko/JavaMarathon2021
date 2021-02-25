package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x, y;
        for (int i = 0; i < 5; i++) {
            System.out.println("Делимое =");
            x = scanner.nextDouble();
            System.out.println("Делитель =");
            y = scanner.nextDouble();
            if (y != 0) {
                Double div = x / y;
                System.out.println("Результат деления №" + i + " " + div);
                continue; // переходит в конец или начало для продолжения
            }
            System.out.println("Деление на НОЛЬ, программа завершает работу");
            break; // прерывает выполнение цикла
        }
    }
}
