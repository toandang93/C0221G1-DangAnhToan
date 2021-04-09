package bai_7_abstractClass_interface.bai_tap.interface_Resizeable;

import bai_6_inheratance.bai_tap.Shape.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius=0.1;
    private final double PI=3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filler, double radius) {
        super(color, filler);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*PI;
    }
    public double getPerimeter(){
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*percent/100);
    }
}
