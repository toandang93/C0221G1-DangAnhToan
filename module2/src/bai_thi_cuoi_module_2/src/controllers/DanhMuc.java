package controllers;

import java.util.Scanner;

public class DanhMuc {
    static Scanner scanner = new Scanner(System.in);
    public static void danhMuc(){
        String chon = null;
        while (true){
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----\n" +
                    "Chọn chức năng theo số ( để tiếp tục)\n" +
                    "1.Xem danh sách\n" +
                    "2.Thêm mới\n" +
                    "3.Cập nhật\n" +
                    "4.Xóa\n" +
                    "5.Tìm kiếm\n" +
                    "6.Đọc từ file\n" +
                    "7.Ghi vào file\n" +
                    "8.Thoát");
            System.out.print("Chọn chức năng :");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    QuanLyChucNang.hienThiDanhBa();
                    break;
                case "2":
                    QuanLyChucNang.themMoiDanhBa();
                    break;
                case "3":
                    QuanLyChucNang.capNhatDanhBa();
                    break;
                case "4":
                    QuanLyChucNang.xoaDanhBa();
                    break;
                case "5":
                    QuanLyChucNang.timKiemDanhBa();
                    break;
                case "6":
                    QuanLyChucNang.docVaoFile();
                    break;
                case "7":
                    QuanLyChucNang.ghiVaoFile();
                    break;
                case "8":
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn theo danh sách , nhập số để chọn");
                    break;

            }
        }
    }
}
