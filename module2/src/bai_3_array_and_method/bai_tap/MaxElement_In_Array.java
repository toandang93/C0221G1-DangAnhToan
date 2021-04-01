package bai_3_array_and_method.bai_tap;

import java.util.Scanner;

public class MaxElement_In_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài của ma trận");
        int N = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào chiều rộng của ma trận");
        int M = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("nhập vào các phần vị trí " + i+j + " của ma trận : ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("số lớn nhất trong ma trận là : "+max);
    }
}