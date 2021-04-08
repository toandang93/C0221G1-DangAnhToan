package bai_6_inheratance.bai_tap.Shape;

public class Square extends Rectangle {
    private double side=1.0;
    public Square() {
    }

    public Square( double side) {
        super(side, side);
        this.side = side;
    }

    public Square(String color, boolean filler, double side) {
        super(color, filler, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
