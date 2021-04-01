package bai_3_array_and_method.bai_tap;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập vào số lượng phần tử :");
        int N=Integer.parseInt(scanner.nextLine());
        int[] arr=new int[N];
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("nhập vào phần tử thứ %d :",i+1);
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.print("mảng được khởi tạo :");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("nhập vào giá trị x");
        int x=Integer.parseInt(scanner.nextLine());
        System.out.print("nhập vào vị trí muốn thêm ");
        int index=Integer.parseInt(scanner.nextLine());
        if(index<0 && index>arr.length){
            System.out.println("không thêm được vào mảng");
        }else {
            int[] newArr=new int[arr.length+1];
            for (int i = 0; i <index-1 ; i++) {
                newArr[i]=arr[i];
            }
            newArr[index-1]=x;
            for (int i = index; i <newArr.length ; i++) {
                newArr[i]=arr[i-1];
            }
            System.out.println("mảng mới được tạo thành");
            for (int i = 0; i <newArr.length ; i++) {
                System.out.print(newArr[i]);

            }
        }
    }
}
