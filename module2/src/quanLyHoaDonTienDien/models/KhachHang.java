package quanLyHoaDonTienDien.models;

public abstract class KhachHang {
    protected String maKH;
    protected String hoTen;

    public KhachHang() {
    }

    public KhachHang(String maKH, String hoTen) {
        this.maKH = maKH;
        this.hoTen = hoTen;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public abstract String showInfo();

    @Override
    public String toString() {
        return  maKH  +
                "," + hoTen ;
    }
}
