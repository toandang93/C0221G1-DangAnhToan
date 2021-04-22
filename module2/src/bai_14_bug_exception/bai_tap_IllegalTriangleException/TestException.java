package bai_14_bug_exception.bai_tap_IllegalTriangleException;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("nhập vào 3 cạnh của tam giác");
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                int c = Integer.parseInt(scanner.nextLine());
                if (a < 0 || b < 0 || c < 0 ) {
                    throw new IllegalTriangleException("không nhận giá trị âm");
                }
                if( a + b <= c || b + c <= a || a + c <= b){
                    throw new IllegalTriangleException("tổng 2 cạnh phải lớn hơn cạnh còn lại");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhập sai kiểu dữ liệu");
            }catch (IllegalTriangleException e) {
                System.out.println(e);
            }
        }
    }
}