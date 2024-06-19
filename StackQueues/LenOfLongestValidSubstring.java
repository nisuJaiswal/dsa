package StackQueues;

import java.util.Stack;

public class LenOfLongestValidSubstring {
    public static int lenOfLongest(String str) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        stack.push(-1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                stack.push(i);
            else {
                if (!stack.isEmpty())
                    stack.pop();

                if (!stack.isEmpty()) {
                    result = Math.max(result, (i - stack.peek()));
                } else {
                    stack.push(i);
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String str = "((()()";
        System.out.println();
        // Function call
        System.out.println(lenOfLongest(str));

        str = "()(()))))";

        // Function call
        System.out.println(lenOfLongest(str));
    }
}
