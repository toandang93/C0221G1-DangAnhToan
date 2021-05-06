package caseStudy.controllers;

import bai_11_collectionFarmword.bai_tap.quanLySanPham_1.QuanLy;
import caseStudy.commons.GhiDocFiles;
import caseStudy.models.*;
import quanLyHoaDonTienDien.commons.GhiDocFile;

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
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String ngaySinh = QuanLyNhapDuLieu.nhapNgaySinh();
        String gioiTinh = QuanLyNhapDuLieu.nhapGioiTinh();
        String soCMND = QuanLyNhapDuLieu.nhapSoCMND();
        String soDT = QuanLyNhapDuLieu.nhapSoDT();
        String email = QuanLyNhapDuLieu.nhapEmail();
        String diaChi = QuanLyNhapDuLieu.nhapDiaChi();
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
        List<KhachHang> khachHangList = GhiDocFiles.docFileKhachHang("khachhang.csv");
        while (true) {
            for (int i = 0; i < khachHangList.size(); i++) {
                System.out.println((i + 1) + " : " + khachHangList.get(i));
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
            for (int i = 0; i < khachHangList.size(); i++) {
                if (i == chon - 1) {
                    khachHang = khachHangList.get(i);
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
                    while (true){
                        boolean kiemtra1 = false;
                        List<Villa> villaList = new ArrayList<>();
                        for (String[] strings1 : strings){
                            Villa villa = new Villa(strings1);
                            villaList.add(villa);
                        }
                        for (int i =0;i<villaList.size();i++){
                            System.out.println((i+1)+" : "+villaList.get(i));
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
                                DichVu dichVu = new Villa(strings.get(i));
                                khachHang.setDichVu(dichVu);
                                List<KhachHang> khachHangList1 = new ArrayList<>();
                                khachHangList1.add(khachHang);
                                GhiDocFiles.ghiFile("booking.csv",khachHangList1,true);
                                kiemtra1 = true;
                                break;
                            }
                        }
                        if (kiemtra1){
                            break;
                        }else {
                            System.out.println("vui long chon trong danh sach");
                        }
                    }
                    break;
                case 2:
                    int chon2 = 0;
                    List<String[]> strings2 = GhiDocFiles.docFile("nha.csv");
                    while (true){
                        boolean kiemtra1 = false;
                        List<Nha> nhaList = new ArrayList<>();
                        for (String[] strings1 : strings2){
                            Nha nha = new Nha(strings1);
                            nhaList.add(nha);
                        }
                        for (int i =0;i<nhaList.size();i++){
                            System.out.println((i+1)+" : "+nhaList.get(i));
                        }
                        while (true) {
                            try {
                                System.out.println("chon theo danh sach");
                                chon2 = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("vui long nhap so");
                                e.printStackTrace();
                            }
                        }
                        for (int i = 0; i < strings2.size(); i++) {
                            if (i == chon2 - 1){
                                DichVu dichVu = new Villa(strings2.get(i));
                                khachHang.setDichVu(dichVu);
                                List<KhachHang> khachHangList1 = new ArrayList<>();
                                khachHangList1.add(khachHang);
                                GhiDocFiles.ghiFile("booking.csv",khachHangList1,true);
                                kiemtra1 = true;
                                break;
                            }
                        }
                        if (kiemtra1){
                            break;
                        }else {
                            System.out.println("vui long chon trong danh sach");
                        }
                    }
                    break;
                case 3:
                    int chon3 = 0;
                    List<String[]> strings3 = GhiDocFiles.docFile("phong.csv");
                    while (true){
                        boolean kiemtra1 = false;
                        List<Phong> phongList = new ArrayList<>();
                        for (String[] strings1 : strings3){
                            Phong phong = new Phong(strings1);
                            phongList.add(phong);
                        }
                        for (int i =0;i<phongList.size();i++){
                            System.out.println((i+1)+" : "+phongList.get(i));
                        }
                        while (true) {
                            try {
                                System.out.println("chon theo danh sach");
                                chon3 = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("vui long nhap so");
                                e.printStackTrace();
                            }
                        }
                        for (int i = 0; i < strings3.size(); i++) {
                            if (i == chon3 - 1){
                                DichVu dichVu = new Villa(strings3.get(i));
                                khachHang.setDichVu(dichVu);
                                List<KhachHang> khachHangList1 = new ArrayList<>();
                                khachHangList1.add(khachHang);
                                GhiDocFiles.ghiFile("booking.csv",khachHangList1,true);
                                kiemtra1 = true;
                                break;
                            }
                        }
                        if (kiemtra1){
                            break;
                        }else {
                            System.out.println("vui long chon trong danh sach");
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("vui long chon 1-3");
            }
        }
    }

    public static void hienThiVeDichVu(){
        List<String> list = GhiDocFiles.docFileString("booking.csv");
        for (String string : list){
            System.out.println(string);
        }
    }

    public static void themMoiNhanVien(){
//: Họ tên Employee , Ngày sinh, Số CMND, Số ĐT, Email, Trình độ, Vị trí, lương
        String ten = QuanLyNhapDuLieu.nhapHoTen();
        String ngaySinh = QuanLyNhapDuLieu.nhapNgaySinh();
        String soCMND = QuanLyNhapDuLieu.nhapSoCMND();
        String soDt = QuanLyNhapDuLieu.nhapSoDT();
        String email = QuanLyNhapDuLieu.nhapEmail();
        String trinhDo = QuanLyNhapDuLieu.nhapTrinhDo();
        String viTri = QuanLyNhapDuLieu.nhapViTri();
        String luong = QuanLyNhapDuLieu.nhapLuong();

        NhanVien nhanVien = new NhanVien(ten,ngaySinh,soCMND,soDt,email,trinhDo,viTri,luong);
        List<NhanVien> nhanViens = new ArrayList<NhanVien>();
        nhanViens.add(nhanVien);
        GhiDocFiles.ghiFile("nhanvien.csv",nhanViens,true);

    }

    public static void hienThiNhanVien(){
        List<String[]> strings = GhiDocFiles.docFile("nhanvien.csv");
        List<NhanVien> nhanVienList = new ArrayList<>();
        for (String[] string : strings){
            NhanVien nhanVien = new NhanVien(string);
            nhanVienList.add(nhanVien);
        }
        for (NhanVien nhanVien : nhanVienList){
            nhanVien.showInfo();
        }
    }

    

}
