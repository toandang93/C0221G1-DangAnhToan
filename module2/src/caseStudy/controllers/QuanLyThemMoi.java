package caseStudy.controllers;

import caseStudy.commons.GhiDocFile;
import caseStudy.models.DichVu;
import caseStudy.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyThemMoi {
    static Scanner scanner = new Scanner(System.in);
    public static void themMoiVilla(){
        //Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
        String tenDV = QuanLyNhapDuLieu.nhapTenDichVu("Villa");
        String dienTich = QuanLyNhapDuLieu.nhapDienTichSuDung();
        String chiPhi = QuanLyNhapDuLieu.nhapChiPhiThue();
        String soLuongNguoi = QuanLyNhapDuLieu.nhapSoLuongNguoi();
        String kieuThue = QuanLyNhapDuLieu.nhapKieuThue();
        String tieuChuanPhong = QuanLyNhapDuLieu.nhapTieuChuanPhong();
        String moTaTienNghi = QuanLyNhapDuLieu.nhapMoTaTienNghi();
        String dienTichHoBoi = QuanLyNhapDuLieu.nhapDienTichHoBoi();
        String soTang = QuanLyNhapDuLieu.nhapSoTang();

        List<DichVu> dichVuList = new ArrayList<>();
        DichVu villa = new Villa(tenDV,dienTich,chiPhi,soLuongNguoi,kieuThue,tieuChuanPhong,moTaTienNghi,dienTichHoBoi,soTang);
        dichVuList.add(villa);
        GhiDocFile.ghiFile("villa.csv",dichVuList,true);
    }
    public static void themMoiNha(){
       //String ten, String dienTich, String chiPhiThue, String soLuongNguoi,
        // String kieuThue, String tieuChuanPhong, String moTaTienNghi, int soTang)
        String tenDV = QuanLyNhapDuLieu.nhapTenDichVu("Nha");
        String dienTich = QuanLyNhapDuLieu.nhapDienTichSuDung();
        String chiPhi = QuanLyNhapDuLieu.nhapChiPhiThue();
        String soLuongNguoi = QuanLyNhapDuLieu.nhapSoLuongNguoi();
        String kieuThue = QuanLyNhapDuLieu.nhapKieuThue();
        String tieuChuanPhong = QuanLyNhapDuLieu.nhapTieuChuanPhong();
        String moTaTienNghi = QuanLyNhapDuLieu.nhapMoTaTienNghi();
        String soTang = QuanLyNhapDuLieu.nhapSoTang();

        List<DichVu> dichVuList = new ArrayList<>();
        DichVu villa = new Villa(tenDV,dienTich,chiPhi,soLuongNguoi,kieuThue,tieuChuanPhong,moTaTienNghi,dienTichHoBoi,soTang);
        dichVuList.add(villa);
        GhiDocFile.ghiFile("villa.csv",dichVuList,true);
    }

}
