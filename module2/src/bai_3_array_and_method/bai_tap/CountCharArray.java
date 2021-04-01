package bai_3_array_and_method.bai_tap;

import java.util.Scanner;

public class CountCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào một chuỗi bất kỳ : ");
        String str = scanner.nextLine();
        System.out.print("nhập vào ký tự cần kiểm tra");
        char x = scanner.nextLine().charAt(0);
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == x){
                count++;
            }
        }
        System.out.println("số lần xuất hiện của "+x+" trong chuỗi là : "+count);
    }
}
