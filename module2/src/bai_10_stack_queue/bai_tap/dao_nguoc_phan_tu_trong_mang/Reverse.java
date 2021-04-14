package bai_10_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        int[] array= {3,4,5,7,8,6};
        Stack<Integer> numStack=new Stack<>();
        for (int i = 0; i < array.length; i++) {
            numStack.push(array[i]);
        }
        while (!numStack.isEmpty()){
            System.out.print(numStack.pop());
        }
    }
}
