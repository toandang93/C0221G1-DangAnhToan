package caseStudy.models;
//Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
public class Villa extends DichVu {
    private String tieuChuanPhong;
    private String moTaTienNghi;
    private String dienTichHoBoi;
    private String soTang;

    public Villa() {
    }
    public Villa(String[] strings) {
        super(strings);
        this.tieuChuanPhong = strings[6];
        this.moTaTienNghi = strings[7];
        this.dienTichHoBoi = strings[8];
        this.soTang = strings[9];
    }

    public Villa(String tieuChuanPhong, String moTaTienNghi, String dienTichHoBoi, String soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }


    public Villa(String id, String ten, String dienTichSuDung, String chiPhiThue, String soLuongNguoi, String kieuThue, String tieuChuanPhong, String moTaTienNghi, String dienTichHoBoi, String soTang) {
        super(id, ten, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
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

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return super.toString()+","+ tieuChuanPhong +
                "," + moTaTienNghi +
                ",'" + dienTichHoBoi +
                "," + soTang  ;
    }

    @Override
    public void showInfo() {
        System.out.println("Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTaTienNghi='" + moTaTienNghi + '\'' +
                ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
                ", soTang='" + soTang + '\'' +
                ", id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soLuongNguoi='" + soLuongNguoi + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}');
    }
}
