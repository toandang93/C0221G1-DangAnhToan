package bai_6_inheratance.bai_tap.Point2D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
    }

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x,double y,double z){
        setX(x);
        setY(y);
        setZ(z);
    }
    public double[] getXYZ(){
        return new double[]{super.getX(),super.getY(),z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + super.toString()+
                '}';
    }
}
