package bai_7_abstractClass_interface.bai_tap.interface_Resizeable;

import bai_6_inheratance.bai_tap.Shape.Rectangle;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filler, double side) {
        super(color, filler, side, side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()*percent/100);
    }
}
