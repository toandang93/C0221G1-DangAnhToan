package quanLyPhuongTien.controllers;

import java.util.Scanner;

public class DanhMuc {
    static Scanner scanner = new Scanner(System.in);
    public static void danhMuc(){
        int chon;
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n");
            do {
                try{
                    chon = Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("vui long nhap so");
                    e.printStackTrace();
                }
            }while (true);
            switch (chon){
                case 1:
                    QuanLyChucNang.themMoiPhuongTien();
                    break;
                case 2:
                    QuanLyChucNang.hienThiPhuongTien();
                    break;
                case 3:
                    QuanLyChucNang.xoaPhuongTien();
                    break;
                case 4:
                    System.exit(0);
            }
        }while (true);
    }
}
