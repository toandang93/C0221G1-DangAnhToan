package bai_6_inheratance.bai_tap.Circle;

public class TestClassCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.setRadius(4);
        Cylinder cylinder=new Cylinder();
        cylinder.setHeight(10);
        System.out.println(cylinder.getVolume());
        Cylinder cylinder1=new Cylinder(4,"black",8);
        System.out.println(cylinder1.getVolume());
    }
}
