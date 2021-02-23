package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a, b;
        Scanner numA = new Scanner(System.in);
        Scanner numB = new Scanner(System.in);
        System.out.println("Введите значение А:");
        a = numA.nextInt();
        System.out.println("Введите значение В:");
        b = numB.nextInt();
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }


    }
}
