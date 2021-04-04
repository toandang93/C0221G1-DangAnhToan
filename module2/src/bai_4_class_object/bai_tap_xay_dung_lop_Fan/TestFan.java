package bai_4_class_object.bai_tap_xay_dung_lop_Fan;

public class TestFan {
    public static void main(String[] args) {
        Fan test=new Fan();
        System.out.println(test.toString());
        test.setSpeed(test.MEDIUM);
        test.setOn(false);
        System.out.println(test.toString());
        test.setOn(true);
        System.out.println(test.toString());
    }
}
