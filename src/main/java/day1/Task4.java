package day1;

public class Task4 {
    public static void main(String[] args) {
        String strOlimp = "Олимпиада", strYear = "года";
        int yearStart = 1980, yearEnd = 2020;
        while (yearStart <= yearEnd){
            System.out.println(strOlimp+" "+yearStart+" "+strYear);
            yearStart=yearStart+4;

        }


    }
}
