package day1;

public class Task5 {
    public static void main(String[] args) {
        String olimpStr, yearStr;
        olimpStr = "Олимпиада";
        yearStr = "года";
        for (int i = 1980; i <= 2020; i = i + 4) {
            System.out.println(olimpStr + " " + i + " " + yearStr);
        }

    }
}
