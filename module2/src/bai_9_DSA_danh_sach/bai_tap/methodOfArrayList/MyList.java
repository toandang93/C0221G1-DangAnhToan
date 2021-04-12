package bai_9_DSA_danh_sach.bai_tap.methodOfArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        int newsize = elements.length * 2;
        elements = Arrays.copyOf(elements, newsize);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        if (index > size && index < 0) {
            System.out.println("ERROR");
            return;
        } else {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }

    }

    public E remove(int index) {
        E element;
        if (index > size && index < 0) {
            System.out.println("ERROR");
            return null;
        } else {
            element = (E) elements[index];
            for (int i = index; i <size ; i++) {
                elements[i]=elements[i+1];
            }
        }
        size--;
        return element;
    }
    public int size(){
        return this.size;
    }
    public E clone(){
        return (E) elements;
    }
    public boolean contains(E o){
        for (int i = 0; i <size ; i++) {
            if(elements[i].equals(o)){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    public boolean add(E o){
        if(size==elements.length){
            ensureCapacity();
        }
        elements[size++]=o;
        return true;
    }
    public Object get(int i){
        if(i<0 && i>size-1){
            return null;
        }else {
            return elements[i];
        }
    }
    public void clear(){
        elements = new Object[DEFAULT_CAPACITY];
        size=0;
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
        }
    }
}
