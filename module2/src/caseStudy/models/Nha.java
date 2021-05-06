package caseStudy.models;
//Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
public class Nha extends DichVu {
    private String tieuChuanPhong;
    private String moTaTienNghi;
    private int soTang;

    public Nha() {
    }
    public Nha(String[] strings) {
        super(strings);
        this.tieuChuanPhong = strings[6];
        this.moTaTienNghi = strings[7];
        this.soTang = Integer.parseInt(strings[8]);
    }

    public Nha(String tieuChuanPhong, String moTaTienNghi, int soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.soTang = soTang;
    }

    public Nha(String id, String ten, String dienTichSuDung, String chiPhiThue, String soLuongNguoi, String kieuThue, String tieuChuanPhong, String moTaTienNghi, int soTang) {
        super(id, ten, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
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
    public String toString() {
        return super.toString()+","+ tieuChuanPhong +
                "," + moTaTienNghi +
                "," + soTang ;
    }

    @Override
    public void showInfo() {
        System.out.println("Nha{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", soTang=" + soTang +
                ", id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soLuongNguoi='" + soLuongNguoi + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}');
    }
}
