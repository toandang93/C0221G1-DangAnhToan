package bai_9_DSA_danh_sach.bai_tap.trien_khai_linkedlist;


public class MyLinkList<E> {
    private Node head;
    private int numNode;

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

    public void add(int index, E element) {
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = new Node(element);

    }

    public void addFirst(E element) {
        Node temp = new Node(element);
        temp.next = head;
        head = temp;
        numNode++;
    }

    public void addLast(E element) {
        Node current = head;
        while (current != null) {
            current = current.next;
        }
        current = new Node(element);
        current.next = null;
        numNode++;

    }

    public Object remove(int index) {
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node temp = current.next;
        current.next = current.next.next;
        return temp;
    }

    public boolean remove(Object e) {
        Node current = head;
        int i = 0;
        while (current != null) {
            if (current.data.equals(e)) {
                remove(i);
                return true;
            }
            current = current.next;
            i++;
        }
        return false;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public int size() {
        return numNode;
    }

    public E clone() {
        return (E) this;

    }

    public boolean contains(E o) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(o)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean add(E o) {
        addLast(o);
        return true;
    }

    public E get(int i) {
        Node current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return (E) current.data;
    }
    public E getFirst(){
        Node current = head;
        return (E)current.data;
    }
    public E getLast(){
        Node current = head;
        while (current!=null){
            current=current.next;
        }
        return (E) current.data;
    }
    public void clean(){
       head = null;
        numNode = 0;
    }



}
