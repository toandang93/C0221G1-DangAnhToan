package controllers;

import java.util.Scanner;

public class DanhMuc {
    static Scanner scanner = new Scanner(System.in);

    public static void danhMuc(){
        String chon = null;
        while (true){
            System.out.println("Danh mục:\n" +
                    "1.Nhập thông tin mới cho cán bộ\n" +
                    "2.Sắp xếp theo tên\n" +
                    "3.Xóa theo danh sách\n" +
                    "4.Hiển thị thông tin về danh sách cán bộ\n" +
                    "5.Tìm kiếm tương đối\n" +
                    "6.Thoát");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    QuanLyChucNang.nhapThongTin();
                    break;
                case "2":
                    QuanLyChucNang.sapXep();
                    break;
                case "3":
                    QuanLyChucNang.xoa();
                    break;
                case "4":
                    QuanLyChucNang.hienThi();
                    break;
                case "5":
                    QuanLyChucNang.timKiemTuongDoi();
                    break;
                case "6":
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn theo danh mục");

            }
        }
    }
}
