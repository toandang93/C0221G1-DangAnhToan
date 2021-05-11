package controllers;

import commons.GhiDocFile;
import models.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner scanner = new Scanner(System.in);
    public static void hienThiDanhBa(){
        System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s","Số điện thoại","Nhóm","Họ tên","Giới tính","Địa chỉ","Ngày sinh","Email");
        System.out.println();
        for (DanhBa danhBa : DanhBa.danhBaList123){
            System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s",danhBa.getSoDt(),danhBa.getNhom(),danhBa.getHoTen(),danhBa.getGioiTinh(),danhBa.getDiaChi(),danhBa.getNgaySinh(),danhBa.getEmail());
            System.out.println();
        }
    }
    public static List<DanhBa> themMoiDanhBa(){
        String sodt = QuanLyNhapDuLieu.nhapSoDt();
        String nhom = QuanLyNhapDuLieu.nhapNhom();
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String gioiTinh = QuanLyNhapDuLieu.nhapGioiTinh();
        String diaChi = QuanLyNhapDuLieu.nhapDiaChi();
        String ngaySinh = QuanLyNhapDuLieu.nhapNgaySinh();
        String email = QuanLyNhapDuLieu.nhapEmail();

        DanhBa danhBa = new DanhBa(sodt,nhom,hoTen,gioiTinh,diaChi,ngaySinh,email);
//        List<DanhBa> danhBaList = new ArrayList<>();
        DanhBa.danhBaList123.add(danhBa);
//        System.out.println(DanhBa.danhBaList123);
        return DanhBa.danhBaList123;

//        GhiDocFile.ghiFile(danhBaList,true);
//        System.out.println("Đã lưu file thành công");
    }
    public static void capNhatDanhBa(){
        boolean kiemTra = false;
        String soDt = null;
//        List<DanhBa> danhBaList = GhiDocFile.docFile();
        while (true){
            System.out.println("Nhập vào số đt cần sửa");
            soDt = scanner.nextLine();
            for (DanhBa danhBa : DanhBa.danhBaList123){
                if (danhBa.getSoDt().equals(soDt)){
                    danhBa.setNhom(QuanLyNhapDuLieu.nhapNhom());
                    danhBa.setHoTen(QuanLyNhapDuLieu.nhapHoTen());
                    danhBa.setGioiTinh(QuanLyNhapDuLieu.nhapGioiTinh());
                    danhBa.setDiaChi(QuanLyNhapDuLieu.nhapDiaChi());
                    danhBa.setNgaySinh(QuanLyNhapDuLieu.nhapNgaySinh());
                    danhBa.setEmail(QuanLyNhapDuLieu.nhapEmail());

//                    GhiDocFile.ghiFile(danhBaList,false);
                    System.out.println("cập nhật thành công");
                    kiemTra = true;
                    break;
                }
            }
            if (soDt.equals("")){
                return;
            }
            if (kiemTra){
                break;
            }else {
                System.out.println("Không tìm được danh bạ với số điện thoại trên.");
            }
        }
    }
    public static void xoaDanhBa(){
        String chon = null;
        boolean kiemTra = false;
        String soDt = null;
//        List<DanhBa> danhBaList = GhiDocFile.docFile();
        while (true){
            System.out.println("Nhập vào số đt cần xóa");
            soDt = scanner.nextLine();
            for (DanhBa danhBa : DanhBa.danhBaList123){
                if (danhBa.getSoDt().equals(soDt)){
                    System.out.println("nhập Y để xóa (nhập ký tự khác để thoát)");
                    chon = scanner.nextLine();
                    if (chon.equals("Y")){
                        DanhBa.danhBaList123.remove(danhBa);
//                        GhiDocFile.ghiFile(danhBaList,false);
                    }else {
                        DanhMuc.danhMuc();
                    }
                    kiemTra = true;
                    break;
                }
            }
            if (soDt.equals("")){
                return;
            }
            if (kiemTra){
                break;
            }else {
                System.out.println("Không tìm được danh bạ với số điện thoại trên.");
            }
        }

    }
    public static void timKiemDanhBa(){
        boolean kiemTra = false;
        String hoTen = null;
        String soDt = null;
        List<DanhBa> danhBaList = GhiDocFile.docFile();
        String chon = null;
        System.out.println("chọn tìm kiếm theo : \n" +
                "1.Họ tên\n" +
                "2.Số điện thoại");
        chon = scanner.nextLine();
        switch (chon){
            case "1":
                System.out.println("nhập tên cần tìm kiếm");
                hoTen = scanner.nextLine();
                for (DanhBa danhBa : danhBaList){
                    if (danhBa.getHoTen().contains(hoTen)){
                        danhBa.hienThi();
                        kiemTra = true;
                    }
                }
                if (kiemTra==false){
                    System.out.println("không tìm thấy tên trong danh bạ");
                }
                break;
            case "2":
                System.out.println("nhập số điện thoại cần tìm kiếm");
                soDt = scanner.nextLine();
                for (DanhBa danhBa : danhBaList){
                    if (danhBa.getHoTen().contains(soDt)){
                        danhBa.hienThi();
                        kiemTra = true;
                    }
                }
                if (kiemTra==false){
                    System.out.println("không tìm thấy số điện thoại trong danh bạ");
                }
                break;
            default:
                System.out.println("bạn chọn k đúng yêu cầu");
        }
    }

    public static void docVaoFile(){
        String chon = null;
        System.out.println("bạn có đồng ý cập nhật bộ nhớ file không\n" +
                "1.Có\n" +
                "2.Không");
        chon = scanner.nextLine();
        if (chon.equals("1")){
            DanhBa.danhBaList123 = GhiDocFile.docFile();
        }else {
            return;
        }

    }

    public static void ghiVaoFile(){
        String chon = null;
        System.out.println("bạn có đồng ý cập nhật file danh bạ không\n" +
                "1.Có\n" +
                "2.Không");
        chon = scanner.nextLine();
        if (chon.equals("1")){
            GhiDocFile.ghiFile(DanhBa.danhBaList123,false);
        }else {
            return;
        }

    }




}
