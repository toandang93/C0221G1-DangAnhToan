package commons;

public class CanBoException extends Exception {
    public CanBoException(String message) {
        super(message);
    }

    public static void kiemTraTen(String nhap) throws CanBoException{
        String regex = "^([A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)(\\s[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễỬỮỰỲỴÝỶỸ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]*)*$";
        if (!nhap.matches(regex)){
            throw new CanBoException("tên không hợp lệ.Vui lòng viết hoa chữ cái đầu");
        }
    }
    public static void kiemTraNamSInh(String nhap) throws CanBoException{
        String regex = "^[0-9]{2}/[0-9]{2}/[0-9]{4}$";
        if (!nhap.matches(regex)){
            throw new CanBoException("nhập sai định dạng XX/XX/XXXX");
        }
    }
    public static void kiemTraBac(String nhap) throws CanBoException{
        String regex = "^[1-7]/7$";
        if (!nhap.matches(regex)){
            throw new CanBoException("nhập sai định dạng X/7");
        }
    }


}
