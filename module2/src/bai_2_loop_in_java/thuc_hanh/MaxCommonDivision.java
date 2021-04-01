package bai_2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class MaxCommonDivision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a;
        int b;
        System.out.println("input a");
        a= Integer.parseInt(scanner.nextLine());
        System.out.println("input b");
        b= Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
