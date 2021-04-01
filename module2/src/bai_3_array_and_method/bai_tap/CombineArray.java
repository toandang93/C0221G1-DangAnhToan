package bai_3_array_and_method.bai_tap;

import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập vào số phần tử của mảng A ");
        int N=Integer.parseInt(scanner.nextLine());
        int[] arrA=new int[N];
        for (int i =0;i<arrA.length;i++){
            System.out.print("Nhập vào phần tử thứ "+(i+1)+" của mảng A");
            arrA[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.print("nhập vào số phần tử của mảng B ");
        int M=Integer.parseInt(scanner.nextLine());
        int[] arrB=new int[M];
        for (int i =0;i<arrB.length;i++){
            System.out.print("Nhập vào phần tử thứ "+(i+1)+" của mảng B");
            arrB[i]=Integer.parseInt(scanner.nextLine());
        }
        int[] arrC=new int[N+M];
        for (int i = 0; i <arrA.length ; i++) {
            arrC[i]=arrA[i];
        }
        for (int i=0;i<arrB.length;i++){
            arrC[i+N]=arrB[i];
        }
        System.out.print("Mảng được gộp là : ");
        for (int i = 0; i <arrC.length ; i++) {
            System.out.print(arrC[i]);
        }

    }
}
