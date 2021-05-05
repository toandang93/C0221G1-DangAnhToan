package caseStudy.models;

public class KhachHang {
    //:  Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số ĐT, Email, Loại khách,
    // Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services, và phương thức showInfor().
    private String tenKhachHang;
    private String ngaySinh;
    private String soCMND;
    private String email;
    private String loaiKhach;
    private String diaChi;
    private DichVu dichVu;

    public KhachHang() {
    }

    public KhachHang(String tenKhachHang, String ngaySinh, String soCMND, String email, String loaiKhach, String diaChi, DichVu dichVu) {
        this.tenKhachHang = tenKhachHang;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.dichVu = dichVu;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    @Override
    public String toString() {
        return  tenKhachHang +
                "," + ngaySinh +
                "," + soCMND +
                "," + email +
                ",'" + loaiKhach  +
                "," + diaChi +
                "," + dichVu ;
    }
    public void showInfo(){
        System.out.println("\"KhachHang{\" +\n" +
                "                \"tenKhachHang='\" + tenKhachHang + '\\'' +\n" +
                "                \", ngaySinh='\" + ngaySinh + '\\'' +\n" +
                "                \", soCMND='\" + soCMND + '\\'' +\n" +
                "                \", email='\" + email + '\\'' +\n" +
                "                \", loaiKhach='\" + loaiKhach + '\\'' +\n" +
                "                \", diaChi='\" + diaChi + '\\'' +\n" +
                "                \", dichVu=\" + dichVu +\n" +
                "                '}'");
    }
}
