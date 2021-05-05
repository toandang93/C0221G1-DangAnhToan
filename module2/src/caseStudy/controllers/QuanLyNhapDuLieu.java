package caseStudy.controllers;

import caseStudy.commons.DichVuException;

import java.util.Scanner;

public class QuanLyNhapDuLieu {
    static Scanner scanner = new Scanner(System.in);
    //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
    //-	Riêng Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
    //
    public static String nhapTenDichVu(String ten){
        String tenDV = ten;
        return tenDV;
    }
    public static String nhapDienTichSuDung(){
        System.out.println("nhap dien tich su dung");
        String dienTich = scanner.nextLine();
        return dienTich;
    }
    public static String nhapChiPhiThue(){
        System.out.println("nhap chi phi thue");
        String chiPhi = scanner.nextLine();
        return chiPhi;
    }
    public static String  nhapSoLuongNguoi(){
        String soLuongNguoi = null;
        while (true){
            try{
                System.out.println("nhap so luong nguoi toi da");
                soLuongNguoi = scanner.nextLine();
                DichVuException.kiemTraSoLuongNguoi(soLuongNguoi);
                return soLuongNguoi;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapKieuThue(){
        String kieuThue = null;
        while (true){
            try{
                System.out.println("nhap kieu thue");
                kieuThue= scanner.nextLine();
                DichVuException.kiemTraKieuThue(kieuThue);
                return kieuThue;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapTieuChuanPhong(){
        System.out.println("nhap tieu chuan phong");
        String tieuChuan = scanner.nextLine();
        return tieuChuan;
    }
    public static String nhapMoTaTienNghi(){
        System.out.println("mo ta tien nghi ");
        String moTa = scanner.nextLine();
        return moTa;
    }
    public static String nhapDienTichHoBoi(){
        System.out.println("nhap dien tich ho boi");
        String dienTich = scanner.nextLine();
        return dienTich;
    }
    public static String nhapSoTang(){
        System.out.println("nhap so tang");
        String soTang = scanner.nextLine();
        return soTang;
    }
    public static String nhapTenDichVuDiKem(){
        System.out.println("nhap ten dich vu di kem");
        String tenDichVu = scanner.nextLine();
        return tenDichVu;
    }
    public static String nhapDonViDichVuDiKem(){
        System.out.println("nhap don vi");
        String donVi = scanner.nextLine();
        return donVi;
    }
    public static double nhapGiaTien(){
        double giaTien ;
        while (true){
            try{
                System.out.println("nhap gia tien");
                giaTien = Double.parseDouble(scanner.nextLine());
                return giaTien;
            }catch (NumberFormatException e){
                System.err.println("vui long nhap so");
                e.printStackTrace();
            }
        }
    }
    //:  Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số ĐT, Email, Loại khách,
    // Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services, và phương thức showInfor().
    public static String hoTenKhachHang(){
        String hoTen = null;
        while (true){
           
        }
    }

}
