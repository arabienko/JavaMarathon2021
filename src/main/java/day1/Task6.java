package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int k;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введи число от 1 до 9 ");
        k = scaner.nextInt();
        System.out.println("Таблица умножения для числа К=" + k+" :");
        for (int i = 0; i <= 9; i++) {
            System.out.println(i + " * " + k + " =" + i * k);

        }


    }
}
