package quanLyHoaDonTienDien.models;

public class KhachHangVietNam extends KhachHang {
    private String loaiKhach;
    private int dinhMucTieuThu;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String loaiKhach, int dinhMucTieuThu) {
        this.loaiKhach = loaiKhach;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public KhachHangVietNam(String maKH, String hoTen, String loaiKhach, int dinhMucTieuThu) {
        super(maKH, hoTen);
        this.loaiKhach = loaiKhach;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public int getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(int dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String showInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return  super.toString()+","+ loaiKhach +
                "," + dinhMucTieuThu
                ;
    }
}
