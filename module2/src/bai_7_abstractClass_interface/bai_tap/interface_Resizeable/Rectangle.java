package bai_7_abstractClass_interface.bai_tap.interface_Resizeable;

import bai_6_inheratance.bai_tap.Shape.Shape;

public class Rectangle extends Shape  implements Resizeable{
    private double width=1.0;
    private double length=1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filler, double width, double length) {
        super(color, filler);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length + super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        setLength(getLength()*percent/100);
        setWidth(getWidth()*percent/100);
    }
}
