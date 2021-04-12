package bai_9_DSA_danh_sach.thuc_hanh.linkedList_don_gian;

public class MyLinkListTest {
    public static void main(String[] args) {
        MyLinkList myLinkList =new MyLinkList(1);
        myLinkList.add(1 ,5);
        myLinkList.addFist(3);
        myLinkList.addFist(2);
        myLinkList.printList();
        System.out.println();
        System.out.println(myLinkList.get(3));
    }
}
