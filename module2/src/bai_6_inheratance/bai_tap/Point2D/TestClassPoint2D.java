package bai_6_inheratance.bai_tap.Point2D;

import java.util.Arrays;

public class TestClassPoint2D {
    public static void main(String[] args) {
        Point3D point3D=new Point3D();
        point3D.setXYZ(4,6,9);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
