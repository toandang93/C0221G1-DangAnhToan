package bai_9_DSA_danh_sach.bai_tap.methodOfArrayList;

public class MyList<E> {
    private int size=0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements=new Object[DEFAULT_CAPACITY];
    }

}
