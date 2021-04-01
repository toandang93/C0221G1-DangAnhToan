package bai_1_introduction_java.bai_tap;

import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your USD");
        float USD=Float.parseFloat(scanner.nextLine());
        float VND= 23000*USD;
        System.out.println("Vnd = "+VND);
    }
}
