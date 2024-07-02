package StackQueues;

import java.util.*;

class ReverseQueue {
    static void reverseQ(Queue<Integer> queue) {
        Stack<Integer> st = new Stack<>();
        while (!queue.isEmpty())
            st.push(queue.poll());

        while (!st.isEmpty())
            queue.add(st.pop());
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        reverseQ(queue);

        for (int i : queue)
            System.out.print(i + " ");
    }
}