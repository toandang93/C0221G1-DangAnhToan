package compar;

public class HocSinh  {
    private String ten;
    private int tuoi;

    public HocSinh(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }

//    @Override
//    public int compareTo(HocSinh hocSinh) {
//        if((this.getTen().compareTo(hocSinh.getTen()))>0){
//            return 1;
//        }else if((this.getTen().compareTo(hocSinh.getTen()))<0){
//            return -1;
//        }else {
//            return this.getTuoi()-hocSinh.getTuoi();
//        }
//    }
}
