package bai_1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Không đúng! Mời bạn nhập lại mật khẩu: ");
        String password = sc.nextLine();
        while (!password.equals("vung oi mo ra")) {
            System.out.println("Không đúng! Mời bạn nhập lại mật khẩu: ");
            password = sc.nextLine();
        }
    }
}
