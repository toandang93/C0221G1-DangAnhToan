package bai_1_introduction_java.thuc_hanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a : ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("b : ");
        float b = Float.parseFloat(scanner.nextLine());
        System.out.println("c : ");
        float c = Float.parseFloat(scanner.nextLine());
        if (a != 0) {
            float result = (c-b) / a;
            System.out.printf("The result is : %f",result);
        }else {
            if( b==0){
                System.out.println("The result is all x");
            }else {
                System.out.println("No solution!");
            }
        }
    }
}
