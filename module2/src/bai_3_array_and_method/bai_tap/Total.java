package bai_3_array_and_method.bai_tap;

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào độ dài của cột : ");
        int colums = Integer.parseInt(scanner.nextLine());
        System.out.print("nhập vào chiều dài của dòng");
        int row = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[colums][row];
        for (int i = 0; i < colums; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("nhập vào các phần tử của ma trận : ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.print("nhập vào cột cần tính tổng");
        int x = Integer.parseInt(scanner.nextLine());
        int total = 0;
        if (x > 0 && x < colums){
            for (int i = 0; i < row; i++) {
                total += arr[x][i];
            }
        }else {
            System.out.println("không tìm thấy cột trong ma trận");
        }
        System.out.println("tổng các giá trị trong cột "+x+" là :"+total);


    }
}
