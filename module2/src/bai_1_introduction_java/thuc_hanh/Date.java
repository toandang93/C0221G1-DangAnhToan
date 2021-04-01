package bai_1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your month");
        int month = Integer.parseInt(scanner.nextLine());
        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth = " 29 or 29 day";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = " 31 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "30 days";
                break;
            default:
                dayInMonth = "";
                break;
        }
        if (dayInMonth != "") {
            System.out.printf("the month %d has %s",month,dayInMonth);
        }else {
            System.out.println("Invalid input");
        }
    }
}