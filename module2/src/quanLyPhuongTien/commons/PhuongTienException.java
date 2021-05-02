package quanLyPhuongTien.commons;

public class PhuongTienException extends Exception {
    public PhuongTienException(String message) {
        super(message);
    }

    public static void kiemTraBienKiemSoatOto(String bienKS) throws PhuongTienException{
        // XXY-XXX.XX (X : 0÷9 , Y=A nếu xe du lịch, Y=B  nếu xe khách)
        String regex ="^[0-9]{2}[A|B]-[0-9]{3}.[0-9]{2}$";
        if (!bienKS.matches(regex)){
            throw new PhuongTienException("nhap bien kiem soat theo mau : XXY-XXX.XX");
        }
    }

    public static void kiemTraBienKiemSoatXeTai(String bienKS) throws PhuongTienException{
        //XXC-XXX.XX (X : 0÷9)
        String regex ="^[0-9]{2}C-[0-9]{3}.[0-9]{2}$";
        if (!bienKS.matches(regex)){
            throw new PhuongTienException("nhap bien kiem soat theo mau : XXC-XXX.XX");
        }
    }

    public static void kiemTraBienKiemSoatXeMay(String bienKS) throws PhuongTienException{
        //XX-YZ-XXX.XX (X : 0÷9, Y= (Chữ cái in hoa), Z =(0÷9) hoặc (Chữ cái in Hoa
        String regex = "^[0-9]{2}-[A-Z][A-Z0-9]-[0-9]{3}.[0-9]{2}$";
        if (!bienKS.matches(regex)){
            throw new PhuongTienException("nhap bien kiem soat theo mau : XX-YZ-XXX.XX");
        }
    }

    public static void kiemTraTen(String ten) throws PhuongTienException{
        String regex = "^[A-Z][a-z]+$";
        if (!ten.matches(regex)){
            throw new PhuongTienException("Nhap sai dinh dang : Xxxx");
        }
    }

    public static void kiemTraNam(String nam)throws PhuongTienException{
        String regex = "^[1|2][0-9]{3}$";
        if (!nam.matches(regex)){
            throw new PhuongTienException("nhap theo mau : 1XXX hoac 2XXX");
        }
    }

    public static void kiemTraSo(String so) throws PhuongTienException{
        String regex = "^[0-9]+$";
        if (!so.matches(regex)){
            throw new PhuongTienException("nhap sai dinh dang");
        }
    }


}
