package bai_2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class LaiNganHang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số tiền gởi");
        double tien=Double.parseDouble(scanner.nextLine());
        System.out.println("nhập vào số tháng gởi");
        int thang=Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào tỉ lệ lãi suất mỗi năm");
        double lai=Double.parseDouble(scanner.nextLine());
        double tong = 0;
        for(int i = 0; i < thang; i++){
            tong += tien * (lai/100)/12 * thang;

        }
        System.out.println("tổng tiền phải trả là : "+tong);
    }
}
