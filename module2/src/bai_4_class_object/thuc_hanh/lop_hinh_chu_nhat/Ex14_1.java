package bai_4_class_object.thuc_hanh.lop_hinh_chu_nhat;

public class Ex14_1 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle.display());
        rectangle = new Rectangle(5,8);
        System.out.println(rectangle.display());
        System.out.println(rectangle.getArea());

    }
}
