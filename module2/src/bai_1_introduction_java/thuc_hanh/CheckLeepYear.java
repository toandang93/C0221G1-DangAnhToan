package bai_1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class CheckLeepYear {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.println("enter your year");
        year=Integer.parseInt(scanner.nextLine());
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" is a leep year");
                }else {
                    System.out.println(year+" is not a leep year");
                }
            }else {
                System.out.println(year+" is a leep year");
            }

        }else {
            System.out.println(year+"is not a leep year");
        }
    }
}
