package bai_2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int num =Integer.parseInt(scanner.nextLine());
        if(num<2){
            System.out.println(num+" is not a prime");
        }else {
            int i=2;
            boolean check=true;
            while (i<Math.sqrt(num)){
                if(num%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(num+" is a prime");
            }else {
                System.out.println(num+" is not a prime");
            }
        }
    }
}
