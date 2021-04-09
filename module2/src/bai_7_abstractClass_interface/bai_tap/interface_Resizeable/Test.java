package bai_7_abstractClass_interface.bai_tap.interface_Resizeable;

public class Test {
    public static void main(String[] args) {
        Square square=new Square(5);
        System.out.println(square);
        square.resize(50);
        System.out.println(square);

    }
}
