package bai_10_stack_queue.bai_tap.chuyen_he_thap_phan_sang_nhi_phan;

import java.util.Stack;

public class Exchange {
    public static void main(String[] args) {
        int number = 10;
        Stack<Integer> numStack = new Stack<>();
        while (number != 0) {
            numStack.push(number % 2);
            number /= 2;
        }
        while (!numStack.isEmpty()){
            System.out.print(numStack.pop());
        }

    }
}
