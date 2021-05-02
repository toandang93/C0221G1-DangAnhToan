package quanLyPhuongTien.controllers;

import quanLyPhuongTien.commons.GhiDocFile;
import quanLyPhuongTien.commons.PhuongTienException;
import quanLyPhuongTien.models.PhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhapDuLieu {
    static Scanner scanner = new Scanner(System.in);

    //Biển kiểm soát , tên hãng sản xuất, năm sản xuất, chủ sở hữu.
    public static String nhapBienKiemSoatOto() {
        boolean kiemTra = true;
        String bienKS = null;
        while (true) {
            while (true) {
                try {
                    System.out.println("nhap bien kiem soat oto");
                    bienKS = scanner.nextLine();
                    PhuongTienException.kiemTraBienKiemSoatOto(bienKS);
                    break;
                } catch (PhuongTienException e) {
                    System.err.println(e.getMessage());
                }
            }
            List<PhuongTien> phuongTienList = new ArrayList<>();
            phuongTienList = GhiDocFile.docFile("phuongtien.csv");
            for (PhuongTien phuongTien : phuongTienList) {
                if (phuongTien.getBienKiemSoat().equals(bienKS)) {
                    System.err.println("Biển kiểm soát đã tồn tại - mời bạn nhập lại");
                    kiemTra = false;
                    break;
                }
            }
            if (kiemTra) {
                break;
            }
        }
        return bienKS;
    }

    public static String nhapBienKiemSoatXeTai() {
        boolean kiemTra = true;
        String bienKS = null;
        while (true) {
            while (true) {
                try {
                    System.out.println("nhap bien kiem soat xe tai");
                    bienKS = scanner.nextLine();
                    PhuongTienException.kiemTraBienKiemSoatXeTai(bienKS);
                    break;
                } catch (PhuongTienException e) {
                    System.err.println(e.getMessage());
                }
            }
            List<PhuongTien> phuongTienList = new ArrayList<>();
            phuongTienList = GhiDocFile.docFile("phuongtien.csv");
            for (PhuongTien phuongTien : phuongTienList) {
                if (phuongTien.getBienKiemSoat().equals(bienKS)) {
                    System.err.println("Biển kiểm soát đã tồn tại - mời bạn nhập lại");
                    kiemTra = false;
                    break;
                }
            }
            if (kiemTra) {
                break;
            }
        }
        return bienKS;
    }

    public static String nhapBienKiemSoatXeMay() {
        boolean kiemTra = true;
        String bienKS = null;
        while (true) {
            while (true) {
                try {
                    System.out.println("nhap bien kiem soat xe may");
                    bienKS = scanner.nextLine();
                    PhuongTienException.kiemTraBienKiemSoatXeMay(bienKS);
                    break;
                } catch (PhuongTienException e) {
                    System.err.println(e.getMessage());
                }
            }
            List<PhuongTien> phuongTienList = new ArrayList<>();
            phuongTienList = GhiDocFile.docFile("phuongtien.csv");
            for (PhuongTien phuongTien : phuongTienList) {
                if (phuongTien.getBienKiemSoat().equals(bienKS)) {
                    System.err.println("Biển kiểm soát đã tồn tại - mời bạn nhập lại");
                    kiemTra = false;
                    break;
                }
            }
            if (kiemTra) {
                break;
            }
        }
        return bienKS;
    }

    public static String nhapTenHangSanXuat() {
        String tenHSX = null;
        List<String> stringList = new ArrayList<>();
        stringList = GhiDocFile.docFileHangSanXuat("tenHangSanXuat.csv");
        int chon;
        do {
            for (int i = 0; i < stringList.size(); i++) {
                System.out.println((i + 1) + " :" + stringList.get(i));
            }
            System.out.println("Chọn theo danh mục");
            while (true) {
                try {
                    chon = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("vui long nhap so");
                    e.printStackTrace();
                }
            }
            if (chon >= 0 && chon <= stringList.size()) {
                for (int i = 0; i < stringList.size(); i++) {
                    if (i == chon - 1) {
                        tenHSX = stringList.get(i).split(",")[1];
                        break;
                    }
                }
            } else {
                System.out.println("ban chon vuot qua danh muc");
            }
        }while (chon> stringList.size());
        return tenHSX;

    }

    public static int nhapNamSanXuat() {
        String chuoiNam = null;
        int nam = 0;
        while (true) {
            try {
                System.out.println("nhap nam san xuat");
                chuoiNam = scanner.nextLine();
                PhuongTienException.kiemTraNam(chuoiNam);
                nam = Integer.parseInt(chuoiNam);
                break;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        }
        return nam;
    }

    public static String nhapChuSoHuu() {
        String ten = null;
        while (true) {
            try {
                System.out.println("Nhap ten chu so huu");
                ten = scanner.nextLine();
                PhuongTienException.kiemTraTen(ten);
                break;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        }
        return ten;
    }

    public static int nhapTaiTrongHoacCongSuat() {
        String chuoiSo = null;
        int so = 0;
        while (true) {
            try {
                System.out.println("Tai trong hoac cong suat");
                chuoiSo = scanner.nextLine();
                PhuongTienException.kiemTraSo(chuoiSo);
                so = Integer.parseInt(chuoiSo);
                break;
            } catch (PhuongTienException e) {
                System.err.println(e.getMessage());
            }
        }
        return so;
    }
}
