package caseStudy.controllers;

import caseStudy.commons.GD;
import caseStudy.commons.GhiDocFiles;
import caseStudy.models.DichVu;
import caseStudy.models.KhachHang;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLyHienThi {
    public static void hienThiVilla(){
        List<String[]> strings = GhiDocFiles.docFile("villa.csv");
        for (String[] strings1 : strings){
            System.out.println(strings1);
        }

    }
    public static void hienThiNha(){
        List<String[]> strings = GhiDocFiles.docFile("nha.csv");
        for (String[] strings1 : strings){
            System.out.println(strings1);
        }
    }
    public static void hienThiPhong(){
        List<String[]> strings = GhiDocFiles.docFile("phong.csv");
        for (String[] strings1 : strings){
            System.out.println(strings1);
        }
    }
    public static void hienThiKhachHang(){
        List<String[]> strings = GhiDocFiles.docFile("khachhang.csv");
        List<KhachHang> khachHangList = new ArrayList<>();
        for (String[] string : strings){
            khachHangList.add(new KhachHang(string));
        }
        khachHangList.sort(Comparator.comparing(KhachHang::getTenKhachHang));
        for (KhachHang khachHang : khachHangList){
            khachHang.showInfo();
        }

    }

}
