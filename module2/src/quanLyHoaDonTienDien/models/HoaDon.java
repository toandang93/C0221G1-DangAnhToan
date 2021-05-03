package quanLyHoaDonTienDien.models;

public class HoaDon {
    //Mã hóa đơn, Mã khách hàng,  ngày ra hoá đơn (ngày, tháng, năm), số lượng (số KW tiêu thụ), đơn giá, thành tiền.
    private String maHoaDon;
    private String maKH;
    private String ngayRaHoaDon;
    private int soLuong;//so kw tieu thu;
    private double donGia;
    private double thanhTien;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maKH, String ngayRaHoaDon, int soLuong, double donGia, double thanhTien) {
        this.maHoaDon = maHoaDon;
        this.maKH = maKH;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
    public String showInfo(){
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                maKH + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                ", thanhTien=" + thanhTien +
                '}';
    }

        @Override
    public String toString() {
        return  maHoaDon +
                "," + maKH  +
                "," + ngayRaHoaDon +
                "," + soLuong +
                "," + donGia +
                "," + thanhTien ;
    }
}
