package StackQueues;

import java.util.Stack;

public class NextLargerElement {
    public static long[] getLarger(long[] arr) {
        int len = arr.length;
        Stack<Long> stack = new Stack<>();
        long[] res = new long[len];

        for (int i = len - 1; i >= 0; i--) {
            // Check if the cuurent element is even larger than the largest element till now
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();

            // If the stack is empty i.e. no larger element, than add -1 to res, else add
            // top of the stack
            if (stack.isEmpty())
                res[i] = -1;
            else
                res[i] = stack.peek();

            stack.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        long[] nums = { 20, 10, 30, 50, 20, 100, 1 };
        long[] res = getLarger(nums);

        System.out.println();
        for (long i : res)
            System.out.print(i + " ");
    }
}
