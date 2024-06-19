package StackQueues;

import java.util.Stack;
// Intution:
// 1. Initialize the integer stack and push the -1 to it and initiliazie the result with 0
// 2. Traverse through the string.
// 3. if the character is ( then simply push it into the stack
// 4. If the character is ) then
// 4.1 if the stack is non empty then pop the first element from the stack
// 4.2 if the stack is non empty then
// 4.2.1 Update the result by taking the diff between current index (i) and the top of the stack (Math.max(result, i - stack.peek()))
// 4.2.2 Push the index of the i into the stack
// 5. Return the value of result

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
