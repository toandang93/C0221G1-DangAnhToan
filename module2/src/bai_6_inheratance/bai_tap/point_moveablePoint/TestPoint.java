package bai_6_inheratance.bai_tap.point_moveablePoint;

public class TestPoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint(5,5,8,8);
        System.out.println(moveablePoint.move());
    }
}
