package quanLyPhuongTien.controllers;

import quanLyPhuongTien.commons.GhiDocFile;
import quanLyPhuongTien.models.Oto;
import quanLyPhuongTien.models.PhuongTien;
import quanLyPhuongTien.models.XeMay;
import quanLyPhuongTien.models.XeTai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyChucNang {
    static Scanner scanner = new Scanner(System.in);

    public static void themMoiPhuongTien() {
        int chon;
        do {
            System.out.println("1. Thêm xe tải,\n" +
                    " \t2. Thêm ôtô, \n" +
                    "3. Thêm  xe máy.\n" +
                    "4. Tro ve menu chinh\n" +
                    "5.Thoat");
            do {
                try {
                    chon = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui long nhap so");
                    e.printStackTrace();
                }
            } while (true);
            switch (chon) {
                case 1:
                    themXeTai();
                    break;
                case 2:
                    themOto();
                    break;
                case 3:
                    themXeMay();
                    break;
                case 4:
                    return;
                case 5:
                    System.exit(0);

            }
        } while (true);
    }
    public static void themXeTai() {
        //String bienKiemSoat, String tenHSX, int namSX, String chuSoHuu, int taiTrong
        String bienKS = QuanLyNhapDuLieu.nhapBienKiemSoatXeTai();
        String tenHSX = QuanLyNhapDuLieu.nhapTenHangSanXuat();
        int namSx = QuanLyNhapDuLieu.nhapNamSanXuat();
        String chuSoHuu = QuanLyNhapDuLieu.nhapChuSoHuu();
        int taiTrong = QuanLyNhapDuLieu.nhapTaiTrongHoacCongSuat();

        List<PhuongTien> phuongTienList = new ArrayList<>();
        PhuongTien xetai = new XeTai(bienKS, tenHSX, namSx, chuSoHuu, taiTrong);
        phuongTienList.add(xetai);
        GhiDocFile.ghiFile("phuongtien.csv", phuongTienList, true);
    }
    public static void themOto() {
        //String bienKiemSoat, String tenHSX, int namSX, String chuSoHuu, int soChoNgoi, String kieuXe
        String bienKS = QuanLyNhapDuLieu.nhapBienKiemSoatOto();
        String tenHSX =QuanLyNhapDuLieu.nhapTenHangSanXuat();
        int namSx = QuanLyNhapDuLieu.nhapNamSanXuat();
        String chuSoHuu = QuanLyNhapDuLieu.nhapChuSoHuu();
        int soChoNgoi = QuanLyNhapDuLieu.nhapTaiTrongHoacCongSuat();
        String kieuXe = null;
        if (bienKS.contains("A")) {
            kieuXe = "Du Lich";
        } else if (bienKS.contains("B")) {
            kieuXe = "Xe Khach";
        }

        List<PhuongTien> phuongTienList = new ArrayList<>();
        PhuongTien oto = new Oto(bienKS, tenHSX, namSx, chuSoHuu, soChoNgoi, kieuXe);
        phuongTienList.add(oto);
        GhiDocFile.ghiFile("phuongtien.csv", phuongTienList, true);
    }
    public static void themXeMay() {
        //String bienKiemSoat, String tenHSX, int namSX, String chuSoHuu, int congSuat
        String bienKS = QuanLyNhapDuLieu.nhapBienKiemSoatXeMay();
        String tenHSX = QuanLyNhapDuLieu.nhapTenHangSanXuat();
        int namSx = QuanLyNhapDuLieu.nhapNamSanXuat();
        String chuSoHuu = QuanLyNhapDuLieu.nhapChuSoHuu();
        int congSuat = QuanLyNhapDuLieu.nhapTaiTrongHoacCongSuat();

        List<PhuongTien> phuongTienList = new ArrayList<>();
        PhuongTien xeMay = new XeMay(bienKS, tenHSX, namSx, chuSoHuu, congSuat);
        phuongTienList.add(xeMay);
        GhiDocFile.ghiFile("phuongtien.csv", phuongTienList, true);
    }

    public static void hienThiPhuongTien(){
        int chon;
        do {
            System.out.println("1. Hiện thị xe tải.\n" +
                    "2. Hiện thị ôtô. \n" +
                    "3. Hiện  xe máy.\n" +
                    "4.Hiện tất cả\n" +
                    "5.Tro lai menu chinh\n" +
                    "6.Thoat");
            do {
                try {
                    chon = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui long nhap so");
                    e.printStackTrace();
                }
            } while (true);
            switch (chon){
                case 1:
                    hienThiXeTai();
                    break;
                case 2:
                    hienThiOto();
                    break;
                case 3:
                    hienThiXeMay();
                    break;
                case 4:
                    hienThiTatCa();
                    break;
                case 5:
                    return;
                case 6:
                    System.exit(0);
            }
        }while (true);

    }
    public static void hienThiXeTai(){
        List<PhuongTien> phuongTienList = new ArrayList<>();
        phuongTienList = GhiDocFile.docFile("phuongtien.csv");
        //String bienKiemSoat, String tenHSX, int namSX, String chuSoHuu, int taiTrong)
        System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s","biển kiểm soát","Tên HSX","Năm Sản Xuất","Chủ sở hửu","Tải trọng");
        System.out.println();
        for (PhuongTien phuongTien : phuongTienList){
            if (phuongTien instanceof XeTai){
                System.out.printf("%-15s | %-15s | %-15s | %-15s | %-15s",phuongTien.getBienKiemSoat(),phuongTien.getTenHSX(),phuongTien.getNamSX(),phuongTien.getChuSoHuu(),((XeTai) phuongTien).getTaiTrong());
                System.out.println();
            }
        }
    }
    public static void hienThiOto(){
        List<PhuongTien> phuongTienList = new ArrayList<>();
        phuongTienList = GhiDocFile.docFile("phuongtien.csv");
        for (PhuongTien phuongTien : phuongTienList){
            if (phuongTien instanceof Oto){
                System.out.println(phuongTien);
            }
        }
    }
    public static void hienThiXeMay(){
        List<PhuongTien> phuongTienList = new ArrayList<>();
        phuongTienList = GhiDocFile.docFile("phuongtien.csv");
        for (PhuongTien phuongTien : phuongTienList){
            if (phuongTien instanceof XeMay){
                System.out.println(phuongTien);
            }
        }
    }
    public static void hienThiTatCa(){
        List<PhuongTien> phuongTienList = new ArrayList<>();
        phuongTienList = GhiDocFile.docFile("phuongtien.csv");
        for (PhuongTien phuongTien : phuongTienList){
            System.out.println(phuongTien);
        }
    }

    public static void xoaPhuongTien(){
        System.out.println("nhập vào biển kiểm soát muốn xóa");
        String bienKS = scanner.nextLine();
        boolean co = false;
        int chon;
        List<PhuongTien> phuongTienList = new ArrayList<>();
        phuongTienList = GhiDocFile.docFile("phuongtien.csv");
        for (int i =0;i<phuongTienList.size();i++){
            if (phuongTienList.get(i).getBienKiemSoat().equals(bienKS)){
               while (true){
                   System.out.println("Bạn có muốn xóa không :\n" +
                           "1.Có\n" +
                           "2.Không");
                   do {
                       try {
                           chon = Integer.parseInt(scanner.nextLine());
                           break;
                       } catch (NumberFormatException e) {
                           System.out.println("vui long nhap so");
                           e.printStackTrace();
                       }
                   } while (true);
                   switch (chon){
                       case 1:
                           phuongTienList.remove(phuongTienList.get(i));
                           GhiDocFile.ghiFile("phuongtien.csv",phuongTienList,false);
                           System.out.println("Đã xóa thành công");
                           co = true;
                           break;
                       case 2:
                           return;
                       default:
                           System.out.println("ban cho vuot qua danh muc");
                           break;
                   }
                   if (co){
                       break;
                   }
               }
               break;
            }
        }
    }

}
