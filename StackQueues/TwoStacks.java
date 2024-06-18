package StackQueues;

public class TwoStacks {
    static int arr[];
    static int top1, top2;
    int size;

    TwoStacks(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1; // Initialize top1 to -1
        top2 = size; // Initialize top2 to size
    }

    void pushFirst(int el) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = el;
        } else {
            System.out.println("First Stack Overflow");
        }
    }

    void pushSecond(int el) {
        if (top2 > top1 + 1) {
            top2--;
            arr[top2] = el;
        } else {
            System.out.println("Second Stack Overflow");
        }
    }

    int popFirst() {
        if (top1 >= 0) {
            int temp = arr[top1];
            top1--;
            return temp;
        } else {
            System.out.println("First Stack Underflow");
            return -1; // Return -1 to indicate underflow
        }
    }

    int popSecond() {
        if (top2 < size) {
            int temp = arr[top2];
            top2++;
            return temp;
        } else {
            System.out.println("Second Stack Underflow");
            return -1; // Return -1 to indicate underflow
        }
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);
        ts.pushFirst(5);
        ts.pushSecond(10);
        System.out.println(ts.popFirst());
        System.out.println(ts.popSecond());
    }
}
