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




}
