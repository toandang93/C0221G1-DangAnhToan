package controllers;

import commons.GhiDocFile;
import models.CanBo;
import models.CongNhan;
import models.KySu;
import models.NhanVien;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner scanner = new Scanner(System.in);
    public static void nhapThongTin(){
        String chon = null;
        while (true){
            System.out.println("Chọn cán bộ\n" +
                    "1.Công nhân\n" +
                    "2.Kỹ sư\n" +
                    "3.Nhân viên\n" +
                    "4.Trở lại danh mục\n" +
                    "5.Thoát");
            chon= scanner.nextLine();
            switch (chon){
                case "1":
                    nhapCongNhan();
                    break;
                case "2":
                    nhapKySu();
                    break;
                case "3":
                    nhapNhanVien();
                    break;
                case "4":
                    return;
                    //Danhmuc.danhmuc();
                case "5":
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn theo danh sách");
            }
        }
    }
    public static void nhapCongNhan(){
        String id = QuanLyNhapDuLieu.nhapID();
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String namSinh = QuanLyNhapDuLieu.nhapNamSinh();
        String gioiTinh = QuanLyNhapDuLieu.nhapGioiTinh();
        String diaChi = QuanLyNhapDuLieu.nhapDiaChi();
        String bac = QuanLyNhapDuLieu.nhapBac();

        CanBo congNhan = new CongNhan(id,hoTen,namSinh,gioiTinh,diaChi,bac);
        List<CanBo> canBoList = new ArrayList<>();
        canBoList.add(congNhan);
        GhiDocFile.ghiFile("canbo.csv",canBoList,true);
    }
    public static void nhapKySu(){
        String id = QuanLyNhapDuLieu.nhapID();
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String namSinh = QuanLyNhapDuLieu.nhapNamSinh();
        String gioiTinh = QuanLyNhapDuLieu.nhapGioiTinh();
        String diaChi = QuanLyNhapDuLieu.nhapDiaChi();
        String nganhDaoTao = QuanLyNhapDuLieu.nhapNganhDaoTao();

        CanBo kySu = new KySu(id,hoTen,namSinh,gioiTinh,diaChi,nganhDaoTao);
        List<CanBo> canBoList = new ArrayList<>();
        canBoList.add(kySu);
        GhiDocFile.ghiFile("canbo.csv",canBoList,true);
    }
    public static void nhapNhanVien(){
        String id = QuanLyNhapDuLieu.nhapID();
        String hoTen = QuanLyNhapDuLieu.nhapHoTen();
        String namSinh = QuanLyNhapDuLieu.nhapNamSinh();
        String gioiTinh = QuanLyNhapDuLieu.nhapGioiTinh();
        String diaChi = QuanLyNhapDuLieu.nhapDiaChi();
        String congViec = QuanLyNhapDuLieu.nhapCongViec();

        CanBo nhanVien = new NhanVien(id,hoTen,namSinh,gioiTinh,diaChi,congViec);
        List<CanBo> canBoList = new ArrayList<>();
        canBoList.add(nhanVien);
        GhiDocFile.ghiFile("canbo.csv",canBoList,true);
    }

    public static void sapXep(){
        List<CanBo> canBoList = GhiDocFile.docFile("canbo.csv");
        canBoList.sort(Comparator.comparing(CanBo::getHoTen));
        for (CanBo canBo : canBoList){
            canBo.showInfo();
        }
    }

    public static void xoa(){
        boolean kiemTra = false;
        String chon = null;
        List<CanBo> canBoList = GhiDocFile.docFile("canbo.csv");
        while (true){
            for (int i =0;i<canBoList.size();i++){
                System.out.println((i+1)+" . "+canBoList.get(i));
            }
            chon = scanner.nextLine();
            for (int i =0;i<canBoList.size();i++){
               if (i == (Integer.parseInt(chon)-1)){
                   System.out.println("Bạn có muốn xóa không\n" +
                           "1.Có\n" +
                           "2.Không");
                   String chon2 = scanner.nextLine();
                   switch (chon2){
                       case "1":
                           canBoList.remove(canBoList.get(i));
                           kiemTra = true;
                           break;
                       case "2":
                           return;
                       default:
                           System.out.println("vui lòng chọn 1 hoặc 2");
                           break;
                   }
               }
            }
            if (kiemTra){
                GhiDocFile.ghiFile("canbo.csv",canBoList,false);
                break;
            }
        }
    }

    public static void hienThi(){
        String chon = null;
        while (true){
            System.out.println("chọn cán bộ hiển thị\n" +
                    "1.Công nhân\n" +
                    "2.Kỹ sư\n" +
                    "3.Nhân viên\n" +
                    "4.Hiển thị tất cả\n" +
                    "5.Trở danh mục\n" +
                    "6.Thoát");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    hienThiCongNhan();
                    break;
                case "2":
                    hienThiKySu();
                    break;
                case "3":
                    hienThiNhanVien();
                    break;
                case "4":
                    hienThiTatCa();
                    break;
                case "5":
                    return;
                case "6":
                    System.exit(0);
            }
        }
    }
    public static void hienThiCongNhan(){
        List<CanBo> canBoList = GhiDocFile.docFile("canbo.csv");
        for (CanBo canBo : canBoList){
            if (canBo instanceof CongNhan){
                canBo.showInfo();
            }
        }
    }
    public static void hienThiKySu(){
        List<CanBo> canBoList = GhiDocFile.docFile("canbo.csv");
        for (CanBo canBo : canBoList){
            if (canBo instanceof KySu){
                canBo.showInfo();
            }
        }
    }
    public static void hienThiNhanVien(){
        List<CanBo> canBoList = GhiDocFile.docFile("canbo.csv");
        for (CanBo canBo : canBoList){
            if (canBo instanceof NhanVien){
                canBo.showInfo();
            }
        }
    }
    public static void hienThiTatCa(){
        List<CanBo> canBoList = GhiDocFile.docFile("canbo.csv");
        for (CanBo canBo : canBoList){
                canBo.showInfo();
        }
    }

    public static void timKiemTuongDoi(){
        boolean kiemTra = false;
        System.out.println("nhập vào tên cần tìm kiếm");
        String ten = scanner.nextLine();
        List<CanBo> canBoList = GhiDocFile.docFile("canbo.csv");
        for (CanBo canBo : canBoList){
            if (canBo.getHoTen().contains(ten)){
                canBo.showInfo();
                kiemTra= true;
            }
        }
        if (!kiemTra){
            System.out.println("không tìm thấy tên theo yêu cầu");
        }
    }
}
