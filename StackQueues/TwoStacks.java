package StackQueues;

public class TwoStacks {
    static int arr[];
    static int top1, top2;
    int size;

    TwoStacks(int size) {
        this.size = size;
        arr = new int[size];
        top1 = (size / 2) - 1;
        top2 = size / 2;
    }

    void pushFirst(int el) {
        if (top1 > 0) {
            top1--;
            arr[top1] = el;
        } else {
            System.out.println("First Stack Overflow " + top1);
        }
        return;
    }

    void pushSecond(int el) {
        if (top2 < size - 1) {
            top2++;
            arr[top2] = el;
        } else {
            System.out.println("Second Stack Overflow");
        }

        return;
    }

    int popFirst() {
        if (top1 <= size / 2) {
            int temp = arr[top1];
            top1++;
            return temp;
        } else {
            System.out.println("First Stack Underflow");
            System.exit(0);
        }
        return -1;
    }

    int popSecond() {
        if (top2 < size) {
            int temp = arr[top2];
            top2--;
            return temp;
        } else {
            System.out.println("Second Stack Underflow");
            System.exit(0);
        }
        return -1;
    }

}
