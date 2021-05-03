package caseStudy.models;

public class Phong extends DichVu {
    private DichVuDiKem dichVuDiKem;

    public Phong() {
    }

    public Phong(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public Phong(String ten, String dienTich, String chiPhiThue, String soLuongNguoi, String kieuThue, DichVuDiKem dichVuDiKem) {
        super(ten, dienTich, chiPhiThue, soLuongNguoi, kieuThue);
        this.dichVuDiKem = dichVuDiKem;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    @Override
    public void showInfo() {
        System.out.println("Phong{" +
                "dichVuDiKem=" + dichVuDiKem +
                ", ten='" + ten + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", chiPhiThue='" + chiPhiThue + '\'' +
                ", soLuongNguoi='" + soLuongNguoi + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return super.toString()+ "," + dichVuDiKem.toString() ;
    }
}
