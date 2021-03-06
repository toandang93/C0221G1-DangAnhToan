package bai_6_inheratance.bai_tap.Shape;

public class Square extends Rectangle {

    public Square() {
    }

    public Square( double side) {
        super(side, side);

    }

    public Square(String color, boolean filler, double side) {
        super(color, filler, side, side);

    }

    public double getSide() {
        return getLength();
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
}
