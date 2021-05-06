package caseStudy.controllers;

import caseStudy.commons.GD;
import caseStudy.commons.GhiDocFiles;
import caseStudy.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyThemMoiCacDichVu {
    static Scanner scanner = new Scanner(System.in);
    public static void themMoiVilla(){

        //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
        String id = QuanLyNhapDuLieu.nhapidDichVuVilla();
        String tenDV = QuanLyNhapDuLieu.nhapTenDichVu("Villa");
        String dienTich = QuanLyNhapDuLieu.nhapDienTichSuDung();
        String chiPhi = QuanLyNhapDuLieu.nhapChiPhiThue();
        String soLuongNguoi = QuanLyNhapDuLieu.nhapSoLuongNguoi();
        String kieuThue = QuanLyNhapDuLieu.nhapKieuThue();
        String tieuChuanPhong = QuanLyNhapDuLieu.nhapTieuChuanPhong();
        String moTaTienNghi = QuanLyNhapDuLieu.nhapMoTaTienNghi();
        String dienTichHoBoi = QuanLyNhapDuLieu.nhapDienTichHoBoi();
        String soTang = QuanLyNhapDuLieu.nhapSoTang();

        List<Villa> list = new ArrayList<Villa>();
        Villa villa = new Villa(id,tenDV,dienTich,chiPhi,soLuongNguoi,kieuThue,tieuChuanPhong,moTaTienNghi,dienTichHoBoi,soTang);
        list.add(villa);
        GhiDocFiles.ghiFile("villa.csv",list,true);
    }
    public static void themMoiNha(){
       //String ten, String dienTich, String chiPhiThue, String soLuongNguoi,
        // String kieuThue, String tieuChuanPhong, String moTaTienNghi, int soTang)
        String id = QuanLyNhapDuLieu.nhapidDichVuNha();
        String tenDV = QuanLyNhapDuLieu.nhapTenDichVu("Nha");
        String dienTich = QuanLyNhapDuLieu.nhapDienTichSuDung();
        String chiPhi = QuanLyNhapDuLieu.nhapChiPhiThue();
        String soLuongNguoi = QuanLyNhapDuLieu.nhapSoLuongNguoi();
        String kieuThue = QuanLyNhapDuLieu.nhapKieuThue();
        String tieuChuanPhong = QuanLyNhapDuLieu.nhapTieuChuanPhong();
        String moTaTienNghi = QuanLyNhapDuLieu.nhapMoTaTienNghi();
        String soTang = QuanLyNhapDuLieu.nhapSoTang();

        List<Nha> list = new ArrayList<Nha>();
        Nha nha  = new Nha(id,tenDV,dienTich,chiPhi,soLuongNguoi,kieuThue,tieuChuanPhong,moTaTienNghi,Integer.parseInt(soTang));
        list.add(nha);
        GhiDocFiles.ghiFile("nha.csv",list,true);
    }
    public static void themMoiPhong(){
        //tenDichVu, String donVi, double giaTien
        String id = QuanLyNhapDuLieu.nhapidDichVuPhong();
        String tenDV = QuanLyNhapDuLieu.nhapTenDichVu("Phong");
        String dienTich = QuanLyNhapDuLieu.nhapDienTichSuDung();
        String chiPhi = QuanLyNhapDuLieu.nhapChiPhiThue();
        String soLuongNguoi = QuanLyNhapDuLieu.nhapSoLuongNguoi();
        String kieuThue = QuanLyNhapDuLieu.nhapKieuThue();
        String tenDichVu = QuanLyNhapDuLieu.nhapTenDichVuDiKem();
        String donVi = QuanLyNhapDuLieu.nhapDonViDichVuDiKem();
        double giaTien = QuanLyNhapDuLieu.nhapGiaTien();

        List<Phong> list = new ArrayList<Phong>();
        Phong phong  = new Phong(id,tenDV,dienTich,chiPhi,soLuongNguoi,kieuThue,new DichVuDiKem(tenDichVu,donVi,giaTien));
        list.add(phong);
        GhiDocFiles.ghiFile("phong.csv",list,true);
    }


}
