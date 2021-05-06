package caseStudy.commons;

public class DichVuException extends Exception {
    public DichVuException(String message) {
        super(message);
    }
    public static void kiemTraSoLuongNguoi(String input) throws DichVuException {
        String regex = "^([0-9])|([1][0-9])$";
        if (!input.matches(regex)){
            throw new DichVuException("vui long chi nhap so");
        }
    }

    public static void kiemTraKieuThue(String input) throws DichVuException {
        String regex = "^[0-9]*$";
        if (!input.matches(regex)){
            throw new DichVuException("vui long chi nhap so");
        }
    }
    public static void kiemTraTen(String input) throws DichVuException {
        String regex = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơ" +
                "ƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềể" +
                "ỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừ" +
                "ỬỮỰỲỴÝỶỸửữựỳỵỷỹ]+(\\s{1}[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠ" +
                "àáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂ" +
                "ưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪ" +
                "ễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ]+)*$";
        if (!input.matches(regex)){
            throw new DichVuException("vui long nhap ten dung dinh dang : viet hoa chu cai dau" );
        }
    }
    public static void kiemTraMaDichVuVilla(String input) throws DichVuException{
        String regex = "^SVVL-[0-9]{4}";
        if (!input.matches(regex)){
            throw new DichVuException("vui long nhap dung dinh dang : SVVL-XXXX");
        }
    }
    public static void kiemTraMaDichVuNha(String input) throws DichVuException{
        String regex = "^SVHO-[0-9]{4}";
        if (!input.matches(regex)){
            throw new DichVuException("vui long nhap dung dinh dang : SVHO-XXXX");
        }
    }
    public static void kiemTraMaDichVuPhong(String input) throws DichVuException{
        String regex = "^SVRO-[0-9]{4}";
        if (!input.matches(regex)){
            throw new DichVuException("vui long nhap dung dinh dang : SVRO-XXXX");
        }
    }
    public static void kiemTraMaNgaySinh(String input) throws DichVuException{
        String regex = "^[0-9]{2}/[0-9]{2}/[1|2][0-9]{3}$";
        if (!input.matches(regex)){
            throw new DichVuException("vui long nhap dung dinh dang : SVRO-XXXX");
        }
    }
    public static void kiemTraGioiTinh(String input) throws DichVuException{
        String regex =  "^(Male)$|^(Female)$|^(Other)$";
        if (!input.matches(regex)){
            throw new DichVuException("vui long nhap dung dinh dang : Male | Female | Other");
        }
    }
    public static void kiemTraSoCMND(String input) throws DichVuException{
        String regex =  "^[0-9]{3}[ ][0-9]{3}[ ][0-9]{3}$";
        if (!input.matches(regex)){
            throw new DichVuException("vui long nhap dung dinh dang : XXX XXX XXX");
        }
    }
    public static void kiemTraSoDT(String input) throws DichVuException{
        String regex =  "^[0-9]{4}[ ][0-9]{3}[ ][0-9]{3}$";
        if (!input.matches(regex)){
            throw new DichVuException("vui long nhap dung dinh dang : XXXX XXX XXX");
        }
    }
    public static void kiemTraEmail(String input) throws DichVuException{
        String regex =  "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$";
        if (!input.matches(regex)){
            throw new DichVuException("vui long nhap dung dinh dang : XXX@XXX.XXX");
        }
    }



}
