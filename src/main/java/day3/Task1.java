package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название города ");
        String scan = scanner.next();
        String stop = "стоп";

        while (!(scan.equals(stop))) {
            switch (scan) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Russia");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Italy");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
            if (!(scan.equals(stop))) {
                System.out.println("Введи город ");
                scan = scanner.next();
            }
        }
        System.out.println("Слово СТОП, конец программы");
    }
}


