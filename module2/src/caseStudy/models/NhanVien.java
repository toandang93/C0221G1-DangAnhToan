package caseStudy.models;

public class NhanVien {
    //: Họ tên Employee , Ngày sinh, Số CMND, Số ĐT, Email, Trình độ, Vị trí, lương
    private String ten;
    private String ngaySinh;
    private String soCMND;
    private String soDT;
    private String email;
    private String trinhDo;
    private String viTri;
    private String luong;

    public NhanVien() {
    }
    public NhanVien(String[] strings) {
        this.ten = strings[0];
        this.ngaySinh = strings[1];
        this.soCMND = strings[2];
        this.soDT = strings[3];
        this.email = strings[4];
        this.trinhDo = strings[5];
        this.luong = strings[6];
        this.ten = strings[7];
    }

    public NhanVien(String ten, String ngaySinh, String soCMND, String soDT, String email, String trinhDo, String viTri, String luong) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.soDT = soDT;
        this.email = email;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return  ten +
                "," + ngaySinh +
                "," + soCMND +
                "," + soDT +
                "," + email +
                "," + trinhDo +
                "," + viTri +
                "," + luong ;
    }
    public void showInfo(){
        System.out.println("NhanVien{" +
                "ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", soCMND='" + soCMND + '\'' +
                ", soDT='" + soDT + '\'' +
                ", email='" + email + '\'' +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong='" + luong + '\'' +
                '}');
    }
}
