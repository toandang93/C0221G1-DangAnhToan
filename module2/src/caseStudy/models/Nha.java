package caseStudy.models;
//Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
public class Nha extends DichVu {
    private String tieuChuanPhong;
    private String moTaTienNghi;
    private int soTang;

    public Nha() {
    }

    public Nha(String tieuChuanPhong, String moTaTienNghi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.soTang = soTang;
    }

    public Nha(String ten, String dienTich, String chiPhiThue, String soLuongNguoi, String kieuThue, String tieuChuanPhong, String moTaTienNghi, int soTang) {
        super(ten, dienTich, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghi() {
        return moTaTienNghi;
    }

    public void setMoTaTienNghi(String moTaTienNghi) {
        this.moTaTienNghi = moTaTienNghi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public void showInfo() {
        System.out.println( "Nha{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", soTang=" + soTang +
                ", ten='" + ten + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soLuongNguoi='" + soLuongNguoi + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return super.toString()+"," + tieuChuanPhong +
                "," + moTaTienNghi +
                "," + soTang ;
    }
}
