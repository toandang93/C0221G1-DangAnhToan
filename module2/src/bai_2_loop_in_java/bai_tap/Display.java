package bai_2_loop_in_java.bai_tap;

import java.net.Inet4Address;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("enter your choice");
        int choice =Integer.parseInt(scanner.nextLine());
        String c = "";
        switch (choice){
            case 1 :
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        c+="*";
                    }
                    c+="\n";
                }
                System.out.println(c);
                break;
            case 2:
                for(int i=1; i<=5; i++){
                    for(int j=1; j<=i; j++){
                        c+="*";
                    }
                    c+="\n";
                }
                System.out.println(c);
                break;
            default:
                break;
        }
    }
}
