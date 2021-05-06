package caseStudy.controllers;

import caseStudy.commons.GD;
import caseStudy.commons.GhiDocFiles;
import caseStudy.models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuanLyHienThi {
    public static void hienThiVilla(){
        List<String[]> strings = GhiDocFiles.docFile("villa.csv");
        List<Villa> villaList = new ArrayList<>();
        for (String[] strings1 : strings){
            Villa villa = new Villa(strings1);
            villaList.add(villa);
        }
        for (Villa villa: villaList){
            villa.showInfo();
        }

    }
    public static void hienThiNha(){
        List<String[]> strings = GhiDocFiles.docFile("nha.csv");
        List<Nha> nhaList = new ArrayList<>();
        for (String[] strings1 : strings){
           Nha nha = new Nha(strings1);
           nhaList.add(nha);
        }
        for (Nha nha : nhaList){
            nha.showInfo();
        }
    }
    public static void hienThiPhong(){
        List<String[]> strings = GhiDocFiles.docFile("phong.csv");
        List<Phong> phongList = new ArrayList<>();
        for (String[] strings1 : strings){
            Phong phong = new Phong(strings1);
            phongList.add(phong);
        }
        for (Phong phong : phongList){
            phong.showInfo();
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
