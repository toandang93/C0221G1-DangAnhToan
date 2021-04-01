package bai_3_array_and_method.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số phần tử");
        int N =Integer.parseInt(scanner.nextLine());
        int[] arr=new int[N];
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("nhập phần tử thử %d: ",i+1);
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("nhập vị trí phần tử muốn xóa");
        int index= Integer.parseInt(scanner.nextLine());
        for( int i=index-1;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        System.out.println("mảng sau khi xóa :");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
