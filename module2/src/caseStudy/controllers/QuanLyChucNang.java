package caseStudy.controllers;

import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner scanner = new Scanner(System.in);
    public static void themMoiDichVu(){
        String chon = null;
        while (true){
            System.out.println("Add new service\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    QuanLyThemMoi.themMoiVilla();
                    break;
                case "2":
                    QuanLyThemMoi.themMoiNha();
                    break;
                case "3":
                    QuanLyThemMoi.themMoiPhong();
                    break;
                case "4":
                    return;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("vui long chon 1-5");
            }
        }
    }

    public static void hienThiDichVu(){
        String chon = null;
        while (true){
            System.out.println("---SHOW---\n" +
                    "1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    QuanLyHienThi.hienThiVilla();
                    break;
                case "2":
                    QuanLyHienThi.hienThiNha();
                    break;
                case "3":
                    QuanLyHienThi.hienThiPhong();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    return;
                case "8":
                    System.exit(0);
            }
        }
    }

    public static void themMoiKhachHang(){

    }
}
