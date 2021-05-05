package caseStudy.controllers;

import caseStudy.commons.GhiDocFile;
import caseStudy.models.DichVu;

import java.util.List;

public class QuanLyHienThi {
    public static void hienThiVilla(){
        List<DichVu> dichVuList = GhiDocFile.docFile("villa.csv");
        for (DichVu dichVu : dichVuList){
            System.out.println(dichVu);
        }
    }
    public static void hienThiNha(){
        List<DichVu> dichVuList = GhiDocFile.docFile("nha.csv");
            for (DichVu dichVu : dichVuList){
                System.out.println(dichVu);
            }

    }
    public static void hienThiPhong(){
        List<DichVu> dichVuList = GhiDocFile.docFile("phong.csv");
        for (DichVu dichVu : dichVuList){
            System.out.println(dichVu);
        }
    }
}
