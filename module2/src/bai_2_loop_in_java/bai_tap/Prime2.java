package bai_2_loop_in_java.bai_tap;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào N");
        int N = Integer.parseInt(scanner.nextLine());
        System.out.println("các số nguyên tố nhỏ hơn N là ");

        for (int i = 2; i <N ; i++) {
            boolean check=true;
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println(i);
            }

        }
    }
}
