package models;

import java.util.ArrayList;
import java.util.List;

public class DanhBa {
    public static List<DanhBa> danhBaList123 = new ArrayList<>();
    private String soDt;
    private String nhom;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String email;

    public DanhBa() {
    }
    public DanhBa(String[] strings) {
        this.soDt = strings[0];
        this.nhom = strings[1];
        this.hoTen = strings[2];
        this.gioiTinh = strings[3];
        this.diaChi = strings[4];
        this.ngaySinh = strings[5];
        this.email = strings[6];
    }

    public DanhBa(String soDt, String nhom, String hoTen, String gioiTinh, String diaChi, String ngaySinh, String email) {
        this.soDt = soDt;
        this.nhom = nhom;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  soDt +
                "," + nhom +
                "," + hoTen +
                "," + gioiTinh +
                "," + diaChi +
                "," + ngaySinh +
                "," + email ;
    }
    public void hienThi(){
        System.out.println("DanhBa{" +
                "soDt='" + soDt + '\'' +
                ", nhom='" + nhom + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", email='" + email + '\'' +
                '}');
    }
}
