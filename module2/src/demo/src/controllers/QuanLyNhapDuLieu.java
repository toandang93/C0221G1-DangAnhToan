package controllers;

import commons.CanBoException;
import commons.GhiDocFile;
import models.CanBo;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhapDuLieu {
    //String id, String hoTen, String namSinh, String gioiTinh, String diaChi
    static Scanner scanner = new Scanner(System.in);
    public static String nhapID(){
        //:  id(Tự tăng CB-001)
        String ma = "CB-";
        String id = "";
        String regex = "^CB-[0-9]{3}$";
        List<CanBo> canBoList = GhiDocFile.docFile("canbo.csv");
        while (true){
            id = ma + (canBoList.size() +1);
            if(id.matches(regex)){
                break;
            }
            ma +=0;
            id="";
        }
        return id;
    }

    public static String nhapHoTen(){
        String hoTen = null;
        while (true){
            try{
                System.out.println("nhập họ tên");
                hoTen = scanner.nextLine();
                CanBoException.kiemTraTen(hoTen);
                break;
            }catch (CanBoException e){
                System.err.println(e.getMessage());
            }
        }
       return hoTen;
    }

    public static String nhapNamSinh(){
        String namSinh = null;
        while (true){
            try{
                System.out.println("nhập năm sinh");
                namSinh = scanner.nextLine();
                CanBoException.kiemTraNamSInh(namSinh);
                break;
            }catch (CanBoException e){
                System.err.println(e.getMessage());
            }
        }
        return namSinh;
    }

    public static String nhapGioiTinh(){
        String chon = null;
        String gioiTinh = null;
        while (true){
            System.out.println("Chọn giới tính\n" +
                    "1.nam\n" +
                    "2.nữ");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    gioiTinh = "Nam";
                    return gioiTinh;
                case "2":
                    gioiTinh = "Nữ";
                    return gioiTinh;
                default:
                    System.out.println("vui lòng chọn 1 hoặc 2");
            }
        }
    }

    public static String nhapDiaChi(){
        String diaChi = null;
        while (true){
            try{
                System.out.println("nhập địa chỉ");
                diaChi = scanner.nextLine();
                CanBoException.kiemTraTen(diaChi);
                break;
            }catch (CanBoException e){
                System.err.println(e.getMessage());
            }
        }
        return diaChi;
    }

    public static String nhapBac(){
        String bac = null;
        while (true){
            try{
                System.out.println("nhập cấp bậc");
                bac = scanner.nextLine();
                CanBoException.kiemTraBac(bac);
                break;
            }catch (CanBoException e){
                System.err.println(e.getMessage());
            }
        }
        return bac;
    }

    public static String nhapCongViec(){
        String chon = null;
        String congViec = null;
        while (true){
            System.out.println("Chọn công việc\n" +
                    "1.PV-Ngoài trời\n" +
                    "2.PV-Trong nhà");
            chon = scanner.nextLine();
            switch (chon){
                case "1":
                    congViec = "PV-Ngoài trời";
                    return congViec;
                case "2":
                    congViec = "PV-Trong nhà";
                    return congViec;
                default:
                    System.out.println("vui lòng chọn 1 hoặc 2");
            }
        }
    }

    public static String nhapNganhDaoTao(){
        String chon = null;
        String nganhDaoTao = null;
        List<String> stringsList = GhiDocFile.docFileNganhDaoTao();
        while (true){
            for (int i =0;i<stringsList.size();i++){
                System.out.println((i+1)+" . "+ stringsList.get(i));
            }
            chon = scanner.nextLine();
            for (int i =0;i<stringsList.size();i++){
                if (i== (Integer.parseInt(chon)-1)){
                    nganhDaoTao = stringsList.get(i).split(",")[1];
                    return nganhDaoTao;
                }
            }
            System.out.println("vui lòng chọn theo danh sách");
        }
    }


}
