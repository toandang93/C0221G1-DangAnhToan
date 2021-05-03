package quanLyHoaDonTienDien.models;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(String quocTich) {
        this.quocTich = quocTich;
    }

    public KhachHangNuocNgoai(String maKH, String hoTen, String quocTich) {
        super(maKH, hoTen);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }


    @Override
    public String showInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return  super.toString()+","+ quocTich ;
    }
}
