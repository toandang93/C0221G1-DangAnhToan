package caseStudy.models;
//Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.
public class Villa extends DichVu {
    private String tieuChuanPhong;
    private String moTaTienNghi;
    private String dienTichHoBoi;
    private String soTang;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, String moTaTienNghi, String dienTichHoBoi, String soTang) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghi = moTaTienNghi;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String ten, String dienTich, String chiPhiThue, String soLuongNguoi, String kieuThue, String tieuChuanPhong, String moTaTienNghi, String dienTichHoBoi, String soTang) {
        super(ten, dienTich, chiPhiThue, soLuongNguoi, kieuThue);
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
    public void showInfo() {
        System.out.println("\"Villa{\" +\n" +
                "                \"tieuChuanPhong='\" + tieuChuanPhong + '\\'' +\n" +
                "                \", moTaTienNghi='\" + moTaTienNghi + '\\'' +\n" +
                "                \", dienTichHoBoi='\" + dienTichHoBoi + '\\'' +\n" +
                "                \", soTang='\" + soTang + '\\'' +\n" +
                "                \", ten='\" + ten + '\\'' +\n" +
                "                \", dienTichSuDung='\" + dienTichSuDung + '\\'' +\n" +
                "                \", chiPhiThue='\" + chiPhiThue + '\\'' +\n" +
                "                \", soLuongNguoi='\" + soLuongNguoi + '\\'' +\n" +
                "                \", kieuThue='\" + kieuThue + '\\'' +\n" +
                "                '}'");
    }

    @Override
    public String toString() {
        return super.toString()+ "," + tieuChuanPhong  +
                "," + moTaTienNghi  +
                "," + dienTichHoBoi +
                "," + soTang
                ;
    }
}
