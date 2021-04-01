package bai_1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class BodyWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float weight;
        float height;
        System.out.println("nhập vào cân nặng");
        weight = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập vào chiều cao");
        height = Float.parseFloat(scanner.nextLine());
        double bmi;
        bmi = weight / Math.pow(height, 2);
        if(bmi<18){
            System.out.println("Underweight");
        }else if(bmi<25){
            System.out.println("Normal");
        }else if(bmi<30.0){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }

}
