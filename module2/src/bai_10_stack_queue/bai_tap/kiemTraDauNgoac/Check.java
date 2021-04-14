package bai_10_stack_queue.bai_tap.kiemTraDauNgoac;

import java.util.Stack;

public class Check {
    public static boolean check(String[] string) {
        Stack<String> bStack = new Stack<>();
        for (String sym : string) {
            if (sym.equals("(")) {
                bStack.push(sym);
            }
            if (sym.equals(")")) {
                if (bStack.isEmpty()) {
                    return false;
                }
                bStack.pop();
            }
        }
        if (bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] string = "s * (s – a) * ((s – b)) * (s – c) ".split("");
        System.out.println(check(string));;
    }
}

