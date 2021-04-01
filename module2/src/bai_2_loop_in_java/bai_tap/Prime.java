package bai_2_loop_in_java.bai_tap;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số lượng số nguyên tố cần in ra");
        int number = Integer.parseInt(scanner.nextLine());
        int count=0;
        int N=2;

        if(number<0){
            System.out.println("Không có số nguyên tố");
        }else {
            while (count<number){
                boolean check=true;
                for (int i = 2; i <N ; i++) {
                    if(N%i==0){
                        check=false;
                        break;
                    }
                }
                if (check){
                    System.out.println(N);
                    count++;
                }
                N++;
            }
        }


    }
}
