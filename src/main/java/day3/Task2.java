package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Double result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи делимое");
        Double xStr = scan.nextDouble();
        System.out.println("Введи делитель");
        Double yStr = scan.nextDouble();
        while (yStr != 0) {
            result = xStr / yStr;
            System.out.println("Результат деления = " + result);
            System.out.println("Введи делимое");
            xStr = scan.nextDouble();
            System.out.println("Введи делитель");
            yStr = scan.nextDouble();
        }
        System.out.println("Делить на ноль нельзя");
    }
}
