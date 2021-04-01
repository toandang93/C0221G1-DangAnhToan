package bai_3_array_and_method.bai_tap;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập vào số lượng phần tử trong mảng");
        int N=Integer.parseInt(scanner.nextLine());
        int[] arr=new int[N];
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("nhập vào phần tử thứ "+(i+1)+" ");
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        int Min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<Min){
                Min=arr[i];
            }
        }
        System.out.println("giá trị nhỏ nhất trong mảng là : "+Min);
    }
}
