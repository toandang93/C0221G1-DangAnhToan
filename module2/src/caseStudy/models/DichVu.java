package caseStudy.models;
//Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).
public abstract class DichVu {
    protected String id;
    protected String ten;
    protected String dienTichSuDung;
    protected String chiPhiThue;
    protected String soLuongNguoi;
    protected String kieuThue;

    public DichVu() {
    }
    public DichVu(String[] strings) {
        this.id = strings[0];
        this.ten = strings[1];
        this.dienTichSuDung = strings[2];
        this.chiPhiThue = strings[3];
        this.soLuongNguoi = strings[4];
        this.kieuThue = strings[5];
    }


    public DichVu(String id, String ten, String dienTichSuDung, String chiPhiThue, String soLuongNguoi, String kieuThue) {
        this.id = id;
        this.ten = ten;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(String chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(String soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }
    public abstract void showInfo();

    @Override
    public String toString() {
        return  id +
                "," + ten  +
                "," + dienTichSuDung +
                "," + chiPhiThue +
                "," + soLuongNguoi +
                "," + kieuThue ;
    }
}
