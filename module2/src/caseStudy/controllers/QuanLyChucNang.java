package caseStudy.controllers;

import caseStudy.commons.GhiDocFiles;
import caseStudy.models.DichVu;
import caseStudy.models.KhachHang;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner scanner = new Scanner(System.in);

    public static void themMoiDichVu() {
        String chon = null;
        while (true) {
            System.out.println("Add new service\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit\n");
            chon = scanner.nextLine();
            switch (chon) {
                case "1":
                    QuanLyThemMoiCacDichVu.themMoiVilla();
                    break;
                case "2":
                    QuanLyThemMoiCacDichVu.themMoiNha();
                    break;
                case "3":
                    QuanLyThemMoiCacDichVu.themMoiPhong();
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

    public static void hienThiDichVu() {
        String chon = null;
        while (true) {
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
            switch (chon) {
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

    public static void themMoiKhachHang() {
        String hoTen = QuanLyNhapDuLieu.nhapHoTenKhachHang();
        String ngaySinh = QuanLyNhapDuLieu.nhapNgaySinhKhachHang();
        String gioiTinh = QuanLyNhapDuLieu.nhapGioiTinhKhachHang();
        String soCMND = QuanLyNhapDuLieu.nhapSoCMND();
        String soDT = QuanLyNhapDuLieu.nhapSoDT();
        String email = QuanLyNhapDuLieu.nhapEmail();
        String diaChi = QuanLyNhapDuLieu.nhapDiaChiKhachhang();
        String loaiKhach = QuanLyNhapDuLieu.nhapLoaiKhach();
        DichVu dichVu = null;

        KhachHang khachHang = new KhachHang(hoTen, ngaySinh, gioiTinh, soCMND, soDT, email, loaiKhach, diaChi, dichVu);
        List<KhachHang> khachHangList = new ArrayList<KhachHang>();
        khachHangList.add(khachHang);
        GhiDocFiles.ghiFile("khachhang.csv", khachHangList, true);
    }

    public static void muaVeDichVu() {
        KhachHang khachHang = null;
        boolean kiemTra = false;
        int chon = 0;
        List<String[]> list = GhiDocFiles.docFile("khachhang.csv");
        while (true) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + " : " + list.get(i));
            }
            System.out.println("chon khach hang theo danh sach");
            while (true) {
                try {
                    chon = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui long nhap so");
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (i == chon - 1) {
                    khachHang = new KhachHang(list.get(i));
                    kiemTra = true;
                    break;
                }
            }
            if (kiemTra) {
                break;
            } else {
                System.out.println("vui long chon theo danh sach");
            }
        }
        while (true) {
            System.out.println("chon dich vu mua ve\n" +
                    "1.\tBooking Villa\n" +
                    "2.\tBooking House\n" +
                    "3.\tBooking Room\n" +
                    "4 . Tro lai menu");
            while (true) {
                try {
                    chon = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui long nhap so");
                    e.printStackTrace();
                }
            }
            switch (chon) {
                case 1:
                    int chon1 = 0;
                    List<String[]> strings = GhiDocFiles.docFile("villa.csv");
                    for (int i = 0; i < strings.size(); i++) {
                        System.out.println((i + 1) + " : " + strings.get(i));
                    }
                    while (true) {
                        try {
                            System.out.println("chon theo danh sach");
                            chon1 = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("vui long nhap so");
                            e.printStackTrace();
                        }
                    }
                    for (int i = 0; i < strings.size(); i++) {
                        if (i == chon1 - 1){
                            
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("vui long chon 1-3");
            }
        }
    }

    public static void muaVeVilla() {

        int chon = 0;
        List<String[]> strings = GhiDocFiles.docFile("villa.csv");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println((i + 1) + " : " + strings.get(i));
        }
        while (true) {
            try {
                System.out.println("chon theo danh sach");
                chon = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("vui long nhap so");
                e.printStackTrace();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (i == chon - 1){

            }
        }

    }
}
