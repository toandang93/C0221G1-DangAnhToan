package caseStudy.models;

public class KhachHang {
    //:  Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số ĐT, Email, Loại khách,
    // Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services, và phương thức showInfor().
    private String tenKhachHang;
    private String ngaySinh;
    private String gioiTinh;
    private String soCMND;
    private String soDT;
    private String email;
    private String loaiKhach;
    private String diaChi;
    private DichVu dichVu;

    public KhachHang() {
    }
    public KhachHang(String[] strings) {
        this.tenKhachHang = strings[0];
        this.ngaySinh = strings[1];
        this.gioiTinh = strings[2];
        this.soCMND = strings[3];
        this.soDT = strings[4];
        this.email = strings[5];
        this.loaiKhach = strings[6];
        this.diaChi = strings[7];
    }

    public KhachHang(String tenKhachHang, String ngaySinh, String gioiTinh, String soCMND, String soDT, String email, String loaiKhach, String diaChi, DichVu dichVu) {
        this.tenKhachHang = tenKhachHang;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
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
        return tenKhachHang  +
                "," + ngaySinh +
                "," + gioiTinh +
                "," + soCMND +
                "," + soDT +
                "," + email +
                "," + loaiKhach +
                "," + diaChi +
                "," + dichVu ;
    }
    public void showInfo(){
        System.out.println( "tenKhachHang='" + tenKhachHang + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", soDT='" + soDT + '\'' +
                ", email='" + email + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dichVu=" + dichVu +
                '}');
    }
}
