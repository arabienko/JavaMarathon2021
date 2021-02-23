package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a, b, i;
        Scanner pointA = new Scanner(System.in);
        Scanner pointB = new Scanner(System.in);
        System.out.println("Введите А:");
        a = pointA.nextInt();
        System.out.println("Введите В:");
        b = pointB.nextInt();
        i = a + 1;
        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
