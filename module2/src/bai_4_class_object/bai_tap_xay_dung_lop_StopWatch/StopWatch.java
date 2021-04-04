package bai_4_class_object.bai_tap_xay_dung_lop_StopWatch;

public class StopWatch {
    private long starTime;
    private long endTime;
    public StopWatch(){

    }
    public long getStarTime(){
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void star(){
        starTime= System.currentTimeMillis();
    }
    public void end(){
        endTime= System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return endTime-starTime;
    }

}
