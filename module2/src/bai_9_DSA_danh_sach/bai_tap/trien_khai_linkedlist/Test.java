package bai_9_DSA_danh_sach.bai_tap.trien_khai_linkedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkList<String> myLinkList= new MyLinkList<>();
        myLinkList.addFirst("5");
        myLinkList.addFirst("4");
        myLinkList.addFirst("1");
        myLinkList.addFirst("2");
        myLinkList.addFirst("8");
        myLinkList.print();
        System.out.println();
        myLinkList.remove("12");
        myLinkList.print();
        System.out.println(myLinkList.size());
        System.out.println();
        System.out.println(myLinkList.get(3));
        myLinkList.clean();
        myLinkList.print();



    }
}
