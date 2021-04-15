package bai_11_collectionFarmword.bai_tap.quanLySanPham_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class QuanLy {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<SanPham> sanphams = new ArrayList<>();

    public static void add() {
        System.out.println("Nhập vào id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm");
        double price = Double.parseDouble(scanner.nextLine());
        sanphams.add(new SanPham(id, name, price));
    }

    public static void remove() {
        System.out.println("Nhập vào id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (SanPham sanPham : sanphams) {
            if (sanPham.getId() == id) {
                sanphams.remove(sanPham);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có id :" + id);
    }

    public static void edit() {
        System.out.println("Nhập vào id sản phẩm cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (SanPham sanpham : sanphams) {
            if (sanpham.getId() == id) {
                System.out.println("Nhập vào tên mới của sản phẩm");
                String name = scanner.nextLine();
                System.out.println("Nhập vào đơn giá mới của sản phẩm");
                double price = Double.parseDouble(scanner.nextLine());
                sanpham.setName(name);
                sanpham.setPrice(price);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có id " + id);
    }

    public static void show() {
        for (SanPham temp : sanphams) {
            System.out.println(temp);
        }
    }

    public static void search() {
        System.out.println("Nhập vào tên sản phẩm cần tìm kiếm");
        String name = scanner.nextLine();
        for (SanPham sanpham : sanphams) {
            if (sanpham.getName().equals(name)) {
                System.out.println(sanpham);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm : " + name);
    }

    public static void sortUp() {
        sanphams.sort(Comparator.comparing(SanPham::getPrice));
    }

    public static void sortDown() {
        sanphams.sort(Comparator.comparing(SanPham::getPrice).reversed());
    }

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("Chọn mục theo bản sau : " + "\n"
                    + "1.Thêm sản phẩm " + "\n"
                    + "2.Sửa sản phẩm " + "\n"
                    + "3.Xóa sản phẩm " + "\n"
                    + "4.Tìm kiếm sản phẩm" + "\n"
                    + "5.Hiển thị" + "\n"
                    + "6.Sắp xếp tăng dần" + "\n"
                    + "7.Sắp xếp giảm dần" + "\n"
                    + "8.Thóat" + "\n");
            System.out.println("Chọn mục");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    show();
                    break;
                case 6:
                    sortUp();
                    break;
                case 7:
                    sortDown();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Mời bạn chọn các mục trong bảng");
            }
        } while (choose != 8);
    }
}
