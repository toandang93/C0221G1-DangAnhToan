package bai_9_DSA_danh_sach.thuc_hanh.linkedList_don_gian;

import javax.xml.soap.Node;

public class MyLinkList {
    private Node head;
    private int numNodes;

    public MyLinkList() {

    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

    }

    public MyLinkList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = new Node(data);
        current.next.next = temp;
        numNodes++;

    }

    public void addFist(Object data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        numNodes++;
    }

    public Object get(int index) {
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        return  current.data;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
