package quanLyHoaDonTienDien.controllers;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import quanLyHoaDonTienDien.commons.GhiDocFile;
import quanLyHoaDonTienDien.commons.KhachHangException;
import quanLyHoaDonTienDien.models.HoaDon;
import quanLyHoaDonTienDien.models.KhachHang;
import quanLyHoaDonTienDien.models.KhachHangNuocNgoai;
import quanLyHoaDonTienDien.models.KhachHangVietNam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhapDuLieu {
    static Scanner scanner = new Scanner(System.in);


    public static String nhapMaKhachHangVN() {
        String maKH = null;
        int chon;
//            System.out.println("Chọn mã khách hàng\n" +
//                    "1.Khách hàng Việt Nam - KHVN\n" +
//                    "2.Khách hàng nước ngoài - KHNC");
//            while (true) {
//                try {
//                    chon = Integer.parseInt(scanner.nextLine());
//                    break;
//                } catch (NumberFormatException e) {
//                    System.err.println("Vui long nhap so");
//                    e.printStackTrace();
//                }
//            }
            List<KhachHang> khachHangList = GhiDocFile.docFileKhachHang();
            List<KhachHangVietNam> khachHangVietNams = new ArrayList<>();
//            List<KhachHangNuocNgoai> khachHangNuocNgoais = new ArrayList<>();
            for (KhachHang khachHang : khachHangList) {
                if (khachHang instanceof KhachHangVietNam) {
                    khachHangVietNams.add((KhachHangVietNam) khachHang);
//                } else {
//                    khachHangNuocNgoais.add((KhachHangNuocNgoai) khachHang);
//                }
            }
//            if (chon == 1) {
//                if (khachHangVietNams == null) {
//                    maKH = "KHVN-00001";
//                } else {
//                    maKH = "KHVN-0000" + (khachHangVietNams.size() + 1);
//                }
//                break;
//            } else if (chon == 2) {
//                if (khachHangNuocNgoais == null) {
//                    maKH = "KHNN-00001";
//                } else {
//                    maKH = "KHNN-0000" + (khachHangNuocNgoais.size() + 1);
//                }
//                break;
//            } else {
//                System.err.println("vui long chon 1 hoac 2");
            }
            if (khachHangVietNams == null) {
                maKH = "KHVN-00001";
            } else {
                maKH = "KHVN-0000" + (khachHangVietNams.size() + 1);
            }
        return maKH;
    }

    public static String nhapMaKhachHangNN(){
        String maKHNN = null;
        List<KhachHang> khachHangList = GhiDocFile.docFileKhachHang();
        List<KhachHangNuocNgoai> khachHangNuocNgoais = new ArrayList<>();
        for (KhachHang khachHang : khachHangList) {
            if (khachHang instanceof KhachHangNuocNgoai) {
                khachHangNuocNgoais.add((KhachHangNuocNgoai) khachHang);
            }
        }
        if (khachHangNuocNgoais == null) {
            maKHNN = "KHNN-00001";
        } else {
            maKHNN = "KHNN-0000" + (khachHangNuocNgoais.size() + 1);
        }
        return maKHNN;
    }

    public static String nhapHoTen() {
        String hoTen = null;
        while (true) {
            try {
                System.out.println("nhap ho va ten");
                hoTen = scanner.nextLine();
                KhachHangException.kiemTraTenKH(hoTen);
                break;
            } catch (KhachHangException e) {
                System.err.println(e.getMessage());
                ;
            }
        }
        return hoTen;
    }

    public static String nhapLoaiKhach() {
        String loaiKhach = null;
        while (true) {
            List<String> stringList = GhiDocFile.docFileLoaiKH();
            for (int i = 0; i < stringList.size(); i++) {
                System.out.println((i + 1) + " : " + stringList.get(i));
            }
            System.out.println("chon theo danh sach");
            String chon = scanner.nextLine();
            for (int i = 0; i < stringList.size(); i++) {
                if (i == Integer.parseInt(chon) - 1) {
                    loaiKhach = stringList.get(i).split(",")[1];
                    return loaiKhach;
                }
            }
            System.out.println("vui long chon 1-3");
        }
    }

    public static int nhapDinhMucTieuThu() {
        String dinhMucString = null;
        int dinhMuc;
        while (true) {
            try {
                System.out.println("nhap dinh muc tieu thu");
                dinhMucString = scanner.nextLine();
                KhachHangException.kiemTraDinhMucTieuThu(dinhMucString);
                dinhMuc = Integer.parseInt(dinhMucString);
                return dinhMuc;
            }catch (KhachHangException e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapQuoccTich(){
        System.out.println("nhap quoc tich");
        String quocTich = scanner.nextLine();
        return quocTich;
    }
    //Thông tin hóa đơn gồm có: Mã hóa đơn, Mã khách hàng,
    // ngày ra hoá đơn (ngày, tháng, năm), số lượng (số KW tiêu thụ), đơn giá, thành tiền.
    public static String nhapMaHoaDon(){
        String maHoaDon = null;
        List<HoaDon> hoaDonList = GhiDocFile.docFileHoaDon();
        if (hoaDonList.size()==0){
            maHoaDon = "MHD-001";
        }else {
            maHoaDon = "MHD-00"+(hoaDonList.size()+1);
        }
        return maHoaDon;
    }

    public static String layMaKhachHang(){
        boolean kiemTra = false;
        String maKH = null;
        List<KhachHang> khachHangList = GhiDocFile.docFileKhachHang();
        for (int i =0 ;i<khachHangList.size();i++){
            System.out.println((i+1)+" :"+khachHangList.get(i));
        }
        System.out.println("chon theo danh sach khach hang");
        while (true){
            String chon = scanner.nextLine();
            for (int i =0;i<khachHangList.size();i++){
                if (i == Integer.parseInt(chon)-1){
                    maKH = khachHangList.get(i).getMaKH();
                    kiemTra = true;
                    break;
                }
            }
            if (kiemTra){
                break;
            }else {
                System.out.println("ban nhap k dung dinh dang hoac vuot muc danh sach");
            }
        }
        return maKH;
    }

    public static String nhapNgayRaHoaDon(){
        String ngay = null;
        while (true){
            try{
                System.out.println("nhap ngay ra hoa don");
                ngay = scanner.nextLine();
                KhachHangException.kiemTraNgayRaHoaDon(ngay);
                break;
            }catch (KhachHangException e){
                System.err.println(e.getMessage());
            }
        }
        return ngay;
    }

    public static int nhapSoKWTieuThu(){
        int soLuong;
        String chuoiSoLuong;
        while (true){
            try{
                System.out.println("nhap vao so KW tieu thu");
                chuoiSoLuong= scanner.nextLine();
                KhachHangException.kiemTraNhapSo(chuoiSoLuong);
                soLuong = Integer.parseInt(chuoiSoLuong);
                break;
            }catch (KhachHangException e){
                System.err.println(e.getMessage());
            }
        }
        return soLuong;
    }

    public static double nhapDonGia(){
        double donGia ;
        while (true){
            try{
                System.out.println("nhap don gia");
                donGia = Double.parseDouble(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println("nhap sai dinh dang");
                e.printStackTrace();
            }
        }
        return donGia;
    }

    public static int layDinhMucTieuThuKhachhang(String maKH){
        int dinhMuc = 0;
        List<String[]> strings = GhiDocFile.docFileKhachHangString();
        for (String[] strings1 : strings ){
            if (strings1[0].equals(maKH)){
                dinhMuc = Integer.parseInt(strings1[3]);
                break;
            }
        }
        return dinhMuc;
    }

    public static String layTenKhachHang(String maKH){
        String tenKH = null;
        List<KhachHang> khachHangList = GhiDocFile.docFileKhachHang();
        for (KhachHang khachHang : khachHangList){
            if (khachHang.getMaKH().equals(maKH)){
                tenKH = khachHang.getHoTen();
            }
        }
        return tenKH;
    }

}