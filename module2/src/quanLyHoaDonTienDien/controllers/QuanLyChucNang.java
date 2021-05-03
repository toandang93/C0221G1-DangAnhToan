package quanLyHoaDonTienDien.controllers;

import quanLyHoaDonTienDien.commons.GhiDocFile;
import quanLyHoaDonTienDien.models.HoaDon;
import quanLyHoaDonTienDien.models.KhachHang;
import quanLyHoaDonTienDien.models.KhachHangNuocNgoai;
import quanLyHoaDonTienDien.models.KhachHangVietNam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner scanner = new Scanner(System.in);

    public static void themMoiKhachhang() {
        int chon;
        do {
            System.out.println("Thêm mới khách hàng :\n" +
                    "1.Thêm khách hàng Việt Nam\n" +
                    "2.Thêm khách hàng nước ngoài\n" +
                    "3.Trở lại menu chính\n" +
                    "4.Thoát");
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
                    themKHVietNam();
                    break;
                case 2:
                    themKHNN();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("vui long chon tu 1-4");
                    break;

            }
        } while (true);
    }

    public static void themKHVietNam() {
        String maKH = QuanLyNhapDuLieu.nhapMaKhachHangVN();
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String loaiKhach = QuanLyNhapDuLieu.nhapLoaiKhach();
        int dinhMuc = QuanLyNhapDuLieu.nhapDinhMucTieuThu();

        KhachHang khVietNam = new KhachHangVietNam(maKH, hoTen, loaiKhach, dinhMuc);
        List<KhachHang> list = new ArrayList<>();
        list.add(khVietNam);
        GhiDocFile.ghiFileKhachHang(list, true);
    }

    public static void themKHNN() {
        String maKH = QuanLyNhapDuLieu.nhapMaKhachHangNN();
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String quocTich = QuanLyNhapDuLieu.nhapQuoccTich();

        KhachHang khNN = new KhachHangNuocNgoai(maKH, hoTen, quocTich);
        List<KhachHang> list = new ArrayList<>();
        list.add(khNN);
        GhiDocFile.ghiFileKhachHang(list, true);
    }

    public static void hienThiThongTinKhachHang() {
        int chon;
        do {
            System.out.println("Hiển thị khách hàng :\n" +
                    "1.Hiển thị khách hàng Việt Nam\n" +
                    "2.Hiển thị khách hàng Nước Ngoài\n" +
                    "3.Trở lại menu chính\n" +
                    "4.Thoát");
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
                    hienThiKhachHangVietNam();
                    break;
                case 2:
                    hienThiKhachHangNuocNgoai();
                    break;
                case 3:
                    return;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("vui long chon tu 1-4");
                    break;

            }
        } while (true);
    }

    public static void hienThiKhachHangVietNam() {
        List<KhachHang> khachHangList = GhiDocFile.docFileKhachHang();
        for (KhachHang khachHang : khachHangList) {
            if (khachHang instanceof KhachHangVietNam) {
                System.out.println(khachHang);
            }
        }
    }

    public static void hienThiKhachHangNuocNgoai() {
        List<KhachHang> khachHangList = GhiDocFile.docFileKhachHang();
        for (KhachHang khachHang : khachHangList) {
            if (khachHang instanceof KhachHangNuocNgoai) {
                System.out.println(khachHang);
            }
        }
    }

    public static void timKiemKhachHang() {
        boolean kiemTra = false;
        List<KhachHang> khachHangList = GhiDocFile.docFileKhachHang();
        System.out.println("nhap ten can tim kiem");
        String ten = scanner.nextLine();
        for (KhachHang khachHang : khachHangList) {
            if (khachHang.getHoTen().contains(ten)) {
                System.out.println(khachHang);
                kiemTra = true;
            }
        }
        if (kiemTra == false) {
            System.out.println("khong tim thay ten trong danh sach");
        }
    }

    //Mã hóa đơn, Mã khách hàng,  ngày ra hoá đơn (ngày, tháng, năm), số lượng (số KW tiêu thụ), đơn giá, thành tiền.
    public static void themHoaDon() {
        String maHD = QuanLyNhapDuLieu.nhapMaHoaDon();
        String maKH = QuanLyNhapDuLieu.layMaKhachHang();
        String ngayRaHD = QuanLyNhapDuLieu.nhapNgayRaHoaDon();
        int soLuong = QuanLyNhapDuLieu.nhapSoKWTieuThu();
        double donGia = QuanLyNhapDuLieu.nhapDonGia();
        //+ Khách hàng Việt Nam: Nếu số lượng <= định mức tiêu thụ thì: thành tiền = số lượng * đơn giá.
        // Ngược lại thì: thành tiền = số lượng * đơn giá * định mức tiêu thụ + số lượng KW vượt định mức * Đơn giá * 2.5.
        //+ Khách hàng nước ngoài: Thành tiền được tính = số lượng * đơn giá.
        double thanhTien = 0;
        int dinhMuc = 0;
        if (maKH.contains("VN")) {
            dinhMuc = QuanLyNhapDuLieu.layDinhMucTieuThuKhachhang(maKH);
            if (soLuong < dinhMuc) {
                thanhTien = soLuong * donGia;
            }else {
                thanhTien = soLuong * donGia * dinhMuc + (soLuong-dinhMuc) * donGia * 2.5;
            }
        }else if (maHD.contains("NN")){
            thanhTien = soLuong * donGia;
        }

        List<HoaDon> hoaDonList = new ArrayList<>();
        HoaDon hoaDon = new HoaDon(maHD,maKH,ngayRaHD,soLuong,donGia,thanhTien);
        hoaDonList.add(hoaDon);
        GhiDocFile.ghiFileHoaDon(hoaDonList,true);
    }

    public static void hienThiThongTinChiTietHoaDon(){
        HoaDon hoaDonMoi = null;
        String maKh = null;
        String tenKH = null;
        boolean kiemTra = false;
        List<HoaDon> hoaDonList = GhiDocFile.docFileHoaDon();
        for (int i =0 ;i<hoaDonList.size();i++){
            System.out.println((i+1)+" :"+hoaDonList.get(i));
        }
        System.out.println("chon hoa don can xem chi tiet");
        while (true){
            String chon = scanner.nextLine();
            for (int i =0;i<hoaDonList.size();i++){
                if (i == Integer.parseInt(chon)-1){
                    maKh = hoaDonList.get(i).getMaKH();
                    hoaDonMoi = hoaDonList.get(i);
                    kiemTra = true;
                    break;
                }
            }
            tenKH = QuanLyNhapDuLieu.layTenKhachHang(maKh);
            hoaDonMoi.setMaKH(tenKH);
            System.out.println(hoaDonMoi.showInfo());
            if (kiemTra){
                break;
            }else {
                System.out.println("vui long chon theo danh muc");
            }
        }
    }

}
