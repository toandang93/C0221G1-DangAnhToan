package caseStudy.controllers;

import caseStudy.commons.DichVuException;

import java.util.Scanner;

public class QuanLyNhapDuLieu {
    static Scanner scanner = new Scanner(System.in);
    //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
    //-	Riêng Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
    //
    public static String nhapidDichVuVilla(){
        String id = null;
        while (true){
            try{
                System.out.println("nhap ma dich vu villa");
                id = scanner.nextLine();
                DichVuException.kiemTraMaDichVuVilla(id);
                return id;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapidDichVuNha(){
        String id = null;
        while (true){
            try{
                System.out.println("nhap ma dich vu nha");
                id = scanner.nextLine();
                DichVuException.kiemTraMaDichVuNha(id);
                return id;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapidDichVuPhong(){
        String id = null;
        while (true){
            try{
                System.out.println("nhap ma dich vu phong");
                id = scanner.nextLine();
                DichVuException.kiemTraMaDichVuPhong(id);
                return id;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
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
                DichVuException.kiemTraSo(kieuThue);
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
    public static String nhapHoTen(){
        String hoTen = null;
        while (true){
           try{
               System.out.println("nhap ho va ten ");
               hoTen = scanner.nextLine();
               DichVuException.kiemTraTen(hoTen);
               return hoTen;
           }catch (DichVuException e){
               System.err.println(e.getMessage());
           }
        }
    }
    public static String nhapNgaySinh(){
        String ngaySinh = null;
        while (true){
            try{
                System.out.println("nhap ngay sinh");
                ngaySinh = scanner.nextLine();
                DichVuException.kiemTraMaNgaySinh(ngaySinh);
                return ngaySinh;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapGioiTinh(){
        String gioiTinh = null;
        while (true){
            try{
                System.out.println("nhap gioi tinh");
                gioiTinh = scanner.nextLine();
                DichVuException.kiemTraGioiTinh(gioiTinh);
                return gioiTinh;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapSoCMND(){
        String soCMND = null;
        while (true){
            try{
                System.out.println("nhap so CMND");
                soCMND = scanner.nextLine();
                DichVuException.kiemTraSoCMND(soCMND);
                return soCMND;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapSoDT(){
        String soDT = null;
        while (true){
            try{
                System.out.println("nhap so dt");
                soDT = scanner.nextLine();
                DichVuException.kiemTraSoDT(soDT);
                return soDT;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapEmail(){
        String email = null;
        while (true){
            try{
                System.out.println("nhap email");
                email = scanner.nextLine();
                DichVuException.kiemTraEmail(email);
                return email;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapLoaiKhach(){
        boolean kiemTra = false;
        String loaiKhach = null;
        String chon = null;
        //Diamond, Platinium, Gold, Silver, Member
        String[] strings ={"Diamond","Platinium","Gold","Silver","Menber"};
        while (true){
            for (int i =0 ;i<strings.length;i++){
                System.out.println((i+1)+" : "+strings[i]);
            }
            System.out.println("chon loai khach");
            chon = scanner.nextLine();
            for (int i =0 ;i<strings.length;i++){
                if (i == Integer.parseInt(chon)-1){
                    loaiKhach = strings[i];
                    kiemTra = true;
                    break;
                }
            }
            if (kiemTra){
                break;
            }else {
                System.out.println("vui long chon theo danh sach");
            }
        }
        return loaiKhach;

    }
    public static String nhapDiaChi(){
        String diaChi = null;
        while (true){
            try{
                System.out.println("nhap dia chi");
                diaChi = scanner.nextLine();
                DichVuException.kiemTraTen(diaChi);
                return diaChi;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapTrinhDo(){
        boolean kiemTra = false;
        String chon = null;
        String trinhDo = null;
        while (true){
            System.out.println("Chon trinh do cua nhan vien : \n" +
                    "1.Trung cấp\n" +
                    "2.Cao Đăng\n" +
                    "3.Đại học \n" +
                    "4.Sau đại học");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    trinhDo = "Trung cấp";
                    kiemTra = true;
                    break;
                case "2":
                    trinhDo = "Cao đẳng";
                    kiemTra = true;
                    break;
                case "3":
                    trinhDo = "Đại học";
                    kiemTra = true;
                    break;
                case "4":
                    trinhDo = "Sau đại học";
                    kiemTra = true;
                    break;

            }
            if (kiemTra){
                break;
            }else {
                System.out.println("vui long chon theo danh sach 1-4");
            }
        }
        return trinhDo;
    }
    public static String nhapViTri(){
        boolean kiemTra = false;
        String chon = null;
        String viTri = null;
        while (true){
            //Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giá đốc.
            System.out.println("Chon vi tri cua nhan vien : \n" +
                    "1.Lễ tân\n" +
                    "2.Phục vụ\n" +
                    "3.Chuyên viên \n" +
                    "4.Giám sát\n" +
                    "5.Quản lý\n" +
                    "6.Giám đốc");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    viTri = "Lễ tân";
                    kiemTra = true;
                    break;
                case "2":
                    viTri = "Phục vụ";
                    kiemTra = true;
                    break;
                case "3":
                    viTri = "Chuyên viên";
                    kiemTra = true;
                    break;
                case "4":
                    viTri = "Giám sát";
                    kiemTra = true;
                    break;
                case "5":
                    viTri = "Quản lý";
                    kiemTra = true;
                    break;
                case "6":
                    viTri = "Giám đốc";
                    kiemTra = true;
                    break;

            }
            if (kiemTra){
                break;
            }else {
                System.out.println("vui long chon theo danh sach 1-4");
            }
        }
        return viTri;
    }
    public static String nhapLuong(){
        String luong = null;
        while (true){
            try{
                System.out.println("nhap luong nhan vien");
                luong = scanner.nextLine();
                DichVuException.kiemTraSo(luong);
                break;
            }catch (DichVuException e){
                System.err.println(e.getMessage());
            }
        }
        return luong;
    }



}
