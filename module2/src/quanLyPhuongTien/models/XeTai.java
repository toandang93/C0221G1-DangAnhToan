package quanLyPhuongTien.models;

public class XeTai extends PhuongTien {
    private int taiTrong;

    public XeTai() {
    }

    public XeTai(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    public XeTai(String bienKiemSoat, String tenHSX, int namSX, String chuSoHuu, int taiTrong) {
        super(bienKiemSoat, tenHSX, namSX, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return  super.toString()+","+ taiTrong ;
    }
}
