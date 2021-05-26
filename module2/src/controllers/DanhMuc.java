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
                    controllers.QuanLyChucNang.hienThiDanhBa();
                    break;
                case "2":
                    controllers.QuanLyChucNang.themMoiDanhBa();
                    break;
                case "3":
                    controllers.QuanLyChucNang.capNhatDanhBa();
                    break;
                case "4":
                    controllers.QuanLyChucNang.xoaDanhBa();
                    break;
                case "5":
                    controllers.QuanLyChucNang.timKiemDanhBa();
                    break;
                case "6":
                    controllers.QuanLyChucNang.docVaoFile();
                    break;
                case "7":
                    controllers.QuanLyChucNang.ghiVaoFile();
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
