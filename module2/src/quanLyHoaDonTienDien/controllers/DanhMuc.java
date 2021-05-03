package quanLyHoaDonTienDien.controllers;

import java.util.Scanner;

public class DanhMuc {
    static Scanner scanner = new Scanner(System.in);
    public static void danhMuc(){
        int chon;
        do {
            System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới khách hàng.\n" +
                    "2. Hiện thị thông tin khách hàng\n" +
                    "3. Tìm kiếm khách hàng\n" +
                    "4. Thêm mới hóa đơn\n" +
                    "5. Chua Lam Phan Nay\n" +
                    "6. Hiện thị thông  tin chi tiết hóa đơn\n" +
                    "7. Thoát\n");
            while (true){
                try{
                    chon = Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("vui long nhap so");
                    e.printStackTrace();
                }
            }
            switch (chon){
                case 1:
                    QuanLyChucNang.themMoiKhachhang();
                    break;
                case 2:
                    QuanLyChucNang.hienThiThongTinKhachHang();
                    break;
                case 3:
                    QuanLyChucNang.timKiemKhachHang();
                    break;
                case 4:
                    QuanLyChucNang.themHoaDon();
                    break;
                case 5:
                    break;
                case 6:
                    QuanLyChucNang.hienThiThongTinChiTietHoaDon();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("vui long chon theo danh muc");
                    break;
            }
        }while (true);
    }
}
