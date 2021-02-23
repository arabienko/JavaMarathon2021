package day2;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double x, y;
        int i;
        Scanner xS = new Scanner(System.in);
        System.out.println("Введите значение Х:");
        x = xS.nextDouble();
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
            System.out.println("Значение У= " + y);
        }
        if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
            System.out.println("Значение У= " + y);
        }
        if (x <= -3 && x != -7) {
            System.out.println("Значение У= " + 420);
        }
        if (x == -7) {
            System.out.println("Деление на ноль, ошибка вычислений");
        }
    }
}
