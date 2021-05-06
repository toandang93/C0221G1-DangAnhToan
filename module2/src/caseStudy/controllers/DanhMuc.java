package caseStudy.controllers;

import java.util.Scanner;

public class DanhMuc {
    static Scanner scanner = new Scanner(System.in);
    public static void danhMuc(){
        String chon;
       while (true){
           System.out.println("Danh Muc :\n" +
                   "1.\t Add New Services\n" +
                   "2.\tShow Services\n" +
                   "3.\tAdd New Customer\n" +
                   "4.\tShow Information of Customer\n" +
                   "5.\tAdd New Booking\n" +
                   "6.\tShow Information Booking\n" +
                   "7.\tAdd new Employee\n" +
                   "8.\tShow Information of Employee\n" +
                   "9.\tExit\n");
           chon = scanner.nextLine();
           switch (chon){
               case "1":
                   QuanLyChucNang.themMoiDichVu();
                   break;
               case "2":
                   QuanLyChucNang.hienThiDichVu();
                   break;
               case "3":
                   QuanLyChucNang.themMoiKhachHang();
                   break;
               case "4":
                   QuanLyHienThi.hienThiKhachHang();
                   break;
               case "5":
                   QuanLyChucNang.muaVeDichVu();
                   break;
               case "6":
                   QuanLyChucNang.hienThiVeDichVu();
                   break;
               case "7":
                   QuanLyChucNang.themMoiNhanVien();
                   break;
               case "8":
                   QuanLyChucNang.hienThiNhanVien();
                   break;
               case "9":
                   System.exit(0);
               default:
                   System.out.println("Vui long chon tu 1-7");
                   break;
           }
       }

    }
}
