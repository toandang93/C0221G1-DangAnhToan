package caseStudy.models;

public class Phong extends DichVu {
    private DichVuDiKem dichVuDiKem;

    public Phong() {
    }

    public Phong(String[] strings) {
        super(strings);
        this.dichVuDiKem = new DichVuDiKem(strings[6],strings[7],Double.parseDouble(strings[8]));
    }



    public Phong(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public Phong(String[] strings, DichVuDiKem dichVuDiKem) {
        super(strings);
        this.dichVuDiKem = dichVuDiKem;
    }

    public Phong(String id, String ten, String dienTichSuDung, String chiPhiThue, String soLuongNguoi, String kieuThue, DichVuDiKem dichVuDiKem) {
        super(id, ten, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public String toString() {
        return super.toString()+","+ dichVuDiKem ;
    }

    @Override
    public void showInfo() {
        System.out.println("Phong{" +
                "dichVuDiKem=" + dichVuDiKem +
                ", id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soLuongNguoi='" + soLuongNguoi + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}');
    }
}
