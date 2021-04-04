package bai_4_class_object.bai_tap_xay_dung_lop_StopWatch;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch test=new StopWatch();
        test.star();
        for (int i = 1; i <=100000 ; i++) {
            System.out.println(i);
        }
        test.end();
        System.out.println("thời gian hết : "+ test.getElapsedTime());
    }
}
