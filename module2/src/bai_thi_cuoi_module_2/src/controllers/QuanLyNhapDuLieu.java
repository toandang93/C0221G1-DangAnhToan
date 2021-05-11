package controllers;

import commons.DanhBaException;

import java.util.Scanner;

public class QuanLyNhapDuLieu {
    static Scanner scanner = new Scanner(System.in);
    public static String nhapSoDt(){
        String soDt = null;
        String regex = "^[0-9]{4}.[0-9]{3}.[0-9]{3}$";
        while (true){
            try{
                System.out.println("Nhập vào số điện thoại");
                soDt = scanner.nextLine();
                DanhBaException.kiemTra(soDt,regex,"Vui lòng nhập theo định dạng XXXX.XXX.XXX");
                return soDt;
            }catch (DanhBaException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapNhom(){
        String nhom = null;
        String regex = "^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$";
        while (true){
            try{
                System.out.println("Nhập vào nhóm danh bạ");
                nhom = scanner.nextLine();
                DanhBaException.kiemTra(nhom,regex,"Vui lòng nhập đúng định dạng,viết hoa chữ cái đầu");
                return nhom;
            }catch (DanhBaException e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static String nhapHoTen(){
        String hoTen = null;
        String regex = "^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$";
        while (true){
            try{
                System.out.println("Nhập vào họ tên");
                hoTen = scanner.nextLine();
                DanhBaException.kiemTra(hoTen,regex,"Vui lòng nhập theo định dạng tên,viết hoa chữ cái đầu");
                return hoTen;
            }catch (DanhBaException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapGioiTinh(){
        String chon = null;
        boolean kiemTra = false;
        String gioiTinh = null;
        while (true){
            System.out.println("Chọn giới tính : \n" +
                    "1.Nam\n" +
                    "2.Nữ");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    gioiTinh = "Nam";
                    kiemTra = true;
                    break;
                case "2":
                    gioiTinh = "Nữ";
                    kiemTra = true;
                    break;
                default:
                    System.out.println("vui lòng chọn  1 hoặc 2");
            }
            if (kiemTra){
                break;
            }
        }
        return gioiTinh;
    }
    public static String nhapDiaChi(){
        String diaChi = null;
        String regex = "^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$";
        while (true){
            try{
                System.out.println("Nhập vào địa chỉ");
                diaChi = scanner.nextLine();
                DanhBaException.kiemTra(diaChi,regex,"Vui lòng nhập theo định dạng viết hoa chữ cái đầu");
                return diaChi;
            }catch (DanhBaException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapNgaySinh(){
        String ngaySinh = null;
        String regex = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
        while (true){
            try{
                System.out.println("Nhập vào ngày sinh");
                ngaySinh = scanner.nextLine();
                DanhBaException.kiemTra(ngaySinh,regex,"Vui lòng nhập theo định dạng dd/mm/yyyy");
                return ngaySinh;
            }catch (DanhBaException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public static String nhapEmail(){
        String email = null;
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        while (true){
            try{
                System.out.println("Nhập vào email");
                email = scanner.nextLine();
                DanhBaException.kiemTra(email,regex,"Vui lòng nhập theo định dạng XXX@mail.XXX");
                return email;
            }catch (DanhBaException e){
                System.err.println(e.getMessage());
            }
        }
    }

}
