package quanLyHoaDonTienDien.commons;

import quanLyHoaDonTienDien.models.HoaDon;
import quanLyHoaDonTienDien.models.KhachHang;
import quanLyHoaDonTienDien.models.KhachHangNuocNgoai;
import quanLyHoaDonTienDien.models.KhachHangVietNam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GhiDocFile  {
    static Scanner scanner = new Scanner(System.in);
    public static final String PATHHD = "src/quanLyHoaDonTienDien/data/hoadon.csv";
    public static final String PATHKH = "src/quanLyHoaDonTienDien/data/khachhang.csv";
    public static final String PATHLOAIKH = "src/quanLyHoaDonTienDien/data/loaikhach.csv";

    public static void ghiFileKhachHang(List<KhachHang> khachHangList,boolean trangThai){
        File file = new File(PATHKH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            List<KhachHang> khachHangList1 = new ArrayList<>();
            for (KhachHang khachHang : khachHangList){
                bufferedWriter.write(khachHang.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileWriter.close();
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List<KhachHang> docFileKhachHang(){
        File file = new File(PATHKH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<KhachHang> khachHangList = new ArrayList<>();
        String[] strings = null;
        String line = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                strings = line.split(",");
                if (strings.length == 4){
                    KhachHang khachHangVN = new KhachHangVietNam(strings[0],strings[1],strings[2],Integer.parseInt(strings[3]));
                    khachHangList.add(khachHangVN);
                }else {
                    KhachHang khachHangNN = new KhachHangNuocNgoai(strings[0],strings[1],strings[2]);
                    khachHangList.add(khachHangNN);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return khachHangList;
    }

    public static List<String> docFileLoaiKH(){
        File file = new File(PATHLOAIKH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();
        String line = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                stringList.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return stringList;
    }

    public static void ghiFileHoaDon(List<HoaDon> hoaDonList,boolean trangThai){
        File file = new File(PATHHD);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (HoaDon hoaDon : hoaDonList){
                bufferedWriter.write(hoaDon.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List<HoaDon> docFileHoaDon(){
        File file = new File(PATHHD);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<HoaDon> hoaDonList = new ArrayList<>();
        String[] strings = null;
        String line = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                strings = line.split(",");
                HoaDon hoaDon = new HoaDon(strings[0],strings[1],strings[2],Integer.parseInt(strings[3]),Double.parseDouble(strings[4]),Double.parseDouble(strings[5]));
                hoaDonList.add(hoaDon);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return hoaDonList;
    }

    public static List<String[]> docFileKhachHangString(){
        File file = new File(PATHKH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> arrayList = new ArrayList<>();
        String[] strings = null;
        String line = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                strings = line.split(",");
                arrayList.add(strings);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
