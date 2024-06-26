package StackQueues;

import java.util.Stack;

public class SortStackUsingRecursion {
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;

        int x = stack.pop();
        sortStack(stack);

        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty() && x < stack.peek()) {
            temp.push(stack.pop());
        }

        stack.push(x);

        // System.out.println("====== Elements in Main Stack: ======");
        // for (int i : stack)
        // System.out.print(i + " ");

        // System.out.println();
        // System.out.println("====== Elements in TEmp Stack: ======");
        // for (int i : temp)
        // System.out.print(i + " ");

        while (!temp.isEmpty())
            stack.push(temp.pop());
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println();
        s.push(34);
        s.push(3);
        s.push(31);
        s.push(98);
        s.push(92);
        s.push(23);
        sortStack(s);

        for (int i : s)
            System.out.print(i + " ");

    }
}
