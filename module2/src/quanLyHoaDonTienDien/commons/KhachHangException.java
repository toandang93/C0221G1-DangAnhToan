package quanLyHoaDonTienDien.commons;

public class KhachHangException extends Exception {
    public KhachHangException(String message) {
        super(message);
    }

    public static void kiemTraTenKH(String input) throws KhachHangException{
        String regex = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơ\" +\n" +
                "            \"ƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềể\" +\n" +
                "            \"ỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừ\" +\n" +
                "            \"ỬỮỰỲỴÝỶỸửữựỳỵỷỹ]+(\\\\s{1}[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠ\" +\n" +
                "            \"àáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂ\" +\n" +
                "            \"ưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪ\" +\n" +
                "            \"ễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]+)*$";
        if(!input.matches(regex)){
            throw new KhachHangException("Nhap sai dinh dang ten");
        }
    }
    public static void kiemTraDinhMucTieuThu(String input) throws KhachHangException{
        String regex = "^[0-9]*$";
        if (!input.matches(regex)){
            throw new KhachHangException("nhap sai dinh dang.Vui long chi nhap so");
        }
    }
    public static void kiemTraQuocTich(String input) throws KhachHangException{
        String regex = "^[A-Z][a-z]*$";
        if (!input.matches(regex)){
            throw new KhachHangException("nhap sai dinh dang .Vui long viet hoa chu cai dau tien");
        }
    }
    public static void kiemTraNgayRaHoaDon(String input) throws KhachHangException{
        String regex ="^[0|1|2|3][0-9]/[0|1][0-9]/[1|2][0-9]{3}$";
        if(!input.matches(regex)){
            throw new KhachHangException("nhap sai dinh dang : dd/mm/yyyy");
        }
    }
    public static void kiemTraNhapSo(String input) throws KhachHangException{
        String regex = "^[0-9]*$";
        if (!input.matches(regex)){
            throw new KhachHangException("vui long chi nhap so");
        }
    }
}
