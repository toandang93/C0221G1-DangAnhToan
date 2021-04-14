package bai_10_stack_queue.bai_tap.check_palindrome;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        String[] test = "Able was I ere I saw Elba".split("");
        Stack<String> string = new Stack<>();
        Queue<String> string1 = new LinkedList<>();

        for (int i = 0; i < test.length; i++) {
            string.push(test[i].toLowerCase());
            string1.add(test[i].toLowerCase());
        }
        for (int i = 0; i < test.length; i++) {
            if (!string.pop().equals(string1.remove())) {
                System.out.println("it not a Palindrome ");
                return;
            }
        }
        System.out.println("is a Palindrome");
    }
}
