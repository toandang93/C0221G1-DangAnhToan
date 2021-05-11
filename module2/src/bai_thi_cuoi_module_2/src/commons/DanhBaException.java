package commons;

public class DanhBaException extends Exception {
    public DanhBaException(String message) {
        super(message);
    }
    public static void kiemTra(String nhap,String regex,String thongBao)throws DanhBaException{
        if (!nhap.matches(regex)){
            throw new DanhBaException(thongBao);
        }
    }
}
